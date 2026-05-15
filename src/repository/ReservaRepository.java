package repository;

import entity.Reserva;
import java.util.HashMap;

public class ReservaRepository {

    private HashMap<Integer, Reserva> reservas = new HashMap<>();

    public void salvar(Reserva reserva) {
        reservas.put(reserva.getId(), reserva);
    }

    public Reserva buscarPorId(int id) {
        return reservas.get(id);
    }

    public HashMap<Integer, Reserva> listar() {
        return reservas;
    }
}
