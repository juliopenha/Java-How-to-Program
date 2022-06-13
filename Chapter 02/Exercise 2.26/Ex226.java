
/*******************************************************************************
 * (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar
 * se o primeiro é um múltiplo do segundo e imprimir o resultado. 
 * [Dica: utilize o operador de resto.]
*******************************************************************************/
import java.util.Scanner;

public class Ex226 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Insira 2 números inteiros para determinar se o primeiro é múltiplo do segundo.");
    System.out.print("Primeiro número: ");
    int number1 = input.nextInt();
    System.out.print("Segundo número: ");
    int number2 = input.nextInt();
    input.close();

    if (number1 % number2 == 0) {
      System.out.printf("O número %d é múltiplo de %d%n", number1, number2);
    } else {
      System.out.printf("O número %d NÃO é múltiplo de %d%n", number1, number2);
    }
  }
}
