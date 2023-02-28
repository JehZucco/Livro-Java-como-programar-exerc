import java.util.Scanner;

public class CalcCirculo {

    /** Livro Java: como programamar, cap 2 - Resolução da questão 2.28.
     * Aplicativo que lê a entrada, a partir do usuário, do raio de um círculo
     * como um inteiro (mas usei double) e imprime o diâmetro do círculo, circunferência e área.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raioCirculo;

        System.out.print("Digite o valor do raio: ");
        raioCirculo = input.nextDouble();

        /** O exercício pede que os resultados de cada cálculo não sejam armazenados em um variável,
         * mas sim sejam calculados diretos dentro da instrução System.out.printf */

        System.out.printf("O diâmetro do círculo é %f%n", (raioCirculo * 2));
        System.out.printf("A circunferência do círculo é %f%n", (2 * Math.PI * raioCirculo));
        System.out.printf("A área do círculo é %f%n", (Math.PI * raioCirculo * raioCirculo));

    }
}
