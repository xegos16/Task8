//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new rectangle(4, 6),
                new Tringale(3, 4, 5),
                new Square(4),
                new Pentagon(3)
        };

        for (Shape shape : shapes) {
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
        }
    }
