package pl.waw.sgh.shapes;

public abstract class TriangleShape {
    protected double parH;
    protected double parG;

//    public Shape() {
//    }

    public TriangleShape(double h, double g) {
        setParams(h, g);
    }

    public void setParams(double h, double g) {
        System.out.println("Changing parameters parH from: " + this.parH + " to: " + parH);
        this.parH = h;
        parG = g;
    }

    public abstract double calcSurface();
//    {
//        return -1;
//    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ["+ parH + ", " + parG + "]";
    }
}

