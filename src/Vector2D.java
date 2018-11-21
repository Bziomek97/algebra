public class Vector2D implements Algebra{

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

    public double scalar(Vector2D secondVector){
        return x*secondVector.getX()+y*secondVector.getY();
    }

    public double abs(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
