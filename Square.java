import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet CODE="Square.class" HEIGHT=500 WIDTH= 750>
</applet>*/
public class Square extends Applet implements ActionListener
{
	Label l1, l2;
	TextField no, ans;
	Button calc;
	public void init()
	{
		l1=new Label("Enter a number");
		l2=new Label("Result:");
		calc=new Button("Calculate");
		no=new TextField(5);
		ans=new TextField(5);
		calc.addActionListener(this);
		add(l1);
		add(no);
		add(l2);
		ans.setEditable(false);
		add(ans);
		add(calc);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x, y;
		x=Integer.parseInt(no.getText());
		y=x*x;
		ans.setText(String.valueOf(y));
	}
}
		
		