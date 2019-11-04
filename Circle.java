import java.awt.*;
import java.applet.*;
/*<applet CODE="Circle.java" HEIGHT=500 WIDTH=750>
</applet>*/
public class Circle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(20,20,50,50);
		g.setColor(Color.RED);
		g.fillOval(100,20,50,50);
	}
}