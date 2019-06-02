package com.projetobd.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import com.projetobd.personalizados.JNumberFormatField;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import com.projetobd.personalizados.JNumberField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CadastroProjetos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTipo;
	private JTextField txtNumero;
	private JTextField txtHoras;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProjetos frame = new CadastroProjetos();
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
	public CadastroProjetos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeProjetos = new JLabel();
		lblCadastroDeProjetos.setText("Cadastro de Projetos");
		lblCadastroDeProjetos.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCadastroDeProjetos.setBackground(new Color(153, 153, 153));
		lblCadastroDeProjetos.setBounds(10, 11, 301, 35);
		contentPane.add(lblCadastroDeProjetos);
		
		JSeparator separatorProjetos = new JSeparator();
		separatorProjetos.setForeground(new Color(204, 204, 204));
		separatorProjetos.setBackground(new Color(204, 204, 204));
		separatorProjetos.setBounds(10, 52, 694, 10);
		contentPane.add(separatorProjetos);
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setForeground(new Color(153, 153, 153));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(10, 69, 36, 16);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setForeground(new Color(153, 153, 153));
		txtNome.setBorder(null);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(52, 68, 243, 18);
		contentPane.add(txtNome);
		
		JSeparator separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(10, 92, 285, 10);
		contentPane.add(separatorNome);
		
		JLabel lblNumero = new JLabel();
		lblNumero.setText("Número:");
		lblNumero.setForeground(new Color(153, 153, 153));
		lblNumero.setBackground(Color.WHITE);
		lblNumero.setBounds(313, 69, 50, 16);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBorder(null);
		txtNumero.setBounds(362, 67, 105, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JSeparator separatorNumero = new JSeparator();
		separatorNumero.setForeground(new Color(204, 204, 204));
		separatorNumero.setBackground(new Color(204, 204, 204));
		separatorNumero.setBounds(313, 92, 154, 10);
		contentPane.add(separatorNumero);
		
		JLabel lblVerba = new JLabel();
		lblVerba.setText("Verba:");
		lblVerba.setForeground(new Color(153, 153, 153));
		lblVerba.setBackground(Color.WHITE);
		lblVerba.setBounds(485, 69, 43, 16);
		contentPane.add(lblVerba);
		
		JNumberFormatField txtVerba = new JNumberFormatField(new DecimalFormat("0.00"));
		txtVerba.setToolTipText("");
		txtVerba.setForeground(new Color(153, 153, 153));
		txtVerba.setBorder(null);
		txtVerba.setBackground(Color.WHITE);
		txtVerba.setBounds(529, 68, 174, 18);
		contentPane.add(txtVerba);
		
		JSeparator separatorVerba = new JSeparator();
		separatorVerba.setForeground(new Color(204, 204, 204));
		separatorVerba.setBackground(new Color(204, 204, 204));
		separatorVerba.setBounds(485, 92, 219, 10);
		contentPane.add(separatorVerba);
		
		JLabel lblHoras = new JLabel();
		lblHoras.setText("Horas:");
		lblHoras.setForeground(new Color(153, 153, 153));
		lblHoras.setBackground(Color.WHITE);
		lblHoras.setBounds(10, 113, 50, 16);
		contentPane.add(lblHoras);
		
		JSeparator separatorHoras = new JSeparator();
		separatorHoras.setForeground(new Color(204, 204, 204));
		separatorHoras.setBackground(new Color(204, 204, 204));
		separatorHoras.setBounds(10, 136, 146, 10);
		contentPane.add(separatorHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBorder(null);
		txtHoras.setBounds(51, 113, 105, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JLabel lblTipo = new JLabel();
		lblTipo.setText("Tipo:");
		lblTipo.setForeground(new Color(153, 153, 153));
		lblTipo.setBackground(Color.WHITE);
		lblTipo.setBounds(184, 113, 36, 16);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setToolTipText("");
		txtTipo.setForeground(new Color(153, 153, 153));
		txtTipo.setBorder(null);
		txtTipo.setBackground(Color.WHITE);
		txtTipo.setBounds(218, 114, 145, 18);
		contentPane.add(txtTipo);
		
		JSeparator separatorTipo = new JSeparator();
		separatorTipo.setForeground(new Color(204, 204, 204));
		separatorTipo.setBackground(new Color(204, 204, 204));
		separatorTipo.setBounds(184, 136, 179, 10);
		contentPane.add(separatorTipo);
		
		JLabel lblDepartamento = new JLabel();
		lblDepartamento.setText("Departamento:");
		lblDepartamento.setForeground(new Color(153, 153, 153));
		lblDepartamento.setBackground(Color.WHITE);
		lblDepartamento.setBounds(394, 113, 92, 16);
		contentPane.add(lblDepartamento);
		
		JSeparator separatorDepartamento = new JSeparator();
		separatorDepartamento.setForeground(new Color(204, 204, 204));
		separatorDepartamento.setBackground(new Color(204, 204, 204));
		separatorDepartamento.setBounds(394, 136, 81, 10);
		contentPane.add(separatorDepartamento);
		
		JComboBox cbxDepartamento = new JComboBox();
		cbxDepartamento.setBounds(495, 113, 209, 20);
		contentPane.add(cbxDepartamento);
		
		JButton btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(624, 268, 80, 39);
		contentPane.add(btnSalvar);
		
		JLabel lblConfirmacao = new JLabel();
		lblConfirmacao.setText("Confirmação");
		lblConfirmacao.setBounds(514, 279, 73, 16);
		contentPane.add(lblConfirmacao);
		
		JLabel lblNavegacao = new JLabel();
		lblNavegacao.setText("Navegação:");
		lblNavegacao.setForeground(Color.WHITE);
		lblNavegacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNavegacao.setBounds(37, 326, 100, 23);
		contentPane.add(lblNavegacao);
		
		JButton btnInicio = new JButton("Início");
		btnInicio.setHorizontalAlignment(SwingConstants.LEFT);
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBorder(null);
		btnInicio.setBackground(new Color(0, 168, 89));
		btnInicio.setBounds(37, 349, 57, 23);
		contentPane.add(btnInicio);
		
		JButton btnCadastroDepartamento = new JButton("Cadastro de Departamentos");
		btnCadastroDepartamento.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDepartamento.setForeground(Color.WHITE);
		btnCadastroDepartamento.setBorder(null);
		btnCadastroDepartamento.setBackground(new Color(0, 168, 89));
		btnCadastroDepartamento.setBounds(37, 371, 162, 23);
		contentPane.add(btnCadastroDepartamento);
		
		JButton btnCadastroFuncionarios = new JButton("Cadastro de Funcionários");
		btnCadastroFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroFuncionarios.setForeground(Color.WHITE);
		btnCadastroFuncionarios.setBorder(null);
		btnCadastroFuncionarios.setBackground(new Color(0, 168, 89));
		btnCadastroFuncionarios.setBounds(37, 393, 162, 23);
		contentPane.add(btnCadastroFuncionarios);
		
		JButton btnCadastroProjetos = new JButton("Cadastro de Projetos");
		btnCadastroProjetos.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroProjetos.setForeground(Color.WHITE);
		btnCadastroProjetos.setBorder(null);
		btnCadastroProjetos.setBackground(new Color(0, 168, 89));
		btnCadastroProjetos.setBounds(37, 414, 162, 23);
		contentPane.add(btnCadastroProjetos);
		
		JButton btnCadastroDependentes = new JButton("Cadastro de Dependentes");
		btnCadastroDependentes.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDependentes.setForeground(Color.WHITE);
		btnCadastroDependentes.setBorder(null);
		btnCadastroDependentes.setBackground(new Color(0, 168, 89));
		btnCadastroDependentes.setBounds(37, 433, 162, 23);
		contentPane.add(btnCadastroDependentes);
		
		JLabel lblFuncionario = new JLabel();
		lblFuncionario.setText("Funcionário:");
		lblFuncionario.setForeground(new Color(153, 153, 153));
		lblFuncionario.setBackground(Color.WHITE);
		lblFuncionario.setBounds(10, 157, 84, 16);
		contentPane.add(lblFuncionario);
		
		JSeparator separatorFuncionario = new JSeparator();
		separatorFuncionario.setForeground(new Color(204, 204, 204));
		separatorFuncionario.setBackground(new Color(204, 204, 204));
		separatorFuncionario.setBounds(10, 180, 65, 10);
		contentPane.add(separatorFuncionario);
		
		JLabel lblBack = new JLabel();
		lblBack.setForeground(new Color(0, 204, 0));
		lblBack.setBackground(new Color(0, 204, 0));
		lblBack.setBounds(10, 313, 694, 150);
		contentPane.add(lblBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(89, 155, 278, 20);
		contentPane.add(comboBox);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"CPF", "Nome"
			}
		));
		table.setBounds(10, 189, 357, 86);
		contentPane.add(table);
	}
}
