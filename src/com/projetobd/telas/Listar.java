package com.projetobd.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.projetobd.controler.DepartamentoController;
import com.projetobd.controler.DependentesController;
import com.projetobd.controler.FuncionarioController;
import com.projetobd.controler.ProjetosController;
import com.projetobd.entidades.Departamentos;
import com.projetobd.entidades.Dependentes;
import com.projetobd.entidades.Funcionario;
import com.projetobd.entidades.Projetos;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Listar extends JFrame implements MouseListener, ListSelectionListener {

	private static final long serialVersionUID = 1L;
	private JPanel pane6;
	private JTable table;
	private JButton btnLogout;
	private JLabel lblDepartamentoIcon;
	private JButton btnListarDepartamentos;
	private JLabel lblFuncionarioIcon;
	private JButton btnListarFuncionario;
	private JLabel lblProjetoIcon;
	private JButton btnListarProjeto;
	private JLabel lblDependentesIcon;
	private JButton btnListarDependentes;
	private JScrollPane scrollPane;
	private DefaultTableModel modeloTabela;
	private JButton btnAlterar;
	private JButton btnExcluir;

	public Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		setUndecorated(true);
		setLocationRelativeTo(null);
		pane6 = new JPanel();
		pane6.setBackground(Color.WHITE);
		pane6.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane6);
		pane6.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 780, 327);
		pane6.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.getSelectionModel().addListSelectionListener(this);

		lblDepartamentoIcon = new JLabel("");
		lblDepartamentoIcon.setBounds(148, 29, 40, 45);
		lblDepartamentoIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/icondepartamento.png")));
		pane6.add(lblDepartamentoIcon);
		lblDepartamentoIcon.addMouseListener(this);

		btnListarDepartamentos = new JButton("Departamentos");
		btnListarDepartamentos.setBounds(85, 78, 166, 23);
		btnListarDepartamentos.setFocusPainted(false);
		btnListarDepartamentos.setBorder(null);
		btnListarDepartamentos.setBackground(Color.WHITE);
		pane6.add(btnListarDepartamentos);
		btnListarDepartamentos.addMouseListener(this);

		lblFuncionarioIcon = new JLabel("");
		lblFuncionarioIcon.setBounds(313, 29, 40, 45);
		lblFuncionarioIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconfuncionario.png")));
		pane6.add(lblFuncionarioIcon);
		lblFuncionarioIcon.addMouseListener(this);

		btnListarFuncionario = new JButton("Funcionários");
		btnListarFuncionario.setBounds(261, 78, 145, 23);
		btnListarFuncionario.setFocusPainted(false);
		btnListarFuncionario.setBorder(null);
		btnListarFuncionario.setBackground(Color.WHITE);
		pane6.add(btnListarFuncionario);
		btnListarFuncionario.addMouseListener(this);

		lblProjetoIcon = new JLabel("");
		lblProjetoIcon.setBounds(463, 29, 40, 45);
		lblProjetoIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconprojeto.png")));
		pane6.add(lblProjetoIcon);
		lblProjetoIcon.addMouseListener(this);

		btnListarProjeto = new JButton("Projetos");
		btnListarProjeto.setBounds(416, 78, 134, 23);
		btnListarProjeto.setFocusPainted(false);
		btnListarProjeto.setBorder(null);
		btnListarProjeto.setBackground(Color.WHITE);
		pane6.add(btnListarProjeto);
		btnListarProjeto.addMouseListener(this);

		lblDependentesIcon = new JLabel("");
		lblDependentesIcon.setBounds(610, 26, 51, 45);
		lblDependentesIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/icondependentes.png")));
		pane6.add(lblDependentesIcon);
		lblDependentesIcon.addMouseListener(this);

		btnListarDependentes = new JButton("Dependentes");
		btnListarDependentes.setBounds(560, 78, 151, 23);
		btnListarDependentes.setFocusPainted(false);
		btnListarDependentes.setBorder(null);
		btnListarDependentes.setBackground(Color.WHITE);
		pane6.add(btnListarDependentes);
		btnListarDependentes.addMouseListener(this);

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
		pane6.add(btnLogout);
		btnLogout.setBorder(null);
		btnLogout.setFocusPainted(isVisible());

		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Inicio().setVisible(true);

			}
		});

		btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconatualizar.png")));
		btnAlterar.setBorder(null);
		btnAlterar.setFocusPainted(false);
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setBounds(10, 489, 115, 41);
		btnAlterar.addMouseListener(this);
		btnAlterar.setVisible(false);
		pane6.add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CadastroProjetos cadProjetos = new CadastroProjetos();
				cadProjetos.setVisible(true);
				cadProjetos.alterarProjeto((int) table.getValueAt(table.getSelectedRow(), 0));
			}
		});

		btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconexcluir.png")));
		btnExcluir.setBounds(135, 489, 115, 41);
		btnExcluir.setBorder(null);
		btnExcluir.setFocusPainted(false);
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.addMouseListener(this);
		pane6.add(btnExcluir);
		btnExcluir.setVisible(false);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnListarDepartamentos || lblDepartamentoIcon == e.getSource()) {
			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.clik.png")));
			listaDepartamentos();
		} else if (e.getSource() == btnListarFuncionario || lblFuncionarioIcon == e.getSource()) {
			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.clik.png")));
			listaFuncionarios();
		} else if (e.getSource() == btnListarProjeto || lblProjetoIcon == e.getSource()) {
			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.clik.png")));
			listaProjetos();
		} else if (e.getSource() == btnListarDependentes || lblDependentesIcon == e.getSource()) {
			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.clik.png")));
			listaDependentes();
		} else if (e.getSource() == btnAlterar) {
			btnAlterar.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconatualizar.clik.png")));
		} else if (e.getSource() == btnExcluir) {
			btnExcluir.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconexcluir.clik.png")));
			try {
				new ProjetosController().excluirProjetos((int) table.getValueAt(table.getSelectedRow(), 0));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			modeloTabela.removeRow(table.getSelectedRow());

		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == btnListarDepartamentos || lblDepartamentoIcon == e.getSource()) {

			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.sobre.png")));

		} else if (e.getSource() == btnListarFuncionario || lblFuncionarioIcon == e.getSource()) {

			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.sobre.png")));

		} else if (e.getSource() == btnListarProjeto || lblProjetoIcon == e.getSource()) {

			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.sobre.png")));

		} else if (e.getSource() == btnListarDependentes || lblDependentesIcon == e.getSource()) {

			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.sobre.png")));

		} else if (e.getSource() == btnAlterar) {
			btnAlterar.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconatualizar.sobre.png")));
		} else if (e.getSource() == btnExcluir) {
			btnExcluir.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconexcluir.sobre.png")));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnListarDepartamentos || lblDepartamentoIcon == e.getSource()) {
			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.png")));
		} else if (e.getSource() == btnListarFuncionario || lblFuncionarioIcon == e.getSource()) {

			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.png")));

		} else if (e.getSource() == btnListarProjeto || lblProjetoIcon == e.getSource()) {

			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.png")));

		} else if (e.getSource() == btnListarDependentes || lblDependentesIcon == e.getSource()) {

			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.png")));

		} else if (e.getSource() == btnAlterar) {
			btnAlterar.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconatualizar.png")));
		} else if (e.getSource() == btnExcluir) {
			btnExcluir.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconexcluir.png")));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	public void listaDepartamentos() {
		try {
			modeloTabela = new DefaultTableModel();
			modeloTabela.addColumn("Código");
			modeloTabela.addColumn("Nome");
			modeloTabela.addColumn("Localização");

			for (Departamentos departamentos : new DepartamentoController().listarDepartamentos()) {
				modeloTabela.addRow(new Object[] { departamentos.getCodigo(), departamentos.getNome(),
						departamentos.getLocalizacao() });
			}
			table.setModel(modeloTabela);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro no banco de dados");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Uma classe do projeto não pode ser carregada");
		}
	}

	public void listaFuncionarios() {
		try {
			modeloTabela = new DefaultTableModel();
			modeloTabela.addColumn("CPF");
			modeloTabela.addColumn("Nome");
			modeloTabela.addColumn("Salario");

			for (Funcionario funcionario : new FuncionarioController().listarFuncionario()) {
				modeloTabela
						.addRow(new Object[] { funcionario.getCpf(), funcionario.getNome(), funcionario.getSalario() });
			}
			table.setModel(modeloTabela);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro no banco de dados");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Uma classe do projeto não pode ser carregada");
		}
	}

	public void listaProjetos() {
		try {
			modeloTabela = new DefaultTableModel();
			modeloTabela.addColumn("Numero");
			modeloTabela.addColumn("Nome");
			modeloTabela.addColumn("Verba");

			for (Projetos projetos : new ProjetosController().listarProjetos()) {
				modeloTabela.addRow(new Object[] { projetos.getNumero(), projetos.getNome(), projetos.getVerba() });
			}
			table.setModel(modeloTabela);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro no banco de dados");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Uma classe do projeto não pode ser carregada");
		}
	}

	public void listaDependentes() {
		try {
			modeloTabela = new DefaultTableModel();
			modeloTabela.addColumn("Código");
			modeloTabela.addColumn("Nome");
			modeloTabela.addColumn("Funcionario");
			modeloTabela.addColumn("Parentesco");

			for (Dependentes dependentes : new DependentesController().listarDependentes()) {
				modeloTabela.addRow(new Object[] { dependentes.getCodigo(), dependentes.getNome(),
						dependentes.getNome_funcionario(), dependentes.getParentesco() });
			}
			table.setModel(modeloTabela);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro no banco de dados");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Uma classe do projeto não pode ser carregada");
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		if (arg0.getSource() == table.getSelectionModel()) {
			btnAlterar.setVisible(true);
			btnExcluir.setVisible(true);
		}
	}
}