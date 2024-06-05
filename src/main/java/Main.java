package main.java;

public class Main {
    public static void main(String[] args) {
        SistemaGamificacao sistema = new SistemaGamificacao();

        // Criando desafios
        Desafio desafio1 = new Desafio(1, "Primeiro Desafio", "Complete o primeiro desafio", 100);
        Desafio desafio2 = new Desafio(2, "Segundo Desafio", "Complete o segundo desafio", 200);
        Desafio desafioInvalido = new Desafio(3, "", "Descrição vazia", -50);

        // Adicionando desafios ao sistema (o inválido não deve ser adicionado)
        sistema.adicionarDesafio(desafio1);
        sistema.adicionarDesafio(desafio2);
        sistema.adicionarDesafio(desafioInvalido);

        // Criando recompensas
        Recompensa recompensa1 = new Recompensa(1, "Recompensa Bronze", TipoRecompensa.BRONZE);
        Recompensa recompensa2 = new Recompensa(2, "Recompensa Prata", TipoRecompensa.PRATA);
        Recompensa recompensa3 = new Recompensa(3, "Recompensa Ouro", TipoRecompensa.OURO);

        // Adicionando recompensas ao sistema
        sistema.adicionarRecompensa(recompensa1);
        sistema.adicionarRecompensa(recompensa2);
        sistema.adicionarRecompensa(recompensa3);

        // Criando participante
        Participante participante = new Participante(1, "João");

        // Participante aceita e completa desafios
        participante.aceitarDesafio(desafio1);
        participante.aceitarDesafio(desafio2);

        // Atribuindo recompensas ao participante
        recompensa1.atribuir(participante);
        recompensa2.atribuir(participante);
        recompensa3.atribuir(participante);

        // Visualizando estatísticas do sistema
        sistema.visualizarEstatisticas().atualizarEstatisticas(participante);

        // Imprimindo estatísticas do sistema
        Estatisticas estatisticasSistema = sistema.visualizarEstatisticas();
        estatisticasSistema.visualizarEstatisticas();

        // Visualizando desafios e recompensas do participante
        System.out.println("Desafios Completos do Participante: " + participante.getDesafiosCompletos().size());
        for (Desafio desafio : participante.getDesafiosCompletos()) {
            System.out.println(" - " + desafio);
        }

        System.out.println("Recompensas do Participante: " + participante.getRecompensas().size());
        for (Recompensa recompensa : participante.getRecompensas()) {
            System.out.println(" - " + recompensa);
        }

        // Testando métodos utilitários
        int pontosCalculados = Util.calcularPontos(participante);
        System.out.println("Pontos calculados para o participante: " + pontosCalculados);

        // Criando disciplina e visualizando estatísticas
        Disciplina disciplina = new Disciplina(1, "Matemática", "Disciplina de Matemática");
        disciplina.atualizarEstatisticas(participante);

        // Imprimindo estatísticas da disciplina
        Estatisticas estatisticasDisciplina = disciplina.visualizarEstatisticas();
        estatisticasDisciplina.visualizarEstatisticas();

        // Exibindo informações da disciplina
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Descrição: " + disciplina.getDescricao());

        // Listando desafios e recompensas do sistema
        System.out.println("Desafios no sistema: " + sistema.getDesafios().size());
        for (Desafio d : sistema.getDesafios()) {
            System.out.println(" - " + d);
        }

        System.out.println("Recompensas no sistema: " + sistema.getRecompensas().size());
        for (Recompensa r : sistema.getRecompensas()) {
            System.out.println(" - " + r);
        }
    }
}