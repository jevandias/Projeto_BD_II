package com.projetobd.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.projetobd.controler.DepartamentoController;
import com.projetobd.entidades.Departamentos;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class CadastroDepartamentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCodigo;
	private JTextField txtLocalizacao;
	private JButton btnInicio;
	private JButton btnCadastroDepartamentos;
	private JButton btnCadastroFuncionario;
	private JButton btnCadastroProjetos;
	private JButton btnCadastroDependentes;
	private JPanel panel;
	private JLabel lblTitulo;
	private JSeparator separatorTitulo;
	private JLabel lblNome;
	private JSeparator separatorNome;
	private JLabel lblCodigo;
	private JSeparator separatorCodigo;
	private JLabel lblLocalizacao;
	private JSeparator separatorLocalizacao;
	private JButton btnSalvar;
	private JLabel lblNavegacao;
	private JLabel lblBack;
	private JButton btnLogout;
	private JLabel lblConfirmacao;
	private int contCpfInvalido = 0;

	public CadastroDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 795, 478);
		contentPane.add(panel);

		lblTitulo = new JLabel();
		lblTitulo.setText("Cadastro de Departamentos");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setBackground(new Color(153, 153, 153));
		lblTitulo.setBounds(10, 11, 301, 35);
		panel.add(lblTitulo);

		separatorTitulo = new JSeparator();
		separatorTitulo.setForeground(new Color(204, 204, 204));
		separatorTitulo.setBackground(new Color(204, 204, 204));
		separatorTitulo.setBounds(10, 52, 694, 10);
		panel.add(separatorTitulo);

		lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setForeground(new Color(153, 153, 153));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(10, 69, 36, 16);
		panel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setForeground(new Color(153, 153, 153));
		txtNome.setBorder(null);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(55, 68, 234, 18);
		panel.add(txtNome);

		separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(10, 92, 285, 10);
		panel.add(separatorNome);

		lblCodigo = new JLabel();
		lblCodigo.setText("Código:");
		lblCodigo.setForeground(new Color(153, 153, 153));
		lblCodigo.setBackground(Color.WHITE);
		lblCodigo.setBounds(313, 69, 42, 16);
		panel.add(lblCodigo);

		try {
			int idDepartamento = new DepartamentoController().recuperarId();
			txtCodigo = new JTextField();
			txtCodigo.setForeground(new Color(153, 153, 153));
			txtCodigo.setBorder(null);
			txtCodigo.setText(String.valueOf(idDepartamento));
			txtCodigo.setBackground(Color.WHITE);
			txtCodigo.setBounds(354, 68, 111, 18);
			txtCodigo.setEditable(false);
			panel.add(txtCodigo);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		separatorCodigo = new JSeparator();
		separatorCodigo.setForeground(new Color(204, 204, 204));
		separatorCodigo.setBackground(new Color(204, 204, 204));
		separatorCodigo.setBounds(313, 92, 154, 10);
		panel.add(separatorCodigo);

		lblLocalizacao = new JLabel();
		lblLocalizacao.setText("Localização:");
		lblLocalizacao.setForeground(new Color(153, 153, 153));
		lblLocalizacao.setBackground(Color.WHITE);
		lblLocalizacao.setBounds(485, 69, 80, 16);
		panel.add(lblLocalizacao);

		separatorLocalizacao = new JSeparator();
		separatorLocalizacao.setForeground(new Color(204, 204, 204));
		separatorLocalizacao.setBackground(new Color(204, 204, 204));
		separatorLocalizacao.setBounds(485, 92, 219, 10);
		panel.add(separatorLocalizacao);

		txtLocalizacao = new JTextField();
		txtLocalizacao.setToolTipText("");
		txtLocalizacao.setForeground(new Color(153, 153, 153));
		txtLocalizacao.setBorder(null);
		txtLocalizacao.setBackground(Color.WHITE);
		txtLocalizacao.setBounds(563, 68, 141, 18);
		panel.add(txtLocalizacao);

		btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(10, 287, 80, 39);
		panel.add(btnSalvar);

		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cadastrarDep();
			}
		});

		lblConfirmacao = new JLabel();
		lblConfirmacao.setForeground(Color.GREEN);
		lblConfirmacao.setText("Cadastrado com sucesso");
		lblConfirmacao.setBounds(99, 298, 154, 16);
		panel.add(lblConfirmacao);
		lblConfirmacao.setVisible(false);

		lblNavegacao = new JLabel();
		lblNavegacao.setText("Navegação:");
		lblNavegacao.setForeground(Color.WHITE);
		lblNavegacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNavegacao.setBounds(50, 330, 100, 23);
		panel.add(lblNavegacao);

		btnInicio = new JButton("Início");
		btnInicio.setHorizontalAlignment(SwingConstants.LEFT);
		btnInicio.setForeground(Color.BLACK);
		btnInicio.setBorder(null);
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(15, 349, 57, 23);
		panel.add(btnInicio);
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
		panel.add(btnCadastroDepartamentos);
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
		panel.add(btnCadastroFuncionario);
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
		panel.add(btnCadastroProjetos);
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
		panel.add(btnCadastroDependentes);
		btnCadastroDependentes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroDependentes().setVisible(true);
				dispose();

			}
		});

		lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(CadastroDepartamentos.class.getResource("/imgs/backdepartamento.png")));
		lblBack.setBounds(0, 202, 795, 276);
		panel.add(lblBack);

		btnLogout = new JButton("");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout2.0.sobre.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnLogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout2.0.png")));
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout2.0.png")));
		btnLogout.setBounds(767, 14, 23, 18);
		panel.add(btnLogout);
		btnLogout.setBorder(null);
		btnLogout.setFocusPainted(isVisible());
		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblTitulo.getText().equals("Atualizar Departamento")) {
					dispose();
				} else {
					dispose();
					new Inicio().setVisible(true);
				}
			}
		});

	}

	private void cadastrarDep() {
		Departamentos departamento = new Departamentos();
		departamento.setCodigo(Integer.parseInt(txtCodigo.getText()));
		departamento.setLocalizacao(txtLocalizacao.getText());
		departamento.setNome(txtNome.getText());

		try {

			if (lblTitulo.getText().equals("Atualizar Departamento")) {
				new DepartamentoController().alterarDepartamentos(departamento);
			} else {
				new DepartamentoController().cadastrarDepartamento(departamento);
			}

			lblConfirmacao.setVisible(true);

			Timer timer = new Timer();
			TimerTask task = new TimerTask() {

				public void run() {
					contCpfInvalido--;
					if (contCpfInvalido == -1) {
						timer.cancel();
						lblConfirmacao.setVisible(false);
						if (lblTitulo.getText().equals("Atualizar Departamento"))
							dispose();
					}
				}
			};
			timer.scheduleAtFixedRate(task, 1000, 1000);

			limparTelas();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro interno do sistema");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + e.getMessage());
		}
	}

	private void limparTelas() {
		txtCodigo.setText("");
		txtLocalizacao.setText("");
		txtNome.setText("");
	}

	public void alterarDepartamento(int codigo) {
		try {
			lblTitulo.setText("Atualizar Departamento");
			Departamentos departamento = new DepartamentoController().retornaDepartamento(codigo);
			txtCodigo.setText(String.valueOf(departamento.getCodigo()));
			txtLocalizacao.setText(departamento.getLocalizacao());
			txtNome.setText(departamento.getNome());
		} catch (SQLException e) {

		} catch (ClassNotFoundException e) {

		}
	}
}