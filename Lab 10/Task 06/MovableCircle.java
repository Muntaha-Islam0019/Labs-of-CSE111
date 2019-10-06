public class MovableCircle implements Movable {
    
    int radius;
    MovablePoint center;
    
    MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint (x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        String str = "This circle object's center in now on position: (" + center.x + "," + center.y + ")\nIt has a velocity of " + center.xSpeed + " on X co-ordinate & a velocity of " + center.ySpeed + " on Y co-ordinate.\nAlso, the radius of this object is " + radius + ".\n";
        return str;
    }
    
    @Override
    public void moveUp() {
        center.y++;
    }
    
    @Override
    public void moveDown() {
        center.y--;
    }
    
    @Override
    public void moveLeft() {
        center.x--;
    }
    
    @Override
    public void moveRight() {
        center.x++;
    }
}