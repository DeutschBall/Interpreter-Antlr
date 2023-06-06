package gui;

// for JDK
import java.awt.*;
import javax.swing.*;


import common.*;

public class MyWindow extends JFrame implements BaseUI{

	private   JPanel contentPane;
	protected JComponent jPanel = null;

	protected Graphics2D theDevice ;

	protected Image theOnceImage = null; 


	public MyWindow() {
		setBackground(Color.BLACK);
		setFont(new Font("Cascadia Code", Font.BOLD, 24));
		setTitle("DustComp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1000, 700);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int myWidth = screenSize.width /2;    //* 3 / 4;
		int myHeight = screenSize.height * 3 / 4;
		int x = (screenSize.width - myWidth) / 2;
		int y = (screenSize.height - myHeight) / 2;

		setBounds(x, y, myWidth, myHeight);

		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		jPanel = contentPane;
		jPanel.setFont(getFont());
		contentPane.setLayout(new BorderLayout(0, 0));
		theDevice= (Graphics2D)jPanel.getGraphics();
//		beginPaint();
	}

	public void dispose() {
		super.dispose();
    }

	public void paint(Graphics g)
	{
		if(!getClass().equals(MyWindow.class))
			super.paint(g);
		else {
			if(theOnceImage != null){

				g.drawImage(theOnceImage, 0, 0, null);
			}
		}
	}



	public void reportError(String msg)
	{
		System.err.print( msg );
		if(msg.length()>0 && msg.charAt(msg.length()-1) != '\n')
    		System.err.print( "\n" );

		if(theDevice == null)
			theDevice = (Graphics2D)jPanel.getGraphics();
        if(theDevice == null) return;
		theDevice.setBackground(Color.BLACK);
		theDevice.clearRect(0, 0, getWidth(), 100);
        ((Graphics)theDevice).setFont(new Font("Cascadia Code",Font.BOLD,28));
		theDevice.drawString(msg, 20, 60);
	}
	
	public void showMessage(String msg)
	{
		/*
		Graphics2D g = (Graphics2D) getGraphics();
		g.setBackground(Color.WHITE);
		g.clearRect(0, 0, getSize().width, getSize().height);
		g.drawString(msg, 20, 150);
		*/
		System.out.println( msg );
	}
	


	public void drawPixel(double x, double y, uiPixelAttrib pa)
	{
//		beginPaint();
//		System.out.println(isInMyWindow(x,y));
//		if(!isInMyWindow(x,y)){
//			System.out.println("out of bounds");
//		}
		if( theDevice == null )
			theDevice = (Graphics2D)getGraphics();
		if( theDevice == null )
		    return;
		double x0=getBounds().getX();
		double y0=getBounds().getY();
		double x1=getBounds().getWidth()+x0;
		double y1=getBounds().getHeight()+y0;
		if(!getBounds().contains(x0+x,y0+y)){
			System.out.println("warnring:point("+x+","+y+") drew out of bounds [("+x0+","+y0+"),("+x1+","+y1+")]");
		}
//		if(!theDevice.getDeviceConfiguration().getBounds().contains(x,y)){
//			System.out.println("out of bounds");
//		}
		theDevice.setColor(new Color((int)pa.red(), (int)pa.green(), (int)pa.blue()));

		theDevice.fillArc((int)x, (int)y, (int)pa.size(), (int)pa.size(), 0, 360);

	}

    public void setTree(org.antlr.v4.runtime.tree.ParseTree tree, String[] ruleNames)
    {}

    public void beginPaint()
    {
        setVisible(true);
		if( theDevice == null ) {
			theDevice = (Graphics2D)jPanel.getGraphics(); 
		}

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int imgWidth = screenSize.width; //getSize().width;
		int imgHeight = screenSize.height; //getSize().height;
		theOnceImage = createImage(imgWidth, imgHeight);

		theDevice = (Graphics2D)theOnceImage.getGraphics();
		
//		theDevice.get
		theDevice.setBackground(Color.BLACK);
		theDevice.clearRect(0, 0, imgWidth, imgHeight);
    }

    public void endPaint(boolean noError)
    {
		drawWaterMarker(theDevice, 500,700);
        if(theDevice != null) { theDevice.dispose(); }        
        repaint();
    }



	protected void drawWaterMarker(Graphics g, int x, int y){
		String waterMarker = "dustball's Interpreter";
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float)0.4);
		Composite oldac = ((Graphics2D)g).getComposite();
		((Graphics2D)g).setComposite(ac);
		g.setColor(Color.RED);
		g.setFont(new Font("Cascadia Code",Font.PLAIN,28));
		g.drawString(waterMarker, (int)x, (int)y);
		((Graphics2D)g).setComposite(oldac);
	}
	boolean isInMyWindow(double x,double y){
		return getBounds().contains(x,y);
	}

}
