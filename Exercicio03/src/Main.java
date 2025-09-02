import java.util.Arrays;
import java.util.List;

public enum ShapeType {
    CIRCLE,
    SQUARE
}

public class Circle {
    private ShapeType type = ShapeType.CIRCLE;

    public void drawCircle() {
        System.out.println("Desenha um círculo");
    }

    public ShapeType getType() {
        return type;
    }
}

public class Square {
    private ShapeType type = ShapeType.SQUARE;

    public void drawSquare() {
        System.out.println("Desenha um quadrado");
    }

    public ShapeType getType() {
        return type;
    }
}

public class Main {
    public static void drawAllShapes(List<Object> shapes) {
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).drawCircle();
            } else if (s instanceof Square) {
                ((Square) s).drawSquare();
            }
        }
    }

    public static void main(String[] args) {
        List<Object> shapes = Arrays.asList(new Circle(), new Square());
        drawAllShapes(shapes);
    }
}