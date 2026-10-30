/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9e6;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista9E6 {
  public static int converter(int hora, char[] periodo) {

        if (hora >= 12) {
            periodo[0] = 'P';
        } else {
            periodo[0] = 'A';
        }

        if (hora == 0) {
            hora = 12;
        } else if (hora > 12) {
            hora = hora - 12;
        }

        return hora;
    }

    public static void exibir(int hora, int minuto, char periodo) {

        System.out.println("Horario convertido: " +
                hora + ":" +
                String.format("%02d", minuto) +
                " " + periodo + ".M.");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {

            System.out.print("Digite a hora (0 a 23): ");
            int hora = entrada.nextInt();

            System.out.print("Digite os minutos (0 a 59): ");
            int minuto = entrada.nextInt();

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {

                System.out.println("Horario invalido!");

            } else {

                char[] periodo = new char[1];

                int horaConvertida = converter(hora, periodo);

                exibir(horaConvertida, minuto, periodo[0]);
            }

            System.out.print("\nDeseja realizar outra conversao? ");
            continuar = entrada.next().charAt(0);
        }

        System.out.println("Programa encerrado!");

        entrada.close();
    }
    
}
