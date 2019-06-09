package com.projetobd.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

import javax.swing.ImageIcon;

public class CadastroDepartamentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCodigo;
	private JTextField txtLocalizacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDepartamentos frame = new CadastroDepartamentos();
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
	public CadastroDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 795, 478);
		contentPane.add(panel);
		
		JLabel label = new JLabel();
		label.setText("Cadastro de Departamentos\r\n");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBackground(new Color(153, 153, 153));
		label.setBounds(23, 15, 301, 35);
		panel.add(label);
		
		JSeparator separatorTitulo = new JSeparator();
		separatorTitulo.setForeground(new Color(204, 204, 204));
		separatorTitulo.setBackground(new Color(204, 204, 204));
		separatorTitulo.setBounds(23, 56, 694, 10);
		panel.add(separatorTitulo);
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setForeground(new Color(153, 153, 153));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(23, 73, 36, 16);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setForeground(new Color(153, 153, 153));
		txtNome.setBorder(null);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(61, 72, 247, 18);
		panel.add(txtNome);
		
		JSeparator separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(23, 96, 285, 10);
		panel.add(separatorNome);
		
		JLabel lblCodigo = new JLabel();
		lblCodigo.setText("Código:");
		lblCodigo.setForeground(new Color(153, 153, 153));
		lblCodigo.setBackground(Color.WHITE);
		lblCodigo.setBounds(326, 73, 42, 16);
		panel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setToolTipText("");
		txtCodigo.setForeground(new Color(153, 153, 153));
		txtCodigo.setBorder(null);
		txtCodigo.setBackground(Color.WHITE);
		txtCodigo.setBounds(369, 72, 111, 18);
		panel.add(txtCodigo);
		
		JSeparator separatorCodigo = new JSeparator();
		separatorCodigo.setForeground(new Color(204, 204, 204));
		separatorCodigo.setBackground(new Color(204, 204, 204));
		separatorCodigo.setBounds(326, 96, 154, 10);
		panel.add(separatorCodigo);
		
		JLabel lblLocalizacao = new JLabel();
		lblLocalizacao.setText("Localização:");
		lblLocalizacao.setForeground(new Color(153, 153, 153));
		lblLocalizacao.setBackground(Color.WHITE);
		lblLocalizacao.setBounds(498, 73, 87, 16);
		panel.add(lblLocalizacao);
		
		JSeparator separatorLocalizacao = new JSeparator();
		separatorLocalizacao.setForeground(new Color(204, 204, 204));
		separatorLocalizacao.setBackground(new Color(204, 204, 204));
		separatorLocalizacao.setBounds(498, 96, 219, 10);
		panel.add(separatorLocalizacao);
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setToolTipText("");
		txtLocalizacao.setForeground(new Color(153, 153, 153));
		txtLocalizacao.setBorder(null);
		txtLocalizacao.setBackground(Color.WHITE);
		txtLocalizacao.setBounds(576, 72, 141, 18);
		panel.add(txtLocalizacao);
		
		JButton btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(23, 111, 80, 39);
		panel.add(btnSalvar);
		
		JLabel lblConfirmacao = new JLabel();
		lblConfirmacao.setText("Confirmação");
		lblConfirmacao.setBounds(113, 122, 73, 16);
		panel.add(lblConfirmacao);
		
		JLabel lblNavegacao = new JLabel();
		lblNavegacao.setText("Navegação:");
		lblNavegacao.setForeground(Color.WHITE);
		lblNavegacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNavegacao.setBounds(50, 330, 100, 23);
		panel.add(lblNavegacao);
		
		JButton button = new JButton("Início");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setForeground(Color.BLACK);
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(23, 360, 57, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Cadastro de Departamentos");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.BLACK);
		button_1.setBorder(null);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(23, 382, 162, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Cadastro de Funcionários");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.BLACK);
		button_2.setBorder(null);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(23, 404, 162, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Cadastro de Projetos");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.BLACK);
		button_3.setBorder(null);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(23, 425, 162, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Cadastro de Dependentes");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.BLACK);
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(23, 444, 162, 23);
		panel.add(button_4);
	}

}