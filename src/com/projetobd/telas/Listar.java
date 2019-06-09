package com.projetobd.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Listar extends JFrame implements MouseListener {

	private JPanel pane6;
	private JTable table;
	private JButton btnLogout;
	private JLabel lblDepartamentoIcon;
	private JButton btnCadastroDepartamentos;
	private JLabel lblFuncionarioIcon;
	private JButton btnCadastroFuncionario;
	private JLabel lblProjetoIcon;
	private JButton btnCadastroProjeto;
	private JLabel lblDependentesIcon;
	private JButton btnCadastroDependentes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar frame = new Listar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		setUndecorated(true);
		pane6 = new JPanel();
		pane6.setBackground(Color.WHITE);
		pane6.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane6);
		pane6.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 126, 780, 393);
		pane6.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblDepartamentoIcon = new JLabel("");
		lblDepartamentoIcon.setBounds(148, 29, 40, 45);
		lblDepartamentoIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/icondepartamento.png")));
		pane6.add(lblDepartamentoIcon);
		lblDepartamentoIcon.addMouseListener(this);
		
		
	    btnCadastroDepartamentos = new JButton("Departamentos");
		btnCadastroDepartamentos.setBounds(85, 78, 166, 23);
		btnCadastroDepartamentos.setFocusPainted(false);
		btnCadastroDepartamentos.setBorder(null);
		btnCadastroDepartamentos.setBackground(Color.WHITE);
		pane6.add(btnCadastroDepartamentos);
		btnCadastroDepartamentos.addMouseListener(this);
		
		lblFuncionarioIcon = new JLabel("");
		lblFuncionarioIcon.setBounds(313, 29, 40, 45);
		lblFuncionarioIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconfuncionario.png")));
		pane6.add(lblFuncionarioIcon);
		lblFuncionarioIcon.addMouseListener(this);
		
		btnCadastroFuncionario = new JButton("Funcionários");
		btnCadastroFuncionario.setBounds(261, 78, 145, 23);
		btnCadastroFuncionario.setFocusPainted(false);
		btnCadastroFuncionario.setBorder(null);
		btnCadastroFuncionario.setBackground(Color.WHITE);
		pane6.add(btnCadastroFuncionario);
		btnCadastroFuncionario.addMouseListener(this);
		
		lblProjetoIcon = new JLabel("");
		lblProjetoIcon.setBounds(463, 29, 40, 45);
		lblProjetoIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/iconprojeto.png")));
		pane6.add(lblProjetoIcon);
		lblProjetoIcon.addMouseListener(this);
		
		btnCadastroProjeto = new JButton("Projetos");
		btnCadastroProjeto.setBounds(416, 78, 134, 23);
		btnCadastroProjeto.setFocusPainted(false);
		btnCadastroProjeto.setBorder(null);
		btnCadastroProjeto.setBackground(Color.WHITE);
		pane6.add(btnCadastroProjeto);
		btnCadastroProjeto.addMouseListener(this);
		
		lblDependentesIcon = new JLabel("");
		lblDependentesIcon.setBounds(610, 26, 51, 45);
		lblDependentesIcon.setIcon(new ImageIcon(Listar.class.getResource("/imgs/icondependentes.png")));
		pane6.add(lblDependentesIcon);
		lblDependentesIcon.addMouseListener(this);
		
		btnCadastroDependentes = new JButton("Dependentes");
		btnCadastroDependentes.setBounds(560, 78, 151, 23);
		btnCadastroDependentes.setFocusPainted(false);
		btnCadastroDependentes.setBorder(null);
		btnCadastroDependentes.setBackground(Color.WHITE);
		pane6.add(btnCadastroDependentes);
		btnCadastroDependentes.addMouseListener(this);
		
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
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnCadastroDepartamentos || lblDepartamentoIcon == e.getSource()) {

			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.clik.png")));
		

		}

		else if (e.getSource() == btnCadastroFuncionario || lblFuncionarioIcon == e.getSource()) {

			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.clik.png")));
		

		}

		else if (e.getSource() == btnCadastroProjeto || lblProjetoIcon == e.getSource()) {

			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.clik.png")));
			

		}

		else if (e.getSource() == btnCadastroDependentes || lblDependentesIcon == e.getSource()) {

			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.clik.png")));
			

		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == btnCadastroDepartamentos || lblDepartamentoIcon == e.getSource()) {

			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.sobre.png")));

		}

		else if (e.getSource() == btnCadastroFuncionario || lblFuncionarioIcon == e.getSource()) {

			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.sobre.png")));

		}

		else if (e.getSource() == btnCadastroProjeto || lblProjetoIcon == e.getSource()) {

			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.sobre.png")));

		}

		else if (e.getSource() == btnCadastroDependentes || lblDependentesIcon == e.getSource()) {

			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.sobre.png")));

		}
		

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnCadastroDepartamentos || lblDepartamentoIcon == e.getSource()) {

			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.png")));

		}

		else if (e.getSource() == btnCadastroFuncionario || lblFuncionarioIcon == e.getSource()) {

			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.png")));

		}

		else if (e.getSource() == btnCadastroProjeto || lblProjetoIcon == e.getSource()) {

			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.png")));

		}

		else if (e.getSource() == btnCadastroDependentes || lblDependentesIcon == e.getSource()) {

			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.png")));

		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
