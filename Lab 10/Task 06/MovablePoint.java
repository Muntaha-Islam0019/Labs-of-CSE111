public class MovablePoint implements Movable {
    
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString() {
        String str = "This object in now on position: (" + x + "," + y + ")\nIt has a velocity of " + xSpeed + " on X co-ordinate & a velocity of " + ySpeed + " on Y co-ordinate.\n";
        return str;
    }
    
    @Override
    public void moveUp() {
        y++;
    }
    
    @Override
    public void moveDown() {
        y--;
    }
    
    @Override
    public void moveLeft() {
        x--;
    }
    
    @Override
    public void moveRight() {
        x++;
    }
}