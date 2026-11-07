/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6p2p3;

/**
 *
 * @author Tesoem
 */
import java.util.Scanner;
public class ED3S6P2P3 {


    int tam = 10;
    int[] cola = new int[tam];
    int indice = 0;
    Scanner sc = new Scanner(System.in);

    public ED3S6P2P3() {
        int opcion;

        do {
            System.out.println("\n1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    inserta();
                    break;
                case 2:
                    elimina();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 4);
    }

    private boolean verificaLleno() {
        if (indice >= tam) {
            System.out.println("Cola llena");
            return true;
        }
        return false;
    }

    private boolean verificaVacio() {
        if (indice == 0) {
            System.out.println("Cola vacia");
            return true;
        }
        return false;
    }

    private void inserta() {
        if (!verificaLleno()) {
            System.out.print("Ingresa el valor: ");
            int valor = sc.nextInt();

            cola[indice] = valor;
            indice = indice + 1;
        }
    }

    private void elimina() {
        if (!verificaVacio()) {
            System.out.println("Elemento eliminado: " + cola[0]);

            recorrer();
            indice = indice - 1;
            cola[indice] = 0;
        }
    }

    private void recorrer() {
        for (int i = 0; i < indice - 1; i++) {
            cola[i] = cola[i + 1];
        }
    }

    private void listar() {
        if (!verificaVacio()) {
            System.out.println("Contenido de la cola:");

            int i;
            for (i = indice - 1; i >= 0; i--) {
                System.out.print("Cola[" + i + "] = " + cola[i] + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new ED3S6P2P3();
    }
}
