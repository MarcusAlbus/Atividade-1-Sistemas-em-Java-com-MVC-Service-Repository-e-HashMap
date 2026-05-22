package main;

import controller.ReservaController;
import controller.SalaController;
import controller.UsuarioController;

import model.repository.ReservaRepository;
import model.repository.SalaRepository;
import model.repository.UsuarioRepository;

import model.service.ReservaService;
import model.service.SalaService;
import model.service.UsuarioService;

public class Main {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository =
                new UsuarioRepository();

        SalaRepository salaRepository =
                new SalaRepository();

        ReservaRepository reservaRepository =
                new ReservaRepository();

        UsuarioService usuarioService =
                new UsuarioService(usuarioRepository);

        SalaService salaService =
                new SalaService(salaRepository);

        ReservaService reservaService =
                new ReservaService(
                        usuarioRepository,
                        salaRepository,
                        reservaRepository
                );

        UsuarioController usuarioController =
                new UsuarioController(usuarioService);

        SalaController salaController =
                new SalaController(salaService);

        ReservaController reservaController =
                new ReservaController(
                        reservaService,
                        reservaRepository
                );

        System.out.println("Sistema iniciado com sucesso.");

    }
}