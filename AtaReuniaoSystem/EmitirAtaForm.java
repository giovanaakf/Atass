
public class EmitirAtaForm {
	package gui;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.List;
	import java.util.ArrayList;

	public class EmitirAtaForm extends JFrame {
	    private JTextField tfInicio, tfFim, tfTitulo, tfPauta, tfDescricao, tfPalavrasChave, tfMatricula;
	    private JComboBox<String> cbSetor, cbTipo;
	    private JCheckBox cbMembroExterno;
	    private JButton btnSalvar, btnIncluir, btnExcluir, btnPesquisar;
	    private List<String> participantes; // Lista para armazenar os participantes

	    public EmitirAtaForm() {
	        setTitle("Emitir Ata");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(12, 2));

	        participantes = new ArrayList<>();

	        // Campos
	        add(new JLabel("Início:"));
	        tfInicio = new JTextField();
	        add(tfInicio);

	        add(new JLabel("Fim:"));
	        tfFim = new JTextField();
	        add(tfFim);

	        add(new JLabel("Setor:"));
	        cbSetor = new JComboBox<>(new String[]{"Financeiro", "RH", "TI"});
	        add(cbSetor);

	        add(new JLabel("Título:"));
	        tfTitulo = new JTextField();
	        add(tfTitulo);

	        add(new JLabel("Pauta:"));
	        tfPauta = new JTextField();
	        add(tfPauta);

	        add(new JLabel("Descrição:"));
	        tfDescricao = new JTextField();
	        add(tfDescricao);

	        add(new JLabel("Tipo:"));
	        cbTipo = new JComboBox<>(new String[]{"Pública", "Privada"});
	        add(cbTipo);

	        add(new JLabel("Palavras-chave:"));
	        tfPalavrasChave = new JTextField();
	        add(tfPalavrasChave);

	        add(new JLabel("Matrícula:"));
	        tfMatricula = new JTextField();
	        add(tfMatricula);

	        cbMembroExterno = new JCheckBox("Membro Externo");
	        add(cbMembroExterno);

	        btnSalvar = new JButton("Salvar");
	        add(btnSalvar);

	        btnIncluir = new JButton("Incluir");
	        add(btnIncluir);

	        btnExcluir = new JButton("Excluir");
	        add(btnExcluir);

	        btnPesquisar = new JButton("Pesquisar");
	        add(btnPesquisar);

	        // Ações dos botões
	        btnSalvar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                salvarAta();
	            }
	        });

	        // Adicione as ações para os outros botões conforme necessário
	    }

	    private void salvarAta() {
	        // Implementação para salvar a ata
	        String inicio = tfInicio.getText();
	        String fim = tfFim.getText();
	        // Adicione validação e salvamento
	    }
	}

}
