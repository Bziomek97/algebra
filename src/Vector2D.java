public class Vector2D {

    private double x,y;

    Vector2D(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double scalar(Vector2D secondVector){
        return x*secondVector.getX()+y*secondVector.getY();
    }
}
