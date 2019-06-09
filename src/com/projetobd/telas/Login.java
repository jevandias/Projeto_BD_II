package com.projetobd.telas;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.Dimension;

import com.projetobd.controler.FuncionarioController;
import com.projetobd.controler.FuncionarioLogado;
import com.projetobd.entidades.Funcionario;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnFechar;
	private JLabel jLabel1;
	private JLabel lblLogo;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JPanel jPanel1;
	private JPasswordField txtPwd;
	private JSeparator jSeparatorUsuario;
	private JSeparator jSeparatorSenha;
	private JTextField txtUsuario;
	private JButton btnEntrar;
	private JLabel lblErro;

	public Login() {

		initComponents();
	}

	private void initComponents() {
		setUndecorated(true);
		jPanel1 = new JPanel();
		jPanel1.setBounds(180, 90, 350, 310);
		lblLogo = new JLabel();
		lblLogo.setBounds(138, 41, 69, 84);
		txtUsuario = new JTextField();
		txtUsuario.setBounds(98, 143, 164, 14);
		jSeparatorUsuario = new JSeparator();
		jSeparatorUsuario.setBounds(98, 157, 164, 10);
		jLabel4 = new JLabel();
		jLabel4.setBounds(78, 141, 16, 18);
		jSeparatorSenha = new JSeparator();
		jSeparatorSenha.setBounds(98, 215, 164, 10);
		jLabel5 = new JLabel();
		jLabel5.setBounds(75, 199, 19, 18);
		txtPwd = new JPasswordField();
		txtPwd.setBounds(98, 201, 164, 14);
		jLabel3 = new JLabel();
		jLabel3.setBounds(160, 70, 400, 350);
		jLabel1 = new JLabel();
		jLabel1.setBounds(0, 0, 720, 500);
		btnFechar = new JButton("X");
		lblErro = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));
		setMinimumSize(new Dimension(720, 500));
		setSize(new Dimension(702, 530));
		setLocationRelativeTo(null);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ifpe.png")));
		lblLogo.setFocusable(false);

		txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
		txtUsuario.setText("Usuário");
		txtUsuario.setBorder(null);
		txtUsuario.setForeground(new Color(204, 204, 204));

		jSeparatorUsuario.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorUsuario.setForeground(new java.awt.Color(204, 204, 204));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/usuario.png")));
		jLabel4.setPreferredSize(new java.awt.Dimension(16, 18));

		jSeparatorSenha.setBackground(new java.awt.Color(204, 204, 204));
		jSeparatorSenha.setForeground(new java.awt.Color(204, 204, 204));

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/senha.png")));
		jLabel5.setPreferredSize(new java.awt.Dimension(16, 18));

		txtPwd.setBackground(new java.awt.Color(255, 255, 255));
		txtPwd.setForeground(new java.awt.Color(204, 204, 204));
		txtPwd.setText("jPasswordField1");
		txtPwd.setBorder(null);

		limparTxtField();
		getContentPane().setLayout(null);

		btnEntrar = new JButton();
		btnEntrar.setFocusable(false);
		btnEntrar.setBounds(138, 249, 69, 26);
		btnEntrar.setIcon(new ImageIcon(Login.class.getResource("/imgs/entrar.png")));
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				btnEntrar.setIcon(new ImageIcon(Login.class.getResource("/imgs/entrar.png")));
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				btnEntrar.setIcon(new ImageIcon(Login.class.getResource("/imgs/entrar2.png")));

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

		btnEntrar.addActionListener(this);

		getContentPane().add(jPanel1);
		jPanel1.setLayout(null);
		jPanel1.add(jLabel4);
		jPanel1.add(jLabel5);
		jPanel1.add(jSeparatorSenha);
		jPanel1.add(txtUsuario);
		jPanel1.add(jSeparatorUsuario);
		jPanel1.add(txtPwd);
		jPanel1.add(lblLogo);
		jPanel1.add(btnEntrar);

		btnFechar.setBounds(672, 0, 48, 23);
		btnFechar.setBackground(Color.RED);
		btnFechar.setForeground(Color.WHITE);
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sombra.png"))); // NOI18N
		getContentPane().add(jLabel3);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back.png"))); // NOI18N
		getContentPane().add(jLabel1);

		pack();
		btnEntrar.setBorder(null);

		lblErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblErro.setBounds(10, 285, 330, 14);
		lblErro.setForeground(Color.RED);
		jPanel1.add(lblErro);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnFechar) {
			dispose();
		} else if (e.getSource() == btnEntrar) {
			validarSessao();
		}
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
					jSeparatorUsuario.setBackground(new Color(204, 204, 204));

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
					jSeparatorSenha.setBackground(new Color(204, 204, 204));
				}
			}
		});
	}

	private void validarSessao() {
		String usuario = txtUsuario.getText();
		String senha = new String(txtPwd.getPassword());
		Funcionario funcionario;

		if (usuario.equals("Usuário") || usuario.equals("")) {
			jSeparatorUsuario.setBackground(Color.RED);
		} else if (senha.equals("jPasswordField1") || senha.equals("")) {
			jSeparatorSenha.setBackground(Color.RED);
		} else {
			try {
				funcionario = new FuncionarioController().validarSessao(usuario, senha);

				if (funcionario != null) {
					FuncionarioLogado.nome = funcionario.getNome();
				} else {
					lblErro.setText("");
					lblErro.setText("Usuario e/ou senha invalidos");
				}
			} catch (ClassNotFoundException e) {
				lblErro.setText("");
				lblErro.setText("Erro interno do sistema");
			} catch (SQLException e) {
				e.printStackTrace();
				lblErro.setText("");
				lblErro.setText("Erro de banco de dados");
			}
		}
	}
}