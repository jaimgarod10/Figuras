package figuras;

import java.util.Scanner;

/**
 *
 * @author jgarciaodowd
 */
public class Triangulo {

    private final String letra = "a";
    Scanner sc = new Scanner(System.in);
    private int altura;

    public void pedirDatos() {
        System.out.println("Introduce la altura del triángulo");
        altura = sc.nextInt();
    }

    public void DibujaTriangulo() {
        pedirDatos();
        String acumulador = "a";
        for (int i = 0; i < altura; i++) {
            System.out.println(acumulador);
            acumulador += letra;
        }
    }

}
