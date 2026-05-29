package view;

import controller.SalaController;

import java.util.Scanner;

public class SalaView {

    private SalaController salaController;

    public SalaView(
            SalaController salaController
    ) {

        this.salaController = salaController;
    }

    public void gerenciarSala(){

        Scanner input = new Scanner(System.in);

        int opcao = -1;

        do{

            System.out.println("Menu de Salas");
            System.out.println("1 - Cadastrar sala");
            System.out.println("0 - Voltar");

            try {

                opcao = input.nextInt();

                switch (opcao){

                    case 1:

                        cadastrarSalaV();
                        break;

                    case 0:

                        break;

                    default:

                        System.out.println(
                                "Erro! Opção inválida."
                        );
                }

            } catch (Exception e){

                System.out.println(
                        "Erro! Digite apenas os números do menu."
                );

                input.nextLine();
            }

        } while (opcao != 0);
    }

    public void cadastrarSalaV(){

        Scanner input = new Scanner(System.in);

        System.out.println("Cadastro da sala");

        System.out.println(
                "Informe o ID da sala"
        );

        int id = input.nextInt();

        System.out.println(
                "Informe o número da sala"
        );

        int numero = input.nextInt();

        System.out.println(
                "Informe a capacidade da sala"
        );

        int capacidade = input.nextInt();

        salaController.cadastrarSala(
                id,
                numero,
                capacidade
        );
    }
}