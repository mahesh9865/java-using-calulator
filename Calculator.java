import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="Calculator" width=400 height=500>
//</applet>

public class Calculator  extends Applet implements ActionListener
{
	int a,b,c;
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	String s,s1,s2,s3,s4;

	public void init()
	{
		setLayout(null);
		t1=new TextField(10);
		t1.setBounds(80,200,260,40);
		add(t1);
		b1=new Button("0");
		b2=new Button("1");
		b3=new Button("2");
		b4=new Button("3");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("7");
		b9=new Button("8");
		b10=new Button("9");
		b11=new Button("+");
		b12=new Button("-");
		b13=new Button("*");
		b14=new Button("/");
		b15=new Button("=");
		b16=new Button("CLR");
		b1.setBounds(90,260,40,30);
		add(b1);
		b2.setBounds(140,260,40,30);
		add(b2);
		b3.setBounds(190,260,40,30);
		add(b3);
		b4.setBounds(240,260,40,30);
		add(b4);
		b5.setBounds(290,260,40,30);
		add(b5);
		b6.setBounds(90,300,40,30);
		add(b6);
		b7.setBounds(140,300,40,30);
		add(b7);
		b8.setBounds(190,300,40,30);
		add(b8);
		b9.setBounds(240,300,40,30);
		add(b9);
		b10.setBounds(290,300,40,30);
		add(b10);
		b11.setBounds(90,340,40,30);
		add(b11);
		b12.setBounds(140,340,40,30);
		add(b12);
		b13.setBounds(190,340,40,30);
		add(b13);
		b14.setBounds(240,340,40,30);
		add(b14);
		b15.setBounds(290,340,40,30);
		add(b15);
		b16.setBounds(90,380,70,20);
		add(b16);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		repaint();
		s=ae.getActionCommand();
if(s.equals("0") || s.equals("1") || s.equals("2")||
s.equals("3") || s.equals("4") || s.equals("5")||s.equals

("6")||s.equals("7")||s.equals("8")||s.equals("9"))
{
	s1=t1.getText()+s;
	t1.setText(s1);
}

if(s.equals("+"))
{
	s2=t1.getText();
	t1.setText("");
	s3="+";
}

if(s.equals("-"))
{
	s2=t1.getText();
	t1.setText("");
	s3="-";
}

if(s.equals("*"))
{
	s2=t1.getText();
	t1.setText("");
	s3="*";
}

if(s.equals("/"))
{
	s2=t1.getText();
	t1.setText("");
	s3="/";
}

if(s.equals("="))
{
	s4=t1.getText();
	a=Integer.parseInt(s2);
	b=Integer.parseInt(s4);

	if(s3.equals("+"))
	c=a+b;

	if(s3.equals("-"))
	c=a-b;

	if(s3.equals("*"))
	c=a*b;
	
	if(s3.equals("/"))
	c=a/b;

	t1.setText(String.valueOf(c));
}

if(s.equals("CLR"))
{

	t1.setText("");

}

}
public void paint(Graphics g)
{
	setBackground(Color.green);
	g.drawRect(0,0,0,0);
	showStatus(" CREATED BY MAHESH CHALLA");
	g.drawString("CALCULATOR",200,50);
}
}