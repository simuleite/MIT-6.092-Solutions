import java.awt.Graphics;

public class MoveItems implements Mover {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public MoveItems(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite; 
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);

        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;
    }
    
    public int getX() {
        return x;
    }

    public int getXDirection() {
        return xDirection;
    }

    public int getY() {
        return y;
    }

    public int getYDirection() {
        return yDirection;
    }

    public Sprite getSprite() {
        return sprite;
    }
}