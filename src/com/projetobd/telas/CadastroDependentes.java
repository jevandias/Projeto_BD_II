package com.projetobd.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.projetobd.controler.DependentesController;
import com.projetobd.controler.FuncionarioController;
import com.projetobd.entidades.Dependentes;
import com.projetobd.entidades.Funcionario;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class CadastroDependentes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
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
	private JLabel lblCpfFunc;
	private JSeparator separatorCpfFunc;
	private JLabel lblEndereco;
	private JLabel lblCep;
	private JLabel lblConfirmacao;
	private JButton btnCadastroFuncionario;
	private JButton btnCadastroProjetos;
	private JButton btnCadastroDependentes;
	private JButton btnInicio;
	private JButton btnCadastroDepartamentos;
	private JLabel lblBack;
	private JComboBox<Long> comboBox;

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

		lblCpfFunc = new JLabel();
		lblCpfFunc.setText("Funcionário:");
		lblCpfFunc.setForeground(new Color(153, 153, 153));
		lblCpfFunc.setBackground(Color.WHITE);
		lblCpfFunc.setBounds(319, 69, 73, 16);
		contentPane.add(lblCpfFunc);

		comboBox = new JComboBox<Long>();
		comboBox.setBounds(402, 67, 136, 20);
		contentPane.add(comboBox);
		try {
			comboBox.addItem(0L);
			for (Funcionario func : new FuncionarioController().listarFuncionario()) {
				comboBox.addItem(func.getCpf());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		separatorCpfFunc = new JSeparator();
		separatorCpfFunc.setForeground(new Color(204, 204, 204));
		separatorCpfFunc.setBackground(new Color(204, 204, 204));
		separatorCpfFunc.setBounds(319, 92, 73, 10);
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
		btnSalvar.setBounds(10, 287, 80, 39);
		contentPane.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				salvarCadastro();
			}
		});

		lblConfirmacao = new JLabel();
		lblConfirmacao.setText("Confirmação");
		lblConfirmacao.setBounds(99, 298, 73, 16);
		contentPane.add(lblConfirmacao);

		btnInicio = new JButton("Início");
		btnInicio.setHorizontalAlignment(SwingConstants.LEFT);
		btnInicio.setForeground(Color.BLACK);
		btnInicio.setBorder(null);
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(15, 349, 57, 23);
		contentPane.add(btnInicio);
		btnInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
				dispose();

			}
		});

		btnCadastroDepartamentos = new JButton("Cadastro de Departamentos");
		btnCadastroDepartamentos.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDepartamentos.setForeground(Color.BLACK);
		btnCadastroDepartamentos.setBorder(null);
		btnCadastroDepartamentos.setBackground(Color.WHITE);
		btnCadastroDepartamentos.setBounds(15, 371, 162, 23);
		contentPane.add(btnCadastroDepartamentos);
		btnCadastroDepartamentos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroDepartamentos().setVisible(true);
				dispose();

			}
		});

		btnCadastroFuncionario = new JButton("Cadastro de Funcionários");
		btnCadastroFuncionario.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroFuncionario.setForeground(Color.BLACK);
		btnCadastroFuncionario.setBorder(null);
		btnCadastroFuncionario.setBackground(Color.WHITE);
		btnCadastroFuncionario.setBounds(15, 393, 162, 23);
		contentPane.add(btnCadastroFuncionario);
		btnCadastroFuncionario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroFuncionario().setVisible(true);
				dispose();

			}
		});

		btnCadastroProjetos = new JButton("Cadastro de Projetos");
		btnCadastroProjetos.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroProjetos.setForeground(Color.BLACK);
		btnCadastroProjetos.setBorder(null);
		btnCadastroProjetos.setBackground(Color.WHITE);
		btnCadastroProjetos.setBounds(15, 414, 162, 23);
		contentPane.add(btnCadastroProjetos);
		btnCadastroProjetos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroProjetos().setVisible(true);
				dispose();

			}
		});

		btnCadastroDependentes = new JButton("Cadastro de Dependentes");
		btnCadastroDependentes.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDependentes.setForeground(Color.BLACK);
		btnCadastroDependentes.setBorder(null);
		btnCadastroDependentes.setBackground(Color.WHITE);
		btnCadastroDependentes.setBounds(15, 433, 162, 23);
		contentPane.add(btnCadastroDependentes);
		btnCadastroDependentes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroDependentes().setVisible(true);
				dispose();
			}
		});


		lblBack = new JLabel("");
		lblBack.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBack.setIcon(new ImageIcon(CadastroDependentes.class.getResource("/imgs/backdependentes.png")));
		lblBack.setBounds(0, 200, 798, 278);
		contentPane.add(lblBack);
	}
	
	private void salvarCadastro() {
		Dependentes dependentes = new Dependentes();
		dependentes.setCodigo(codigo);
		dependentes.setNome(nome);
		dependentes.set
		
	}
}