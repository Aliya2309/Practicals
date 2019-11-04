import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet CODE="Max.class" HEIGHT=500 WIDTH=500
</applet>*/
public class Max extends Applet implements ActionListener
{
	Label l1, l2, l3, l4;
	TextField no1, no2, no3, ans;
	Button calc;
	public void init()
	{
		l1=new Label("Number 1:");
		l2=new Label("Number 2:");
		l3=new Label("Number 3:");
		l4=new Label("Ans:");
		no1=new TextField(5);
		no2=new TextField(5);
		no3=new TextField(5);
		ans=new TextField(5);
		calc =new Button("Calculate");
		calc.addActionListener(this);
		add(l1);
		add(no1);
		add(l2);
		add(no2);
		add(l3);
		add(no3);
		add(l4);
		ans.setEditable(false);
		add(ans);
		add(calc);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1, n2, n3, max=0;
		n1=Integer.parseInt(no1.getText());
		n2=Integer.parseInt(no2.getText());
		n3=Integer.parseInt(no3.getText());
		if(n1>=n2 && n1>=n3)
		{
			max=n1;
		}
		else if(n2>n1 && n2>n3)
		{
			max=n2;
		}
		else if(n3>n2 && n3>n1)
		{
			max=n3;
		}
		ans.setText(String.valueOf(max));
	}
}