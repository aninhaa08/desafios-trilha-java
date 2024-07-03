package desafioConta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int num;
        String agencia, nome;
        float saldo;

        System.out.println("-- CONTA BANCO --");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da sua conta: ");
        num = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número da sua agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o seu nome completo: ");
        nome = sc.nextLine();

        System.out.print("Digite o valor a ser depositado: ");
        saldo = sc.nextFloat();


        System.out.printf("\n\n-- Dados inseridos:\n\nNome do cliente: %s\nNúmero da conta: %d\nNúmero da agência: %s\nSaldo da conta: %.2f", nome, num, agencia, saldo);
    }
}
