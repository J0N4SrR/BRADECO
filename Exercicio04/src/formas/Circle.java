package formas;

public class Circle implements Shape{
    private int NumAngulo = 0;
    @Override
    public void draw() {
        System.out.println("Desenhando um círculo");
    }

    public int getNumAngulo() {
        return NumAngulo;
    }
}
