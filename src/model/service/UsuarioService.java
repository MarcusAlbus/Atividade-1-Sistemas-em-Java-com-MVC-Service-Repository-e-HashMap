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

    public void exibirUsuarios() {

        if (repository.listar().isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for (Usuario usuario : repository.listar().values()) {
            usuario.exibirDados();
        }
    }
}