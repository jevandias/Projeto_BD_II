package com.projetobd.telas;

import java.awt.Dimension;
import javax.swing.JButton;
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
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Cadastro extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

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
		jScrollPane2 = new JScrollPane();
		jTable1 = new JTable();
		tabCadastrar = new JPanel();
		lblTituloTela = new JLabel();
		jSeparatorTitulo = new JSeparator();
		txtFuncionarioNome = new JTextField();
		jSeparatorNome = new JSeparator();
		lblCpf = new JLabel();
		txtFuncionarioCpf = new JTextField();
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
		txtTelefone = new JTextField();
		jSeparatorTelefone = new JSeparator();
		txtSenha = new JTextField();
		jSeparator13 = new JSeparator();
		lblConfirmacao = new JLabel();
		lblNavegacao = new JLabel();

		setUndecorated(true);
		setMinimumSize(new Dimension(800, 530));
		setSize(new Dimension(800, 531));
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
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(618, 18, 110, 14);
		jButton1 = new javax.swing.JButton();
		jButton1.setBounds(726, 14, 59, 23);
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setBounds(36, 17, 70, 96);
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setBounds(520, 11, 92, 24);
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator1.setBounds(110, 119, 675, 10);
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setBounds(212, 135, 371, 14);

		tabInicio.setBackground(new java.awt.Color(255, 255, 255));
		tabInicio.setForeground(new java.awt.Color(0, 0, 0));

		jLabel1.setBackground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Usuário");

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Sair");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ifpe.png")));

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
		jLabel3.setText("Bem vindo !");

		jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

		jLabel4.setText("Gerência Empressarial |  Departamentos e Funcionários");

		jTabbedPane1.addTab("Inicío", tabInicio);
		tabInicio.setLayout(null);
		tabInicio.add(jLabel2);
		tabInicio.add(jSeparator1);
		tabInicio.add(jLabel3);
		tabInicio.add(jLabel1);
		tabInicio.add(jButton1);
		tabInicio.add(jLabel4);

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

		jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
		jScrollPane2.setBorder(null);

		jTable1.setBackground(new java.awt.Color(255, 255, 255));
		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "CPF", "Nome", "Telefone", "Departamento" }));
		jTable1.setGridColor(new java.awt.Color(153, 153, 153));
		jScrollPane2.setViewportView(jTable1);

		javax.swing.GroupLayout gl_tabListar = new javax.swing.GroupLayout(tabListar);
		tabListar.setLayout(gl_tabListar);
		gl_tabListar.setHorizontalGroup(gl_tabListar.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE));
		gl_tabListar.setVerticalGroup(gl_tabListar.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE));

		jTabbedPane1.addTab("Listas", tabListar);

		tabCadastrar.setBackground(new java.awt.Color(255, 255, 255));
		tabCadastrar.setLayout(null);

		lblTituloTela.setBackground(new java.awt.Color(153, 153, 153));
		lblTituloTela.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
		txtNumero = new javax.swing.JTextField();

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
		txtCep = new javax.swing.JTextField();

		txtCep.setBackground(new java.awt.Color(255, 255, 255));
		txtCep.setForeground(new java.awt.Color(153, 153, 153));
		txtCep.setToolTipText("");
		txtCep.setBorder(null);

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

		txtSenha.setBackground(new java.awt.Color(255, 255, 255));
		txtSenha.setForeground(new java.awt.Color(153, 153, 153));
		txtSenha.setToolTipText("");
		txtSenha.setBorder(null);

		tabCadastrar.add(txtSenha);
		txtSenha.setBounds(131, 232, 111, 18);
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

		lblNavegacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
		jLabel19 = new javax.swing.JLabel();

		jLabel19.setBackground(new java.awt.Color(0, 204, 0));
		jLabel19.setForeground(new java.awt.Color(0, 204, 0));
		jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaverde.png"))); // NOI18N
		tabCadastrar.add(jLabel19);
		jLabel19.setBounds(23, 317, 694, 150);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		jTabbedPane1.addTab("Dependentes", null, panel, null);
		panel.setLayout(null);
		
		lblCadastroDeDependentes = new JLabel();
		lblCadastroDeDependentes.setText("Cadastro de Dependentes");
		lblCadastroDeDependentes.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCadastroDeDependentes.setBackground(new Color(153, 153, 153));
		lblCadastroDeDependentes.setBounds(10, 11, 301, 35);
		panel.add(lblCadastroDeDependentes);
		
		separator = new JSeparator();
		separator.setForeground(new Color(204, 204, 204));
		separator.setBackground(new Color(204, 204, 204));
		separator.setBounds(10, 52, 694, 10);
		panel.add(separator);
		
		label_1 = new JLabel();
		label_1.setText("Nome:");
		label_1.setForeground(new Color(153, 153, 153));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(10, 69, 36, 16);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setForeground(new Color(153, 153, 153));
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(52, 68, 243, 18);
		panel.add(textField);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 204, 204));
		separator_1.setBackground(new Color(204, 204, 204));
		separator_1.setBounds(10, 92, 285, 10);
		panel.add(separator_1);
		
		label_2 = new JLabel();
		label_2.setText("CPF:");
		label_2.setForeground(new Color(153, 153, 153));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(313, 69, 25, 16);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setForeground(new Color(153, 153, 153));
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(344, 68, 123, 18);
		panel.add(textField_1);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(new Color(204, 204, 204));
		separator_2.setBackground(new Color(204, 204, 204));
		separator_2.setBounds(313, 92, 154, 10);
		panel.add(separator_2);
		
		lblFuncionrio = new JLabel();
		lblFuncionrio.setText("CPF do Funcionário:");
		lblFuncionrio.setForeground(new Color(153, 153, 153));
		lblFuncionrio.setBackground(Color.WHITE);
		lblFuncionrio.setBounds(485, 69, 97, 16);
		panel.add(lblFuncionrio);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(new Color(204, 204, 204));
		separator_3.setBackground(new Color(204, 204, 204));
		separator_3.setBounds(485, 92, 97, 10);
		panel.add(separator_3);
		
		label_4 = new JLabel();
		label_4.setText("Endereço");
		label_4.setForeground(new Color(153, 153, 153));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(10, 114, 57, 16);
		panel.add(label_4);
		
		label_5 = new JLabel();
		label_5.setText("Rua:");
		label_5.setForeground(new Color(153, 153, 153));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(10, 143, 25, 16);
		panel.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setForeground(new Color(153, 153, 153));
		textField_3.setBorder(null);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(38, 142, 291, 18);
		panel.add(textField_3);
		
		separator_4 = new JSeparator();
		separator_4.setForeground(new Color(204, 204, 204));
		separator_4.setBackground(new Color(204, 204, 204));
		separator_4.setBounds(10, 166, 319, 10);
		panel.add(separator_4);
		
		label_6 = new JLabel();
		label_6.setText("Bairro:");
		label_6.setForeground(new Color(153, 153, 153));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(350, 143, 38, 16);
		panel.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setForeground(new Color(153, 153, 153));
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(400, 142, 154, 18);
		panel.add(textField_4);
		
		separator_5 = new JSeparator();
		separator_5.setForeground(new Color(204, 204, 204));
		separator_5.setBackground(new Color(204, 204, 204));
		separator_5.setBounds(350, 166, 204, 10);
		panel.add(separator_5);
		
		label_7 = new JLabel();
		label_7.setText("Nº:");
		label_7.setForeground(new Color(153, 153, 153));
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(585, 143, 25, 16);
		panel.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setForeground(new Color(153, 153, 153));
		textField_5.setBorder(null);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(606, 142, 97, 18);
		panel.add(textField_5);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(new Color(204, 204, 204));
		separator_6.setBackground(new Color(204, 204, 204));
		separator_6.setBounds(585, 166, 118, 10);
		panel.add(separator_6);
		
		label_8 = new JLabel();
		label_8.setText("Cidade:");
		label_8.setForeground(new Color(153, 153, 153));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(10, 189, 42, 16);
		panel.add(label_8);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setForeground(new Color(153, 153, 153));
		textField_6.setBorder(null);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(58, 188, 114, 18);
		panel.add(textField_6);
		
		separator_7 = new JSeparator();
		separator_7.setForeground(new Color(204, 204, 204));
		separator_7.setBackground(new Color(204, 204, 204));
		separator_7.setBounds(10, 212, 162, 10);
		panel.add(separator_7);
		
		label_9 = new JLabel();
		label_9.setText("UF:");
		label_9.setForeground(new Color(153, 153, 153));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(198, 189, 17, 16);
		panel.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("");
		textField_7.setForeground(new Color(153, 153, 153));
		textField_7.setBorder(null);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(221, 188, 56, 18);
		panel.add(textField_7);
		
		separator_8 = new JSeparator();
		separator_8.setForeground(new Color(204, 204, 204));
		separator_8.setBackground(new Color(204, 204, 204));
		separator_8.setBounds(198, 212, 79, 10);
		panel.add(separator_8);
		
		label_10 = new JLabel();
		label_10.setText("CEP:");
		label_10.setForeground(new Color(153, 153, 153));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(303, 189, 26, 16);
		panel.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setForeground(new Color(153, 153, 153));
		textField_8.setBorder(null);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(335, 188, 114, 18);
		panel.add(textField_8);
		
		separator_9 = new JSeparator();
		separator_9.setForeground(new Color(204, 204, 204));
		separator_9.setBackground(new Color(204, 204, 204));
		separator_9.setBounds(303, 212, 146, 10);
		panel.add(separator_9);
		
		lblParentesco = new JLabel();
		lblParentesco.setText("Parentesco:");
		lblParentesco.setForeground(new Color(153, 153, 153));
		lblParentesco.setBackground(Color.WHITE);
		lblParentesco.setBounds(467, 189, 61, 16);
		panel.add(lblParentesco);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("");
		textField_9.setForeground(new Color(153, 153, 153));
		textField_9.setBorder(null);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(525, 188, 178, 18);
		panel.add(textField_9);
		
		separator_10 = new JSeparator();
		separator_10.setForeground(new Color(204, 204, 204));
		separator_10.setBackground(new Color(204, 204, 204));
		separator_10.setBounds(467, 212, 236, 10);
		panel.add(separator_10);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("");
		textField_10.setForeground(new Color(153, 153, 153));
		textField_10.setBorder(null);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(118, 228, 111, 18);
		panel.add(textField_10);
		
		button = new JButton();
		button.setText("Salvar");
		button.setForeground(new Color(153, 153, 153));
		button.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		button.setBackground(Color.WHITE);
		button.setBounds(624, 268, 80, 39);
		panel.add(button);
		
		separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.WHITE);
		separator_12.setBackground(new Color(204, 204, 204));
		separator_12.setBounds(27, 326, 20, 130);
		panel.add(separator_12);
		
		label_13 = new JLabel();
		label_13.setText("Confirmação");
		label_13.setBounds(514, 279, 73, 16);
		panel.add(label_13);
		
		label_14 = new JLabel();
		label_14.setText("Navegação:");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Dialog", Font.BOLD, 14));
		label_14.setBounds(37, 326, 100, 23);
		panel.add(label_14);
		
		button_1 = new JButton("Início");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.WHITE);
		button_1.setBorder(null);
		button_1.setBackground(new Color(0, 168, 89));
		button_1.setBounds(37, 349, 57, 23);
		panel.add(button_1);
		
		button_2 = new JButton("Cadastro de Departamentos");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.WHITE);
		button_2.setBorder(null);
		button_2.setBackground(new Color(0, 168, 89));
		button_2.setBounds(37, 371, 162, 23);
		panel.add(button_2);
		
		button_3 = new JButton("Cadastro de Funcionários");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.WHITE);
		button_3.setBorder(null);
		button_3.setBackground(new Color(0, 168, 89));
		button_3.setBounds(37, 393, 162, 23);
		panel.add(button_3);
		
		button_4 = new JButton("Cadastro de Projetos");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.WHITE);
		button_4.setBorder(null);
		button_4.setBackground(new Color(0, 168, 89));
		button_4.setBounds(37, 414, 162, 23);
		panel.add(button_4);
		
		button_5 = new JButton("Cadastro de Dependentes");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.WHITE);
		button_5.setBorder(null);
		button_5.setBackground(new Color(0, 168, 89));
		button_5.setBounds(37, 433, 162, 23);
		panel.add(button_5);
		
		label_15 = new JLabel();
		label_15.setIcon(new ImageIcon(Cadastro.class.getResource("/imgs/telaverde.png")));
		label_15.setForeground(new Color(0, 204, 0));
		label_15.setBackground(new Color(0, 204, 0));
		label_15.setBounds(10, 313, 694, 150);
		panel.add(label_15);
		
		comboBox = new JComboBox();
		comboBox.setBounds(585, 73, 119, 20);
		panel.add(comboBox);

		getContentPane().add(jPanel1);
		jPanel1.setBounds(0, 0, 800, 530);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		dispose();
		new Inicio().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cadastro().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblBairro;
	private javax.swing.JLabel lblNumero;
	private javax.swing.JLabel lblCidade;
	private javax.swing.JLabel lblUf;
	private javax.swing.JLabel lblCep;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JLabel lblSalario;
	private javax.swing.JLabel lblConfirmacao;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel lblNavegacao;
	private javax.swing.JLabel lblSenha;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel lblTituloTela;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblEndereco;
	private javax.swing.JLabel lblRua;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel tabListar;
	private javax.swing.JPanel tabCadastrar;
	private javax.swing.JPanel tabInicio;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparatorCep;
	private javax.swing.JSeparator jSeparatorTelefone;
	private javax.swing.JSeparator jSeparatorSalario;
	private javax.swing.JSeparator jSeparator13;
	private javax.swing.JSeparator jSeparatorSenha;
	private javax.swing.JSeparator jSeparatorTitulo;
	private javax.swing.JSeparator jSeparatorNome;
	private javax.swing.JSeparator jSeparatorCpf;
	private javax.swing.JSeparator jSeparatorRua;
	private javax.swing.JSeparator jSeparatorBairro;
	private javax.swing.JSeparator jSeparatorCidade;
	private javax.swing.JSeparator jSeparatorNumero;
	private javax.swing.JSeparator jSeparatorUf;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txtFuncionarioNome;
	private javax.swing.JTextField txtSalario;
	private javax.swing.JTextField txtSenha;
	private javax.swing.JTextField txtFuncionarioCpf;
	private javax.swing.JTextField txtCidade;
	private javax.swing.JTextField txtBairro;
	private javax.swing.JTextField txtNumero;
	private javax.swing.JTextField txtRua;
	private javax.swing.JTextField txtUf;
	private javax.swing.JTextField txtTelefone;
	private javax.swing.JTextField txtCep;
	private JButton btnCadastroDeDependentes;
	private JButton btnCadastroDeDepartamentos;
	private JButton btnCadastroDeFuncionarios;
	private JButton btnCadastroDeProjetos;
	private JButton btnInicio;
	private JButton btnCadastroDeDepartamentos_1;
	private JButton btnCadastroDeFuncionrios;
	private JButton btnCadastroFuncionarios;
	private JButton btnCadastroDeDependentes_1;
	private JPanel panel;
	private JLabel lblCadastroDeDependentes;
	private JSeparator separator;
	private JLabel label_1;
	private JTextField textField;
	private JSeparator separator_1;
	private JLabel label_2;
	private JTextField textField_1;
	private JSeparator separator_2;
	private JLabel lblFuncionrio;
	private JSeparator separator_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textField_3;
	private JSeparator separator_4;
	private JLabel label_6;
	private JTextField textField_4;
	private JSeparator separator_5;
	private JLabel label_7;
	private JTextField textField_5;
	private JSeparator separator_6;
	private JLabel label_8;
	private JTextField textField_6;
	private JSeparator separator_7;
	private JLabel label_9;
	private JTextField textField_7;
	private JSeparator separator_8;
	private JLabel label_10;
	private JTextField textField_8;
	private JSeparator separator_9;
	private JLabel lblParentesco;
	private JTextField textField_9;
	private JSeparator separator_10;
	private JTextField textField_10;
	private JButton button;
	private JSeparator separator_12;
	private JLabel label_13;
	private JLabel label_14;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JLabel label_15;
	private JComboBox comboBox;
	// End of variables declaration//GEN-END:variables
}
