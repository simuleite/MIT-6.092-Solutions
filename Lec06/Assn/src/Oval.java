import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class Oval implements Sprite{
    // private int x;
    // private int y;
    // private int xDirection;
    // private int yDirection;
    // private Sprite sprite;
    private int width;
    private int height;
    private Color color;

    /** Constructor **/
    public Oval(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    // public void setMovementVector(int xIncrement, int yIncrement){
        // xDirection = xIncrement;
        // yDirection = yIncrement;
    // }
    
    public int getWidth() {
        /** Use "return 0" to see the oval slip out of the edge. **/ 
        
        // You must modify DrawGraphics to ensure it works. 
        // Or java will run the former code, nothing will be different.
        // return 0;
        return width;
    }
    
    public int getHeight() {
        // return 0;
        return height;
    }
    
    public void draw(Graphics surface, int x, int y) {
        surface.setColor(color);
        surface.fillOval(x, y, width, height);
        // black edge
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(x, y, width, height);
    }
}