/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listae5;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class ListaE5 {

  

    public static double somaImposto(double taxaImposto, double custo) {

        double imposto = custo * (taxaImposto / 100);

        double novoCusto = custo + imposto;

        return novoCusto;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o custo do produto: ");
        double custo = entrada.nextDouble();

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = entrada.nextDouble();

        custo = somaImposto(taxaImposto, custo);

        System.out.println("Custo com imposto: R$ " + custo);

        entrada.close();
    
    }
    }
