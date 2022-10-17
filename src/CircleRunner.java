public class CircleRunner {
    public static void main(String []arg){
        Circle circ1 = new Circle(5);
        String info = circ1.getInfo();
        System.out.println(info);
        circ1.setRadius(9.2);
        System.out.println(circ1.getInfo());


    }
}
