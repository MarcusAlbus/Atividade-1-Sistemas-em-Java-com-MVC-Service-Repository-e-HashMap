package view;

import controller.ReservaController;
import model.service.ReservaService;
import java.util.Scanner;

public class ReservaView {
    private ReservaController reservaController;

    public ReservaView() {
        this.reservaController = reservaController;
    }

    public void gerenciarReserva() {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("Menu de Reservas");
            System.out.println("1 - Criar reserva");
            System.out.println("2 - Listar reservas");
            System.out.println("3 - Atualizar reserva");
            System.out.println("4 - Remover reserva");
            System.out.println("0 - Voltar ao menu principal");

            try {
                opcao = input.nextInt();

                switch (opcao) {

                    case 1:
                        criarReserva();

                    case 2:
                        ReservaController.listarReservas();

                    case 3:
                        atualizarReserva();

                    case 4:
                        cancelarReserva();

                    case 0:
                        MenuView.menuPrincipal();

                    default:
                        System.out.println("Erro! Opção inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite apenas os números do menu.");
            }
        } while (opcao != 0);
    }


    public void criarReserva() {
        Scanner input = new Scanner(System.in);

        System.out.println("Criar Reserva");
        System.out.println("Digite o ID do usuário:");
        int id = input.nextInt();

        System.out.println("Digite o número da sala:");
        int numeroSala = input.nextInt();

        System.out.println("Digite a data (DD/MM/AAAA):");
        String data = input.nextLine();

        System.out.println("Digite o horário (HH:MM): ");
        String horario = input.nextLine();
    }

    public void atualizarReserva() {
        Scanner input = new Scanner(System.in);

        System.out.println("Atualizar Reserva");
        System.out.println("Informe o ID da reserva a ser atualizada:");
        int id = input.nextInt();

        System.out.println("Informe a nova data:");
        String novaData = input.nextLine();

        System.out.println("Informe o novo horário:");
        String novoHorario = input.nextLine();

        ReservaController.atualizarReseva(id, novaData, novoHorario);
    }

    public void cancelarReserva() {

        Scanner input = new Scanner(System.in);

        System.out.println("Cancelar reserva");
        System.out.println("Informe o ID da reserva a ser cancelada:");
        int id = input.nextInt();

        ReservaController.cancelarReserva(id);
    }
}










