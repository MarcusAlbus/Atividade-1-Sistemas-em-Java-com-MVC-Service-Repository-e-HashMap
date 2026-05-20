package controller;

import model.entity.Sala;
import model.service.SalaService;

public class SalaController {
    private SalaService salaService;

    public SalaController(SalaService salaService){
        this.salaService = salaService;
    }

    public void cadastrarSala(int id, int numero, int capacidade) {
        Sala novaSala = new Sala(id, numero, capacidade, true);

        boolean sucesso = salaService.cadastrar(novaSala);

        if (sucesso) {
            System.out.println("Sala cadastrada com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar sala.");
        }

    }
}