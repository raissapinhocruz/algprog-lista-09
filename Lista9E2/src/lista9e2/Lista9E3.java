/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9e2;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista9E3 {

    /**
     
     */
       
public class Exercicio3 {

    public static int somar(int a, int b, int c) {

        int resultado = a + b + c;

        return resultado;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int n3 = entrada.nextInt();

        int resultado = somar(n1, n2, n3);

        System.out.println("A soma e: " + resultado);

        entrada.close();
    }

    
        // TODO code application logic here
    }
    
}
