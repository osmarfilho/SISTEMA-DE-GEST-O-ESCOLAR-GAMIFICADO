package main.java;
public class Disciplina {
    private int id;
    private String nome;
    private String descricao;
    private Estatisticas estatisticas;

    public Disciplina(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.estatisticas = new Estatisticas();
    }

    public Estatisticas visualizarEstatisticas() {
        return this.estatisticas;
    }

    public void atualizarEstatisticas(Participante participante) {
        this.estatisticas.atualizarEstatisticas(participante);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return nome;
    }
}