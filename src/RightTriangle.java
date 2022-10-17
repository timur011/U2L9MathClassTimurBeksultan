public class RightTriangle {

    private double base;
    private double height;
    public RightTriangle(double base, double height){

        this.base = base;
        this.height = height;

    }
    public double hypotenuse(){
        double s1sq = Math.pow(base, 2);
        double s2sq = Math.pow(height, 2);
        double hypotenuseL = Math.sqrt(s1sq + s2sq);


    }

}
