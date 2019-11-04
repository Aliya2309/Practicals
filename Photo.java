import java.awt.*;
import java.applet.*;
/*<applet CODE="Photo.class" HEIGHT=800 WIDTH=800>
</applet>*/
public class Photo extends Applet 
{
	Image pic;
	public void init()
	{
		pic=getImage(getDocumentBase(),"flower.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(pic, 30, 30, this);
	}
}