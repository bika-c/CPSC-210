package model.utility;

// Coordinate is a (x, y) coordinate
public class Coordinate {

    private int xcoord;
    private int ycoord;

    // EFFECTS: constructs a coordinate with the given x and y
    public Coordinate(int xcoord, int ycoord) {
        this.xcoord = xcoord;
        this.ycoord = ycoord;
    }

    // MODIFIES: this
    // EFFECTS: set x to be the given x
    public void setX(int xcoord) {
        this.xcoord = xcoord;
    }

    // MODIFIES: this
    // EFFECTS: set y to be the given y
    public void setY(int ycoord) {
        this.ycoord = ycoord;
    }

    // MODIFIES: this
    // EFFECTS: xcoord - 1
    public void goLeft() {
        this.xcoord--;
    }

    // MODIFIES: this
    // EFFECTS: xcoord + 1
    public void goRight() {
        this.xcoord++;
    }

    // MODIFIES: this
    // EFFECTS: ycoord - 1
    public void goUp() {
        this.ycoord--;
    }

    // MODIFIES: this
    // EFFECTS: ycoord + 1
    public void goDown() {
        this.ycoord++;
    }

    // MODIFIES: this
    // EFFECTS: go with the given direction
    // for example go(Direction.up) is equivalent to goUp()
    public void go(Direction direction) {
        switch (direction) {
            case up:
                this.goUp();
                break;
            case down:
                this.goDown();
                break;
            case left:
                this.goLeft();
                break;
            case right:
                this.goRight();
                break;

            default:
                break;
        }
    }

    // MODIFIES: this
    // EFFECTS: set xcoord to be the newX
    // and ycoord to be the newY
    public void setXY(int newX, int newY) {
        this.xcoord = newX;
        this.ycoord = newY;
    }

    // MODIFIES: this
    // EFFECTS: increase y by amount
    public void increaseY(int amount) {
        this.ycoord += amount;
    }

    // MODIFIES: this
    // EFFECTS: decrease y by amount
    public void decreaseY(int amount) {
        this.ycoord -= amount;
    }

    // MODIFIES: this
    // EFFECTS: increase x by amount
    public void increaseX(int amount) {
        this.xcoord += amount;
    }

    // MODIFIES: this
    // EFFECTS: decrease x by amount
    public void decreaseX(int amount) {
        this.xcoord -= amount;
    }

    // MODIFIES: this
    // EFFECTS: increase x and y by dx and dy
    public void increaseXY(int dx, int dy) {
        this.xcoord += dx;
        this.ycoord += dy;
    }

    // MODIFIES: this
    // EFFECTS: decrease x and y by dx and dy
    public void decreaseXY(int dx, int dy) {
        this.xcoord -= dx;
        this.ycoord -= dy;
    }


    // REQUIRES: coordinate != null
    // EFFECTS: true if getX() == coordinate.getX() && getY() == coordinate.getY();
    public boolean isSame(Coordinate coordinate) {
        return this.xcoord == coordinate.xcoord && this.ycoord == coordinate.ycoord;
    }

    // EFFECTS: true if getX() == x && getY() == y;
    public boolean isSame(int x, int y) {
        return this.xcoord == x && this.ycoord == y;
    }

    public int getX() {
        return xcoord;
    }

    public int getY() {
        return ycoord;
    }
}
