/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9e1;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista9E1 {



    public static void imprimir(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = entrada.nextInt();

        imprimir(n);

        entrada.close();
        // TODO code application logic here
    }
    
}
