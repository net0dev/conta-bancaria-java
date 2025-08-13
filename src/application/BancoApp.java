package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Conta;

public class BancoApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta c1 = new Conta("Neto", 1209, 0);
        Conta c2 = new Conta("Rodrigo", 1703, 0);

        Map<Integer, Conta> contas = new HashMap<>();

        contas.put(c1.getNumero(), c1);
        contas.put(c2.getNumero(), c2);

        int opcao;
        do {
            System.out.println("===Menu===");
            System.out.println("1- Ver saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Transferir ");
            System.out.println("5- Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual %.2f reais%n", c1.saldo());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Qual o valor para depósito?");
                    double depositarValor = sc.nextDouble();
                    c1.depositar(depositarValor);
                    break;
                case 3:
                    System.out.println("Qual o valor de saque?");
                    double sacarValor = sc.nextDouble();
                    c1.sacar(sacarValor);
                    break;
                case 4:
                    System.out.println("Para quem você quer transferir?");
                    int numeroDestino = sc.nextInt();

                    System.out.println("Quanto você quer tranferir?");
                    double valorTransferencia = sc.nextDouble();

                    Conta destino = contas.get(numeroDestino);
                    c1.transferir(destino, valorTransferencia);

                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 5);

        sc.close();
    }
}
