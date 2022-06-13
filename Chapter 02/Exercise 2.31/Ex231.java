/*******************************************************************************
 * (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação 
 * que aprendeu neste capítulo, escreva um aplicativo que calcule os quadrados 
 * e cubos dos números de 0 a 10 e imprima os valores resultantes em formato 
 * de tabela como a seguir:
 * number square  cube
 * 0	    0	      0
 * 1	    1	      1
 * 2	    4	      8
 * 3	    9	      27
 * 4	    16	    64
 * 5	    25	    125
 * 6	    36	    216
 * 7	    49	    343
 * 8	    64	    512
 * 9	    81	    729
 * 10	    100	    1000
 *******************************************************************************/
public class Ex231 {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("number\tsquare\tcube");
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
    System.out.printf("%d\t%d\t%d\n", x, x*x, x*x*x++);
  }
}
