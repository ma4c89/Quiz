package quiz;

import javax.swing.JOptionPane;

public class Pergunta {
	private String enunciado;
	private String[] alternativas;
    private String respostaCorreta;
	
    public Pergunta(String enunciado, String[] alternativas, String respostaCorreta) {
    	this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }
	
    public boolean verificarResposta(String resposta) {
        return resposta.equalsIgnoreCase(respostaCorreta);
    }
    
    public String exibirPergunta(Jogador jogador) {
        StringBuilder mensagem = new StringBuilder("\nUsuário: " + jogador.getNome() + " | Pontos: " + jogador.getPontos() + "\n");
        mensagem.append(enunciado).append("\n");

        char opcao = 'A';
        for (String alternativa : alternativas) {
            mensagem.append(opcao).append(") ").append(alternativa).append("\n");
            opcao++;
        }

        return JOptionPane.showInputDialog(mensagem.toString());
    }
}
