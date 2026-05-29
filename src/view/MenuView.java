package view;

import view.ReservaView;
import model.entity.Usuario;

import java.util.Scanner;

public class MenuView {

    public static void menuPrincipal() {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("Menu Principal");
            System.out.println("1 - Gerenciar Usuário");
            System.out.println("2 - Gerenciar Reserva");
            System.out.println("3 - Gerenciar Sala");
            System.out.println("0 - Sair do sistema");

            try {

                switch (opcao) {
                    case 1:
                        UsuarioView.gerenciarUsuario();
                        break;

                    case 2:
                        ReservaView.gerenciarReserva();

                    case 3:
                        SalaView.gerenciarSala();

                    case 0:
                        System.out.println("Encerrando sistema.");
                        break;

                    default:
                        System.out.println("Erro: Opção inválida! Escolha uma opção do menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números. Letras não são aceitas no menu.");
            }
        } while (opcao != 0);
    }
}