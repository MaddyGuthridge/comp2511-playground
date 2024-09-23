package navigator;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Position add(Direction d) {
        switch (d) {
        case NORTH:
            return new Position(this.x, this.y + 1);
        case SOUTH:
            return new Position(this.x, this.y - 1);
        case EAST:
            return new Position(this.x - 1, this.y);
        case WEST:
            return new Position(this.x + 1, this.y);
        default:
            throw new Error("Invalid direction");
        }
    }

    public Position add(Vector v) {
        return new Position(this.x + v.getX(), this.y + v.getY());
    }

    public Vector subtract(Position other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }
}
