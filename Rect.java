import java.awt.*;
import java.applet.*;
/*<applet CODE="Rect.java" HEIGHT=500 WIDTH= 750>
</applet>*/
public class Rect extends Applet
{
	public void paint(Graphics g) 
	{
		g.drawRect(20, 20, 70, 150);
		g.fillRect(20, 200, 70, 150);
		g.setColor(Color.YELLOW);
		g.drawRoundRect(100,20,70,150, 10, 10);
		g.fillRoundRect(100, 200, 70, 150, 10, 10);
	}
}