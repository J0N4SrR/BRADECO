package ordenacao;

import formas.Shape;

import java.util.Comparator;

public class OrdenarPorNumAnguloStrategy implements Comparator<Shape> {
    public int compare(Shape s1, Shape s2) {
        return Integer.compare(s1.getNumAngulo(), s2.getNumAngulo());
    }


}
