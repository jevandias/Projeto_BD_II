package com.projetobd.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import com.projetobd.personalizados.JNumberFormatField;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import com.projetobd.personalizados.JNumberField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtCep;
	private JTextField txtCpf;
	private JTextField txtTelefone;


	/**
	 * Create the frame.
	 */
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 478);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Cadastro de Funcionários");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBackground(new Color(153, 153, 153));
		label.setBounds(10, 11, 301, 35);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(204, 204, 204));
		separator.setBackground(new Color(204, 204, 204));
		separator.setBounds(10, 52, 694, 10);
		contentPane.add(separator);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Nome:");
		label_1.setForeground(new Color(153, 153, 153));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(10, 69, 36, 16);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setForeground(new Color(153, 153, 153));
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(52, 68, 243, 18);
		contentPane.add(textField);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 204, 204));
		separator_1.setBackground(new Color(204, 204, 204));
		separator_1.setBounds(10, 92, 285, 10);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("CPF:");
		label_2.setForeground(new Color(153, 153, 153));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(313, 69, 25, 16);
		contentPane.add(label_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(204, 204, 204));
		separator_2.setBackground(new Color(204, 204, 204));
		separator_2.setBounds(313, 92, 154, 10);
		contentPane.add(separator_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Salário:");
		label_3.setForeground(new Color(153, 153, 153));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(485, 69, 43, 16);
		contentPane.add(label_3);
		
		JNumberFormatField numberFormatField = new JNumberFormatField(new DecimalFormat("0.00"));
		numberFormatField.setToolTipText("");
		numberFormatField.setForeground(new Color(153, 153, 153));
		numberFormatField.setBorder(null);
		numberFormatField.setBackground(Color.WHITE);
		numberFormatField.setBounds(529, 68, 174, 18);
		contentPane.add(numberFormatField);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(204, 204, 204));
		separator_3.setBackground(new Color(204, 204, 204));
		separator_3.setBounds(485, 92, 219, 10);
		contentPane.add(separator_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Endereço");
		label_4.setForeground(new Color(153, 153, 153));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(10, 114, 57, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setText("CEP:");
		label_5.setForeground(new Color(153, 153, 153));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(10, 143, 28, 16);
		contentPane.add(label_5);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(204, 204, 204));
		separator_4.setBackground(new Color(204, 204, 204));
		separator_4.setBounds(10, 166, 146, 10);
		contentPane.add(separator_4);
		
		JLabel label_6 = new JLabel();
		label_6.setText("Rua:");
		label_6.setForeground(new Color(153, 153, 153));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(180, 143, 38, 16);
		contentPane.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setForeground(new Color(153, 153, 153));
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(216, 142, 251, 18);
		contentPane.add(textField_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(new Color(204, 204, 204));
		separator_5.setBackground(new Color(204, 204, 204));
		separator_5.setBounds(180, 166, 287, 10);
		contentPane.add(separator_5);
		
		JLabel label_7 = new JLabel();
		label_7.setText("Bairro:");
		label_7.setForeground(new Color(153, 153, 153));
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(485, 143, 45, 16);
		contentPane.add(label_7);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setForeground(new Color(153, 153, 153));
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(529, 142, 174, 18);
		contentPane.add(textField_2);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(new Color(204, 204, 204));
		separator_6.setBackground(new Color(204, 204, 204));
		separator_6.setBounds(485, 166, 219, 10);
		contentPane.add(separator_6);
		
		JLabel label_8 = new JLabel();
		label_8.setText("Número:");
		label_8.setForeground(new Color(153, 153, 153));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(10, 185, 50, 16);
		contentPane.add(label_8);
		
		JNumberField numberField = new JNumberField();
		numberField.setToolTipText("");
		numberField.setForeground(new Color(153, 153, 153));
		numberField.setBorder(null);
		numberField.setBackground(Color.WHITE);
		numberField.setBounds(61, 184, 95, 18);
		contentPane.add(numberField);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(new Color(204, 204, 204));
		separator_7.setBackground(new Color(204, 204, 204));
		separator_7.setBounds(10, 212, 146, 10);
		contentPane.add(separator_7);
		
		JLabel label_9 = new JLabel();
		label_9.setText("Cidade:");
		label_9.setForeground(new Color(153, 153, 153));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(180, 185, 45, 16);
		contentPane.add(label_9);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setForeground(new Color(153, 153, 153));
		textField_3.setBorder(null);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(223, 184, 119, 18);
		contentPane.add(textField_3);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(new Color(204, 204, 204));
		separator_8.setBackground(new Color(204, 204, 204));
		separator_8.setBounds(180, 212, 162, 10);
		contentPane.add(separator_8);
		
		JLabel label_10 = new JLabel();
		label_10.setText("UF:");
		label_10.setForeground(new Color(153, 153, 153));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(366, 185, 17, 16);
		contentPane.add(label_10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setForeground(new Color(153, 153, 153));
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(386, 184, 81, 18);
		contentPane.add(textField_4);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(new Color(204, 204, 204));
		separator_9.setBackground(new Color(204, 204, 204));
		separator_9.setBounds(366, 212, 101, 10);
		contentPane.add(separator_9);
		
		JLabel label_11 = new JLabel();
		label_11.setText("Telefone:");
		label_11.setForeground(new Color(153, 153, 153));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(485, 185, 52, 16);
		contentPane.add(label_11);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(new Color(204, 204, 204));
		separator_10.setBackground(new Color(204, 204, 204));
		separator_10.setBounds(485, 212, 219, 10);
		contentPane.add(separator_10);
		
		JLabel label_12 = new JLabel();
		label_12.setText("Senha de Acesso:");
		label_12.setForeground(new Color(153, 153, 153));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(10, 229, 105, 16);
		contentPane.add(label_12);
		
		JNumberField numberField_1 = new JNumberField();
		numberField_1.setToolTipText("");
		numberField_1.setForeground(new Color(153, 153, 153));
		numberField_1.setBorder(null);
		numberField_1.setBackground(Color.WHITE);
		numberField_1.setBounds(116, 228, 113, 18);
		contentPane.add(numberField_1);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(new Color(204, 204, 204));
		separator_11.setBackground(new Color(204, 204, 204));
		separator_11.setBounds(10, 252, 219, 10);
		contentPane.add(separator_11);
		
		JButton button = new JButton();
		button.setText("Salvar");
		button.setForeground(new Color(153, 153, 153));
		button.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		button.setBackground(Color.WHITE);
		button.setBounds(624, 268, 80, 39);
		contentPane.add(button);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.WHITE);
		separator_12.setBackground(new Color(204, 204, 204));
		separator_12.setBounds(27, 326, 20, 130);
		contentPane.add(separator_12);
		
		JLabel label_13 = new JLabel();
		label_13.setText("Confirmação");
		label_13.setBounds(514, 279, 73, 16);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel();
		label_14.setText("Navegação:");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Dialog", Font.BOLD, 14));
		label_14.setBounds(37, 326, 100, 23);
		contentPane.add(label_14);
		
		JButton button_1 = new JButton("Início");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.WHITE);
		button_1.setBorder(null);
		button_1.setBackground(new Color(0, 168, 89));
		button_1.setBounds(37, 349, 57, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Cadastro de Departamentos");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.WHITE);
		button_2.setBorder(null);
		button_2.setBackground(new Color(0, 168, 89));
		button_2.setBounds(37, 371, 162, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Cadastro de Funcionários");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.WHITE);
		button_3.setBorder(null);
		button_3.setBackground(new Color(0, 168, 89));
		button_3.setBounds(37, 393, 162, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Cadastro de Projetos");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.WHITE);
		button_4.setBorder(null);
		button_4.setBackground(new Color(0, 168, 89));
		button_4.setBounds(37, 414, 162, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Cadastro de Dependentes");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.WHITE);
		button_5.setBorder(null);
		button_5.setBackground(new Color(0, 168, 89));
		button_5.setBounds(37, 433, 162, 23);
		contentPane.add(button_5);
		
		JLabel label_15 = new JLabel();
		label_15.setForeground(new Color(0, 204, 0));
		label_15.setBackground(new Color(0, 204, 0));
		label_15.setBounds(10, 313, 694, 150);
		contentPane.add(label_15);
		
		txtCep = new JTextField();
		txtCep.setBorder(null);
		txtCep.setForeground(Color.WHITE);
		txtCep.setBounds(43, 141, 113, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBorder(null);
		txtCpf.setForeground(Color.WHITE);
		txtCpf.setBounds(342, 67, 125, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBorder(null);
		txtTelefone.setBounds(542, 183, 162, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
	}
}
