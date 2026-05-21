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
}

public void criarReserva(int id, int usuarioId, int salaId, String data, String horario){
    boolean sucesso = reservaService.criar(id, usuarioId, data, horario);

    if (sucesso){
        System.out.println("Reserva realizada com sucesso!");
    }else{
        System.out.println("Erro ao criar reserva.");
    }
}
public void listarReserva

