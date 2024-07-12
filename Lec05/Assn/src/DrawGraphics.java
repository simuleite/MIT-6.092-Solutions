import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<BouncingBox>();
        box = new BouncingBox(187, 50, Color.RED);
        boxes.add(box);
        box = new BouncingBox(50, 250, Color.BLUE);
        boxes.add(box);
        box = new BouncingBox(250, 250, Color.GREEN);
        boxes.add(box);

        // Or put setMovementVector() here.
        // boxes.get(0).setMovementVector(-2, 1);
        // boxes.get(1).setMovementVector(2, -1);
        // boxes.get(2).setMovementVector(-2, -2);
 
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 60, 250, 260);
        surface.drawLine(60, 50, 260, 250);
        surface.drawArc(250, 250, 25, 25, 10, 360);
        surface.drawLine(200, 200, 45, 45);
        surface.drawLine(250, 150, 150, 250);
        surface.drawOval(150, 20, 75, 125);
        surface.fillRect(160, 70, 55, 10);
        
        boxes.get(0).draw(surface);
        boxes.get(1).draw(surface);
        boxes.get(2).draw(surface);
        boxes.get(0).setMovementVector(-2, 1);
        boxes.get(1).setMovementVector(2, -1);
        boxes.get(2).setMovementVector(-2, -2);
        
        // Better way:
        // for (BouncingBox box: boxes) {
            // box.draw(surface);
        // }
        
        // surface.fillRect(150, 100, 25, 40);
        surface.setColor(Color.YELLOW);
        // After this items turn yellow
        surface.fillOval(40, 40, 25, 10);
        surface.drawString("Mr. And Mrs. Smith", 200, 10);
    }
}