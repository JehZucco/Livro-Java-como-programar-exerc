/** Essa questão do livro pede para escrever um aplicativo que imprima um padrão de tabuleiro de damas com asteríscos;
 *
 * Nesse caso, é usada a instrução de repetição while para formar a coluna aninhada em outra instrução de
 * repetição while que forma as linhas. Assim, como são 8 linhas, inicia-se a variável inteira linha com valor 8,
 * e enquanto essa variável for maior ou igual a 1 executará a formação de colunas. Ao terminar as instruções da formação de colunas,
 * decrementa-se 1 da variável linha e pula uma linha com o println, assim a instrução da formação de colunas,
 * decremento e println é executada 8 vezes, formando 8 linhas.
 *
 * Para a formação de colunas, há dois padrões que são alternados, sendo cada padrão usado uma linha sim, uma linha não,
 * que é o mesmo que dizer que um padrão é usado só nas linhas de número par, e outro é usado só nas linhas de número ímpar.
 * É sabido que todo número par é divisível por 2, ou seja, ao ser dividido por 2 o resto é zero.
 *Assim, esse segundo while testa o valor da variável coluna,
 * se ele for menor ou igual a 8 o aplicativo avalia se na divisão do valor da variável linha por 2 o resto é 1,
 * se é ele imprime o argumento que está antes dos dois pontos, se não ele imprime o que está após.
 * Então ele incrementa 1 na variável coluna e o aplicativo repete tudo até que o valor seja 9, pois é maior que 8.
 * */
public class TabuleiroDamasAsterisco {
    public static void main(String[] args) {

        int linha = 8;
        while(linha >= 1){

            int coluna = 1;
            while(coluna <= 8){
                System.out.print(linha % 2 == 1 ? " *" : "* "); //note que aqui é print e não println
                ++coluna;
            }
            --linha;
            System.out.println();

        }
    }
}
