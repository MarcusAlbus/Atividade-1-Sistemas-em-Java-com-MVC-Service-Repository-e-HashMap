package controller;

import model.entity.Usuario;
import model.service.UsuarioService;

public class UsuarioController {

    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    public void cadastrarUsuario(int id, String nome, String cpf) {
        Usuario novoUsuario = new Usuario(id, nome, cpf);
        boolean sucesso = usuarioService.cadastrar(novoUsuario);
        if (sucesso) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar usuário. Verifique os dados e tente novamente.");
        }
    }
}