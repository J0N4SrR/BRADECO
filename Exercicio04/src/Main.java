import formas.Circle;
import formas.Shape;
import formas.Square;
import formas.Triangle;
import ordenacao.OrdenarPorNumAnguloStrategy;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lista Original em ordem de inserção:");
        List<Shape> shapes = Arrays.asList(new Square(), new Triangle(),new Circle());
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("-------------------------------------");
        System.out.println("Ordenando por Número de Angulos:");
        Comparator<Shape> comparadorPorAngulo = new OrdenarPorNumAnguloStrategy();
        shapes.sort(comparadorPorAngulo);
        for (Shape shape : shapes) {
            shape.draw();
        }




    }
}

/*É possível adicionar ordem ao código do exercício anterior sem alterar o código-fonte pré-existente?*/
/* R: NÃO, Você inevitavelmente terá que alterar o código cliente (Main) para aplicar essa nova estratégia de ordenação. */

/* A solução é fechada para modificação, pois as classes Shape não são alteradas para suportar novas regras de ordenação.
Ela é aberta para extensão, pois novas estratégias de ordenação podem ser adicionadas simplesmente criando novas classes Comparator. */