package com.projetobd.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class CadastroDependentes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtCep;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtCidade;
	private JTextField txtUf;
	private JTextField txtParentesco;
	private JTextField txtRua;
	private JLabel lblTitulo;
	private JSeparator separatorTitulo;
	private JLabel lblNome;
	private JSeparator separatorNome;
	private JLabel lblCpf;
	private JSeparator separatorNumero;
	private JLabel lblCidade;
	private JSeparator separatorCidade;
	private JSeparator separatorCep;
	private JLabel lblBairro;
	private JSeparator separatorBairro;
	private JLabel lblNumero;
	private JLabel lblUf;
	private JSeparator separatorUf;
	private JLabel lblRua;
	private JSeparator separatorRua;
	private JLabel lblParentesco;
	private JSeparator separatorParentesco;
	private JButton btnSalvar;
	private JSeparator separatorCpf;
	private JLabel lblCpfFunc;
	private JSeparator separatorCpfFunc;
	private JLabel lblEndereco;
	private JLabel lblCep;
	private JSeparator separatorMenu;
	private JLabel lblConfirmacao;
	private JLabel lblNavegacao;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JLabel label_14;
	private JComboBox comboBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDependentes frame = new CadastroDependentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroDependentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitulo = new JLabel();
		lblTitulo.setText("Cadastro de Dependentes");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setBackground(new Color(153, 153, 153));
		lblTitulo.setBounds(10, 11, 301, 35);
		contentPane.add(lblTitulo);
		
		separatorTitulo = new JSeparator();
		separatorTitulo.setForeground(new Color(204, 204, 204));
		separatorTitulo.setBackground(new Color(204, 204, 204));
		separatorTitulo.setBounds(10, 52, 694, 10);
		contentPane.add(separatorTitulo);
		
		lblNome = new JLabel();
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
		txtNome.setBounds(48, 68, 247, 18);
		contentPane.add(txtNome);
		
		separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(10, 92, 285, 10);
		contentPane.add(separatorNome);
		
		lblCpf = new JLabel();
		lblCpf.setText("CPF:");
		lblCpf.setForeground(new Color(153, 153, 153));
		lblCpf.setBackground(Color.WHITE);
		lblCpf.setBounds(313, 69, 25, 16);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setToolTipText("");
		txtCpf.setForeground(new Color(153, 153, 153));
		txtCpf.setBorder(null);
		txtCpf.setBackground(Color.WHITE);
		txtCpf.setBounds(344, 68, 123, 18);
		contentPane.add(txtCpf);
		
		separatorCpf = new JSeparator();
		separatorCpf.setForeground(new Color(204, 204, 204));
		separatorCpf.setBackground(new Color(204, 204, 204));
		separatorCpf.setBounds(313, 92, 154, 10);
		contentPane.add(separatorCpf);
		
		lblCpfFunc = new JLabel();
		lblCpfFunc.setText("CPF do Funcionário:");
		lblCpfFunc.setForeground(new Color(153, 153, 153));
		lblCpfFunc.setBackground(Color.WHITE);
		lblCpfFunc.setBounds(485, 69, 118, 16);
		contentPane.add(lblCpfFunc);
		
		separatorCpfFunc = new JSeparator();
		separatorCpfFunc.setForeground(new Color(204, 204, 204));
		separatorCpfFunc.setBackground(new Color(204, 204, 204));
		separatorCpfFunc.setBounds(485, 92, 118, 10);
		contentPane.add(separatorCpfFunc);
		
		lblEndereco = new JLabel();
		lblEndereco.setText("Endereço");
		lblEndereco.setForeground(new Color(153, 153, 153));
		lblEndereco.setBackground(Color.WHITE);
		lblEndereco.setBounds(10, 114, 57, 16);
		contentPane.add(lblEndereco);
		
		lblCep = new JLabel();
		lblCep.setText("CEP:");
		lblCep.setForeground(new Color(153, 153, 153));
		lblCep.setBackground(Color.WHITE);
		lblCep.setBounds(10, 143, 36, 16);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setToolTipText("");
		txtCep.setForeground(new Color(153, 153, 153));
		txtCep.setBorder(null);
		txtCep.setBackground(Color.WHITE);
		txtCep.setBounds(38, 142, 118, 18);
		contentPane.add(txtCep);
		
		separatorCep = new JSeparator();
		separatorCep.setForeground(new Color(204, 204, 204));
		separatorCep.setBackground(new Color(204, 204, 204));
		separatorCep.setBounds(10, 166, 146, 10);
		contentPane.add(separatorCep);
		
		lblBairro = new JLabel();
		lblBairro.setText("Bairro:");
		lblBairro.setForeground(new Color(153, 153, 153));
		lblBairro.setBackground(Color.WHITE);
		lblBairro.setBounds(485, 143, 38, 16);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setToolTipText("");
		txtBairro.setForeground(new Color(153, 153, 153));
		txtBairro.setBorder(null);
		txtBairro.setBackground(Color.WHITE);
		txtBairro.setBounds(526, 142, 178, 18);
		contentPane.add(txtBairro);
		
		separatorBairro = new JSeparator();
		separatorBairro.setForeground(new Color(204, 204, 204));
		separatorBairro.setBackground(new Color(204, 204, 204));
		separatorBairro.setBounds(485, 166, 219, 10);
		contentPane.add(separatorBairro);
		
		lblNumero = new JLabel();
		lblNumero.setText("Número:");
		lblNumero.setForeground(new Color(153, 153, 153));
		lblNumero.setBackground(Color.WHITE);
		lblNumero.setBounds(10, 185, 57, 16);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setToolTipText("");
		txtNumero.setForeground(new Color(153, 153, 153));
		txtNumero.setBorder(null);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setBounds(60, 184, 94, 18);
		contentPane.add(txtNumero);
		
		separatorNumero = new JSeparator();
		separatorNumero.setForeground(new Color(204, 204, 204));
		separatorNumero.setBackground(new Color(204, 204, 204));
		separatorNumero.setBounds(10, 212, 146, 10);
		contentPane.add(separatorNumero);
		
		lblCidade = new JLabel();
		lblCidade.setText("Cidade:");
		lblCidade.setForeground(new Color(153, 153, 153));
		lblCidade.setBackground(Color.WHITE);
		lblCidade.setBounds(180, 185, 42, 16);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setToolTipText("");
		txtCidade.setForeground(new Color(153, 153, 153));
		txtCidade.setBorder(null);
		txtCidade.setBackground(Color.WHITE);
		txtCidade.setBounds(223, 184, 115, 18);
		contentPane.add(txtCidade);
		
		separatorCidade = new JSeparator();
		separatorCidade.setForeground(new Color(204, 204, 204));
		separatorCidade.setBackground(new Color(204, 204, 204));
		separatorCidade.setBounds(180, 212, 162, 10);
		contentPane.add(separatorCidade);
		
		lblUf = new JLabel();
		lblUf.setText("UF:");
		lblUf.setForeground(new Color(153, 153, 153));
		lblUf.setBackground(Color.WHITE);
		lblUf.setBounds(366, 185, 17, 16);
		contentPane.add(lblUf);
		
		txtUf = new JTextField();
		txtUf.setToolTipText("");
		txtUf.setForeground(new Color(153, 153, 153));
		txtUf.setBorder(null);
		txtUf.setBackground(Color.WHITE);
		txtUf.setBounds(386, 184, 81, 18);
		contentPane.add(txtUf);
		
		separatorUf = new JSeparator();
		separatorUf.setForeground(new Color(204, 204, 204));
		separatorUf.setBackground(new Color(204, 204, 204));
		separatorUf.setBounds(366, 212, 101, 10);
		contentPane.add(separatorUf);
		
		lblRua = new JLabel();
		lblRua.setText("Rua:");
		lblRua.setForeground(new Color(153, 153, 153));
		lblRua.setBackground(Color.WHITE);
		lblRua.setBounds(180, 143, 26, 16);
		contentPane.add(lblRua);
		
		separatorRua = new JSeparator();
		separatorRua.setForeground(new Color(204, 204, 204));
		separatorRua.setBackground(new Color(204, 204, 204));
		separatorRua.setBounds(180, 166, 287, 10);
		contentPane.add(separatorRua);
		
		lblParentesco = new JLabel();
		lblParentesco.setText("Parentesco:");
		lblParentesco.setForeground(new Color(153, 153, 153));
		lblParentesco.setBackground(Color.WHITE);
		lblParentesco.setBounds(485, 185, 73, 16);
		contentPane.add(lblParentesco);
		
		txtParentesco = new JTextField();
		txtParentesco.setToolTipText("");
		txtParentesco.setForeground(new Color(153, 153, 153));
		txtParentesco.setBorder(null);
		txtParentesco.setBackground(Color.WHITE);
		txtParentesco.setBounds(558, 184, 146, 18);
		contentPane.add(txtParentesco);
		
		separatorParentesco = new JSeparator();
		separatorParentesco.setForeground(new Color(204, 204, 204));
		separatorParentesco.setBackground(new Color(204, 204, 204));
		separatorParentesco.setBounds(485, 212, 219, 10);
		contentPane.add(separatorParentesco);
		
		txtRua = new JTextField();
		txtRua.setToolTipText("");
		txtRua.setForeground(new Color(153, 153, 153));
		txtRua.setBorder(null);
		txtRua.setBackground(Color.WHITE);
		txtRua.setBounds(208, 142, 259, 18);
		contentPane.add(txtRua);
		
		btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(624, 268, 80, 39);
		contentPane.add(btnSalvar);
		
		separatorMenu = new JSeparator();
		separatorMenu.setOrientation(SwingConstants.VERTICAL);
		separatorMenu.setForeground(Color.WHITE);
		separatorMenu.setBackground(new Color(204, 204, 204));
		separatorMenu.setBounds(27, 326, 20, 130);
		contentPane.add(separatorMenu);
		
		lblConfirmacao = new JLabel();
		lblConfirmacao.setText("Confirmação");
		lblConfirmacao.setBounds(514, 279, 73, 16);
		contentPane.add(lblConfirmacao);
		
		lblNavegacao = new JLabel();
		lblNavegacao.setText("Navegação:");
		lblNavegacao.setForeground(Color.BLACK);
		lblNavegacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNavegacao.setBounds(37, 326, 100, 23);
		contentPane.add(lblNavegacao);
		
		button_1 = new JButton("Início");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.BLACK);
		button_1.setBorder(null);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(37, 349, 57, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("Cadastro de Departamentos");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.BLACK);
		button_2.setBorder(null);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(37, 371, 162, 23);
		contentPane.add(button_2);
		
		button_3 = new JButton("Cadastro de Funcionários");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.BLACK);
		button_3.setBorder(null);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(37, 393, 162, 23);
		contentPane.add(button_3);
		
		button_4 = new JButton("Cadastro de Projetos");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.BLACK);
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(37, 414, 162, 23);
		contentPane.add(button_4);
		
		button_5 = new JButton("Cadastro de Dependentes");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.BLACK);
		button_5.setBorder(null);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(37, 433, 162, 23);
		contentPane.add(button_5);
		
		label_14 = new JLabel();
		label_14.setForeground(new Color(0, 204, 0));
		label_14.setBackground(new Color(0, 204, 0));
		label_14.setBounds(10, 313, 694, 150);
		contentPane.add(label_14);
		
		comboBox = new JComboBox();
		comboBox.setBounds(604, 68, 102, 20);
		contentPane.add(comboBox);
	}
}
