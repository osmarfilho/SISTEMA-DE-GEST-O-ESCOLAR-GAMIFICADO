package main.java;

import java.util.ArrayList;

public class Participante extends Usuario implements Desafiavel {
    private int pontos;
    private ArrayList<Desafio> desafiosCompletos;
    private ArrayList<Recompensa> recompensas;
    private static int numeroParticipantes = 0;

    public Participante(int id, String nome) {
        super(id, nome);
        this.pontos = 0;
        this.desafiosCompletos = new ArrayList<>();
        this.recompensas = new ArrayList<>();
        numeroParticipantes++;
    }

    public void aceitarDesafio(Desafio desafio) {
        this.desafiosCompletos.add(desafio);
        this.pontos += desafio.getPontos();
    }

    public ArrayList<Desafio> getDesafiosCompletos() {
        return desafiosCompletos;
    }

    public ArrayList<Recompensa> getRecompensas() {
        return recompensas;
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public void completarDesafio(Participante participante) {
        // Implementação necessária da interface
    }

    public void adicionarRecompensa(Recompensa recompensa) {
        this.recompensas.add(recompensa);
    }

    public static int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public static void resetNumeroParticipantes() {
        numeroParticipantes = 0;
    }
}