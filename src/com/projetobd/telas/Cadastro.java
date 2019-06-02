package com.projetobd.telas;

import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.projetobd.personalizados.JDocumentFormatedField;
import com.projetobd.personalizados.JNumberField;
import com.projetobd.controler.ConsultaCep;
import com.projetobd.controler.GerarSenha;
import com.projetobd.controler.ValidaCNP;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton btnSair;
	private JButton btnSalvar;
	private JLabel lblUsuarioLogado;
	private JLabel lblBairro;
	private JLabel lblNumero;
	private JLabel lblCidade;
	private JLabel lblUf;
	private JLabel lblCep;
	private JLabel lblTelefone;
	private JLabel lblSalario;
	private JLabel lblConfirmacao;
	private JLabel lblRodape;
	private JLabel lblIconIF;
	private JLabel lblNavegacao;
	private JLabel lblSenha;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private JLabel jLabel29;
	private JLabel lblBemVindo;
	private JLabel jLabel30;
	private JLabel lblNomeSistema;
	private JLabel lblTituloTela;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblEndereco;
	private JLabel lblRua;
	private JPanel jPanel1;
	private JPanel tabListar;
	private JPanel tabCadastrar;
	private JPanel tabInicio;
	private JScrollPane jScrollPaneListas;
	private JSeparator jSeparatorBase;
	private JSeparator jSeparatorCep;
	private JSeparator jSeparatorTelefone;
	private JSeparator jSeparatorSalario;
	private JSeparator jSeparator13;
	private JSeparator jSeparatorSenha;
	private JSeparator jSeparatorTitulo;
	private JSeparator jSeparatorNome;
	private JSeparator jSeparatorCpf;
	private JSeparator jSeparatorRua;
	private JSeparator jSeparatorBairro;
	private JSeparator jSeparatorCidade;
	private JSeparator jSeparatorNumero;
	private JSeparator jSeparatorUf;
	private JTabbedPane jTabbedPane1;
	private JTable ListaFuncionario;
	private JTextField txtFuncionarioNome;
	private JTextField txtSalario;
	private JTextField txtFuncionarioCpf;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtRua;
	private JTextField txtUf;
	private JTextField txtTelefone;
	private JTextField txtCep;
	private JButton btnCadastroDeDependentes;
	private JButton btnCadastroDeDepartamentos;
	private JButton btnCadastroDeFuncionarios;
	private JButton btnCadastroDeProjetos;
	private JButton btnInicio;
	private JButton btnCadastroDeDepartamentos_1;
	private JButton btnCadastroDeFuncionrios;
	private JButton btnCadastroFuncionarios;
	private JButton btnCadastroDeDependentes_1;
	private JTextField txtSenha;
	
	public Cadastro() {
		initComponents();
	}

	private void initComponents() {
		setLocationRelativeTo(null);
		jLabel26 = new JLabel();
		jLabel27 = new JLabel();
		jLabel28 = new JLabel();
		jLabel29 = new JLabel();
		jLabel30 = new JLabel();
		jPanel1 = new JPanel();
		jTabbedPane1 = new JTabbedPane();
		tabListar = new JPanel();
		jScrollPaneListas = new JScrollPane();
		ListaFuncionario = new JTable();
		tabCadastrar = new JPanel();
		lblTituloTela = new JLabel();
		jSeparatorTitulo = new JSeparator();
		txtFuncionarioNome = new JTextField();
		jSeparatorNome = new JSeparator();
		lblCpf = new JLabel();
		txtFuncionarioCpf = new JDocumentFormatedField().getCpf();
		jSeparatorCpf = new JSeparator();
		lblEndereco = new JLabel();
		lblRua = new JLabel();
		jSeparatorRua = new JSeparator();
		lblBairro = new JLabel();
		jSeparatorBairro = new JSeparator();
		lblNumero = new JLabel();
		jSeparatorNumero = new JSeparator();
		txtCidade = new JTextField();
		jSeparatorCidade = new JSeparator();
		lblUf = new JLabel();
		jSeparatorUf = new JSeparator();
		lblCep = new JLabel();
		jSeparatorCep = new JSeparator();
		txtTelefone = new JDocumentFormatedField().getTel();
		jSeparatorTelefone = new JSeparator();
		jSeparator13 = new JSeparator();
		lblConfirmacao = new JLabel();
		lblNavegacao = new JLabel();

		setUndecorated(true);
		setMinimumSize(new Dimension(800, 530));
		setSize(new Dimension(800, 520));
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		jLabel26.setBackground(new java.awt.Color(255, 255, 255));
		jLabel26.setForeground(new java.awt.Color(255, 255, 255));
		jLabel26.setText("Inicío");

		jLabel27.setBackground(new java.awt.Color(255, 255, 255));
		jLabel27.setForeground(new java.awt.Color(255, 255, 255));
		jLabel27.setText("Cadastro de Departamentos");

		jLabel28.setBackground(new java.awt.Color(255, 255, 255));
		jLabel28.setForeground(new java.awt.Color(255, 255, 255));
		jLabel28.setText("Cadastro de Funcionários");

		jLabel29.setBackground(new java.awt.Color(255, 255, 255));
		jLabel29.setForeground(new java.awt.Color(255, 255, 255));
		jLabel29.setText("Cadastro de Projetos");

		jLabel30.setBackground(new java.awt.Color(255, 255, 255));
		jLabel30.setForeground(new java.awt.Color(255, 255, 255));
		jLabel30.setText("Cadastro de Dependentes");

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
		tabInicio = new javax.swing.JPanel();
		lblUsuarioLogado = new javax.swing.JLabel();
		lblUsuarioLogado.setBounds(618, 18, 110, 14);
		btnSair = new javax.swing.JButton();
		btnSair.setBounds(726, 14, 59, 23);
		lblIconIF = new javax.swing.JLabel();
		lblIconIF.setBounds(36, 17, 70, 96);
		lblBemVindo = new javax.swing.JLabel();
		lblBemVindo.setBounds(520, 11, 92, 24);
		jSeparatorBase = new javax.swing.JSeparator();
		jSeparatorBase.setBounds(110, 119, 675, 10);
		lblNomeSistema = new javax.swing.JLabel();
		lblNomeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeSistema.setBounds(212, 135, 371, 14);

		tabInicio.setBackground(new java.awt.Color(255, 255, 255));
		tabInicio.setForeground(new java.awt.Color(0, 0, 0));

		lblUsuarioLogado.setBackground(new java.awt.Color(255, 255, 255));
		lblUsuarioLogado.setText("Usuário");

		btnSair.setBackground(new java.awt.Color(255, 255, 255));
		btnSair.setText("Sair");
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		lblIconIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ifpe.png")));

		lblBemVindo.setFont(new java.awt.Font("Dialog", 1, 14));
		lblBemVindo.setText("Bem vindo !");

		jSeparatorBase.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorBase.setForeground(new java.awt.Color(204, 204, 204));

		lblNomeSistema.setText("Gerência Empressarial |  Departamentos e Funcionários");

		jTabbedPane1.addTab("Inicío", tabInicio);
		tabInicio.setLayout(null);
		tabInicio.add(lblIconIF);
		tabInicio.add(jSeparatorBase);
		tabInicio.add(lblBemVindo);
		tabInicio.add(lblUsuarioLogado);
		tabInicio.add(btnSair);
		tabInicio.add(lblNomeSistema);

		btnCadastroDeDependentes = new JButton("Cadastro de dependentes");
		btnCadastroDeDependentes.setBackground(Color.WHITE);
		btnCadastroDeDependentes.setBounds(615, 95, 170, 23);
		tabInicio.add(btnCadastroDeDependentes);
		btnCadastroDeDependentes.setBorder(null);

		btnCadastroDeDepartamentos = new JButton("Cadastro de departamentos");
		btnCadastroDeDepartamentos.setBackground(Color.WHITE);
		btnCadastroDeDepartamentos.setBounds(116, 95, 170, 23);
		tabInicio.add(btnCadastroDeDepartamentos);
		btnCadastroDeDepartamentos.setBorder(null);

		btnCadastroDeFuncionarios = new JButton("Cadastro de funcionarios");
		btnCadastroDeFuncionarios.setBackground(Color.WHITE);
		btnCadastroDeFuncionarios.setBounds(296, 95, 166, 23);
		tabInicio.add(btnCadastroDeFuncionarios);
		btnCadastroDeFuncionarios.setBorder(null);

		btnCadastroDeProjetos = new JButton("Cadastro de projetos");
		btnCadastroDeProjetos.setBackground(Color.WHITE);
		btnCadastroDeProjetos.setBounds(472, 95, 140, 23);
		tabInicio.add(btnCadastroDeProjetos);
		btnCadastroDeProjetos.setBorder(null);

		tabListar.setBackground(new java.awt.Color(255, 255, 255));

		jScrollPaneListas.setBackground(new java.awt.Color(255, 255, 255));
		jScrollPaneListas.setBorder(null);

		ListaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
		ListaFuncionario.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "CPF", "Nome", "Telefone", "Departamento" }));
		ListaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(70);
		ListaFuncionario.getColumnModel().getColumn(1).setPreferredWidth(225);
		ListaFuncionario.getColumnModel().getColumn(2).setPreferredWidth(98);
		ListaFuncionario.getColumnModel().getColumn(3).setPreferredWidth(109);
		ListaFuncionario.setGridColor(new java.awt.Color(153, 153, 153));
		jScrollPaneListas.setViewportView(ListaFuncionario);

		javax.swing.GroupLayout gl_tabListar = new javax.swing.GroupLayout(tabListar);
		tabListar.setLayout(gl_tabListar);
		gl_tabListar.setHorizontalGroup(gl_tabListar.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPaneListas, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE));
		gl_tabListar.setVerticalGroup(gl_tabListar.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPaneListas, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE));

		jTabbedPane1.addTab("Listas", tabListar);

		tabCadastrar.setBackground(new java.awt.Color(255, 255, 255));
		tabCadastrar.setLayout(null);

		lblTituloTela.setBackground(new java.awt.Color(153, 153, 153));
		lblTituloTela.setFont(new java.awt.Font("Dialog", 1, 18));
		lblTituloTela.setText("Cadastro de Funcionários");
		tabCadastrar.add(lblTituloTela);
		lblTituloTela.setBounds(23, 15, 301, 35);

		jSeparatorTitulo.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorTitulo.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorTitulo);
		jSeparatorTitulo.setBounds(23, 56, 694, 10);
		lblNome = new javax.swing.JLabel();

		lblNome.setBackground(new java.awt.Color(255, 255, 255));
		lblNome.setForeground(new java.awt.Color(153, 153, 153));
		lblNome.setText("Nome:");
		tabCadastrar.add(lblNome);
		lblNome.setBounds(23, 73, 36, 16);

		txtFuncionarioNome.setBackground(new java.awt.Color(255, 255, 255));
		txtFuncionarioNome.setForeground(new java.awt.Color(153, 153, 153));
		txtFuncionarioNome.setToolTipText("");
		txtFuncionarioNome.setBorder(null);

		tabCadastrar.add(txtFuncionarioNome);
		txtFuncionarioNome.setBounds(65, 72, 243, 18);

		jSeparatorNome.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorNome.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorNome);
		jSeparatorNome.setBounds(23, 96, 285, 10);

		lblCpf.setBackground(new java.awt.Color(255, 255, 255));
		lblCpf.setForeground(new java.awt.Color(153, 153, 153));
		lblCpf.setText("CPF:");
		tabCadastrar.add(lblCpf);
		lblCpf.setBounds(326, 73, 25, 16);

		txtFuncionarioCpf.setBackground(new java.awt.Color(255, 255, 255));
		txtFuncionarioCpf.setForeground(new java.awt.Color(153, 153, 153));
		txtFuncionarioCpf.setToolTipText("");
		txtFuncionarioCpf.setBorder(null);
		txtFuncionarioCpf.addFocusListener(new FocusListener() {	
			@Override
			public void focusLost(FocusEvent arg0) {
				boolean valido = ValidaCNP.isValidCPF(txtFuncionarioCpf.getText().replace(".", "").replace("-", ""));
				if(!valido) {
					jSeparatorCpf.setBackground(Color.RED);
					txtFuncionarioCpf.setText("");
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				jSeparatorCpf.setBackground(new Color(204,204,204));
			}
		});

		tabCadastrar.add(txtFuncionarioCpf);
		txtFuncionarioCpf.setBounds(357, 72, 123, 18);

		jSeparatorCpf.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorCpf.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorCpf);
		jSeparatorCpf.setBounds(326, 96, 154, 10);
		lblSalario = new javax.swing.JLabel();

		lblSalario.setBackground(new java.awt.Color(255, 255, 255));
		lblSalario.setForeground(new java.awt.Color(153, 153, 153));
		lblSalario.setText("Salário:");
		tabCadastrar.add(lblSalario);
		lblSalario.setBounds(498, 73, 43, 16);
		txtSalario = new javax.swing.JTextField();

		txtSalario.setBackground(new java.awt.Color(255, 255, 255));
		txtSalario.setForeground(new java.awt.Color(153, 153, 153));
		txtSalario.setToolTipText("");
		txtSalario.setBorder(null);

		tabCadastrar.add(txtSalario);
		txtSalario.setBounds(542, 72, 174, 18);
		jSeparatorSalario = new javax.swing.JSeparator();

		jSeparatorSalario.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorSalario.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorSalario);
		jSeparatorSalario.setBounds(498, 96, 219, 10);

		lblEndereco.setBackground(new java.awt.Color(255, 255, 255));
		lblEndereco.setForeground(new java.awt.Color(153, 153, 153));
		lblEndereco.setText("Endereço");
		tabCadastrar.add(lblEndereco);
		lblEndereco.setBounds(23, 118, 57, 16);

		lblRua.setBackground(new java.awt.Color(255, 255, 255));
		lblRua.setForeground(new java.awt.Color(153, 153, 153));
		lblRua.setText("Rua:");
		tabCadastrar.add(lblRua);
		lblRua.setBounds(23, 147, 25, 16);
		txtRua = new javax.swing.JTextField();

		txtRua.setBackground(new java.awt.Color(255, 255, 255));
		txtRua.setForeground(new java.awt.Color(153, 153, 153));
		txtRua.setToolTipText("");
		txtRua.setBorder(null);

		tabCadastrar.add(txtRua);
		txtRua.setBounds(51, 146, 291, 18);

		jSeparatorRua.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorRua.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorRua);
		jSeparatorRua.setBounds(23, 170, 319, 10);

		lblBairro.setBackground(new java.awt.Color(255, 255, 255));
		lblBairro.setForeground(new java.awt.Color(153, 153, 153));
		lblBairro.setText("Bairro:");
		tabCadastrar.add(lblBairro);
		lblBairro.setBounds(363, 147, 38, 16);
		txtBairro = new javax.swing.JTextField();

		txtBairro.setBackground(new java.awt.Color(255, 255, 255));
		txtBairro.setForeground(new java.awt.Color(153, 153, 153));
		txtBairro.setToolTipText("");
		txtBairro.setBorder(null);

		tabCadastrar.add(txtBairro);
		txtBairro.setBounds(413, 146, 154, 18);

		jSeparatorBairro.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorBairro.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorBairro);
		jSeparatorBairro.setBounds(363, 170, 204, 10);

		lblNumero.setBackground(new java.awt.Color(255, 255, 255));
		lblNumero.setForeground(new java.awt.Color(153, 153, 153));
		lblNumero.setText("Nº:");
		tabCadastrar.add(lblNumero);
		lblNumero.setBounds(598, 147, 25, 16);
		txtNumero = new JNumberField();

		txtNumero.setBackground(new java.awt.Color(255, 255, 255));
		txtNumero.setForeground(new java.awt.Color(153, 153, 153));
		txtNumero.setToolTipText("");
		txtNumero.setBorder(null);

		tabCadastrar.add(txtNumero);
		txtNumero.setBounds(619, 146, 97, 18);

		jSeparatorNumero.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorNumero.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorNumero);
		jSeparatorNumero.setBounds(598, 170, 118, 10);
		lblCidade = new javax.swing.JLabel();

		lblCidade.setBackground(new java.awt.Color(255, 255, 255));
		lblCidade.setForeground(new java.awt.Color(153, 153, 153));
		lblCidade.setText("Cidade:");
		tabCadastrar.add(lblCidade);
		lblCidade.setBounds(23, 193, 42, 16);

		txtCidade.setBackground(new java.awt.Color(255, 255, 255));
		txtCidade.setForeground(new java.awt.Color(153, 153, 153));
		txtCidade.setToolTipText("");
		txtCidade.setBorder(null);

		tabCadastrar.add(txtCidade);
		txtCidade.setBounds(71, 192, 114, 18);

		jSeparatorCidade.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorCidade.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorCidade);
		jSeparatorCidade.setBounds(23, 216, 162, 10);

		lblUf.setBackground(new java.awt.Color(255, 255, 255));
		lblUf.setForeground(new java.awt.Color(153, 153, 153));
		lblUf.setText("UF:");
		tabCadastrar.add(lblUf);
		lblUf.setBounds(211, 193, 17, 16);
		txtUf = new javax.swing.JTextField();

		txtUf.setBackground(new java.awt.Color(255, 255, 255));
		txtUf.setForeground(new java.awt.Color(153, 153, 153));
		txtUf.setToolTipText("");
		txtUf.setBorder(null);

		tabCadastrar.add(txtUf);
		txtUf.setBounds(234, 192, 56, 18);

		jSeparatorUf.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorUf.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorUf);
		jSeparatorUf.setBounds(211, 216, 79, 10);

		lblCep.setBackground(new java.awt.Color(255, 255, 255));
		lblCep.setForeground(new java.awt.Color(153, 153, 153));
		lblCep.setText("CEP:");
		tabCadastrar.add(lblCep);
		lblCep.setBounds(316, 193, 26, 16);
		txtCep = new JDocumentFormatedField().getCep();

		txtCep.setBackground(new java.awt.Color(255, 255, 255));
		txtCep.setForeground(new java.awt.Color(153, 153, 153));
		txtCep.setToolTipText("");
		txtCep.setBorder(null);
		txtCep.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (!txtCep.getText().replace("     -   ", "").isEmpty()) {
					ConsultaCep consulta = new ConsultaCep(txtCep.getText().replace("-", ""));
					txtBairro.setText(consulta.getBairro());
					txtCidade.setText(consulta.getCidade());
					txtRua.setText(consulta.getLogradouro());
					txtUf.setText(consulta.getEstado());
					txtSenha.setText(String.valueOf(GerarSenha.retornaSenha()));
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {

			}
		});

		tabCadastrar.add(txtCep);
		txtCep.setBounds(348, 192, 114, 18);

		jSeparatorCep.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorCep.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorCep);
		jSeparatorCep.setBounds(316, 216, 146, 10);
		lblTelefone = new javax.swing.JLabel();

		lblTelefone.setBackground(new java.awt.Color(255, 255, 255));
		lblTelefone.setForeground(new java.awt.Color(153, 153, 153));
		lblTelefone.setText("Telefone:");
		tabCadastrar.add(lblTelefone);
		lblTelefone.setBounds(480, 193, 52, 16);

		txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
		txtTelefone.setForeground(new java.awt.Color(153, 153, 153));
		txtTelefone.setToolTipText("");
		txtTelefone.setBorder(null);

		tabCadastrar.add(txtTelefone);
		txtTelefone.setBounds(538, 192, 178, 18);

		jSeparatorTelefone.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorTelefone.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorTelefone);
		jSeparatorTelefone.setBounds(480, 216, 236, 10);
		lblSenha = new javax.swing.JLabel();

		lblSenha.setBackground(new java.awt.Color(255, 255, 255));
		lblSenha.setForeground(new java.awt.Color(153, 153, 153));
		lblSenha.setText("Senha de Acesso:");
		tabCadastrar.add(lblSenha);
		lblSenha.setBounds(23, 233, 102, 16);
		jSeparatorSenha = new javax.swing.JSeparator();

		jSeparatorSenha.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorSenha.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparatorSenha);
		jSeparatorSenha.setBounds(23, 256, 219, 10);
		btnSalvar = new javax.swing.JButton();

		btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
		btnSalvar.setForeground(new java.awt.Color(153, 153, 153));
		btnSalvar.setText("Salvar");
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		tabCadastrar.add(btnSalvar);
		btnSalvar.setBounds(637, 272, 80, 39);

		jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
		jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
		tabCadastrar.add(jSeparator13);
		jSeparator13.setBounds(40, 330, 20, 130);

		lblConfirmacao.setText("Confirmação");
		tabCadastrar.add(lblConfirmacao);
		lblConfirmacao.setBounds(527, 283, 73, 16);

		lblNavegacao.setFont(new java.awt.Font("Dialog", 1, 14));
		lblNavegacao.setForeground(new java.awt.Color(255, 255, 255));
		lblNavegacao.setText("Navegação:");
		tabCadastrar.add(lblNavegacao);
		lblNavegacao.setBounds(50, 330, 100, 23);

		btnInicio = new JButton("Início");
		btnInicio.setHorizontalAlignment(SwingConstants.LEFT);
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setBackground(new Color(0, 168, 89));
		btnInicio.setBounds(50, 353, 57, 23);
		btnInicio.setBorder(null);
		tabCadastrar.add(btnInicio);

		btnCadastroDeDepartamentos_1 = new JButton("Cadastro de Departamentos");
		btnCadastroDeDepartamentos_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDeDepartamentos_1.setForeground(Color.WHITE);
		btnCadastroDeDepartamentos_1.setBorder(null);
		btnCadastroDeDepartamentos_1.setBackground(new Color(0, 168, 89));
		btnCadastroDeDepartamentos_1.setBounds(50, 375, 162, 23);
		tabCadastrar.add(btnCadastroDeDepartamentos_1);

		btnCadastroDeFuncionrios = new JButton("Cadastro de Funcionários");
		btnCadastroDeFuncionrios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDeFuncionrios.setForeground(Color.WHITE);
		btnCadastroDeFuncionrios.setBorder(null);
		btnCadastroDeFuncionrios.setBackground(new Color(0, 168, 89));
		btnCadastroDeFuncionrios.setBounds(50, 397, 162, 23);
		tabCadastrar.add(btnCadastroDeFuncionrios);

		btnCadastroFuncionarios = new JButton("Cadastro de Projetos");
		btnCadastroFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroFuncionarios.setForeground(Color.WHITE);
		btnCadastroFuncionarios.setBorder(null);
		btnCadastroFuncionarios.setBackground(new Color(0, 168, 89));
		btnCadastroFuncionarios.setBounds(50, 418, 162, 23);
		tabCadastrar.add(btnCadastroFuncionarios);

		btnCadastroDeDependentes_1 = new JButton("Cadastro de Dependentes");
		btnCadastroDeDependentes_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDeDependentes_1.setForeground(Color.WHITE);
		btnCadastroDeDependentes_1.setBorder(null);
		btnCadastroDeDependentes_1.setBackground(new Color(0, 168, 89));
		btnCadastroDeDependentes_1.setBounds(50, 437, 162, 23);
		tabCadastrar.add(btnCadastroDeDependentes_1);

		jTabbedPane1.addTab("Cadastrar", tabCadastrar);
		lblRodape = new javax.swing.JLabel();

		lblRodape.setBackground(new java.awt.Color(0, 204, 0));
		lblRodape.setForeground(new java.awt.Color(0, 204, 0));
		lblRodape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaverde.png")));
		tabCadastrar.add(lblRodape);
		lblRodape.setBounds(23, 317, 694, 150);
		
		txtSenha = new JTextField();
		txtSenha.setBackground(new Color(255, 255, 255));
		txtSenha.setBounds(127, 232, 114, 18);
		txtSenha.setForeground(new Color(153, 153, 153));
		tabCadastrar.add(txtSenha);
		txtSenha.setBorder(null);
		txtSenha.setColumns(10);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		getContentPane().add(jPanel1);
		jPanel1.setBounds(0, 0, 800, 519);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		new Inicio().setVisible(true);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cadastro().setVisible(true);
			}
		});
	}
}