package model.repository;

import model.entity.Usuario;
import java.util.HashMap;

public class UsuarioRepository {

    private HashMap<Integer, Usuario> usuarios = new HashMap<>();

    public void salvar(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public void remover(int id) {
        usuarios.remove(id); }

    public Usuario buscarPorId(int id) {
        return usuarios.get(id);
    }

    public HashMap<Integer, Usuario> listar() {
        return usuarios;
    }
}