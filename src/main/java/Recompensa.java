package main.java;

public class Recompensa extends RecompensaBase {
    private TipoRecompensa tipo;

    public Recompensa(int id, String descricao, TipoRecompensa tipo) {
        super(id, descricao);
        this.tipo = tipo;
    }

    @Override
    public void atribuir(Participante participante) {
        participante.adicionarRecompensa(this);
    }

    public TipoRecompensa getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return getDescricao() + "Recompensa (" + tipo + ")";
    }
}