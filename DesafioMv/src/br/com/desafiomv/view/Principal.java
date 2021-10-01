package br.com.desafiomv.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textEndereco;
	private JTextField textField;
	private JTextField textFieldRazaoSocial;
	private JTextField textFieldNire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Clientes", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 185, 712, 143);
		panel.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Endere\u00E7o", "CPF / CNPJ", "Telefone", "Tipo", "Contas", "Raz\u00E3o Social", "NIRE"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(5).setPreferredWidth(82);
		table.getColumnModel().getColumn(6).setPreferredWidth(77);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(76, 8, 162, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(76, 67, 135, 20);
		panel.add(textCpf);
		
		JLabel lblNewLabel2 = new JLabel("CPF/CNPJ:");
		lblNewLabel2.setBounds(10, 70, 62, 14);
		panel.add(lblNewLabel2);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(10, 36, 62, 14);
		panel.add(lblNewLabel_1);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(76, 36, 399, 20);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contas:");
		lblNewLabel_2.setBounds(481, 11, 62, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNovoCliente = new JButton("Novo");
		btnNovoCliente.setBounds(98, 151, 102, 23);
		panel.add(btnNovoCliente);
		
		JButton btnEditarCliente = new JButton("Editar");
		btnEditarCliente.setBounds(277, 151, 102, 23);
		panel.add(btnEditarCliente);
		
		JButton btnExcluirCliente = new JButton("Excluir");
		btnExcluirCliente.setBounds(456, 151, 102, 23);
		panel.add(btnExcluirCliente);
		
		JComboBox comboBoxContas = new JComboBox();
		comboBoxContas.setBounds(532, 7, 87, 22);
		panel.add(comboBoxContas);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setBounds(10, 98, 62, 14);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(76, 95, 135, 20);
		panel.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pessoa:");
		lblNewLabel_2_1.setBounds(277, 11, 54, 14);
		panel.add(lblNewLabel_2_1);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"F\u00EDsica", "Jur\u00EDdica"}));
		comboBoxTipo.setBounds(329, 7, 87, 22);
		panel.add(comboBoxTipo);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazoSocial.setBounds(277, 70, 87, 14);
		panel.add(lblRazoSocial);
		
		textFieldRazaoSocial = new JTextField();
		textFieldRazaoSocial.setColumns(10);
		textFieldRazaoSocial.setBounds(365, 67, 178, 20);
		panel.add(textFieldRazaoSocial);
		
		JLabel lblNewLabel_4 = new JLabel("NIRE:");
		lblNewLabel_4.setBounds(311, 98, 46, 14);
		panel.add(lblNewLabel_4);
		
		textFieldNire = new JTextField();
		textFieldNire.setColumns(10);
		textFieldNire.setBounds(365, 95, 135, 20);
		panel.add(textFieldNire);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Contas", null, panel_1, null);
		panel_1.setLayout(null);
	}
}
