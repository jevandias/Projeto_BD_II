package com.projetobd.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.projetobd.controler.DepartamentoController;
import com.projetobd.controler.FuncionarioController;
import com.projetobd.controler.ProjetosController;
import com.projetobd.entidades.Departamentos;
import com.projetobd.entidades.Funcionario;
import com.projetobd.entidades.Projetos;
import com.projetobd.personalizados.JNumberFormatField;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class CadastroProjetos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pane4;
	private JTextField txtNome;
	private JTextField txtTipo;
	private JTextField txtNumero;
	private JTextField txtHoras;
	private JButton btnInici;
	private JButton btnCadastroDepartamentos;
	private JButton btnCadastroFuncionario;
	private JButton btnCadastroProjetos;
	private JButton btnCadastroDependentes;
	private JButton btnLogout;
	private JComboBox<String> cbxDepartamento;
	private JSeparator separatorDepartamento;
	private JButton btnSalvar;
	private JLabel lblConfirmacao;
	private JLabel lblNavegacao;
	private JLabel lblFuncionario;
	private JSeparator separatorFuncionario;
	private JComboBox<String> cbxFuncionario;
	private JLabel lblBack;
	private JLabel lblDepartamento;
	private JSeparator separatorTipo;
	private JLabel lblTipo;
	private JSeparator separatorHoras;
	private JLabel lblHoras;
	private JSeparator separatorVerba;
	private JNumberFormatField txtVerba;
	private JSeparator separatorNome;
	private JLabel lblNumero;
	private JSeparator separatorNumero;
	private JLabel lblVerba;
	private JLabel lblCadastroDeProjetos;
	private JSeparator separatorProjetos;
	private JLabel lblNome;
	private ProjetosController projetosController;
	private int numProjeto;
	private DefaultTableModel model;
	private JButton btnAdicionar;
	private JTable tblFuncionario;
	private JScrollPane scrollPane;

	public CadastroProjetos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setLocationRelativeTo(null);
		setUndecorated(true);
		pane4 = new JPanel();
		pane4.setBackground(Color.WHITE);
		pane4.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane4);
		pane4.setLayout(null);

		lblCadastroDeProjetos = new JLabel();
		lblCadastroDeProjetos.setText("Cadastro de Projetos");
		lblCadastroDeProjetos.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCadastroDeProjetos.setBackground(new Color(153, 153, 153));
		lblCadastroDeProjetos.setBounds(10, 11, 301, 35);
		pane4.add(lblCadastroDeProjetos);

		separatorProjetos = new JSeparator();
		separatorProjetos.setForeground(new Color(204, 204, 204));
		separatorProjetos.setBackground(new Color(204, 204, 204));
		separatorProjetos.setBounds(10, 52, 694, 10);
		pane4.add(separatorProjetos);

		lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setForeground(new Color(153, 153, 153));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(10, 69, 36, 16);
		pane4.add(lblNome);

		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setForeground(new Color(153, 153, 153));
		txtNome.setBorder(null);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(52, 68, 243, 18);
		pane4.add(txtNome);

		separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(10, 92, 285, 10);
		pane4.add(separatorNome);

		lblNumero = new JLabel();
		lblNumero.setText("Número:");
		lblNumero.setForeground(new Color(153, 153, 153));
		lblNumero.setBackground(Color.WHITE);
		lblNumero.setBounds(313, 69, 50, 16);
		pane4.add(lblNumero);

		try {
			projetosController = new ProjetosController();
			numProjeto = projetosController.recuperarNumero();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		txtNumero = new JTextField();
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setBorder(null);
		txtNumero.setBounds(362, 67, 105, 20);
		txtNumero.setEditable(false);
		txtNumero.setText(String.valueOf(numProjeto));
		pane4.add(txtNumero);
		txtNumero.setColumns(10);

		separatorNumero = new JSeparator();
		separatorNumero.setForeground(new Color(204, 204, 204));
		separatorNumero.setBackground(new Color(204, 204, 204));
		separatorNumero.setBounds(313, 92, 154, 10);
		pane4.add(separatorNumero);

		lblVerba = new JLabel();
		lblVerba.setText("Verba:");
		lblVerba.setForeground(new Color(153, 153, 153));
		lblVerba.setBackground(Color.WHITE);
		lblVerba.setBounds(485, 69, 43, 16);
		pane4.add(lblVerba);

		txtVerba = new JNumberFormatField(new DecimalFormat("0.00"));
		txtVerba.setToolTipText("");
		txtVerba.setForeground(new Color(153, 153, 153));
		txtVerba.setBorder(null);
		txtVerba.setBackground(Color.WHITE);
		txtVerba.setBounds(529, 68, 174, 18);
		pane4.add(txtVerba);

		separatorVerba = new JSeparator();
		separatorVerba.setForeground(new Color(204, 204, 204));
		separatorVerba.setBackground(new Color(204, 204, 204));
		separatorVerba.setBounds(485, 92, 219, 10);
		pane4.add(separatorVerba);

		lblHoras = new JLabel();
		lblHoras.setText("Horas:");
		lblHoras.setForeground(new Color(153, 153, 153));
		lblHoras.setBackground(Color.WHITE);
		lblHoras.setBounds(10, 113, 50, 16);
		pane4.add(lblHoras);

		separatorHoras = new JSeparator();
		separatorHoras.setForeground(new Color(204, 204, 204));
		separatorHoras.setBackground(new Color(204, 204, 204));
		separatorHoras.setBounds(10, 136, 146, 10);
		pane4.add(separatorHoras);

		txtHoras = new JTextField();
		txtHoras.setBorder(null);
		txtHoras.setBounds(51, 113, 105, 20);
		pane4.add(txtHoras);
		txtHoras.setColumns(10);

		lblTipo = new JLabel();
		lblTipo.setText("Tipo:");
		lblTipo.setForeground(new Color(153, 153, 153));
		lblTipo.setBackground(Color.WHITE);
		lblTipo.setBounds(184, 113, 36, 16);
		pane4.add(lblTipo);

		txtTipo = new JTextField();
		txtTipo.setToolTipText("");
		txtTipo.setForeground(new Color(153, 153, 153));
		txtTipo.setBorder(null);
		txtTipo.setBackground(Color.WHITE);
		txtTipo.setBounds(218, 114, 145, 18);
		pane4.add(txtTipo);

		separatorTipo = new JSeparator();
		separatorTipo.setForeground(new Color(204, 204, 204));
		separatorTipo.setBackground(new Color(204, 204, 204));
		separatorTipo.setBounds(184, 136, 179, 10);
		pane4.add(separatorTipo);

		lblDepartamento = new JLabel();
		lblDepartamento.setText("Departamento:");
		lblDepartamento.setForeground(new Color(153, 153, 153));
		lblDepartamento.setBackground(Color.WHITE);
		lblDepartamento.setBounds(394, 113, 92, 16);
		pane4.add(lblDepartamento);

		separatorDepartamento = new JSeparator();
		separatorDepartamento.setForeground(new Color(204, 204, 204));
		separatorDepartamento.setBackground(new Color(204, 204, 204));
		separatorDepartamento.setBounds(394, 136, 81, 10);
		pane4.add(separatorDepartamento);

		cbxDepartamento = new JComboBox<String>();
		cbxDepartamento.setBounds(495, 113, 209, 20);
		pane4.add(cbxDepartamento);
		cbxDepartamento.addItem("");
		try {
			for (Departamentos dep : new DepartamentoController().listarDepartamentos()) {
				cbxDepartamento.addItem(dep.getNome());
			}
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

		btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(10, 287, 80, 39);
		pane4.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					Projetos projeto = new Projetos();
					projeto.setNome(txtNome.getText());
					projeto.setNumero(numProjeto);
					projeto.setTipo(txtTipo.getText());
					projeto.setHora(Integer.parseInt(txtHoras.getText()));
					projeto.setVerba(Double.parseDouble(txtVerba.getText().replace(",", ".")));
					int codDepartamento;
					codDepartamento = new DepartamentoController()
							.consultaDep(cbxDepartamento.getSelectedItem().toString());
					projeto.setCod_departamento(codDepartamento);

					List<Long> listCpfFunc = new ArrayList<Long>();
					for (int i = 0; i < tblFuncionario.getRowCount(); i++) {
						listCpfFunc.add(Long.parseLong(tblFuncionario.getValueAt(i, 0).toString()));
					}
					projeto.setCpf_funcionario(listCpfFunc);

					projetosController.cadastrarProjeto(projeto);
					lblConfirmacao.setVisible(true);

					Timer timer = new Timer(); // new timer
					TimerTask task = new TimerTask() {
						private int contador = 0;

						public void run() {
							contador--;
							if (contador == -1) {
								timer.cancel();
								lblConfirmacao.setVisible(false);
							}
						}
					};
					timer.scheduleAtFixedRate(task, 1000, 1000); // = 1000 = a delay de 1 segundo no contador;

					limparTela();

				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}

			}
		});

		lblConfirmacao = new JLabel();
		lblConfirmacao.setForeground(Color.GREEN);
		lblConfirmacao.setText("Cadastrado com sucesso");
		lblConfirmacao.setBounds(99, 298, 146, 16);
		lblConfirmacao.setVisible(false);
		pane4.add(lblConfirmacao);

		lblNavegacao = new JLabel();
		lblNavegacao.setText("Navegação:");
		lblNavegacao.setForeground(Color.WHITE);
		lblNavegacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNavegacao.setBounds(37, 326, 100, 23);
		pane4.add(lblNavegacao);

		btnInici = new JButton("Início");
		btnInici.setHorizontalAlignment(SwingConstants.LEFT);
		btnInici.setForeground(Color.BLACK);
		btnInici.setBorder(null);
		btnInici.setBackground(Color.WHITE);
		btnInici.setBounds(15, 349, 57, 23);
		pane4.add(btnInici);
		btnInici.addActionListener(new ActionListener() {

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
		pane4.add(btnCadastroDepartamentos);
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
		pane4.add(btnCadastroFuncionario);
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
		pane4.add(btnCadastroProjetos);
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
		pane4.add(btnCadastroDependentes);
		btnCadastroDependentes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroDependentes().setVisible(true);
				dispose();

			}
		});

		lblFuncionario = new JLabel();
		lblFuncionario.setText("Funcionário:");
		lblFuncionario.setForeground(new Color(153, 153, 153));
		lblFuncionario.setBackground(Color.WHITE);
		lblFuncionario.setBounds(10, 157, 84, 16);
		pane4.add(lblFuncionario);

		separatorFuncionario = new JSeparator();
		separatorFuncionario.setForeground(new Color(204, 204, 204));
		separatorFuncionario.setBackground(new Color(204, 204, 204));
		separatorFuncionario.setBounds(10, 180, 65, 10);
		pane4.add(separatorFuncionario);

		model = new DefaultTableModel();
		model.addColumn("CPF");

		cbxFuncionario = new JComboBox<String>();
		cbxFuncionario.setBounds(89, 155, 278, 20);
		pane4.add(cbxFuncionario);

		try {
			cbxFuncionario.addItem("");
			for (Funcionario funcionario : new FuncionarioController().listarFuncionario()) {
				cbxFuncionario.addItem(String.valueOf(funcionario.getCpf()));
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		lblBack = new JLabel();
		lblBack.setIcon(new ImageIcon(CadastroProjetos.class.getResource("/imgs/backprojetos.png")));
		lblBack.setForeground(new Color(0, 204, 0));
		lblBack.setBackground(new Color(0, 204, 0));
		lblBack.setBounds(0, 208, 800, 270);
		pane4.add(lblBack);

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
		pane4.add(btnLogout);
		btnLogout.setBorder(null);
		btnLogout.setFocusPainted(isVisible());
		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
				dispose();

			}
		});

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(377, 154, 89, 23);
		pane4.add(btnAdicionar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 188, 209, 88);
		pane4.add(scrollPane);

		tblFuncionario = new JTable();
		tblFuncionario.setModel(model);
		scrollPane.setViewportView(tblFuncionario);
		btnAdicionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.addRow(new Object[] { cbxFuncionario.getSelectedItem() });
				cbxFuncionario.setSelectedItem("");
			}
		});
	}

	private void limparTela() {
		txtNome.setText("");
		txtNumero.setText("");
		txtVerba.setText("");
		txtHoras.setText("");
		txtTipo.setText("");
		cbxDepartamento.setSelectedItem("");
		cbxFuncionario.setSelectedItem("");
	}
}