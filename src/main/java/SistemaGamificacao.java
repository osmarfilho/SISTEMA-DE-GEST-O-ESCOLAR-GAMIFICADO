package main.java;

import java.util.ArrayList;
import java.util.List;

public class SistemaGamificacao {
    private List<Desafio> desafios;
    private List<Recompensa> recompensas;
    private Estatisticas estatisticas;

    public SistemaGamificacao() {
        this.desafios = new ArrayList<>();
        this.recompensas = new ArrayList<>();
        this.estatisticas = new Estatisticas();
    }

    public void adicionarDesafio(Desafio desafio) {
        try {
            desafio.validarDesafio();
            this.desafios.add(desafio);
        } catch (DesafioInvalidoException e) {
            System.out.println("Erro ao adicionar desafio: " + e.getMessage());
        }
    }

    public void adicionarRecompensa(Recompensa recompensa) {
        this.recompensas.add(recompensa);
    }

    public Estatisticas visualizarEstatisticas() {
        return this.estatisticas;
    }

    public List<Desafio> getDesafios() {
        return new ArrayList<>(this.desafios);
    }

    public List<Recompensa> getRecompensas() {
        return new ArrayList<>(this.recompensas);
    }
}