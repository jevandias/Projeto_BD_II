package com.projetobd.telas;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Cadastro extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public Cadastro() {
		initComponents();
	}

	private void initComponents() {
		setLocationRelativeTo(null);
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		tabListar = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		tabCadastrar = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		jTextField1 = new javax.swing.JTextField();
		jSeparator3 = new javax.swing.JSeparator();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jSeparator4 = new javax.swing.JSeparator();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jSeparator5 = new javax.swing.JSeparator();
		jLabel10 = new javax.swing.JLabel();
		jSeparator6 = new javax.swing.JSeparator();
		jLabel11 = new javax.swing.JLabel();
		jSeparator8 = new javax.swing.JSeparator();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jSeparator7 = new javax.swing.JSeparator();
		jTextField6 = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		jSeparator9 = new javax.swing.JSeparator();
		jTextField7 = new javax.swing.JTextField();
		jLabel14 = new javax.swing.JLabel();
		jSeparator10 = new javax.swing.JSeparator();
		jTextField8 = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();
		jSeparator11 = new javax.swing.JSeparator();
		jTextField9 = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jSeparator12 = new javax.swing.JSeparator();
		jLabel17 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jSeparator13 = new javax.swing.JSeparator();
		jButton2 = new javax.swing.JButton();
		jLabel18 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jSeparator14 = new javax.swing.JSeparator();
		jLabel22 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		
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
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel4 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();

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

		jLabel32.setBackground(new java.awt.Color(255, 255, 255));
		jLabel32.setForeground(new java.awt.Color(153, 153, 153));
		jLabel32.setText("Cadastro de Departamentos");

		jLabel33.setBackground(new java.awt.Color(255, 255, 255));
		jLabel33.setForeground(new java.awt.Color(153, 153, 153));
		jLabel33.setText("Cadastro de Funcionários");

		jLabel34.setBackground(new java.awt.Color(255, 255, 255));
		jLabel34.setForeground(new java.awt.Color(153, 153, 153));
		jLabel34.setText("Cadastro de Projetos");

		jLabel35.setBackground(new java.awt.Color(255, 255, 255));
		jLabel35.setForeground(new java.awt.Color(153, 153, 153));
		jLabel35.setText("Cadastro de Dependentes");

		javax.swing.GroupLayout gl_tabInicio = new javax.swing.GroupLayout(tabInicio);
		gl_tabInicio.setHorizontalGroup(
			gl_tabInicio.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tabInicio.createSequentialGroup()
					.addGap(36)
					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInicio.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_tabInicio.createSequentialGroup()
							.addGap(9)
							.addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jLabel33)
							.addGap(18)
							.addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel35))
						.addGroup(gl_tabInicio.createParallelGroup(Alignment.LEADING)
							.addComponent(jSeparator1, Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(Alignment.TRAILING, gl_tabInicio.createSequentialGroup()
								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jButton1)
					.addContainerGap())
				.addGroup(gl_tabInicio.createSequentialGroup()
					.addContainerGap(318, Short.MAX_VALUE)
					.addComponent(jLabel4)
					.addGap(213))
		);
		gl_tabInicio.setVerticalGroup(
			gl_tabInicio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInicio.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInicio.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInicio.createParallelGroup(Alignment.BASELINE)
							.addComponent(jButton1)
							.addComponent(jLabel1)
							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInicio.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel32)
							.addComponent(jLabel33)
							.addComponent(jLabel34)
							.addComponent(jLabel35)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jLabel4)
					.addContainerGap(329, Short.MAX_VALUE))
		);
		tabInicio.setLayout(gl_tabInicio);

		jTabbedPane1.addTab("Inicío", tabInicio);

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

		jLabel5.setBackground(new java.awt.Color(153, 153, 153));
		jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		jLabel5.setText("Cadastro de Funcionários");
		tabCadastrar.add(jLabel5);
		jLabel5.setBounds(23, 15, 301, 35);

		jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator2);
		jSeparator2.setBounds(23, 56, 694, 10);

		jTextField1.setBackground(new java.awt.Color(255, 255, 255));
		jTextField1.setForeground(new java.awt.Color(153, 153, 153));
		jTextField1.setToolTipText("");
		jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField1);
		jTextField1.setBounds(65, 72, 243, 18);

		jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator3);
		jSeparator3.setBounds(23, 96, 285, 10);

		jLabel6.setBackground(new java.awt.Color(255, 255, 255));
		jLabel6.setForeground(new java.awt.Color(153, 153, 153));
		jLabel6.setText("Nome:");
		tabCadastrar.add(jLabel6);
		jLabel6.setBounds(23, 73, 36, 16);

		jLabel7.setBackground(new java.awt.Color(255, 255, 255));
		jLabel7.setForeground(new java.awt.Color(153, 153, 153));
		jLabel7.setText("CPF:");
		tabCadastrar.add(jLabel7);
		jLabel7.setBounds(326, 73, 25, 16);

		jTextField2.setBackground(new java.awt.Color(255, 255, 255));
		jTextField2.setForeground(new java.awt.Color(153, 153, 153));
		jTextField2.setToolTipText("");
		jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField2);
		jTextField2.setBounds(357, 72, 123, 18);

		jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator4);
		jSeparator4.setBounds(326, 96, 154, 10);

		jLabel8.setBackground(new java.awt.Color(255, 255, 255));
		jLabel8.setForeground(new java.awt.Color(153, 153, 153));
		jLabel8.setText("Endereço:");
		tabCadastrar.add(jLabel8);
		jLabel8.setBounds(23, 118, 57, 16);

		jLabel9.setBackground(new java.awt.Color(255, 255, 255));
		jLabel9.setForeground(new java.awt.Color(153, 153, 153));
		jLabel9.setText("Rua:");
		tabCadastrar.add(jLabel9);
		jLabel9.setBounds(23, 147, 25, 16);

		jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator5);
		jSeparator5.setBounds(23, 170, 319, 10);

		jLabel10.setBackground(new java.awt.Color(255, 255, 255));
		jLabel10.setForeground(new java.awt.Color(153, 153, 153));
		jLabel10.setText("Bairro:");
		tabCadastrar.add(jLabel10);
		jLabel10.setBounds(363, 147, 38, 16);

		jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator6);
		jSeparator6.setBounds(363, 170, 204, 10);

		jLabel11.setBackground(new java.awt.Color(255, 255, 255));
		jLabel11.setForeground(new java.awt.Color(153, 153, 153));
		jLabel11.setText("Nº:");
		tabCadastrar.add(jLabel11);
		jLabel11.setBounds(598, 147, 15, 16);

		jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator8);
		jSeparator8.setBounds(598, 170, 118, 10);

		jTextField3.setBackground(new java.awt.Color(255, 255, 255));
		jTextField3.setForeground(new java.awt.Color(153, 153, 153));
		jTextField3.setToolTipText("");
		jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField3);
		jTextField3.setBounds(71, 192, 114, 18);

		jTextField4.setBackground(new java.awt.Color(255, 255, 255));
		jTextField4.setForeground(new java.awt.Color(153, 153, 153));
		jTextField4.setToolTipText("");
		jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField4);
		jTextField4.setBounds(413, 146, 154, 18);

		jTextField5.setBackground(new java.awt.Color(255, 255, 255));
		jTextField5.setForeground(new java.awt.Color(153, 153, 153));
		jTextField5.setToolTipText("");
		jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField5);
		jTextField5.setBounds(619, 146, 97, 18);

		jLabel12.setBackground(new java.awt.Color(255, 255, 255));
		jLabel12.setForeground(new java.awt.Color(153, 153, 153));
		jLabel12.setText("Cidade:");
		tabCadastrar.add(jLabel12);
		jLabel12.setBounds(23, 193, 42, 16);

		jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator7);
		jSeparator7.setBounds(23, 216, 162, 10);

		jTextField6.setBackground(new java.awt.Color(255, 255, 255));
		jTextField6.setForeground(new java.awt.Color(153, 153, 153));
		jTextField6.setToolTipText("");
		jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField6);
		jTextField6.setBounds(51, 146, 291, 18);

		jLabel13.setBackground(new java.awt.Color(255, 255, 255));
		jLabel13.setForeground(new java.awt.Color(153, 153, 153));
		jLabel13.setText("UF:");
		tabCadastrar.add(jLabel13);
		jLabel13.setBounds(211, 193, 17, 16);

		jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator9);
		jSeparator9.setBounds(211, 216, 79, 10);

		jTextField7.setBackground(new java.awt.Color(255, 255, 255));
		jTextField7.setForeground(new java.awt.Color(153, 153, 153));
		jTextField7.setToolTipText("");
		jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField7);
		jTextField7.setBounds(234, 192, 56, 18);

		jLabel14.setBackground(new java.awt.Color(255, 255, 255));
		jLabel14.setForeground(new java.awt.Color(153, 153, 153));
		jLabel14.setText("CEP:");
		tabCadastrar.add(jLabel14);
		jLabel14.setBounds(316, 193, 26, 16);

		jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator10.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator10);
		jSeparator10.setBounds(316, 216, 146, 10);

		jTextField8.setBackground(new java.awt.Color(255, 255, 255));
		jTextField8.setForeground(new java.awt.Color(153, 153, 153));
		jTextField8.setToolTipText("");
		jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField8);
		jTextField8.setBounds(538, 192, 178, 18);

		jLabel15.setBackground(new java.awt.Color(255, 255, 255));
		jLabel15.setForeground(new java.awt.Color(153, 153, 153));
		jLabel15.setText("Telefone:");
		tabCadastrar.add(jLabel15);
		jLabel15.setBounds(480, 193, 52, 16);

		jSeparator11.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator11.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator11);
		jSeparator11.setBounds(480, 216, 236, 10);

		jTextField9.setBackground(new java.awt.Color(255, 255, 255));
		jTextField9.setForeground(new java.awt.Color(153, 153, 153));
		jTextField9.setToolTipText("");
		jTextField9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField9);
		jTextField9.setBounds(348, 192, 114, 18);

		jLabel16.setBackground(new java.awt.Color(255, 255, 255));
		jLabel16.setForeground(new java.awt.Color(153, 153, 153));
		jLabel16.setText("Salário:");
		tabCadastrar.add(jLabel16);
		jLabel16.setBounds(498, 73, 43, 16);

		jTextField10.setBackground(new java.awt.Color(255, 255, 255));
		jTextField10.setForeground(new java.awt.Color(153, 153, 153));
		jTextField10.setToolTipText("");
		jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField10);
		jTextField10.setBounds(542, 72, 174, 18);

		jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator12.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator12);
		jSeparator12.setBounds(498, 96, 219, 10);

		jLabel17.setBackground(new java.awt.Color(255, 255, 255));
		jLabel17.setForeground(new java.awt.Color(255, 255, 255));
		jLabel17.setText("Cadastro de Dependentes");
		tabCadastrar.add(jLabel17);
		jLabel17.setBounds(50, 430, 170, 16);

		jTextField11.setBackground(new java.awt.Color(255, 255, 255));
		jTextField11.setForeground(new java.awt.Color(153, 153, 153));
		jTextField11.setToolTipText("");
		jTextField11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		tabCadastrar.add(jTextField11);
		jTextField11.setBounds(131, 232, 111, 18);

		jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
		jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
		tabCadastrar.add(jSeparator13);
		jSeparator13.setBounds(40, 330, 20, 130);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setForeground(new java.awt.Color(153, 153, 153));
		jButton2.setText("Salvar");
		jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
		tabCadastrar.add(jButton2);
		jButton2.setBounds(637, 272, 80, 39);

		jLabel18.setText("Confirmação");
		tabCadastrar.add(jLabel18);
		jLabel18.setBounds(527, 283, 73, 16);

		jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel20.setForeground(new java.awt.Color(255, 255, 255));
		jLabel20.setText("Navegação:");
		tabCadastrar.add(jLabel20);
		jLabel20.setBounds(50, 330, 100, 19);

		jSeparator14.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator14.setForeground(new java.awt.Color(204, 204, 204));
		tabCadastrar.add(jSeparator14);
		jSeparator14.setBounds(23, 256, 219, 10);

		jLabel22.setBackground(new java.awt.Color(255, 255, 255));
		jLabel22.setForeground(new java.awt.Color(255, 255, 255));
		jLabel22.setText("Inicío");
		tabCadastrar.add(jLabel22);
		jLabel22.setBounds(50, 350, 30, 16);

		jLabel21.setBackground(new java.awt.Color(255, 255, 255));
		jLabel21.setForeground(new java.awt.Color(153, 153, 153));
		jLabel21.setText("Senha de Acesso:");
		tabCadastrar.add(jLabel21);
		jLabel21.setBounds(23, 233, 102, 16);

		jLabel23.setBackground(new java.awt.Color(255, 255, 255));
		jLabel23.setForeground(new java.awt.Color(255, 255, 255));
		jLabel23.setText("Cadastro de Departamentos");
		tabCadastrar.add(jLabel23);
		jLabel23.setBounds(50, 370, 170, 16);

		jLabel24.setBackground(new java.awt.Color(255, 255, 255));
		jLabel24.setForeground(new java.awt.Color(255, 255, 255));
		jLabel24.setText("Cadastro de Funcionários");
		tabCadastrar.add(jLabel24);
		jLabel24.setBounds(50, 390, 170, 16);

		jLabel25.setBackground(new java.awt.Color(255, 255, 255));
		jLabel25.setForeground(new java.awt.Color(255, 255, 255));
		jLabel25.setText("Cadastro de Projetos");
		tabCadastrar.add(jLabel25);
		jLabel25.setBounds(50, 410, 170, 16);

		jLabel19.setBackground(new java.awt.Color(0, 204, 0));
		jLabel19.setForeground(new java.awt.Color(0, 204, 0));
		jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaverde.png"))); // NOI18N
		tabCadastrar.add(jLabel19);
		jLabel19.setBounds(23, 317, 694, 150);

		jTabbedPane1.addTab("Cadastrar", tabCadastrar);

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
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel tabListar;
	private javax.swing.JPanel tabCadastrar;
	private javax.swing.JPanel tabInicio;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator10;
	private javax.swing.JSeparator jSeparator11;
	private javax.swing.JSeparator jSeparator12;
	private javax.swing.JSeparator jSeparator13;
	private javax.swing.JSeparator jSeparator14;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JSeparator jSeparator6;
	private javax.swing.JSeparator jSeparator7;
	private javax.swing.JSeparator jSeparator8;
	private javax.swing.JSeparator jSeparator9;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
}
