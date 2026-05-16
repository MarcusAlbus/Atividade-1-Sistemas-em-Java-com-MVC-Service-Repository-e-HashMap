package model.service;

import model.entity.Sala;
import model.repository.SalaRepository;

public class SalaService {

    private SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public boolean cadastrar(Sala sala) {

        if (sala.getCapacidade() <= 0) {
            return false;
        }

        repository.salvar(sala);
        return true;
    }
}