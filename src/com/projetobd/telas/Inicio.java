package com.projetobd.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Inicio extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblIcone;
	private JSeparator separatorBase;
	private JLabel lblBemVindo;
	private JLabel lblUsuarioLogado;
	private JLabel lblNomeSistema;
	private JButton btnCadastroDependentes;
	
	private JButton btnCadastroFuncionario;
	private JButton btnCadastroProjeto;
	private JLabel lblDepartamentoIcon;
	private JLabel lblFuncionarioIcon;
	private JLabel lblProjetoIcon;
	private JLabel lblDependentesIcon;
	private JLabel lblBanner;
	private JButton btnLogout;
	private JButton btnCadastroDepartamentos;

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 479);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 799, 478);
		contentPane.add(panel);

		lblIcone = new JLabel();
		lblIcone.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/ifpe.png")));
		lblIcone.setBounds(36, 17, 70, 96);
		panel.add(lblIcone);

		separatorBase = new JSeparator();
		separatorBase.setForeground(new Color(204, 204, 204));
		separatorBase.setBackground(new Color(204, 204, 204));
		separatorBase.setBounds(110, 119, 675, 10);
		panel.add(separatorBase);

		lblBemVindo = new JLabel();
		lblBemVindo.setText("Bem vindo !");
		lblBemVindo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBemVindo.setBounds(560, 11, 92, 24);
		panel.add(lblBemVindo);

		lblUsuarioLogado = new JLabel();
		lblUsuarioLogado.setText("Usuário");
		lblUsuarioLogado.setBounds(663, 16, 79, 14);
		panel.add(lblUsuarioLogado);

		lblNomeSistema = new JLabel();
		lblNomeSistema.setText("Gerência Empresarial |  Departamentos e Funcionários");
		lblNomeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeSistema.setBounds(212, 135, 371, 14);
		panel.add(lblNomeSistema);
		
		btnCadastroDepartamentos = new JButton("Cadastro de departamentos");
		btnCadastroDepartamentos.setFocusPainted(false);
		btnCadastroDepartamentos.setBorder(null);
		btnCadastroDepartamentos.setBackground(Color.WHITE);
		btnCadastroDepartamentos.setBounds(117, 95, 166, 23);
		panel.add(btnCadastroDepartamentos);
		btnCadastroDepartamentos.addMouseListener(this);
		

		btnCadastroDependentes = new JButton("Cadastro de dependentes");
		btnCadastroDependentes.setBorder(null);
		btnCadastroDependentes.setBackground(Color.WHITE);
		btnCadastroDependentes.setFocusPainted(isVisible());
		btnCadastroDependentes.setBounds(615, 95, 170, 23);
		panel.add(btnCadastroDependentes);
		btnCadastroDependentes.setFocusPainted(isVisible());
		btnCadastroDependentes.addMouseListener(this);
		

		btnCadastroFuncionario = new JButton("Cadastro de funcionários");
		btnCadastroFuncionario.setBorder(null);
		btnCadastroFuncionario.setBackground(Color.WHITE);
		btnCadastroFuncionario.setBounds(293, 95, 166, 23);
		panel.add(btnCadastroFuncionario);
		btnCadastroFuncionario.addMouseListener(this);
		btnCadastroFuncionario.setFocusPainted(isVisible());
		

		btnCadastroProjeto = new JButton("Cadastro de projetos");
		btnCadastroProjeto.setBorder(null);
		btnCadastroProjeto.setBackground(Color.WHITE);
		btnCadastroProjeto.setBounds(469, 95, 140, 23);
		panel.add(btnCadastroProjeto);
		btnCadastroProjeto.setFocusPainted(isVisible());
		btnCadastroProjeto.addMouseListener(this);
		

		lblDepartamentoIcon = new JLabel("");
		lblDepartamentoIcon.addMouseListener(this);
		lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.png")));
		lblDepartamentoIcon.setBounds(181, 46, 40, 45);
		panel.add(lblDepartamentoIcon);
		lblDepartamentoIcon.addMouseListener(this);
		
		
		lblFuncionarioIcon = new JLabel("");
		lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.png")));
		lblFuncionarioIcon.setBounds(356, 46, 40, 45);
		panel.add(lblFuncionarioIcon);
		lblFuncionarioIcon.addMouseListener(this);
		

		lblProjetoIcon = new JLabel("");
		lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.png")));
		lblProjetoIcon.setBounds(519, 46, 40, 45);
		panel.add(lblProjetoIcon);
		lblDependentesIcon = new JLabel("");
		lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.png")));
		lblDependentesIcon.setBounds(675, 43, 51, 45);
		panel.add(lblDependentesIcon);
		lblProjetoIcon.addMouseListener(this);
		
		
		
		lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/backinicio.png")));
		lblBanner.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanner.setBounds(0, 160, 800, 323);
		panel.add(lblBanner);

		btnLogout = new JButton("");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout.sobre.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout.png")));
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout.png")));
		btnLogout.setBounds(767, 14, 18, 18);
		panel.add(btnLogout);
		btnLogout.setBorder(null);
		btnLogout.setFocusPainted(isVisible());
				
		btnLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				dispose();

			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource() == btnCadastroDepartamentos || lblDepartamentoIcon == arg0.getSource()) {
			
			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.clik.png")));
			dispose();
			new CadastroDepartamentos().setVisible(true);
			
		}
		
		else if(arg0.getSource() == btnCadastroFuncionario || lblFuncionarioIcon == arg0.getSource()) {
			
			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.clik.png")));
			dispose();
			new CadastroFuncionario().setVisible(true);
			
		}
		
	
		else if(arg0.getSource() == btnCadastroProjeto || lblProjetoIcon == arg0.getSource()) {
			
			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.clik.png")));
			dispose();
			new CadastroProjetos().setVisible(true);
			
		}
		
		
		else if(arg0.getSource() == btnCadastroDependentes || lblDependentesIcon == arg0.getSource()) {
			
			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.clik.png")));
			dispose();
			new CadastroDependentes().setVisible(true);
			
		}
		
	}
		
	

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == btnCadastroDepartamentos || lblDepartamentoIcon == e.getSource()) {
			
			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.sobre.png")));
			
		}
		
		else if(e.getSource() == btnCadastroFuncionario || lblFuncionarioIcon == e.getSource()) {
			
			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.sobre.png")));
			
		}
		
	
		else if(e.getSource() == btnCadastroProjeto || lblProjetoIcon == e.getSource()) {
			
			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.sobre.png")));
		
		}
		
		
		else if(e.getSource() == btnCadastroDependentes || lblDependentesIcon == e.getSource()) {
			
			lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.sobre.png")));
			
		}
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		if(e.getSource() == btnCadastroDepartamentos || lblDepartamentoIcon == e.getSource()) {
			
			lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.png")));
			
		}
		
		else if(e.getSource() == btnCadastroFuncionario || lblFuncionarioIcon == e.getSource()) {
			
			lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.png")));
			
		}
		
	
		else if(e.getSource() == btnCadastroProjeto || lblProjetoIcon == e.getSource()) {
			
			lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.png")));
		
		}
		
		
		else if(e.getSource() == btnCadastroDependentes || lblDependentesIcon == e.getSource()) {
			
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