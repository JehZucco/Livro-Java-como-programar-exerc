/** Questão pede para escrever um aplicativo que leia um inteiro, além de determinar e imprimir se ele é par ou ímpar.
 * */

import java.util.Scanner;

public class NumerosParesEImpares {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int numero1;

        System.out.print("Digite um número inteiro: ");
        numero1 = input.nextInt();

        System.out.printf(numero1 % 2 == 0 ? "É um número par%n" : "É um número ímpar%n");
    }
}
