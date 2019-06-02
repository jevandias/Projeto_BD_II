package com.projetobd.telas;

import java.awt.Dimension;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

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

import javax.swing.table.DefaultTableModel;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import com.projetobd.personalizados.JDocumentFormatedField;
import com.projetobd.personalizados.JNumberField;
import com.projetobd.personalizados.JNumberFormatField;
import com.projetobd.controler.ConsultaCep;
import com.projetobd.controler.GerarSenha;
import com.projetobd.controler.ValidaCNP;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton btnSair;
	private JLabel lblUsuarioLogado;
	private JLabel lblIconIF;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private JLabel jLabel29;
	private JLabel lblBemVindo;
	private JLabel jLabel30;
	private JLabel lblNomeSistema;
	private JPanel jPanel1;
	private JPanel tabInicio;
	private JSeparator jSeparatorBase;

	private JTabbedPane jTabbedPane1;

	private JButton btnCadastroDeDependentes;
	private JButton btnCadastroDeDepartamentos;
	private JButton btnCadastroDeFuncionarios;
	private JButton btnCadastroDeProjetos;

	private JLabel lblNewLabel;

	private JLabel lbllogout;

	private JLabel label;

	private JLabel jLabel4;

	private JSeparator jSeparator1;

	private JLabel jLabel3;

	private JLabel jLabel2;

	private JLabel jLabel1;

	private JPanel tabListar;

	private JLabel lblTituloTela;

	public Inicio() {
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
		lblTituloTela = new JLabel();
		

		setUndecorated(true);
		setMinimumSize(new Dimension(800, 530));
		setSize(new Dimension(800, 531));

		
		

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

		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(663, 16, 83, 14);
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setBounds(36, 17, 70, 96);
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setBounds(560, 11, 92, 24);
		jSeparator1 = new JSeparator();
		jSeparator1.setBounds(110, 119, 675, 10);
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setBounds(212, 135, 371, 14);

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

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ifpe.png")));

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
		jLabel3.setText("Bem vindo !");

		jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

		jLabel4.setText("Gerência Empresarial |  Departamentos e Funcionários");

		jTabbedPane1.addTab("Inicío", tabInicio);
		tabInicio.setLayout(null);
		tabInicio.add(jLabel2);
		tabInicio.add(jSeparator1);
		tabInicio.add(jLabel3);
		tabInicio.add(jLabel1);
		tabInicio.add(jLabel4);

		btnCadastroDeDependentes = new JButton("Cadastro de dependentes");
		btnCadastroDeDependentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastroDeDependentes.setBackground(Color.WHITE);
		btnCadastroDeDependentes.setBounds(615, 95, 170, 23);
		tabInicio.add(btnCadastroDeDependentes);
		btnCadastroDeDependentes.setBorder(null);

		btnCadastroDeDepartamentos = new JButton("Cadastro de departamentos");
		btnCadastroDeDepartamentos.setBackground(Color.WHITE);
		btnCadastroDeDepartamentos.setBounds(116, 95, 170, 23);
		tabInicio.add(btnCadastroDeDepartamentos);
		btnCadastroDeDepartamentos.setBorder(null);

		btnCadastroDeFuncionarios = new JButton("Cadastro de funcionários");
		btnCadastroDeFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastroDeFuncionarios.setBackground(Color.WHITE);
		btnCadastroDeFuncionarios.setBounds(293, 95, 166, 23);
		tabInicio.add(btnCadastroDeFuncionarios);
		btnCadastroDeFuncionarios.setBorder(null);

		btnCadastroDeProjetos = new JButton("Cadastro de projetos");
		btnCadastroDeProjetos.setBackground(Color.WHITE);
		btnCadastroDeProjetos.setBounds(469, 95, 140, 23);
		tabInicio.add(btnCadastroDeProjetos);
		btnCadastroDeProjetos.setBorder(null);

		JLabel lbldepartamentos = new JLabel("");
		lbldepartamentos.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.png")));
		lbldepartamentos.setBounds(181, 46, 40, 45);
		tabInicio.add(lbldepartamentos);

		JLabel lblfuncionarios = new JLabel("");
		lblfuncionarios.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.png")));
		lblfuncionarios.setBounds(356, 46, 40, 45);
		tabInicio.add(lblfuncionarios);

		JLabel lblprojetos = new JLabel("");
		lblprojetos.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.png")));
		lblprojetos.setBounds(519, 46, 40, 45);
		tabInicio.add(lblprojetos);

		label = new JLabel("");
		label.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.png")));
		label.setBounds(675, 43, 51, 45);
		tabInicio.add(label);

		lbllogout = new JLabel("New label");
		lbllogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout.png")));
		lbllogout.setBounds(756, 13, 18, 18);
		tabInicio.add(lbllogout);

		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/backinicio.png")));
		lblNewLabel.setBounds(0, 160, 800, 323);
		tabInicio.add(lblNewLabel);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnSair.setBackground(new java.awt.Color(255, 255, 255));
		btnSair.setText("Sair");
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// jButton1ActionPerformed(evt);
			}
		});

		lblIconIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ifpe.png")));

		lblBemVindo.setFont(new java.awt.Font("Dialog", 1, 14));
		lblBemVindo.setText("Bem vindo !");
	}
}