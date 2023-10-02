package D_Notas;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        // Pedindo para o usuario as notas dos alunos

        Scanner nota = new Scanner(System.in);
        System.out.println("Digite a primeira nota do Aluno: ");
        int num1 = nota.nextInt();

        System.out.println("Digite a segunda nota do Aluno: ");
        int num2 = nota.nextInt();

        System.out.println("Digite a terceira nota do Aluno: ");
        int num3 = nota.nextInt();


        // Fazer o cálculo das notas

        int resultado = (num1+num2+num3)/3;


        // Mostrar o resultado das notas

        if (resultado >=7){
            System.out.println("\nSua nota final foi: " + resultado + " - Aprovado" );

        }else if (resultado >=5) {
            System.out.println("\nSua nota final foi: " + resultado + " - Recuperação" );

        }else{
            System.out.println("\nSua nota final foi: " + resultado + " - Reprovado" );
        }


    }
}
