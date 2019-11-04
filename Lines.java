import java.awt.*;
import java.applet.*;
/*<applet CODE="Lines.java" WIDTH=500 HEIGHT=500>
</applet>
*/
public class Lines extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(20,20,100,20);
		g.drawLine(20,60,100,60);
		g.drawLine(40,50,40,150);
		g.drawLine(60,50,60,150);
	}
}