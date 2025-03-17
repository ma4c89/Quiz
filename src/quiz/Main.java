package quiz;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		// Data e Hora
		LocalDateTime agora = LocalDateTime.now();
	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String dataFormatada = agora.format(dateFormatter);

	    LocalTime horaAtual = LocalTime.now();
	    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	    String horaFormatada = horaAtual.format(timeFormatter);

	    JOptionPane.showMessageDialog(null, "Hora: " + horaFormatada + "\nData: " + dataFormatada);

	    // Início do Quiz
	    int escolhaInicial = JOptionPane.showConfirmDialog(null, "DESEJA COMEÇAR O QUIZ?", "QUIZ HISTÓRIA DO BRASIL", JOptionPane.YES_NO_OPTION);
	    if (escolhaInicial != JOptionPane.YES_OPTION) {
	    	JOptionPane.showMessageDialog(null, "QUIZ CANCELADO");
	    	System.exit(0);
	    }

	    String nomeUsuario = JOptionPane.showInputDialog("Digite seu nome:");
	    if (nomeUsuario == null || nomeUsuario.isBlank()) {
	    	JOptionPane.showMessageDialog(null, "Quiz cancelado.");
	    	System.exit(0);
	    }

	    Jogador jogador = new Jogador(nomeUsuario);
	    Quiz quiz = new Quiz(jogador);
        quiz.iniciar();
        quiz.exibirPontuacaoFinal();

        JOptionPane.showMessageDialog(null, "Obrigado por jogar, " + jogador.getNome() + "!\nHora: " + horaFormatada);
    }
}
