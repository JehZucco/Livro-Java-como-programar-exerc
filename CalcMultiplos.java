/** Essa questão pede para escrever um aplicativo que leia dois inteiros,
 * além de determinar se o primeiro é múltiplo do segundo e imprimir o resultado.
 * Como dica, diz para utilizar o operador de resto.
 * */

import java.util.Scanner;

public class CalcMultiplos {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Esse aplicativo avalia se o primeiro número digitado é múltiplo do segundo");
        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        if(numero1 % numero2 == 0){
            System.out.printf("%d é múltiplo de %d%n", numero1, numero2);
        } else
            System.out.printf("%d NÃO é múltiplo de %d%n", numero1, numero2);




    }
}
