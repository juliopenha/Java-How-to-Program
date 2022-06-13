
/*******************************************************************************
 * (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um 
 * número consistindo em cinco dígitos a partir do usuário, separe o número em 
 * seus dígitos individuais e imprima os dígitos separados uns dos outros por 
 * três espaços. Por exemplo, se o usuário digitar o número 42339, o programa 
 * deve imprimir 4   2   3   3   9
 * Suponha que o usuário insira o número correto de dígitos. 
 * O que acontece quando você insere um número com mais de cinco dígitos?
 * O que acontece quando você insere um número com menos de cinco dígitos?
 * [Dica: é possível fazer este exercício com as técnicas que aprendeu neste
 * capítulo. Você precisará tanto das operações de divisão como das de resto 
 * para “selecionar” cada dígito.]
 *******************************************************************************/
import java.util.Scanner;

public class Ex230 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Insira um número inteiro com 5 dígitos: ");
    int number = input.nextInt();
    input.close();

    System.out.printf("%d   %d   %d   %d   %d%n",
        number / 10000,
        (number % 10000) / 1000,
        (number % 1000) / 100,
        (number % 100) / 10,
        number % 10);
  }
}
