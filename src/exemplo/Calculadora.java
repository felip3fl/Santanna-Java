package exemplo;

import java.util.Scanner;

public class Calculadora {

  private static Scanner teclado;

public static void main(String args[]) {
    
    teclado = new Scanner(System.in);
    String opcao;
    double x, y;
    
    do {
    	
      System.out.println("-----------------");
      System.out.println("* * * MENU * * *");
      System.out.println("-----------------");
      System.out.println("+) Adição");
      System.out.println("-) Subtração");
      System.out.println("*) Multiplicação");
      System.out.println("/) Divisão");
      System.out.println("0) Sair");
      System.out.println("----------------");
      System.out.println();
      System.out.print("Opção: ");
      opcao = teclado.next();
      System.out.println();
      System.out.println("----------------");
      System.out.println();
      
      if ((opcao.equals("+")) || (opcao.equals("-")) || (opcao.equals("*")) || (opcao.equals("/"))) {
        System.out.print("X: ");
        x = teclado.nextDouble();
        System.out.print("Y: ");
        y = teclado.nextDouble();
        System.out.println();
        System.out.println("----------------");
        System.out.println();

        switch (opcao.charAt(0)) {
      	  case '+': System.out.println(Double.toString(x) + " + " + Double.toString(y) + " = " + Double.toString(x + y));
      		        break;
      	  case '-': System.out.printf("%.2f - %.2f = %.2f\n", x, y, x - y);
      		        break;
      	  case '*': System.out.printf("%.2f * %.2f = %.2f\n", x, y, x * y);
      		        break;
      	  case '/': if (y == 0)
      	  	          System.out.println("Não é possível dividir por zero!");
      	  	        else
      	  	          System.out.printf("%.2f / %.2f = %.2f\n", x, y, x / y);
        }
      }
      else
        if (!opcao.equals("0"))
          System.out.println("Opcao Inválida!");
      
      System.out.println();
      System.out.println();

    } while (!opcao.equals("0"));
    System.out.printf("Encerado");
  }
}