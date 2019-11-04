import java.awt.*;
import java.applet.*;
/*<applet CODE="Face2.java" HEIGHT=500 WIDTH= 750>
</applet>*/
public class Face2 extends Applet
{
	public void paint(Graphics g) 
	{
		g.drawOval(20,20,75, 50);
		g.drawOval(115,20,75, 50);
		g.drawLine(105, 20, 105, 100);
		g.drawArc(5, 5, 200, 110, 180, 135);
	}
}