public class Pentagon extends  Shape{
    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 5 * side;
    }
}

