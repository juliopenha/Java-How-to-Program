
/*******************************************************************************
 * (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar
 * e imprimir se ele é ímpar ou par. [Dica: utilize o operador de resto. 
 * Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 
 * quando dividido por 2.]
*******************************************************************************/
import java.util.Scanner;

public class Ex225 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Insira um número para saber se ele é par ou ímpar: ");
    int number = input.nextInt();

    input.close();

    if (number % 2 == 0) {
      System.out.printf("O número %d é par.%n", number);
    } else {
      System.out.printf("O número %d é ímpar.%n", number);
    }
  }
}
