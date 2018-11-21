public class Main {

    public static void main(String[] args) {
        Vector2D tmp = new Vector2D(1,1);
        Vector2D tmp2 = new Vector2D(10,20);

        System.out.println("|x|= "+tmp.abs()+", |y|= "+tmp2.abs());
        System.out.println("Iloczyn Skalarny: "+tmp.scalar(tmp2));

        Vector3D vector1 = new Vector3D(5,10,15);
        Vector3D vector2 = new Vector3D(10,20,36);
        Vector2dAdapter tmp3 = new Vector2dAdapter(tmp);

        System.out.println("*************************************");
        System.out.println("|a|= "+vector1.abs()+", |b|= "+vector2.abs()+", |x|= "+tmp3.abs());
        System.out.println("Iloczyn Skalarny: "+vector1.scalar(tmp3));
        System.out.println("Iloczyn Wektorowy: ["+vector1.vector(vector2).get(0)+", "+vector1.vector(vector2).get(1)+", "+vector1.vector(vector2).get(2)+"]");

        Vector2Ddecorator tmp4= new Vector2Ddecorator(tmp);
        System.out.println("*************************************");
        System.out.println("Kąt: " + tmp4.getAngle());
        System.out.println("Długość: " + tmp4.getLength());
    }

}
