import formas.Circle;
import formas.Shape;
import formas.Square;
import formas.Triangle;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

/* Por que Triangle foi adicionado sem modificar a main?
Porque o metodo drawAllShapes agora depende da abstração Shape e não de classes concretas.
Graças ao polimorfismo, ele chama o metodo draw() em qualquer objeto que cumpra o contrato da interface, sem precisar saber seu tipo específico.*/

/* Qual a relação com o Princípio Aberto/Fechado?
* O sistema está aberto a extensões (novas classes como Triangle podem ser criadas) e fechado para modificações
* (o código de drawAllShapes não precisa ser alterado para suportar essas novas classes). */
