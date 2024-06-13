package org.example;
import Implementation.Supermarket;
import Implementation.Supermarket_Array;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket_Array(SIZE);
        int opcao;
        do{
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    supermarket.Add(item);
                    break;
                case 2:
                    supermarket.Print();
                    break;
                case 3:
                    System.out.print("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermarket.Delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while(opcao != 4);

        scanner.close();
    }
}