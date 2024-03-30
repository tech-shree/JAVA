import java.awt.*;
import java.awt.event.*;
public class exS extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3;
	Button b1;
	exS()
	{
		tf1=new TextField();
		tf1.setBounds(50,50,150,20);
		tf2=new TextField();
		tf2.setBounds(50,100,150,20);
		tf3=new TextField();
		tf3.setBounds(50,150,150,20);
		tf3.setEditable(false);
		b1=new Button("Click Here To Compare");
		b1.setBounds(50,200,250,50);
		b1.addActionListener(this);
		add(tf1);add(tf2);add(tf3);
		add(b1);
		setSize(350,350);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		boolean c;
		if(e.getSource()==b1)
		{
			c=s1.equals(s2);
			if(c== true)
			{
				//String m="Matched";
				tf3.setText("Matched");
			}
			else
			{
				//String n="Not Matched";
				tf3.setText("Not Matched");
			}
		}
	}
	public static void main(String args[])
	{
		new exS();
	}
}	