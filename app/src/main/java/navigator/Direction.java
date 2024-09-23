package navigator;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public Direction opposite() {
        switch (this) {
        case NORTH:
            return SOUTH;
        case SOUTH:
            return NORTH;
        case EAST:
            return WEST;
        case WEST:
            return EAST;
        default:
            throw new Error("Not implemented");
        }
    }

    public Vector scale(int amount) {
        switch (this) {
        case NORTH:
            return new Vector(0, amount);
        case SOUTH:
            return new Vector(0, -amount);
        case EAST:
            return new Vector(-amount, 0);
        case WEST:
            return new Vector(amount, 0);
        default:
            throw new Error("Not implemented");
        }
    }
}
