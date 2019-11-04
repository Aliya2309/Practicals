import java.awt.*;
import java.applet.*;
/*<applet CODE="Face.java" HEIGHT=500 WIDTH= 750>
</applet>*/
public class Face extends Applet
{
	public void paint(Graphics g) 
	{
		g.drawOval(20,20,75, 50);
		g.drawOval(115,20,75, 50);
		g.drawLine(105, 20, 105, 100);
		g.drawLine(65, 125, 145, 125);
	}
}