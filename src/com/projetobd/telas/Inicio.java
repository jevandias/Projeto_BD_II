package com.projetobd.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblIcone;
	private JSeparator separatorBase;
	private JLabel lblBemVindo;
	private JLabel lblUsuarioLogado;
	private JLabel lblNomeSistema;
	private JButton btnCadastroDependentes;
	private JButton btnCadastroDepartamentos;
	private JButton btnCadatroFuncionario;
	private JButton btnCadastroProjeto;
	private JLabel lblDepartamentoIcon;
	private JLabel lblFuncionarioIcon;
	private JLabel lblProjetoIcon;
	private JLabel lblDependentesIcon;
	private JLabel lblSair;
	private JLabel lblBanner;

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
		lblUsuarioLogado.setBounds(663, 16, 83, 14);
		panel.add(lblUsuarioLogado);
		
		lblNomeSistema = new JLabel();
		lblNomeSistema.setText("Gerência Empresarial |  Departamentos e Funcionários");
		lblNomeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeSistema.setBounds(212, 135, 371, 14);
		panel.add(lblNomeSistema);
		
		btnCadastroDependentes = new JButton("Cadastro de dependentes");
		btnCadastroDependentes.setBorder(null);
		btnCadastroDependentes.setBackground(Color.WHITE);
		btnCadastroDependentes.setBounds(615, 95, 170, 23);
		panel.add(btnCadastroDependentes);
				
		btnCadastroDepartamentos = new JButton("Cadastro de departamentos");
		btnCadastroDepartamentos.setBorder(null);
		btnCadastroDepartamentos.setBackground(Color.WHITE);
		btnCadastroDepartamentos.setBounds(116, 95, 170, 23);
		panel.add(btnCadastroDepartamentos);
		
		btnCadatroFuncionario = new JButton("Cadastro de funcionários");
		btnCadatroFuncionario.setBorder(null);
		btnCadatroFuncionario.setBackground(Color.WHITE);
		btnCadatroFuncionario.setBounds(293, 95, 166, 23);
		panel.add(btnCadatroFuncionario);
		
		btnCadastroProjeto = new JButton("Cadastro de projetos");
		btnCadastroProjeto.setBorder(null);
		btnCadastroProjeto.setBackground(Color.WHITE);
		btnCadastroProjeto.setBounds(469, 95, 140, 23);
		panel.add(btnCadastroProjeto);
		
		lblDepartamentoIcon = new JLabel("");
		lblDepartamentoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondepartamento.png")));
		lblDepartamentoIcon.setBounds(181, 46, 40, 45);
		panel.add(lblDepartamentoIcon);
		
		lblFuncionarioIcon = new JLabel("");
		lblFuncionarioIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconfuncionario.png")));
		lblFuncionarioIcon.setBounds(356, 46, 40, 45);
		panel.add(lblFuncionarioIcon);
		
		lblProjetoIcon = new JLabel("");
		lblProjetoIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconprojeto.png")));
		lblProjetoIcon.setBounds(519, 46, 40, 45);
		panel.add(lblProjetoIcon);
		
		lblDependentesIcon = new JLabel("");
		lblDependentesIcon.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/icondependentes.png")));
		lblDependentesIcon.setBounds(675, 43, 51, 45);
		panel.add(lblDependentesIcon);
		
		lblSair = new JLabel("");
		lblSair.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/iconlogout.png")));
		lblSair.setBounds(756, 13, 18, 18);
		panel.add(lblSair);
		
		lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon(Inicio.class.getResource("/imgs/backinicio.png")));
		lblBanner.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanner.setBounds(0, 160, 800, 323);
		panel.add(lblBanner);
	}
}