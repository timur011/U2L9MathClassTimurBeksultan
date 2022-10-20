public class RightTriangleRunner {
    public static void main(String []args){
        RightTriangle r1 = new RightTriangle(3, 4);
        RightTriangle r2 = new RightTriangle(6.5, 10.7);
        RightTriangle r3 = new RightTriangle(6, 8);
        System.out.println(r1.hypotenuse());
        System.out.println(r2.hypotenuse());
        System.out.println(r3.hypotenuse());

    }
}
