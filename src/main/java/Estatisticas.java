package main.java;

public class Estatisticas {
    private int totalDesafiosCompletos;
    private int totalPontos;

    public Estatisticas() {
        this.totalDesafiosCompletos = 0;
        this.totalPontos = 0;
    }

    public void atualizarEstatisticas(Participante participante) {
        this.totalDesafiosCompletos = participante.getDesafiosCompletos().size();
        this.totalPontos = participante.getPontos();
    }

    public int getTotalDesafiosCompletos() {
        return totalDesafiosCompletos;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void visualizarEstatisticas() {
        System.out.println("Total de desafios completos: " + totalDesafiosCompletos);
        System.out.println("Total de pontos: " + totalPontos);
    }
}