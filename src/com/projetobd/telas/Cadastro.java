package com.projetobd.telas;

import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

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

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import com.projetobd.personalizados.JDocumentFormatedField;
import com.projetobd.personalizados.JNumberField;
import com.projetobd.personalizados.JNumberFormatField;
import com.projetobd.controler.ConsultaCep;
import com.projetobd.controler.GerarSenha;
import com.projetobd.controler.ValidaCNP;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton btnSair;
	private JButton btnSalvar;
	private JLabel lblUsuarioLogado;
	private JLabel lblRua;
	private JLabel lblBairro;
	private JLabel lblNumero;
	private JLabel lblCidade;
	private JLabel lblUf;
	private JLabel lblTelefone;
	private JLabel lblSalario;
	private JLabel lblConfirmacao;
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
	private JLabel lblCep;
	private JPanel jPanel1;
	private JPanel tabListar;
	private JPanel tabFuncionario;
	private JPanel tabInicio;
	private JScrollPane jScrollPaneListas;
	private JSeparator jSeparatorBase;
	private JSeparator jSeparatorUf;
	private JSeparator jSeparatorTelefone;
	private JSeparator jSeparatorSalario;
	private JSeparator jSeparator13;
	private JSeparator jSeparatorSenha;
	private JSeparator jSeparatorTitulo;
	private JSeparator jSeparatorNome;
	private JSeparator jSeparatorCpf;
	private JSeparator jSeparatorCep;
	private JSeparator jSeparatorRua;
	private JSeparator jSeparatorNumero;
	private JSeparator jSeparatorBairro;
	private JSeparator jSeparatorCidade;
	private JTabbedPane jTabbedPane1;
	private JTable ListaFuncionario;
	private JTextField txtFuncionarioNome;
	private JTextField txtSalario;
	private JTextField txtFuncionarioCpf;
	private JTextField txtNumero;
	private JTextField txtRua;
	private JTextField txtBairro;
	private JTextField txtRua12;
	private JTextField txtCidade;
	private JTextField txtTelefone;
	private JTextField txtCep;
	private JTextField txtUf;
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

	private JPanel tabDependentes;

	private JLabel lblCadastroDeDependentes;

	private JLabel jLabel19;

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

	private JLabel lblCpf_1;

	private JTextField textField_3;

	private JSeparator separator_4;

	private JLabel label_6;

	private JTextField textField_4;

	private JSeparator separator_5;

	private JLabel lblNmero;

	private JTextField textField_5;

	private JSeparator separator_6;

	private JLabel label_8;

	private JTextField textField_6;

	private JButton button_2;

	private JButton button_1;

	private JButton button_3;

	private JButton button_4;

	private JButton button_5;

	private JSeparator separator_7;

	private JLabel label_9;

	private JTextField textField_7;

	private JSeparator separator_8;

	private JLabel lblRua_1;

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

	private JLabel label_15;

	private JComboBox comboBox;

	private JPanel tabDepartamentos;

	private JPanel tabDepartamentos_1;

	private JLabel lblCadastroDeDepartamentos;

	private JSeparator separator_11;

	private JLabel label_3;

	private JTextField textField_2;

	private JSeparator separator_13;

	private JLabel lblCdigo;

	private JTextField textField_11;

	private JSeparator separator_14;

	private JLabel lblLocalizao;

	private JSeparator separator_15;

	private JTextField textField_13;

	private JTextField textField_14;

	private JButton button_6;

	private JSeparator separator_23;

	private JLabel label_24;

	private JLabel label_25;

	private JButton button_7;

	private JButton button_8;

	private JButton button_9;

	private JButton button_10;

	private JButton button_11;

	private JLabel label_26;

	private JScrollPane jScrollPane2;

	private JTable jTable1;

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
		txtFuncionarioCpf = new JDocumentFormatedField().getCpf();
		txtTelefone = new JDocumentFormatedField().getTel();

		jScrollPane2 = new JScrollPane();
		jTable1 = new JTable();

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

		txtFuncionarioCpf.setBackground(new java.awt.Color(255, 255, 255));
		txtFuncionarioCpf.setForeground(new java.awt.Color(153, 153, 153));
		txtFuncionarioCpf.setToolTipText("");
		txtFuncionarioCpf.setBorder(null);
		txtFuncionarioCpf.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent arg0) {
				boolean valido = ValidaCNP.isValidCPF(txtFuncionarioCpf.getText().replace(".", "").replace("-", ""));
				if (!valido) {
					jSeparatorCpf.setBackground(Color.RED);
					txtFuncionarioCpf.setText("");
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
				jSeparatorCpf.setBackground(new Color(204, 204, 204));
			}
		});
		txtFuncionarioCpf.setBounds(357, 72, 123, 18);
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
		txtCep.setBounds(51, 146, 118, 18);

		txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
		txtTelefone.setForeground(new java.awt.Color(153, 153, 153));
		txtTelefone.setToolTipText("");
		txtTelefone.setBorder(null);
		txtTelefone.setBounds(538, 192, 178, 18);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		tabFuncionario = new JPanel();
		lblTituloTela = new JLabel();
		jSeparatorTitulo = new JSeparator();
		txtFuncionarioNome = new JTextField();
		jSeparatorNome = new JSeparator();
		lblCpf = new JLabel();
		txtFuncionarioCpf = new JDocumentFormatedField().getCpf();
		jSeparatorCpf = new JSeparator();
		lblEndereco = new JLabel();
		lblCep = new JLabel();
		jSeparatorCep = new JSeparator();
		lblRua = new JLabel();
		jSeparatorRua = new JSeparator();
		lblBairro = new JLabel();
		jSeparatorBairro = new JSeparator();
		txtNumero = new JNumberField();
		jSeparatorNumero = new JSeparator();
		lblCidade = new JLabel();
		jSeparatorCidade = new JSeparator();
		lblUf = new JLabel();
		jSeparatorUf = new JSeparator();
		txtTelefone = new JDocumentFormatedField().getTel();
		jSeparatorTelefone = new JSeparator();
		txtSenha = new JNumberField();
		jSeparator13 = new JSeparator();
		lblConfirmacao = new JLabel();
		lblNavegacao = new JLabel();

		tabFuncionario.setBackground(new java.awt.Color(255, 255, 255));
		tabFuncionario.setLayout(null);

		lblTituloTela.setBackground(new java.awt.Color(153, 153, 153));
		lblTituloTela.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		lblTituloTela.setText("Cadastro de Funcionários");
		tabFuncionario.add(lblTituloTela);
		tabFuncionario.add(txtCep);
		lblTituloTela.setBounds(23, 15, 301, 35);

		jSeparatorTitulo.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorTitulo.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorTitulo);
		jSeparatorTitulo.setBounds(23, 56, 694, 10);
		lblNome = new javax.swing.JLabel();

		lblNome.setBackground(new java.awt.Color(255, 255, 255));
		lblNome.setForeground(new java.awt.Color(153, 153, 153));
		lblNome.setText("Nome:");
		tabFuncionario.add(lblNome);
		lblNome.setBounds(23, 73, 36, 16);

		txtFuncionarioNome.setBackground(new java.awt.Color(255, 255, 255));
		txtFuncionarioNome.setForeground(new java.awt.Color(153, 153, 153));
		txtFuncionarioNome.setToolTipText("");
		txtFuncionarioNome.setBorder(null);

		tabFuncionario.add(txtFuncionarioNome);
		txtFuncionarioNome.setBounds(65, 72, 243, 18);

		jSeparatorNome.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorNome.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorNome);
		jSeparatorNome.setBounds(23, 96, 285, 10);

		lblCpf.setBackground(new java.awt.Color(255, 255, 255));
		lblCpf.setForeground(new java.awt.Color(153, 153, 153));
		lblCpf.setText("CPF:");
		tabFuncionario.add(lblCpf);
		lblCpf.setBounds(326, 73, 25, 16);

		txtFuncionarioCpf.setBackground(new java.awt.Color(255, 255, 255));
		txtFuncionarioCpf.setForeground(new java.awt.Color(153, 153, 153));
		txtFuncionarioCpf.setToolTipText("");
		txtFuncionarioCpf.setBorder(null);

		tabFuncionario.add(txtFuncionarioCpf);
		txtFuncionarioCpf.setBounds(357, 72, 123, 18);
		txtFuncionarioCpf.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!ValidaCNP.isValidCPF(txtFuncionarioCpf.getText().replace("-", "").replace(".", ""))) {
					jSeparatorCpf.setBackground(Color.RED);
					txtFuncionarioCpf.setText("");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				jSeparatorCpf.setBackground(new Color(204, 204, 204));
			}
		});

		jSeparatorCpf.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorCpf.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorCpf);
		jSeparatorCpf.setBounds(326, 96, 154, 10);
		lblSalario = new javax.swing.JLabel();

		lblSalario.setBackground(new java.awt.Color(255, 255, 255));
		lblSalario.setForeground(new java.awt.Color(153, 153, 153));
		lblSalario.setText("Salário:");
		tabFuncionario.add(lblSalario);
		lblSalario.setBounds(498, 73, 43, 16);
		txtSalario = new JNumberFormatField(new DecimalFormat("0.00"));

		txtSalario.setBackground(new java.awt.Color(255, 255, 255));
		txtSalario.setForeground(new java.awt.Color(153, 153, 153));
		txtSalario.setToolTipText("");
		txtSalario.setBorder(null);

		tabFuncionario.add(txtSalario);
		txtSalario.setBounds(542, 72, 174, 18);
		jSeparatorSalario = new javax.swing.JSeparator();

		jSeparatorSalario.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorSalario.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorSalario);
		jSeparatorSalario.setBounds(498, 96, 219, 10);

		lblEndereco.setBackground(new java.awt.Color(255, 255, 255));
		lblEndereco.setForeground(new java.awt.Color(153, 153, 153));
		lblEndereco.setText("Endereço");
		tabFuncionario.add(lblEndereco);
		lblEndereco.setBounds(23, 118, 57, 16);

		lblCep.setBackground(new java.awt.Color(255, 255, 255));
		lblCep.setForeground(new java.awt.Color(153, 153, 153));
		lblCep.setText("CEP:");
		tabFuncionario.add(lblCep);
		lblCep.setBounds(23, 147, 28, 16);

		jSeparatorCep.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorCep.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorCep);
		jSeparatorCep.setBounds(23, 170, 146, 10);

		lblRua.setBackground(new java.awt.Color(255, 255, 255));
		lblRua.setForeground(new java.awt.Color(153, 153, 153));
		lblRua.setText("Rua:");
		tabFuncionario.add(lblRua);
		lblRua.setBounds(193, 147, 38, 16);
		txtRua = new javax.swing.JTextField();

		txtRua.setBackground(new java.awt.Color(255, 255, 255));
		txtRua.setForeground(new java.awt.Color(153, 153, 153));
		txtRua.setToolTipText("");
		txtRua.setBorder(null);

		tabFuncionario.add(txtRua);
		txtRua.setBounds(229, 146, 251, 18);

		jSeparatorRua.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorRua.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorRua);
		jSeparatorRua.setBounds(193, 170, 287, 10);

		lblBairro.setBackground(new java.awt.Color(255, 255, 255));
		lblBairro.setForeground(new java.awt.Color(153, 153, 153));
		lblBairro.setText("Bairro:");
		tabFuncionario.add(lblBairro);
		lblBairro.setBounds(498, 147, 45, 16);
		txtBairro = new javax.swing.JTextField();

		txtBairro.setBackground(new java.awt.Color(255, 255, 255));
		txtBairro.setForeground(new java.awt.Color(153, 153, 153));
		txtBairro.setToolTipText("");
		txtBairro.setBorder(null);

		tabFuncionario.add(txtBairro);
		txtBairro.setBounds(542, 146, 174, 18);

		jSeparatorBairro.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorBairro.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorBairro);
		jSeparatorBairro.setBounds(498, 170, 219, 10);
		lblNumero = new javax.swing.JLabel();

		lblNumero.setBackground(new java.awt.Color(255, 255, 255));
		lblNumero.setForeground(new java.awt.Color(153, 153, 153));
		lblNumero.setText("Número:");
		tabFuncionario.add(lblNumero);
		lblNumero.setBounds(23, 189, 50, 16);

		txtNumero.setBackground(new java.awt.Color(255, 255, 255));
		txtNumero.setForeground(new java.awt.Color(153, 153, 153));
		txtNumero.setToolTipText("");
		txtNumero.setBorder(null);

		tabFuncionario.add(txtNumero);
		txtNumero.setBounds(74, 188, 95, 18);

		jSeparatorNumero.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorNumero.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorNumero);
		jSeparatorNumero.setBounds(23, 216, 146, 10);

		lblCidade.setBackground(new java.awt.Color(255, 255, 255));
		lblCidade.setForeground(new java.awt.Color(153, 153, 153));
		lblCidade.setText("Cidade:");
		tabFuncionario.add(lblCidade);
		lblCidade.setBounds(193, 189, 45, 16);
		txtCidade = new javax.swing.JTextField();

		txtCidade.setBackground(new java.awt.Color(255, 255, 255));
		txtCidade.setForeground(new java.awt.Color(153, 153, 153));
		txtCidade.setToolTipText("");
		txtCidade.setBorder(null);

		tabFuncionario.add(txtCidade);
		txtCidade.setBounds(236, 188, 119, 18);

		jSeparatorCidade.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorCidade.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorCidade);
		jSeparatorCidade.setBounds(193, 216, 162, 10);

		lblUf.setBackground(new java.awt.Color(255, 255, 255));
		lblUf.setForeground(new java.awt.Color(153, 153, 153));
		lblUf.setText("UF:");
		tabFuncionario.add(lblUf);
		lblUf.setBounds(379, 189, 17, 16);
		txtUf = new javax.swing.JTextField();

		txtUf.setBackground(new java.awt.Color(255, 255, 255));
		txtUf.setForeground(new java.awt.Color(153, 153, 153));
		txtUf.setToolTipText("");
		txtUf.setBorder(null);

		tabFuncionario.add(txtUf);
		txtUf.setBounds(399, 188, 81, 18);

		jSeparatorUf.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorUf.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorUf);
		jSeparatorUf.setBounds(379, 216, 101, 10);
		lblTelefone = new javax.swing.JLabel();

		lblTelefone.setBackground(new java.awt.Color(255, 255, 255));
		lblTelefone.setForeground(new java.awt.Color(153, 153, 153));
		lblTelefone.setText("Telefone:");
		tabFuncionario.add(lblTelefone);
		lblTelefone.setBounds(498, 189, 52, 16);

		txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
		txtTelefone.setForeground(new java.awt.Color(153, 153, 153));
		txtTelefone.setToolTipText("");
		txtTelefone.setBorder(null);

		tabFuncionario.add(txtTelefone);
		txtTelefone.setBounds(549, 188, 168, 18);

		jSeparatorTelefone.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorTelefone.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorTelefone);
		jSeparatorTelefone.setBounds(498, 216, 219, 10);
		lblSenha = new javax.swing.JLabel();

		lblSenha.setBackground(new java.awt.Color(255, 255, 255));
		lblSenha.setForeground(new java.awt.Color(153, 153, 153));
		lblSenha.setText("Senha de Acesso:");
		tabFuncionario.add(lblSenha);
		lblSenha.setBounds(23, 233, 105, 16);

		txtSenha.setBackground(new java.awt.Color(255, 255, 255));
		txtSenha.setForeground(new java.awt.Color(153, 153, 153));
		txtSenha.setToolTipText("");
		txtSenha.setBorder(null);

		tabFuncionario.add(txtSenha);
		txtSenha.setBounds(129, 232, 113, 18);
		jSeparatorSenha = new javax.swing.JSeparator();

		jSeparatorSenha.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorSenha.setForeground(new java.awt.Color(204, 204, 204));
		tabFuncionario.add(jSeparatorSenha);
		jSeparatorSenha.setBounds(23, 256, 219, 10);
		btnSalvar = new javax.swing.JButton();

		btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
		btnSalvar.setForeground(new java.awt.Color(153, 153, 153));
		btnSalvar.setText("Salvar");
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		tabFuncionario.add(btnSalvar);
		btnSalvar.setBounds(637, 272, 80, 39);

		jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
		jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
		tabFuncionario.add(jSeparator13);
		jSeparator13.setBounds(40, 330, 20, 130);

		lblConfirmacao.setText("Confirmação");
		tabFuncionario.add(lblConfirmacao);
		lblConfirmacao.setBounds(527, 283, 73, 16);

		lblNavegacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		lblNavegacao.setForeground(new java.awt.Color(255, 255, 255));
		lblNavegacao.setText("Navegação:");
		tabFuncionario.add(lblNavegacao);
		lblNavegacao.setBounds(50, 330, 100, 23);

		btnInicio = new JButton("Início");
		btnInicio.setHorizontalAlignment(SwingConstants.LEFT);
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setBackground(new Color(0, 168, 89));
		btnInicio.setBounds(50, 353, 57, 23);
		btnInicio.setBorder(null);
		tabFuncionario.add(btnInicio);

		btnCadastroDeDepartamentos_1 = new JButton("Cadastro de Departamentos");
		btnCadastroDeDepartamentos_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDeDepartamentos_1.setForeground(Color.WHITE);
		btnCadastroDeDepartamentos_1.setBorder(null);
		btnCadastroDeDepartamentos_1.setBackground(new Color(0, 168, 89));
		btnCadastroDeDepartamentos_1.setBounds(50, 375, 162, 23);
		tabFuncionario.add(btnCadastroDeDepartamentos_1);

		btnCadastroDeFuncionrios = new JButton("Cadastro de Funcionários");
		btnCadastroDeFuncionrios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDeFuncionrios.setForeground(Color.WHITE);
		btnCadastroDeFuncionrios.setBorder(null);
		btnCadastroDeFuncionrios.setBackground(new Color(0, 168, 89));
		btnCadastroDeFuncionrios.setBounds(50, 397, 162, 23);
		tabFuncionario.add(btnCadastroDeFuncionrios);

		btnCadastroFuncionarios = new JButton("Cadastro de Projetos");
		btnCadastroFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroFuncionarios.setForeground(Color.WHITE);
		btnCadastroFuncionarios.setBorder(null);
		btnCadastroFuncionarios.setBackground(new Color(0, 168, 89));
		btnCadastroFuncionarios.setBounds(50, 418, 162, 23);
		tabFuncionario.add(btnCadastroFuncionarios);

		btnCadastroDeDependentes_1 = new JButton("Cadastro de Dependentes");
		btnCadastroDeDependentes_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastroDeDependentes_1.setForeground(Color.WHITE);
		btnCadastroDeDependentes_1.setBorder(null);
		btnCadastroDeDependentes_1.setBackground(new Color(0, 168, 89));
		btnCadastroDeDependentes_1.setBounds(50, 437, 162, 23);
		tabFuncionario.add(btnCadastroDeDependentes_1);

		jTabbedPane1.addTab("Funcionário", tabFuncionario);
		jLabel19 = new JLabel();

		jLabel19.setBackground(new java.awt.Color(0, 204, 0));
		jLabel19.setForeground(new java.awt.Color(0, 204, 0));
		jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaverde.png"))); // NOI18N
		tabFuncionario.add(jLabel19);
		jLabel19.setBounds(23, 317, 694, 150);

		tabDependentes = new JPanel();
		tabDependentes.setBackground(Color.WHITE);
		jTabbedPane1.addTab("Dependentes", null, tabDependentes, null);
		tabDependentes.setLayout(null);

		lblCadastroDeDependentes = new JLabel();
		lblCadastroDeDependentes.setText("Cadastro de Dependentes");
		lblCadastroDeDependentes.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCadastroDeDependentes.setBackground(new Color(153, 153, 153));
		lblCadastroDeDependentes.setBounds(23, 15, 301, 35);
		tabDependentes.add(lblCadastroDeDependentes);

		separator = new JSeparator();
		separator.setForeground(new Color(204, 204, 204));
		separator.setBackground(new Color(204, 204, 204));
		separator.setBounds(23, 56, 694, 10);
		tabDependentes.add(separator);

		label_1 = new JLabel();
		label_1.setText("Nome:");
		label_1.setForeground(new Color(153, 153, 153));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(23, 73, 36, 16);
		tabDependentes.add(label_1);

		textField = new JTextField();
		textField.setToolTipText("");
		textField.setForeground(new Color(153, 153, 153));
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(61, 72, 247, 18);
		tabDependentes.add(textField);

		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 204, 204));
		separator_1.setBackground(new Color(204, 204, 204));
		separator_1.setBounds(23, 96, 285, 10);
		tabDependentes.add(separator_1);

		label_2 = new JLabel();
		label_2.setText("CPF:");
		label_2.setForeground(new Color(153, 153, 153));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(326, 73, 25, 16);
		tabDependentes.add(label_2);

		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setForeground(new Color(153, 153, 153));
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(357, 72, 123, 18);
		tabDependentes.add(textField_1);

		separator_2 = new JSeparator();
		separator_2.setForeground(new Color(204, 204, 204));
		separator_2.setBackground(new Color(204, 204, 204));
		separator_2.setBounds(326, 96, 154, 10);
		tabDependentes.add(separator_2);

		lblFuncionrio = new JLabel();
		lblFuncionrio.setText("CPF do Funcionário:");
		lblFuncionrio.setForeground(new Color(153, 153, 153));
		lblFuncionrio.setBackground(Color.WHITE);
		lblFuncionrio.setBounds(498, 73, 118, 16);
		tabDependentes.add(lblFuncionrio);

		separator_3 = new JSeparator();
		separator_3.setForeground(new Color(204, 204, 204));
		separator_3.setBackground(new Color(204, 204, 204));
		separator_3.setBounds(498, 96, 118, 10);
		tabDependentes.add(separator_3);

		label_4 = new JLabel();
		label_4.setText("Endereço");
		label_4.setForeground(new Color(153, 153, 153));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(23, 118, 57, 16);
		tabDependentes.add(label_4);

		lblCpf_1 = new JLabel();
		lblCpf_1.setText("CEP:");
		lblCpf_1.setForeground(new Color(153, 153, 153));
		lblCpf_1.setBackground(Color.WHITE);
		lblCpf_1.setBounds(23, 147, 36, 16);
		tabDependentes.add(lblCpf_1);

		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setForeground(new Color(153, 153, 153));
		textField_3.setBorder(null);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(61, 146, 108, 18);
		tabDependentes.add(textField_3);

		separator_4 = new JSeparator();
		separator_4.setForeground(new Color(204, 204, 204));
		separator_4.setBackground(new Color(204, 204, 204));
		separator_4.setBounds(23, 170, 146, 10);
		tabDependentes.add(separator_4);

		label_6 = new JLabel();
		label_6.setText("Bairro:");
		label_6.setForeground(new Color(153, 153, 153));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(498, 147, 38, 16);
		tabDependentes.add(label_6);

		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setForeground(new Color(153, 153, 153));
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(536, 146, 181, 18);
		tabDependentes.add(textField_4);

		separator_5 = new JSeparator();
		separator_5.setForeground(new Color(204, 204, 204));
		separator_5.setBackground(new Color(204, 204, 204));
		separator_5.setBounds(498, 170, 219, 10);
		tabDependentes.add(separator_5);

		lblNmero = new JLabel();
		lblNmero.setText("Número:");
		lblNmero.setForeground(new Color(153, 153, 153));
		lblNmero.setBackground(Color.WHITE);
		lblNmero.setBounds(23, 189, 57, 16);
		tabDependentes.add(lblNmero);

		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setForeground(new Color(153, 153, 153));
		textField_5.setBorder(null);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(67, 188, 102, 18);
		tabDependentes.add(textField_5);

		separator_6 = new JSeparator();
		separator_6.setForeground(new Color(204, 204, 204));
		separator_6.setBackground(new Color(204, 204, 204));
		separator_6.setBounds(23, 216, 146, 10);
		tabDependentes.add(separator_6);

		label_8 = new JLabel();
		label_8.setText("Cidade:");
		label_8.setForeground(new Color(153, 153, 153));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(193, 189, 42, 16);
		tabDependentes.add(label_8);

		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setForeground(new Color(153, 153, 153));
		textField_6.setBorder(null);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(236, 188, 115, 18);
		tabDependentes.add(textField_6);

		separator_7 = new JSeparator();
		separator_7.setForeground(new Color(204, 204, 204));
		separator_7.setBackground(new Color(204, 204, 204));
		separator_7.setBounds(193, 216, 162, 10);
		tabDependentes.add(separator_7);

		label_9 = new JLabel();
		label_9.setText("UF:");
		label_9.setForeground(new Color(153, 153, 153));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(379, 189, 17, 16);
		tabDependentes.add(label_9);

		textField_7 = new JTextField();
		textField_7.setToolTipText("");
		textField_7.setForeground(new Color(153, 153, 153));
		textField_7.setBorder(null);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(399, 188, 81, 18);
		tabDependentes.add(textField_7);

		separator_8 = new JSeparator();
		separator_8.setForeground(new Color(204, 204, 204));
		separator_8.setBackground(new Color(204, 204, 204));
		separator_8.setBounds(379, 216, 101, 10);
		tabDependentes.add(separator_8);

		lblRua_1 = new JLabel();
		lblRua_1.setText("Rua:");
		lblRua_1.setForeground(new Color(153, 153, 153));
		lblRua_1.setBackground(Color.WHITE);
		lblRua_1.setBounds(193, 147, 26, 16);
		tabDependentes.add(lblRua_1);

		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setForeground(new Color(153, 153, 153));
		textField_8.setBorder(null);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(348, 192, 38, 18);
		tabDependentes.add(textField_8);

		separator_9 = new JSeparator();
		separator_9.setForeground(new Color(204, 204, 204));
		separator_9.setBackground(new Color(204, 204, 204));
		separator_9.setBounds(193, 170, 287, 10);
		tabDependentes.add(separator_9);

		lblParentesco = new JLabel();
		lblParentesco.setText("Parentesco:");
		lblParentesco.setForeground(new Color(153, 153, 153));
		lblParentesco.setBackground(Color.WHITE);
		lblParentesco.setBounds(498, 189, 61, 16);
		tabDependentes.add(lblParentesco);

		textField_9 = new JTextField();
		textField_9.setToolTipText("");
		textField_9.setForeground(new Color(153, 153, 153));
		textField_9.setBorder(null);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(563, 188, 154, 18);
		tabDependentes.add(textField_9);

		separator_10 = new JSeparator();
		separator_10.setForeground(new Color(204, 204, 204));
		separator_10.setBackground(new Color(204, 204, 204));
		separator_10.setBounds(498, 216, 219, 10);
		tabDependentes.add(separator_10);

		textField_10 = new JTextField();
		textField_10.setToolTipText("");
		textField_10.setForeground(new Color(153, 153, 153));
		textField_10.setBorder(null);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(221, 146, 259, 18);
		tabDependentes.add(textField_10);

		button = new JButton();
		button.setText("Salvar");
		button.setForeground(new Color(153, 153, 153));
		button.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		button.setBackground(Color.WHITE);
		button.setBounds(637, 272, 80, 39);
		tabDependentes.add(button);

		separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.WHITE);
		separator_12.setBackground(new Color(204, 204, 204));
		separator_12.setBounds(40, 330, 20, 130);
		tabDependentes.add(separator_12);

		label_13 = new JLabel();
		label_13.setText("Confirmação");
		label_13.setBounds(527, 283, 73, 16);
		tabDependentes.add(label_13);

		label_14 = new JLabel();
		label_14.setText("Navegação:");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Dialog", Font.BOLD, 14));
		label_14.setBounds(50, 330, 100, 23);
		tabDependentes.add(label_14);

		button_1 = new JButton("Início");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.WHITE);
		button_1.setBorder(null);
		button_1.setBackground(new Color(0, 168, 89));
		button_1.setBounds(50, 353, 57, 23);
		tabDependentes.add(button_1);

		button_2 = new JButton("Cadastro de Departamentos");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.WHITE);
		button_2.setBorder(null);
		button_2.setBackground(new Color(0, 168, 89));
		button_2.setBounds(50, 375, 162, 23);
		tabDependentes.add(button_2);

		button_3 = new JButton("Cadastro de Funcionários");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.WHITE);
		button_3.setBorder(null);
		button_3.setBackground(new Color(0, 168, 89));
		button_3.setBounds(50, 397, 162, 23);
		tabDependentes.add(button_3);

		button_4 = new JButton("Cadastro de Projetos");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.WHITE);
		button_4.setBorder(null);
		button_4.setBackground(new Color(0, 168, 89));
		button_4.setBounds(50, 418, 162, 23);
		tabDependentes.add(button_4);

		button_5 = new JButton("Cadastro de Dependentes");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.WHITE);
		button_5.setBorder(null);
		button_5.setBackground(new Color(0, 168, 89));
		button_5.setBounds(50, 437, 162, 23);
		tabDependentes.add(button_5);

		label_15 = new JLabel();
		label_15.setIcon(new ImageIcon(Cadastro.class.getResource("/imgs/telaverde.png")));
		label_15.setForeground(new Color(0, 204, 0));
		label_15.setBackground(new Color(0, 204, 0));
		label_15.setBounds(23, 317, 694, 150);
		tabDependentes.add(label_15);

		comboBox = new JComboBox();
		comboBox.setBounds(617, 72, 102, 20);
		tabDependentes.add(comboBox);

		tabDepartamentos = new JPanel();
		jTabbedPane1.addTab("Departamentos", null, tabDepartamentos, null);
		tabDepartamentos.setLayout(null);

		tabDepartamentos_1 = new JPanel();
		tabDepartamentos_1.setBounds(0, 0, 795, 478);
		tabDepartamentos_1.setLayout(null);
		tabDepartamentos_1.setBackground(Color.WHITE);
		tabDepartamentos.add(tabDepartamentos_1);

		lblCadastroDeDepartamentos = new JLabel();
		lblCadastroDeDepartamentos.setText("Cadastro de Departamentos\r\n");
		lblCadastroDeDepartamentos.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCadastroDeDepartamentos.setBackground(new Color(153, 153, 153));
		lblCadastroDeDepartamentos.setBounds(23, 15, 301, 35);
		tabDepartamentos_1.add(lblCadastroDeDepartamentos);

		separator_11 = new JSeparator();
		separator_11.setForeground(new Color(204, 204, 204));
		separator_11.setBackground(new Color(204, 204, 204));
		separator_11.setBounds(23, 56, 694, 10);
		tabDepartamentos_1.add(separator_11);

		label_3 = new JLabel();
		label_3.setText("Nome:");
		label_3.setForeground(new Color(153, 153, 153));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(23, 73, 36, 16);
		tabDepartamentos_1.add(label_3);

		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setForeground(new Color(153, 153, 153));
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(61, 72, 247, 18);
		tabDepartamentos_1.add(textField_2);

		separator_13 = new JSeparator();
		separator_13.setForeground(new Color(204, 204, 204));
		separator_13.setBackground(new Color(204, 204, 204));
		separator_13.setBounds(23, 96, 285, 10);
		tabDepartamentos_1.add(separator_13);

		lblCdigo = new JLabel();
		lblCdigo.setText("Código:");
		lblCdigo.setForeground(new Color(153, 153, 153));
		lblCdigo.setBackground(Color.WHITE);
		lblCdigo.setBounds(326, 73, 42, 16);
		tabDepartamentos_1.add(lblCdigo);

		textField_11 = new JTextField();
		textField_11.setToolTipText("");
		textField_11.setForeground(new Color(153, 153, 153));
		textField_11.setBorder(null);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(369, 72, 111, 18);
		tabDepartamentos_1.add(textField_11);

		separator_14 = new JSeparator();
		separator_14.setForeground(new Color(204, 204, 204));
		separator_14.setBackground(new Color(204, 204, 204));
		separator_14.setBounds(326, 96, 154, 10);
		tabDepartamentos_1.add(separator_14);

		lblLocalizao = new JLabel();
		lblLocalizao.setText("Localização:");
		lblLocalizao.setForeground(new Color(153, 153, 153));
		lblLocalizao.setBackground(Color.WHITE);
		lblLocalizao.setBounds(498, 73, 61, 16);
		tabDepartamentos_1.add(lblLocalizao);

		separator_15 = new JSeparator();
		separator_15.setForeground(new Color(204, 204, 204));
		separator_15.setBackground(new Color(204, 204, 204));
		separator_15.setBounds(498, 96, 219, 10);
		tabDepartamentos_1.add(separator_15);

		textField_13 = new JTextField();
		textField_13.setToolTipText("");
		textField_13.setForeground(new Color(153, 153, 153));
		textField_13.setBorder(null);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(399, 146, 154, 18);
		tabDepartamentos_1.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setToolTipText("");
		textField_14.setForeground(new Color(153, 153, 153));
		textField_14.setBorder(null);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(563, 72, 154, 18);
		tabDepartamentos_1.add(textField_14);

		button_6 = new JButton();
		button_6.setText("Salvar");
		button_6.setForeground(new Color(153, 153, 153));
		button_6.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(637, 272, 80, 39);
		tabDepartamentos_1.add(button_6);

		separator_23 = new JSeparator();
		separator_23.setOrientation(SwingConstants.VERTICAL);
		separator_23.setForeground(Color.WHITE);
		separator_23.setBackground(new Color(204, 204, 204));
		separator_23.setBounds(40, 330, 20, 130);
		tabDepartamentos_1.add(separator_23);

		label_24 = new JLabel();
		label_24.setText("Confirmação");
		label_24.setBounds(527, 283, 73, 16);
		tabDepartamentos_1.add(label_24);

		label_25 = new JLabel();
		label_25.setText("Navegação:");
		label_25.setForeground(Color.WHITE);
		label_25.setFont(new Font("Dialog", Font.BOLD, 14));
		label_25.setBounds(50, 330, 100, 23);
		tabDepartamentos_1.add(label_25);

		button_7 = new JButton("Início");
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setForeground(Color.WHITE);
		button_7.setBorder(null);
		button_7.setBackground(new Color(0, 168, 89));
		button_7.setBounds(50, 353, 57, 23);
		tabDepartamentos_1.add(button_7);

		button_8 = new JButton("Cadastro de Departamentos");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setForeground(Color.WHITE);
		button_8.setBorder(null);
		button_8.setBackground(new Color(0, 168, 89));
		button_8.setBounds(50, 375, 162, 23);
		tabDepartamentos_1.add(button_8);

		button_9 = new JButton("Cadastro de Funcionários");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setForeground(Color.WHITE);
		button_9.setBorder(null);
		button_9.setBackground(new Color(0, 168, 89));
		button_9.setBounds(50, 397, 162, 23);
		tabDepartamentos_1.add(button_9);

		button_10 = new JButton("Cadastro de Projetos");
		button_10.setHorizontalAlignment(SwingConstants.LEFT);
		button_10.setForeground(Color.WHITE);
		button_10.setBorder(null);
		button_10.setBackground(new Color(0, 168, 89));
		button_10.setBounds(50, 418, 162, 23);
		tabDepartamentos_1.add(button_10);

		button_11 = new JButton("Cadastro de Dependentes");
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setForeground(Color.WHITE);
		button_11.setBorder(null);
		button_11.setBackground(new Color(0, 168, 89));
		button_11.setBounds(50, 437, 162, 23);
		tabDepartamentos_1.add(button_11);

		label_26 = new JLabel();
		label_26.setIcon(new ImageIcon(Cadastro.class.getResource("/imgs/telaverde.png")));
		label_26.setForeground(new Color(0, 204, 0));
		label_26.setBackground(new Color(0, 204, 0));
		label_26.setBounds(23, 317, 694, 150);
		tabDepartamentos_1.add(label_26);

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