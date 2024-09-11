
public class EmitirSugestaoForm {
	package gui;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class EmitirSugestaoForm extends JFrame {
	    private JTextField tfTitulo;
	    private JTextArea taSugestao;
	    private JButton btnSalvar;
	    private JComboBox<String> cbAtas;

	    public EmitirSugestaoForm() {
	        setTitle("Emitir Sugestão");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(4, 2));

	        // Campos
	        add(new JLabel("Selecione Ata:"));
	        cbAtas = new JComboBox<>(new String[]{"Ata 1", "Ata 2"});
	        add(cbAtas);

	        add(new JLabel("Título:"));
	        tfTitulo = new JTextField();
	        add(tfTitulo);

	        add(new JLabel("Sugestão:"));
	        taSugestao = new JTextArea(5, 20);
	        add(new JScrollPane(taSugestao));

	        btnSalvar = new JButton("Salvar");
	        add(btnSalvar);

	        // Ação do botão
	        btnSalvar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                salvarSugestao();
	            }
	        });
	    }

	    private void salvarSugestao() {
	        // Implementação para salvar sugestão
	        String titulo = tfTitulo.getText();
	        String sugestao = taSugestao.getText();
	        // Adicione validação e salvamento
	    }
	}

}
