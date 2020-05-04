package pl.waw.sgh.shapes;

public class Triangle extends TriangleShape{
    public Triangle(double h, double g){
        super(h, g);
    }
    public double calcSurface() {
        return this.parH*parG/2;
    }
//    @Override
//    public double calcPerimeter() { return this.parG*parH; }
}
