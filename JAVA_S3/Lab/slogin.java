import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener
{
	JLabel x,y;
	JTextField t1,t2;
	JButton b1,b2;
	test()
	{
		JFrame f=new JFrame("Login");
		x= new JLabel("username");
		y=new JLabel("password");
		
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("login");
		b2=new JButton("clear");
		JPanel p= new JPanel(new GridLayout(3,0));
		p.add(x);
		p.add(y);
		
		p.add(t1);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(p);
		f.setSize(300,300);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{ String s=e.getActionCommand();
	if(s.equals("login"))
		{
		x.setText(t1.getText());
		y.setText(t2.getText());
		t1.setText("");
		t2.setText("");
		}
	else{
		t1.setText("");
		t2.setText("");
	}
	}
	public static  void main(String args[])
	{
		test t =new test();
	}
}
	
