package com.projetobd.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class CadastroDepartamentos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCodigo;
	private JTextField txtLocalizacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDepartamentos frame = new CadastroDepartamentos();
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
	public CadastroDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 795, 478);
		contentPane.add(panel);
		
		JLabel label = new JLabel();
		label.setText("Cadastro de Departamentos\r\n");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBackground(new Color(153, 153, 153));
		label.setBounds(23, 15, 301, 35);
		panel.add(label);
		
		JSeparator separatorTitulo = new JSeparator();
		separatorTitulo.setForeground(new Color(204, 204, 204));
		separatorTitulo.setBackground(new Color(204, 204, 204));
		separatorTitulo.setBounds(23, 56, 694, 10);
		panel.add(separatorTitulo);
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setForeground(new Color(153, 153, 153));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(23, 73, 36, 16);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setForeground(new Color(153, 153, 153));
		txtNome.setBorder(null);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(61, 72, 247, 18);
		panel.add(txtNome);
		
		JSeparator separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(23, 96, 285, 10);
		panel.add(separatorNome);
		
		JLabel lblCodigo = new JLabel();
		lblCodigo.setText("Código:");
		lblCodigo.setForeground(new Color(153, 153, 153));
		lblCodigo.setBackground(Color.WHITE);
		lblCodigo.setBounds(326, 73, 42, 16);
		panel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setToolTipText("");
		txtCodigo.setForeground(new Color(153, 153, 153));
		txtCodigo.setBorder(null);
		txtCodigo.setBackground(Color.WHITE);
		txtCodigo.setBounds(369, 72, 111, 18);
		panel.add(txtCodigo);
		
		JSeparator separatorCodigo = new JSeparator();
		separatorCodigo.setForeground(new Color(204, 204, 204));
		separatorCodigo.setBackground(new Color(204, 204, 204));
		separatorCodigo.setBounds(326, 96, 154, 10);
		panel.add(separatorCodigo);
		
		JLabel lblLocalizacao = new JLabel();
		lblLocalizacao.setText("Localização:");
		lblLocalizacao.setForeground(new Color(153, 153, 153));
		lblLocalizacao.setBackground(Color.WHITE);
		lblLocalizacao.setBounds(498, 73, 61, 16);
		panel.add(lblLocalizacao);
		
		JSeparator separatorLocalizacao = new JSeparator();
		separatorLocalizacao.setForeground(new Color(204, 204, 204));
		separatorLocalizacao.setBackground(new Color(204, 204, 204));
		separatorLocalizacao.setBounds(498, 96, 219, 10);
		panel.add(separatorLocalizacao);
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setToolTipText("");
		txtLocalizacao.setForeground(new Color(153, 153, 153));
		txtLocalizacao.setBorder(null);
		txtLocalizacao.setBackground(Color.WHITE);
		txtLocalizacao.setBounds(563, 72, 154, 18);
		panel.add(txtLocalizacao);
		
		JButton btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(637, 272, 80, 39);
		panel.add(btnSalvar);
		
		JLabel lblConfirmacao = new JLabel();
		lblConfirmacao.setText("Confirmação");
		lblConfirmacao.setBounds(527, 283, 73, 16);
		panel.add(lblConfirmacao);
		
		JLabel lblNavegacao = new JLabel();
		lblNavegacao.setText("Navegação:");
		lblNavegacao.setForeground(Color.WHITE);
		lblNavegacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNavegacao.setBounds(50, 330, 100, 23);
		panel.add(lblNavegacao);
		
		JButton btnInicio = new JButton("Início");
		btnInicio.setHorizontalAlignment(SwingConstants.LEFT);
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBorder(null);
		btnInicio.setBackground(new Color(0, 168, 89));
		btnInicio.setBounds(50, 353, 57, 23);
		panel.add(btnInicio);
		
		JButton btnCadastroDepartamento = new JButton("Cadastro de Departamentos");
		btnCadastroDepartamento.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDepartamento.setForeground(Color.WHITE);
		btnCadastroDepartamento.setBorder(null);
		btnCadastroDepartamento.setBackground(new Color(0, 168, 89));
		btnCadastroDepartamento.setBounds(50, 375, 162, 23);
		panel.add(btnCadastroDepartamento);
		
		JButton btnCadastroFuncionario = new JButton("Cadastro de Funcionários");
		btnCadastroFuncionario.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroFuncionario.setForeground(Color.WHITE);
		btnCadastroFuncionario.setBorder(null);
		btnCadastroFuncionario.setBackground(new Color(0, 168, 89));
		btnCadastroFuncionario.setBounds(50, 397, 162, 23);
		panel.add(btnCadastroFuncionario);
		
		JButton btnCadastroProjeto = new JButton("Cadastro de Projetos");
		btnCadastroProjeto.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroProjeto.setForeground(Color.WHITE);
		btnCadastroProjeto.setBorder(null);
		btnCadastroProjeto.setBackground(new Color(0, 168, 89));
		btnCadastroProjeto.setBounds(50, 418, 162, 23);
		panel.add(btnCadastroProjeto);
		
		JButton btnCadastroDependentes = new JButton("Cadastro de Dependentes");
		btnCadastroDependentes.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDependentes.setForeground(Color.WHITE);
		btnCadastroDependentes.setBorder(null);
		btnCadastroDependentes.setBackground(new Color(0, 168, 89));
		btnCadastroDependentes.setBounds(50, 437, 162, 23);
		panel.add(btnCadastroDependentes);
		
		JLabel lblBack = new JLabel();
		lblBack.setForeground(new Color(0, 204, 0));
		lblBack.setBackground(new Color(0, 204, 0));
		lblBack.setBounds(23, 317, 694, 150);
		panel.add(lblBack);
	}

}
