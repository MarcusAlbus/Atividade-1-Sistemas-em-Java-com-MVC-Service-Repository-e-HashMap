package view;

import controller.UsuarioController;
import java.util.Scanner;

public class UsuarioView {

    Scanner input = new Scanner(System.in);

    UsuarioController controller;

    public UsuarioView(UsuarioController controller){

        this.controller = controller;
    }

    public static void gerenciarUsuario() {
    }

    public void cadastrarUsuario(){

        System.out.println("Informe seu nome:");
        String nome = input.nextLine();

        System.out.println("Informe seu CPF:");
        String cpf = input.nextLine();

        controller.cadastrarUsuario(nome, cpf);
    }

}
