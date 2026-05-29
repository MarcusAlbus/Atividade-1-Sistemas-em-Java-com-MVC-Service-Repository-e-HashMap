package view;

import controller.SalaController;
import model.repository.SalaRepository;

import java.util.Scanner;

import static controller.SalaController.cadastrarSala;

public class SalaView {

    public static void gerenciarSala(){
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do{
            System.out.println("Menu de Salas");
            System.out.println("1 - Cadastrar sala");
            System.out.println("2 - Listar sala");
            System.out.println("0 - Voltar ao menu principal");

            try {
                opcao = input.nextInt();

                switch (opcao){

                    case 1:
                        cadastrarSalaV();

                    case 2:
                        SalaRepository.listar();

                    case 0:
                        MenuView.menuPrincipal();

                    default:
                            System.out.println("Erro! Opção inválida.");
                }
            } catch (NumberFormatException e){
                System.out.println("Erro! Digite apenas os números do menu.");
            }
        } while (opcao != 0);
    }

    public static void cadastrarSalaV(){
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastro da sala");

        System.out.println("Informe o número da sala");
        int numero = input.nextInt();

        System.out.println("Informe a capacidade da sala");
        int capacidade = input.nextInt();
    }
}
