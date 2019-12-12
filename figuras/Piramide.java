/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author jgarciaodowd
 */
public class Piramide {

    private final String simbolo = "*";
    Scanner sc = new Scanner(System.in);
    private int altura2;
    private String espacio = " ";

    public void pedirDatos() {
        System.out.println("Introduce la altura de la piramide: ");
        altura2 = sc.nextInt();
    }

    public void DibujaPiramide() {
        pedirDatos();
        String acumulador = "*";
        for (int i = 0; i < altura2; i++) {
            for (int j = altura2; j > altura2; j--) {
                acumulador = " " + acumulador;
            }

        }
    }
}    

