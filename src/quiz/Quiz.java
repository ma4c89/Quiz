package quiz;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Quiz {
	private List<Pergunta> perguntas;
	private Jogador jogador;

	public Quiz(Jogador jogador) {
		this.jogador = jogador;
	    this.perguntas = new ArrayList<>();
	    carregarPerguntas();
	}

	private void carregarPerguntas() {
		perguntas.add(new Pergunta(
				"Qual evento levou Getúlio Vargas ao poder em 1930?\n",
				new String[]{"Revolução Constitucionalista", "Revolução de 1930", "Golpe Militar", "Proclamação da República"},
	            "B"));

	    perguntas.add(new Pergunta(
	    		"Qual foi o motivo principal da Revolução Constitucionalista de 1932?\n",
	            new String[]{"Fim da escravidão", "Luta contra a Ditadura Militar", "Exigência de uma nova Constituição", "Aumento dos impostos"},
	            "C"));

	    perguntas.add(new Pergunta(
	    		"Qual era o nome do plano econômico lançado por Vargas em 1943 para modernizar o Brasil?\n",
	            new String[]{"Plano Real", "Plano de Metas", "CLT (Consolidação das Leis do Trabalho)", "Plano Cruzado"},
	            "C"));

	    perguntas.add(new Pergunta(
	            "Quem foi presidente do Brasil durante o AI-5?\n",
	            new String[]{"Castelo Branco", "Costa e Silva", "Médici", "Geisel"},
	            "B"));

	    perguntas.add(new Pergunta(
	            "O movimento Diretas Já tinha como objetivo:\n",
	            new String[]{"Derrubar a Ditadura Militar", "Exigir eleições diretas para presidente", "Aumentar salários dos trabalhadores", "Reduzir os preços dos combustíveis"},
	            "B"));
	    }

	public void iniciar() {
		for (Pergunta pergunta : perguntas) {
			String resposta = pergunta.exibirPergunta(jogador);
			if (pergunta.verificarResposta(resposta)) {
				JOptionPane.showMessageDialog(null, "RESPOSTA CORRETA!");
				jogador.adicionarPontos(10);
				} else {
					JOptionPane.showMessageDialog(null, "RESPOSTA INCORRETA.");
				}
		}
	}

	public void exibirPontuacaoFinal() {
		JOptionPane.showMessageDialog(null, "\nSua pontuação final foi: " + jogador.getPontos());
	}

}

