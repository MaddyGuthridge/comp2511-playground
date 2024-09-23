package navigator;

public class Vector {
    private int x;
    private int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Vector add(Direction d) {
        switch (d) {
        case NORTH:
            return new Vector(this.x, this.y + 1);
        case SOUTH:
            return new Vector(this.x, this.y - 1);
        case EAST:
            return new Vector(this.x - 1, this.y);
        case WEST:
            return new Vector(this.x + 1, this.y);
        default:
            throw new Error("Invalid direction");
        }
    }

    public Vector add(Vector v) {
        return new Vector(this.x + v.getX(), this.y + v.getY());
    }
}
