import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // Bouncer movingSprite;
    // ArrayList<Bouncer> movingSprites;
    // StraightMover straightMover;
    // ArrayList<StraightMover> straightMovers;
    Mover mover;
    ArrayList<Mover> movers;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // movingSprites = new ArrayList<Bouncer>();
        // straightMovers = new ArrayList<StraightMover>();
        movers = new ArrayList<Mover>();

        Rectangle box;
        Oval oval;
        
        box = new Rectangle(30, 20, Color.GRAY);
        mover = new Bouncer(200, 10, box);
        mover.setMovementVector(-2, 4);
        movers.add(mover);
        
        oval = new Oval(20, 30, Color.PINK);
        mover = new Bouncer(10, 200, oval);
        mover.setMovementVector(1, 1);
        movers.add(mover);
        
        box = new Rectangle(15, 20, Color.RED);
        mover = new StraightMover(100, 170, box);
        mover.setMovementVector(3, 1);
        movers.add(mover);
        
        oval = new Oval(50, 25, Color.ORANGE);
        mover = new StraightMover(250, 0, oval);
        mover.setMovementVector(-2, 2);
        movers.add(mover);

    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover: movers) {
            mover.draw(surface);
        }
    }
}
