package formas;

public class Square implements Shape {
    private int NumAngulo = 4;
    @Override
    public void draw() {
        System.out.println("Desenhando um quadrado");
    }

    public int getNumAngulo() {
        return NumAngulo;
    }
}
