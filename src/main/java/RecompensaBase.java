package main.java;

import main.java.Participante;

public abstract class RecompensaBase {
    private int id;
    private String descricao;

    public RecompensaBase(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public abstract void atribuir(Participante participante);

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}