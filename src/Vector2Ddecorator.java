public class Vector2Ddecorator extends Vector2D {
    private Vector2D vector;

    public Vector2Ddecorator(Vector2D vector2d){
        super(vector2d.getX(),vector2d.getY());
        vector=vector2d;
    }

    public double getAngle() {
        return Math.atan2(vector.getY(),vector.getX())*180.0/Math.PI;
    }

    public double getLength() {
        return Math.sqrt(vector.getX()*vector.getX()+vector.getY()*vector.getY());
    }
}
