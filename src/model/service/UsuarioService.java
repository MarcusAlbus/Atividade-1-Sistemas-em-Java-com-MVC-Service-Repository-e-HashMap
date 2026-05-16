package model.service;

import model.entity.Usuario;
import model.repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public boolean cadastrar(Usuario usuario) {

        for (Usuario u : repository.listar().values()) {
            if (u.getCpf().equals(usuario.getCpf())) {
                return false;
            }
        }

        repository.salvar(usuario);
        return true;
    }
}