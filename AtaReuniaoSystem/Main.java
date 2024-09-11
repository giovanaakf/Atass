
public class Main {
	package main;

	import gui.EmitirAtaForm;
	import gui.EmitirSugestaoForm;

	public class Main {
	    public static void main(String[] args) {
	        // Inicializa o formulário de emissão de atas
	        javax.swing.SwingUtilities.invokeLater(() -> new EmitirAtaForm().setVisible(true));

	        // Se precisar iniciar o formulário de sugestões também
	        // javax.swing.SwingUtilities.invokeLater(() -> new EmitirSugestaoForm().setVisible(true));
	    }
	}

}
