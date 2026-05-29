package view;

import java.util.Scanner;

public class MenuView {

    private UsuarioView usuarioView;
    private ReservaView reservaView;
    private SalaView salaView;

    public MenuView(
            UsuarioView usuarioView,
            ReservaView reservaView,
            SalaView salaView
    ) {

        this.usuarioView = usuarioView;
        this.reservaView = reservaView;
        this.salaView = salaView;
    }

    public void menuPrincipal() {

        Scanner input = new Scanner(System.in);

        int opcao = -1;

        do {

            System.out.println("Menu Principal");
            System.out.println("1 - Gerenciar Usuário");
            System.out.println("2 - Gerenciar Reserva");
            System.out.println("3 - Gerenciar Sala");
            System.out.println("0 - Sair do sistema");

            try {

                opcao = input.nextInt();

                switch (opcao) {

                    case 1:

                        usuarioView.gerenciarUsuario();
                        break;

                    case 2:

                        reservaView.gerenciarReserva();
                        break;

                    case 3:

                        salaView.gerenciarSala();
                        break;

                    case 0:

                        System.out.println(
                                "Encerrando sistema."
                        );

                        break;

                    default:

                        System.out.println(
                                "Erro: Opção inválida!"
                        );
                }

            } catch (Exception e) {

                System.out.println(
                        "Erro: Digite apenas números."
                );

                input.nextLine();
            }

        } while (opcao != 0);
    }
}