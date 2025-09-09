package formas;

public class Triangle implements Shape{
    private int NumAngulo = 3;
    @Override
    public void draw() {
        System.out.println("Desenhando um triângulo");
    }

    public int getNumAngulo() {
        return NumAngulo;
    }
}
