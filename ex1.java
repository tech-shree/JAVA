import java.awt.*;
import java.awt.event.*;
class ex1 extends Frame implements ActionListener
{
	Button b1,b2,b3;
	ex1()
	{
		b1=new Button("RED");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		b1.setBounds(50,50,100,50);
		b2.setBounds(170,50,100,50);
		b3.setBounds(290,50,100,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1) //getSource is an actionevent class//its return type is button
		{
			this.setBackground(Color.red);
			
		}
		if(e.getSource()==b2)
		{
			this.setBackground(Color.green);
		}
		if(e.getSource()==b3)
		{
			this.setBackground(Color.blue);
		}
	}
	public static void main(String args[])
	{
		new ex1();
	}
}