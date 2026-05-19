package controller;

import model.entity.Usuario;
import model.service.UsuarioService;
public class UsuarioController {

    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;

    }
    public void cadastrarUsuario(int id, String nome, String cpf) {
        boolean sucesso = usuarioService.cadastrarUsuario(id, nome, cpf);
        if (sucesso) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar usuário. Verifique os dados e tente novamente.");
        }
    }
     public void listarUsuarios() {
            if (usuarioService.listarUsuarios().isEmpty()) {
                System.out.println("Nenhum usuário cadastrado.");
                return;
        }
         for (Usuario usuario : usuarioService.listarUsuarios().values()) {
             usuario.exibirDados();
             System.out.println("------------------------------");
         }
     }

     public void buscarPorId(int id){
         Usuario usuario = usuarioService.buscarPorId(id);
         if(usuario != null){
             usuario.exibirDados();
         }else{
             System.out.println("Erro: Usuário com ID " + id + " não foi encontrado.");
         }
        }

     public void atualizarUsuario(int id, String nome, String cpf){
         boolean sucesso = usuarioService.atualizar(id, nome, cpf);
         if(sucesso){
             System.out.println("Usuário atualizado com sucesso!");
         }else {
             System.out.println("Erro: Usuário não encontrado para atualização.");
         }
        }
     public void removerUsuario(int id){
         boolean sucesso = usuarioService.remover(id);
         if(sucesso){
             System.out.println("Usuário removido com sucesso!");
         }else {
             System.out.println("Erro: Usuário não encontrado.");
         }
        }
}