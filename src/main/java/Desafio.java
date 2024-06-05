package main.java;

public class Desafio {
    private final int id;
    private String titulo;
    private String descricao;
    private int pontos;

    public Desafio(int id, String titulo, String descricao, int pontos) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontos = pontos;
    }

    public void completarDesafio(Participante participante) {
        participante.aceitarDesafio(this);
    }

    public void validarDesafio() throws DesafioInvalidoException {
        if (this.titulo == null || this.titulo.isEmpty() || this.pontos <= 0) {
            throw new DesafioInvalidoException("Desafio inválido");
        }
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public String toString() {
        return "Desafio{id=" + id +
                ", titulo= " + titulo +
                ", descrição= " + descricao +
                ", pontos= " + pontos + "}";
    }
}