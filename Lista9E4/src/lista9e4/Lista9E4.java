/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9e4;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista9E4 {

  
    public static char verificar(int numero) {

        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        char resultado = verificar(numero);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    
    }
    
}
