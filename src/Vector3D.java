import java.util.ArrayList;

public class Vector3D implements Algebra{

    double x,y,z;

    Vector3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double scalar(Vector3D vector){
        return x*vector.getX()+y*vector.getY()+z*vector.getZ();
    }

    public ArrayList<Double> vector(Vector3D vector){
        ArrayList<Double> tmp = new ArrayList<>();
        tmp.add(y*vector.getZ()-z*vector.getY());
        tmp.add(z*vector.getX()-x*vector.getZ());
        tmp.add(x*vector.getY()-y*vector.getX());
        return tmp;
    }

    public double abs(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }
}
