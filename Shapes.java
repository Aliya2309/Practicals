import java.awt.*;
import java.applet.*;
/*<applet CODE="Shapes.java" HEIGHT=500 WIDTH=750>
</applet>*/
public class Shapes extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(20,20,50,50);
		g.setColor(Color.RED);
		g.fillOval(100,20,50,50);
		int x[]={20, 40, 50, 30};
		int y[]={100, 100, 150, 150};
		g.drawPolygon(x,y,4);
	}
}