// Name: Ruohan Sun
// USC NetID: 6539994087
// CS 455 PA1
// Spring 2018

//we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;


/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
   
	/**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   private int bottom;
   private int left;
   private int width;
   private int barHeight;
   private double scale;
   private Color color;
   private String label;
   
   /**
      The constructor of the Bar object
      initialize bar's properties
   */
   public Bar(int bottom, int left, int width, int barHeight,
              double scale, Color color, String label) {
	   this.bottom=bottom;
	   this.left=left;
	   this.color=color;
	   this.label=label;
	   this.barHeight=barHeight;
	   this.width=width;
	   this.scale=scale;
   }
    
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
	   int x=left;
	   int height=(int)(scale*barHeight);
	   int y=bottom-height;
	   
	   //initialize the bar rectangle, setting the area and the color
	   Rectangle resultBar=new Rectangle(x,y,width,height);
	   g2.setColor(color);
	   g2.fill(resultBar);
	   
	   //Setting the area to contain each bar's description
	   Font font=g2.getFont();
	   FontRenderContext description=g2.getFontRenderContext();
	   Rectangle2D labelBounds=font.getStringBounds(label, description);
	   
	   //Set the label's color, and then draw the label
	   int startX=left-width;
	   int startY=bottom+(int)labelBounds.getHeight();
	   g2.setColor(Color.black);
	   g2.drawString(label, startX, startY);
	   
	   
	   
   }
}