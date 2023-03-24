/* Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
a) Leia a declaração do problema.
b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
c) Escreva um programa Java.
d) Teste, depure e execute o programa Java.
e) Processe três conjuntos completos de dados.
4.17 (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista
monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.

Algoritmo
Inicialize as variáveis
Insira a quilometragem percorrida e o consumo de gasolina
Acumule a quilometragem percorrida e o consumo de gasolina
Calcule a quilometragem percorrida por litro
Imprima o cálculo
Imprima o total da quilometragem percorrida e do consumo de gasolina

Algoritmo refinado
Inicialize o total da quilometragem percorrida como 0
Inicialize o total do consumo de gasolina como 0

Solicite que o usuário insira a quilometragem da primeira viagem
Insira a quilometragem da primeira viagem (possivelmente a sentinela)
Solicite que o usuário insira o consumo de gasolina da primiera viagem
Insira o consumo de gasolina da primeira  viagem (possivelmente a sentinela)

Enquanto o usuário não inserir o sentinela
    Adicione essa quilometragem à quilomentragem total
    Adicione esse consumo de gasolina ao consumo total
    Solicite que o usuário insira a próxima quilomentragem
    Insira a próxima quilometragem
    Solicite que o usuário insira o próximo consumo
    Insira o próximo consumo

Se o total do consumo de gasolina for diferente de 0
    Divida quilometragem pelo consumo de gasolina da viagem atual
    Imprima o calculo
    Imprima o total das quilometragens inseridas
    Imprima o total dos consumos inseridos
Caso contrário
    Imprima "Não foram inseridos valores válidos"
* */

import java.util.Scanner;

public class QuilometragemDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalQuilometragem = 0;
        int totalConsumoGasolina = 0;

        System.out.print("Insira a quilometragem percorrida ou digite -1 para sair: ");
        int quilometragem = input.nextInt();

        System.out.print("Insira o consumo de gasolina em litros ou digite -1 para sair: ");
        int consumoGasolina = input.nextInt();

        while (quilometragem != -1 || consumoGasolina != -1){
            totalQuilometragem += quilometragem;
            totalConsumoGasolina += consumoGasolina;

            if (totalConsumoGasolina != 0){ //para evitar a exceção de divisão por zero
                double calculaQuilometragemPorLitro = (double) quilometragem / consumoGasolina;
                System.out.printf("%nA quilometragem percorrida por litro é %.2f km/l", calculaQuilometragemPorLitro);
                System.out.printf("%nA quilometragem total percorrida até o momento é %d Km", totalQuilometragem);
                System.out.printf("%nO consumo total de gasolina até o momento é %d l%n", totalConsumoGasolina);
                System.out.println();
            } else
                System.out.println("Não foram inseridos valores válidos");
                System.out.println();

            System.out.print("Insira a quilometragem percorrida ou digite -1 para sair: ");
            quilometragem = input.nextInt();

            System.out.print("Insira o consumo de gasolina em litros ou digite -1 para sair: ");
            consumoGasolina = input.nextInt();
        }
    }
}
