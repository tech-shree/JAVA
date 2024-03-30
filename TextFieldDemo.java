import java.awt.*;
class TextFieldDemo
{
	public static void main(String args[])
	{
		Frame f =new Frame();
		TextField t1=new TextField("32");
		t1.setBounds(50,80,100,30);
		
		TextField t2=new TextField("10");
		t2.setBounds(50,120,100,30);
		TextField t3=new TextField();
		t3.setBounds(50,160,100,30);
		int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		String s="";
		s=s+sum;
		t3.setText(s);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}