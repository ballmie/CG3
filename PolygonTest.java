import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.image.BufferedImage;

class PolygonTest extends JPanel {

    //private static final long serialVersionUID = 1L;

    public static void main(String[] args) 
	{

        PolygonTest m = new PolygonTest();
        JFrame f = new JFrame();

        f.add(m);
        f.setTitle("Lab3");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) 
	{

        BufferedImage buffer = new BufferedImage(6001, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
		Color blue = new Color(0,0,0);
        g2.setColor(blue);


        
        int x001[] = { 239,216,211 };
        int y001[] = { 235,234,247 };
		Apoly(g,g2,x001,y001);
		
		int x002[] = { 216,208,211 };
        int y002[] = { 234,235,247 };
		Apoly(g,g2,x002,y002);

		int x003[] = { 208,190,210 };
        int y003[] = { 235,241,242 };
		Apoly(g,g2,x003,y003);

		int x004[] = { 190,154,181 };
        int y004[] = { 241,253,249 };
		Apoly(g,g2,x004,y004);



		int x005[] = { 209,204,200 };
        int y005[] = { 235,225,238 };
		Apoly(g,g2,x005,y005);

		int x006[] = { 204,200,191 };
        int y006[] = { 225,238,226 };
		Apoly(g,g2,x006,y006);

		int x007[] = { 200,191,190 };
        int y007[] = { 238,226,241 };
		Apoly(g,g2,x007,y007);

		int x008[] = { 191,181,190 };
        int y008[] = { 226,235,241 };
		Apoly(g,g2,x008,y008);

		int x009[] = { 181,181,190 };
        int y009[] = { 235,245,241 };
		Apoly(g,g2,x009,y009);



		int x010[] = { 181,197,189 };
        int y010[] = { 249,242,259 };
		Apoly(g,g2,x010,y010);

		int x011[] = { 197,189,200 };
        int y011[] = { 242,259,255 };
		Apoly(g,g2,x011,y011);

		int x012[] = { 216,208,211 };
        int y012[] = { 234,235,247 };
		Apoly(g,g2,x012,y012);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x014[] = { 216,208,211 };
        int y014[] = { 234,235,247 };
		Apoly(g,g2,x014,y014);

		int x015[] = { 216,208,211 };
        int y015[] = { 234,235,247 };
		Apoly(g,g2,x015,y015);

		int x016[] = { 216,208,211 };
        int y016[] = { 234,235,247 };
		Apoly(g,g2,x016,y016);

		int x017[] = { 216,208,211 };
        int y017[] = { 234,235,247 };
		Apoly(g,g2,x017,y017);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);

		int x013[] = { 216,208,211 };
        int y013[] = { 234,235,247 };
		Apoly(g,g2,x013,y013);











        

















		g.drawImage(buffer, 0, 0, null);

    }

	public void Apoly(Graphics g,Graphics2D g2,int x[],int y[])
	{
        Polygon poly2 = new Polygon(x, y, x.length);
        g2.drawPolygon(poly2);
	}





    public BufferedImage FLoodFill(Graphics g, BufferedImage buffer, Point pT, Color target_c, Color replace_c) 
	{

        Queue<Point> n = new LinkedList<Point>();
   
        setColor(buffer, pT, replace_c);
        n.add(new Point(pT));

        while (!(n.isEmpty())) 
		{
            Point current = n.remove();
            Point target_Point;

            if (getCurrent_Color(buffer, current.x, current.y + 1).equals(target_c)) 
			{

                target_Point = new Point(current.x, current.y + 1);

                setColor(buffer, target_Point, replace_c);
                n.add(target_Point);

            }
            if (getCurrent_Color(buffer, current.x, current.y - 1).equals(target_c)) 
			{

                target_Point = new Point(current.x, current.y - 1);

                setColor(buffer, target_Point, replace_c);
                n.add(target_Point);

            }
            if (getCurrent_Color(buffer, current.x - 1, current.y).equals(target_c)) 
			{

                target_Point = new Point(current.x - 1, current.y);


                setColor(buffer, target_Point, replace_c);

                n.add(target_Point);

            }
            if (getCurrent_Color(buffer, current.x + 1, current.y).equals(target_c)) 
			{

                target_Point = new Point(current.x + 1, current.y);
                setColor(buffer, target_Point, replace_c);
                n.add(target_Point);

            }

        }
        return buffer;
    }
	
    public Color getCurrent_Color(BufferedImage g, Point pT) 
	{

        int rgb = g.getRGB(pT.x, pT.y);
        Color C = new Color(rgb, true);
        return C;

    }

    public void setColor(BufferedImage g, Point pT, Color replace_c) 
	{

        int rgb = replace_c.getRGB();
        g.setRGB(pT.x, pT.y, rgb);

    }

    public Color getCurrent_Color(BufferedImage g, int x, int y) 
	{

        int rgb = g.getRGB(x, y);
        Color col = new Color(rgb, true);
        return col;

    }

	public void plot(Graphics g, Color c, Point pT) {

        g.setColor(c);
        g.fillRect(pT.x, pT.y, 1, 1);

    }

    public void plot(Graphics g, Color c, Point pT, int sizeX, int sizeY) 
	{

        g.setColor(c);
        g.fillRect(pT.x, pT.y, sizeX, sizeY);

    }

}