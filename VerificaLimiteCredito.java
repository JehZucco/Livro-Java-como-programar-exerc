/*4.18 (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
        limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
        a) Número de conta.
        b) Saldo no início do mês.
        c) Total de todos os itens cobrados desse cliente no mês.
        d) Total de créditos aplicados ao cliente no mês.
        e) Limite de crédito autorizado.
        O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas-créditos), exibir o novo saldo e
        determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
        exibir a mensagem "Limite de crédito excedido".
Até esse capítulo Orientação a Objetos ainda não foi ensinado, então acho q a ideia é fazer algo bem simples sem OO
nesse caso é preciso ficar mudando o valor das variáveis toda vez que for calcular, quando for calcular as informações
de um novo cliente é necessário excluir as do cliente anterior.
*/
public class VerificaLimiteCredito {
    public static void main(String[] args) {

        // Dados disponíveis para cada cliente:
        int numeroConta;
        //insira aqui o saldo do cliente:
        int saldoInicioMes = 3000; //saldo de gastos herdados dos meses anteriores (parcelas), creio eu
        //insira o total das despezas do cliente:
        int totalItensCobradosMes = 1500; //total de despezas feitas durante o mês que deseja calcular
        //insira aqui os créditos do cliente:
        int totalCreditosAplicadosMes = 0; //extornos, promoções da loja (talvez) e afins
        //insira aqui o limite de crédito do cliente:
        int limiteCreditoAutorizado = 4000;

        // Cálculo do novo saldo:
        int novoSaldo = (saldoInicioMes + totalItensCobradosMes) - totalCreditosAplicadosMes;

        // Imprime o novo saldo e verifica se o novo saldo excede o limite de crédito autorizado:
        if (novoSaldo > limiteCreditoAutorizado){
            System.out.println("Seu saldo de gastos atual é R$" + novoSaldo);
            System.out.println("Limite de credito excedido");
        }else
            System.out.println("Seu saldo de gastos atual é R$" + novoSaldo);
    }
}
