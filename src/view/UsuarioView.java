package view;

import controller.UsuarioController;
import java.util.Scanner;

public class UsuarioView {

    static Scanner input = new Scanner(System.in);

    UsuarioController controller;

    public UsuarioView(UsuarioController controller){

        this.controller = controller;
    }

    public static void gerenciarUsuario() {

        int opcao = -1;

        do {
            System.out.println("Menu do Usuário");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("0 - Voltar ao menu principal");

            try {
                opcao = input.nextInt();

                switch (opcao) {

                    case 1:
                        cadastrarUsuario();
                        break;

                    case 0:
                        MenuView.menuPrincipal();

                    default:
                        System.out.println("Erro! Opção Inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite apenas os números do menu.");
            }
        } while (opcao != 0);
    }

        private static void cadastrarUsuario(){

        String nome;

            while (true){
                System.out.println("Informe seu nome:");
                nome = input.nextLine();

                if (nome.isEmpty()){
                    System.out.println("Erro! O nome não pode ficar vazio. Tente novamente.");
                }
                else {
                    break;
                }
            }

            String cpf;

            while (true) {
                System.out.println("Informe seu CPF:");
                cpf = input.nextLine();

                if (cpf.isEmpty()){
                    System.out.println("Erro! O CPF não pode ficar vazio. Tente novamente.");
                }
                else {
                    try {
                        Long.parseLong(cpf);
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Erro! O CPF deve conter apenas números. Tente novamente.");
                    }
                }
            }
        }
}

