package model.service;

import model.entity.Usuario;
import model.entity.Sala;
import model.entity.Reserva;

import model.repository.UsuarioRepository;
import model.repository.SalaRepository;
import model.repository.ReservaRepository;

public class ReservaService {

    private UsuarioRepository repositoryUsuario;
    private SalaRepository repositorySala;
    private ReservaRepository repositoryReserva;

    public ReservaService(

            UsuarioRepository repositoryUsuario,
            SalaRepository repositorySala,
            ReservaRepository repositoryReserva) {
        this.repositoryUsuario = repositoryUsuario;
        this.repositorySala = repositorySala;
        this.repositoryReserva = repositoryReserva;
    }

    public boolean criar(
            int id,
            int usuarioId,
            int salaId,
            String data,
            String horario
    ) {

        try {

            Usuario usuario = repositoryUsuario.buscarPorId(usuarioId);
            Sala sala = repositorySala.buscarPorId(salaId);

            if (usuario == null || sala == null) {
                return false;
            }

            if (!sala.isDisponivel()) {
                return false;
            }

            Reserva reserva = new Reserva(usuario, sala, data, horario);

            sala.setDisponivel(false);

            repositoryReserva.salvar(reserva);

            return true;

        } catch (Exception e) {

            System.out.println("Erro ao criar reserva.");

            return false;
        }
    }

    public boolean atualizar(
            int id,
            String novaData,
            String novoHorario
    ) {

        try {

            Reserva reserva =
                    repositoryReserva.buscarPorId(id);

            if (reserva == null) {
                return false;
            }

            reserva.setData(novaData);
            reserva.setHorario(novoHorario);

            return true;

        } catch (Exception e) {

            System.out.println("Erro ao atualizar reserva.");

            return false;
        }
    }

    public boolean cancelar(int id) {

        try {

            Reserva reserva = repositoryReserva.buscarPorId(id);

            if (reserva == null) {
                return false;
            }

            reserva.getSala().setDisponivel(true);

            reserva.cancelar();

            return true;

        } catch (Exception e) {

            System.out.println("Erro ao cancelar reserva.");

            return false;
            }
        }
    }