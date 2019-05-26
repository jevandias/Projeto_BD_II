package com.projetobd.telas;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Dimension;

public class Inicio extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnFechar;
	private JButton btnEntrar;
	private JLabel jLabel1;
	private JLabel lblLogo;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JPanel jPanel1;
	private JPasswordField txtPwd;
	private JSeparator jSeparator1;
	private JSeparator jSeparator2;
	private JTextField txtUsuario;

	public Inicio() {

		initComponents();
	}

	private void initComponents() {
		setUndecorated(true);
		jPanel1 = new JPanel();
		lblLogo = new JLabel();
		txtUsuario = new JTextField();
		jSeparator1 = new JSeparator();
		jLabel4 = new JLabel();
		jSeparator2 = new JSeparator();
		jLabel5 = new JLabel();
		btnEntrar = new JButton();
		txtPwd = new JPasswordField();
		jLabel3 = new JLabel();
		jLabel1 = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setBackground(new java.awt.Color(255, 255, 255));
		setMinimumSize(new Dimension(720, 500));
		setSize(new Dimension(702, 530));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ifpe.png")));
		lblLogo.setFocusable(true);

		txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
		txtUsuario.setText("Usuário");
		txtUsuario.setBorder(null);
		txtUsuario.setForeground(new Color(204, 204, 204));

		jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/usuario.png")));
		jLabel4.setPreferredSize(new java.awt.Dimension(16, 18));

		jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
		jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/senha.png")));
		jLabel5.setPreferredSize(new java.awt.Dimension(16, 18));

		txtPwd.setBackground(new java.awt.Color(255, 255, 255));
		txtPwd.setForeground(new java.awt.Color(204, 204, 204));
		txtPwd.setText("jPasswordField1");
		txtPwd.setBorder(null);

		limparTxtField();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(73, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jSeparator2)
								.addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
						.addGap(88, 88, 88))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(138, 138, 138).addComponent(lblLogo,
								javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(142, 142, 142).addComponent(btnEntrar)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(41, 41, 41)
						.addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(12, 12, 12)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29).addComponent(btnEntrar).addContainerGap(43, Short.MAX_VALUE)));


		btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/entrar.png")));
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/entrar.png")));
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/entrar2.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		getContentPane().add(jPanel1);
		jPanel1.setBounds(180, 90, 350, 310);

		btnFechar = new JButton("X");
		btnFechar.setBackground(Color.RED);
		btnFechar.setForeground(Color.WHITE);
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFechar.setBounds(679, 0, 41, 23);
		getContentPane().add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sombra.png"))); // NOI18N
		getContentPane().add(jLabel3);
		jLabel3.setBounds(160, 70, 400, 350);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back.png"))); // NOI18N
		getContentPane().add(jLabel1);
		jLabel1.setBounds(0, 0, 720, 500);

		pack();
	}

	private void limparTxtField() {
		txtUsuario.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtUsuario.getText().equals("")) {
					txtUsuario.setText("Usuário");
					txtUsuario.setForeground(new Color(204, 204, 204));
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtUsuario.getText().equals("") || txtUsuario.getText().equals("Usuário")) {
					txtUsuario.setText("");
					txtUsuario.setForeground(Color.black);
				}
			}
		});

		txtPwd.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				String senha = new String(txtPwd.getPassword());
				if (senha.equals("")) {
					txtPwd.setText("jPasswordField1");
					txtPwd.setForeground(new Color(204, 204, 204));
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				String senha = new String(txtPwd.getPassword());
				if (senha.equals("") || senha.equals("jPasswordField1")) {
					txtPwd.setText("");
					txtPwd.setForeground(Color.black);
				}
			}
		});
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Inicio().setVisible(true);
			}
		});
	}
}
