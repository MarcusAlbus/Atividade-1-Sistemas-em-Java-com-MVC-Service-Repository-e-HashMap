package view;

import view.ReservaView;
import model.entity.Usuario;

public class MenuView {

    public static void menuPrincipal(){

        int opcao = -1;

        System.out.println("Menu Principal");
        System.out.println("1 - Gerenciar Usuário");
        System.out.println("2 - Gerenciar Reserva");
        System.out.println("3 - Gerenciar Sala");
        System.out.println("0 - Sair do sistema");

        try {

            switch (opcao){
                case 1:
                    UsuarioView.gerenciarUsuario();
                    break;

                case 2:
                    ReservaView.gerenciarReserva();

            }
        }catch (Exception e){

        }

    }

}