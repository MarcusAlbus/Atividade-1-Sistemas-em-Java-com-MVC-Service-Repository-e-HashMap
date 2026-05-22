package model.entity;

public class Reserva {

    private static int contadorId = 1;

    private int id;
    private Usuario usuario;
    private Sala sala;
    private String data;
    private String horario;
    private String status;

    public Reserva(
            Usuario usuario,
            Sala sala,
            String data,
            String horario
    ) {

        this.id = contadorId++;
        this.usuario = usuario;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.status = "ATIVA";
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getStatus() {
        return status;
    }

    public void cancelar() {
        this.status = "CANCELADA";
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}