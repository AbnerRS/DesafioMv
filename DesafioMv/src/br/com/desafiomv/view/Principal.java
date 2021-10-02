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

import br.com.desafiomv.model.Cliente;
import br.com.desafiomv.model.Conta;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable tbClientes;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textEndereco;
	private JTextField textTelefone;
	private JTextField textFieldRazaoSocial;
	private JTextField textFieldNire;
	private JTextField textSaldo;

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
		ArrayList<Cliente> listaClientes = new ArrayList();
		
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
		
		tbClientes = new JTable();
		scrollPane_1.setViewportView(tbClientes);
		tbClientes.setModel(new DefaultTableModel(
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
		tbClientes.getColumnModel().getColumn(5).setPreferredWidth(82);
		tbClientes.getColumnModel().getColumn(6).setPreferredWidth(77);
		
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
		textEndereco.setBounds(76, 36, 467, 20);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"F\u00EDsica", "Jur\u00EDdica"}));
		comboBoxTipo.setBounds(365, 7, 87, 22);
		panel.add(comboBoxTipo);
		
		JButton btnNovoCliente = new JButton("Novo");
		btnNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente c = new Cliente();

				c.setNome(textNome.getText());
				c.setTelefone(textTelefone.getText());
				c.setEndereco(textEndereco.getText());
				c.setCpf_cnpj(textCpf.getText());
				c.setTipo(comboBoxTipo.getSelectedItem().toString());
				
				
				listaClientes.add(c);

				DefaultTableModel modelo = (DefaultTableModel) tbClientes.getModel();

				modelo.setNumRows(0);

				for (Cliente cl : listaClientes) {
					modelo.addRow(new Object[] {

							cl.getId() , cl.getNome(), cl.getEndereco(), cl.getTelefone(), cl.getCpf_cnpj(), cl.getTipo()
							
					});
				}
				
			}
		});
		btnNovoCliente.setBounds(98, 151, 102, 23);
		panel.add(btnNovoCliente);
		
		JButton btnEditarCliente = new JButton("Editar");
		btnEditarCliente.setBounds(277, 151, 102, 23);
		panel.add(btnEditarCliente);
		
		JButton btnExcluirCliente = new JButton("Excluir");
		btnExcluirCliente.setBounds(456, 151, 102, 23);
		panel.add(btnExcluirCliente);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setBounds(10, 98, 62, 14);
		panel.add(lblNewLabel_3);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(76, 95, 135, 20);
		panel.add(textTelefone);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pessoa:");
		lblNewLabel_2_1.setBounds(301, 11, 54, 14);
		panel.add(lblNewLabel_2_1);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Saldo Inicial :");
		lblNewLabel_2.setBounds(549, 98, 70, 14);
		panel.add(lblNewLabel_2);
		
		textSaldo = new JTextField();
		textSaldo.setColumns(10);
		textSaldo.setBounds(615, 95, 77, 20);
		panel.add(textSaldo);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Contas", null, panel_1, null);
		panel_1.setLayout(null);
	}
}
