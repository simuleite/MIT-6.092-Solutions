import java.awt.Graphics;

public class Bouncer extends MoveItems {
    // private int x;
    // private int y;
    // private int xDirection;
    // private int yDirection;
    // private Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public Bouncer(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    // public void setMovementVector(int xIncrement, int yIncrement) {
        // xDirection = xIncrement;
        // yDirection = yIncrement;
    // }

    /** Draws the sprite at its current position on to surface. */
    @Override
    public void draw(Graphics surface) {
        // Draw the sprite
        // sprite.draw(surface, x, y);

        // Move the object each time we draw it
        // x += xDirection;
        // y += yDirection;

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        super.draw(surface);
        super.bounce();
    }
}
