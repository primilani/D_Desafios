package D_Mercado;

import java.util.Scanner;

public class d_mercado {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);

        System.out.println("Bem Vindos!  Selecione sua bebida abaixo:");
        System.out.println("1 - Água");
        System.out.println("2 - Refrigerante");
        System.out.println("3 - Cerveja");

        int bebida = menu.nextInt();

        if (bebida == 1) { // Água
            System.out.println("Compra efetuada.");

        } else if (bebida == 2) { // Refrigerante
            System.out.println("Compra efetuada");

        }

        if (bebida == 3) { // Cerveja
            System.out.println("Bebida destinada a maiores de 18! Informe sua idade:");
            int idade = menu.nextInt();

            if (idade < 18) {
                System.out.println("Usuario menor de 18 anos, sua compra sera cancelada.");
            } else {
                System.out.println("Compra efetuada.");
            }
        }
    }
}

