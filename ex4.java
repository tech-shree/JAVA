import java.awt.*;
import java.awt.event.*;
public class ex4 extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Button b1;
	ex4()
	{
		tf1=new TextField();
		tf1.setBounds(50,50,150,20);
		tf2=new TextField();
		tf2.setBounds(50,100,150,20);
		tf2.setEditable(false);
		b1=new Button("Factorial");
		b1.setBounds(50,200,50,50);
		b1.addActionListener(this);
		add(tf1);add(tf2);
		add(b1);
		setSize(350,350);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		int a=Integer.parseInt(s1);
		int f=1;
		if(e.getSource()==b1)
		{
			for(int i=1;i<=a;i++)
			{
				f=f*i;
			}
		}
		String result =String.valueOf(f);
		tf2.setText(result);
	}
	
	public static void main(String args[])
	{
		new ex4();
	}
}
		