package controller;

import model.entity.Reserva;
import model.repository.ReservaRepository;
import model.service.ReservaService;

public class ReservaController {

    private ReservaService reservaService;
    private ReservaRepository reservaRepository;

    public ReservaController(ReservaService reservaService, ReservaRepository reservaRepository) {
        this.reservaService = reservaService;
        this.reservaRepository = reservaRepository;
    }

public void criarReserva(int id, int usuarioId, int salaId, String data, String horario){
    boolean sucesso = reservaService.criar(id, usuarioId, data, horario);

    if (sucesso){
        System.out.println("Reserva realizada com sucesso!");
    }else{
        System.out.println("Erro ao criar reserva.");
    }
}
public void listarReservas(){

    if(reservaRepository.listar().isEmpty()){
        System.out.println("Nenhuma reservada cadastrada.");
        return;
    }

    System.out.println("===========Lista de reservas===========");
    for(Reserva reserva : reservaRepository.listar().values()){
        System.out.println("Id reserva: "+reserva.getId());
        System.out.println("Usuário: "+  reserva.getUsuario().getNome()+ " (Cpf: "+ reserva.getUsuario().getCpf() +")");
        System.out.println("Sala número: "+reserva.getSala().getNumero());
        System.out.println("Data: " + reserva.getData() + " | Horário: " + reserva.getHorario() );
        System.out.println("Status: "+ reserva.getStatus());
        System.out.println("===================================");
    }
}

public void atualizarReseva(int id, String novaData, String novoHorario){
        boolean sucesso =reservaService.atualizar(id, novaData, novoHorario);
        if(sucesso){
            System.out.println("Reserva atualizada com sucesso!");
        }else{
            System.out.println("Erro: Reserva com ID " + id + " não foi encontrada.");
        }
}

public void cancelarReserva(int id){
        boolean sucesso = reservaService.cancelar(id);
        if(sucesso){
            System.out.println("Reserva cancelada com sucesso e sala liberada!");
        }else{
            System.out.println("Erro: Reserva com ID "+ id + " não foi encontrada.");
        }
}

}
