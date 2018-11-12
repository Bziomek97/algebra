public class Vector2dAdapter extends Vector3D{
    private Vector2D vector;

    public Vector2dAdapter(Vector2D vector2d){
        super(vector2d.getX(),vector2d.getY(),0);
        this.vector=vector2d;
    }
}
