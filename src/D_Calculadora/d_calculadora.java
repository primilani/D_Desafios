package D_Calculadora;

import java.util.Scanner;

public class d_calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = teclado.nextInt();

        System.out.println("Digite a operação desejada '+, -, *, /': ");
        char op = teclado.next().charAt(0);

        double resultado = 0;

        switch (op){
            case '+' -> resultado = n1+n2;
            case '-' -> resultado = n1-n2;
            case '*' -> resultado = n1*n2;
            case '/' -> resultado = (double) n1/n2;

            default -> {
                System.out.println("Comando inválido!");
            }

        }
        System.out.println("Rsultado = " +resultado);
    }
}
