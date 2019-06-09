package com.projetobd.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import com.projetobd.personalizados.JNumberFormatField;

import java.text.DecimalFormat;

import com.projetobd.controler.ConsultaCep;
import com.projetobd.controler.FuncionarioController;
import com.projetobd.controler.GerarSenha;
import com.projetobd.controler.ValidaCNP;
import com.projetobd.entidades.Funcionario;
import com.projetobd.personalizados.JDocumentFormatedField;
import com.projetobd.personalizados.JNumberField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class CadastroFuncionario extends JFrame implements FocusListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRua;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUf;
	private JTextField txtCep;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JLabel lblTitulo;
	private JSeparator separatorCep;
	private JLabel lblRua;
	private JLabel lblCep;
	private JLabel lblEndereco;
	private JSeparator separatorSalario;
	private JNumberFormatField txtSalario;
	private JLabel lblSalario;
	private JSeparator separatorCpf;
	private JLabel lblCpf;
	private JSeparator separatorNome;
	private JLabel lblNome;
	private JSeparator separatorTitulo;
	private JLabel lblBairro;
	private JSeparator separatorBairro;
	private JLabel lblNumero;
	private JNumberField txtNumero;
	private JSeparator separatorUf;
	private JLabel lblTelefone;
	private JSeparator separatorTelefone;
	private JLabel lblSenha;
	private JNumberField txtSenha;
	private JSeparator separatorSenha;
	private JButton btnSalvar;
	private JLabel label_13;
	private JLabel label_14;
	private JButton btnInici;
	private JButton btnCadastroDepartamentos;
	private JButton btnCadastroFuncionario;
	private JButton btnCadastroProjetos;
	private JButton btnCadastroDependentes;
	private JLabel lblfuncinario;
	private JSeparator separatorRua;
	private JSeparator separatorNumero;
	private JLabel lblCidade;
	private JSeparator separatorCidade;
	private JLabel lblUf;

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

		lblTitulo = new JLabel();
		lblTitulo.setText("Cadastro de Funcionários");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setBackground(new Color(153, 153, 153));
		lblTitulo.setBounds(10, 11, 301, 35);
		contentPane.add(lblTitulo);

		separatorTitulo = new JSeparator();
		separatorTitulo.setForeground(new Color(204, 204, 204));
		separatorTitulo.setBackground(new Color(204, 204, 204));
		separatorTitulo.setBounds(10, 52, 694, 10);
		contentPane.add(separatorTitulo);

		lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setForeground(new Color(153, 153, 153));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(10, 69, 36, 16);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setForeground(new Color(153, 153, 153));
		txtNome.setBorder(null);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(52, 68, 243, 18);
		contentPane.add(txtNome);

		separatorNome = new JSeparator();
		separatorNome.setForeground(new Color(204, 204, 204));
		separatorNome.setBackground(new Color(204, 204, 204));
		separatorNome.setBounds(10, 92, 285, 10);
		contentPane.add(separatorNome);

		lblCpf = new JLabel();
		lblCpf.setText("CPF:");
		lblCpf.setForeground(new Color(153, 153, 153));
		lblCpf.setBackground(Color.WHITE);
		lblCpf.setBounds(313, 69, 25, 16);
		contentPane.add(lblCpf);

		txtCpf = new JDocumentFormatedField().getCpf();
		txtCpf.setBorder(null);
		txtCpf.setForeground(new Color(153, 153, 153));
		txtCpf.setBounds(342, 67, 125, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		txtCpf.addFocusListener(this);
		
		separatorCpf = new JSeparator();
		separatorCpf.setForeground(new Color(204, 204, 204));
		separatorCpf.setBackground(new Color(204, 204, 204));
		separatorCpf.setBounds(313, 92, 154, 10);
		contentPane.add(separatorCpf);

		lblSalario = new JLabel();
		lblSalario.setText("Salário:");
		lblSalario.setForeground(new Color(153, 153, 153));
		lblSalario.setBackground(Color.WHITE);
		lblSalario.setBounds(485, 69, 43, 16);
		contentPane.add(lblSalario);

		txtSalario = new JNumberFormatField(new DecimalFormat("0.00"));
		txtSalario.setToolTipText("");
		txtSalario.setForeground(new Color(153, 153, 153));
		txtSalario.setBorder(null);
		txtSalario.setBackground(Color.WHITE);
		txtSalario.setBounds(529, 68, 174, 18);
		contentPane.add(txtSalario);

		separatorSalario = new JSeparator();
		separatorSalario.setForeground(new Color(204, 204, 204));
		separatorSalario.setBackground(new Color(204, 204, 204));
		separatorSalario.setBounds(485, 92, 219, 10);
		contentPane.add(separatorSalario);

		lblEndereco = new JLabel();
		lblEndereco.setText("Endereço");
		lblEndereco.setForeground(new Color(153, 153, 153));
		lblEndereco.setBackground(Color.WHITE);
		lblEndereco.setBounds(10, 114, 57, 16);
		contentPane.add(lblEndereco);

		lblCep = new JLabel();
		lblCep.setText("CEP:");
		lblCep.setForeground(new Color(153, 153, 153));
		lblCep.setBackground(Color.WHITE);
		lblCep.setBounds(10, 143, 28, 16);
		contentPane.add(lblCep);

		txtCep = new JDocumentFormatedField().getCep();
		txtCep.setBorder(null);
		txtCep.setForeground(new Color(153, 153, 153));
		txtCep.setBounds(43, 141, 113, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		txtCep.addFocusListener(this);

		separatorCep = new JSeparator();
		separatorCep.setForeground(new Color(204, 204, 204));
		separatorCep.setBackground(new Color(204, 204, 204));
		separatorCep.setBounds(10, 166, 146, 10);
		contentPane.add(separatorCep);

		lblRua = new JLabel();
		lblRua.setText("Rua:");
		lblRua.setForeground(new Color(153, 153, 153));
		lblRua.setBackground(Color.WHITE);
		lblRua.setBounds(180, 143, 38, 16);
		contentPane.add(lblRua);

		txtRua = new JTextField();
		txtRua.setForeground(new Color(153, 153, 153));
		txtRua.setBorder(null);
		txtRua.setBackground(Color.WHITE);
		txtRua.setBounds(216, 142, 251, 18);
		contentPane.add(txtRua);

		separatorRua = new JSeparator();
		separatorRua.setForeground(new Color(204, 204, 204));
		separatorRua.setBackground(new Color(204, 204, 204));
		separatorRua.setBounds(180, 166, 287, 10);
		contentPane.add(separatorRua);

		lblBairro = new JLabel();
		lblBairro.setText("Bairro:");
		lblBairro.setForeground(new Color(153, 153, 153));
		lblBairro.setBackground(Color.WHITE);
		lblBairro.setBounds(485, 143, 45, 16);
		contentPane.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setToolTipText("");
		txtBairro.setForeground(new Color(153, 153, 153));
		txtBairro.setBorder(null);
		txtBairro.setBackground(Color.WHITE);
		txtBairro.setBounds(529, 142, 174, 18);
		contentPane.add(txtBairro);

		separatorBairro = new JSeparator();
		separatorBairro.setForeground(new Color(204, 204, 204));
		separatorBairro.setBackground(new Color(204, 204, 204));
		separatorBairro.setBounds(485, 166, 219, 10);
		contentPane.add(separatorBairro);

		lblNumero = new JLabel();
		lblNumero.setText("Número:");
		lblNumero.setForeground(new Color(153, 153, 153));
		lblNumero.setBackground(Color.WHITE);
		lblNumero.setBounds(10, 185, 50, 16);
		contentPane.add(lblNumero);

		txtNumero = new JNumberField();
		txtNumero.setToolTipText("");
		txtNumero.setForeground(new Color(153, 153, 153));
		txtNumero.setBorder(null);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setBounds(61, 184, 95, 18);
		contentPane.add(txtNumero);

		separatorNumero = new JSeparator();
		separatorNumero.setForeground(new Color(204, 204, 204));
		separatorNumero.setBackground(new Color(204, 204, 204));
		separatorNumero.setBounds(10, 212, 146, 10);
		contentPane.add(separatorNumero);

		lblCidade = new JLabel();
		lblCidade.setText("Cidade:");
		lblCidade.setForeground(new Color(153, 153, 153));
		lblCidade.setBackground(Color.WHITE);
		lblCidade.setBounds(180, 185, 49, 16);
		contentPane.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setToolTipText("");
		txtCidade.setForeground(new Color(153, 153, 153));
		txtCidade.setBorder(null);
		txtCidade.setBackground(Color.WHITE);
		txtCidade.setBounds(229, 184, 113, 18);
		contentPane.add(txtCidade);

		separatorCidade = new JSeparator();
		separatorCidade.setForeground(new Color(204, 204, 204));
		separatorCidade.setBackground(new Color(204, 204, 204));
		separatorCidade.setBounds(180, 212, 162, 10);
		contentPane.add(separatorCidade);

		lblUf = new JLabel();
		lblUf.setText("UF:");
		lblUf.setForeground(new Color(153, 153, 153));
		lblUf.setBackground(Color.WHITE);
		lblUf.setBounds(366, 185, 17, 16);
		contentPane.add(lblUf);

		txtUf = new JTextField();
		txtUf.setToolTipText("");
		txtUf.setForeground(new Color(153, 153, 153));
		txtUf.setBorder(null);
		txtUf.setBackground(Color.WHITE);
		txtUf.setBounds(386, 184, 81, 18);
		contentPane.add(txtUf);

		separatorUf = new JSeparator();
		separatorUf.setForeground(new Color(204, 204, 204));
		separatorUf.setBackground(new Color(204, 204, 204));
		separatorUf.setBounds(366, 212, 101, 10);
		contentPane.add(separatorUf);

		lblTelefone = new JLabel();
		lblTelefone.setText("Telefone:");
		lblTelefone.setForeground(new Color(153, 153, 153));
		lblTelefone.setBackground(Color.WHITE);
		lblTelefone.setBounds(485, 185, 52, 16);
		contentPane.add(lblTelefone);

		txtTelefone = new JDocumentFormatedField().getTel();
		txtTelefone.setBorder(null);
		txtTelefone.setBounds(542, 183, 162, 20);
		txtTelefone.setForeground(new Color(153, 153, 153));
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		separatorTelefone = new JSeparator();
		separatorTelefone.setForeground(new Color(204, 204, 204));
		separatorTelefone.setBackground(new Color(204, 204, 204));
		separatorTelefone.setBounds(485, 212, 219, 10);
		contentPane.add(separatorTelefone);

		lblSenha = new JLabel();
		lblSenha.setText("Senha de Acesso:");
		lblSenha.setForeground(new Color(153, 153, 153));
		lblSenha.setBackground(Color.WHITE);
		lblSenha.setBounds(10, 229, 105, 16);
		contentPane.add(lblSenha);

		txtSenha = new JNumberField();
		txtSenha.setEditable(false);
		txtSenha.setToolTipText("");
		txtSenha.setForeground(new Color(153, 153, 153));
		txtSenha.setBorder(null);
		txtSenha.setBackground(Color.WHITE);
		txtSenha.setBounds(116, 228, 113, 18);
		contentPane.add(txtSenha);

		separatorSenha = new JSeparator();
		separatorSenha.setForeground(new Color(204, 204, 204));
		separatorSenha.setBackground(new Color(204, 204, 204));
		separatorSenha.setBounds(10, 252, 219, 10);
		contentPane.add(separatorSenha);

		btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setForeground(new Color(153, 153, 153));
		btnSalvar.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(10, 287, 80, 39);
		contentPane.add(btnSalvar);
		btnSalvar.addActionListener(this);
		
		label_13 = new JLabel();
		label_13.setText("Confirmação");
		label_13.setBounds(99, 298, 73, 16);
		contentPane.add(label_13);

		label_14 = new JLabel();
		label_14.setText("Navegação:");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Dialog", Font.BOLD, 14));
		label_14.setBounds(37, 326, 100, 23);
		contentPane.add(label_14);

		btnInici = new JButton("Início");
		btnInici.setHorizontalAlignment(SwingConstants.LEFT);
		btnInici.setForeground(Color.BLACK);
		btnInici.setBorder(null);
		btnInici.setBackground(Color.WHITE);
		btnInici.setBounds(15, 349, 57, 23);
		contentPane.add(btnInici);
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
		contentPane.add(btnCadastroDepartamentos);
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
		contentPane.add(btnCadastroFuncionario);
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
		contentPane.add(btnCadastroProjetos);
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
		contentPane.add(btnCadastroDependentes);
		btnCadastroDependentes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroDependentes().setVisible(true);
				dispose();
				
			}
		});

		lblfuncinario = new JLabel();
		lblfuncinario.setIcon(new ImageIcon(CadastroFuncionario.class.getResource("/imgs/backfuncionario.png")));
		lblfuncinario.setHorizontalAlignment(SwingConstants.CENTER);
		lblfuncinario.setForeground(new Color(0, 204, 0));
		lblfuncinario.setBackground(new Color(0, 204, 0));
		lblfuncinario.setBounds(0, 208, 800, 270);
		contentPane.add(lblfuncinario);
	}
	
	private void validaCpf() {
		boolean valido = ValidaCNP.isValidCPF(txtCpf.getText());
		if(!valido) {
			separatorCpf.setBackground(Color.RED);
			txtCpf.setText("");
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		if(e.getSource() == txtCpf) {
			separatorCpf.setBackground(new Color(204, 204, 204));
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource() == txtCep) {
			ConsultaCep consulta = new ConsultaCep(txtCep.getText().replace("     -   ", ""));
			if(consulta != null) {
				txtRua.setText(consulta.getLogradouro());
				txtBairro.setText(consulta.getBairro());
				txtCidade.setText(consulta.getCidade());
				txtUf.setText(consulta.getEstado());
				txtSenha.setText(String.valueOf(GerarSenha.retornaSenha()));
			}
		}else if(e.getSource() == txtCpf) {
			validaCpf();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == btnSalvar) {
			Funcionario funcionario = new Funcionario();
			funcionario.setCpf(Long.parseLong(txtCpf.getText().replace("-", "").replace(".", "")));
			funcionario.setNome(txtNome.getText());
			funcionario.setRua(txtRua.getText());
			funcionario.setBairro(txtBairro.getText());
			funcionario.setNumeroEnd(Integer.parseInt(txtNumero.getText()));
			funcionario.setCidade(txtCidade.getText());
			funcionario.setUf(txtUf.getText());
			funcionario.setTelefone(Long.parseLong(txtTelefone.getText().replace("(", "").replace(")", "").replace("-", "")));
			funcionario.setSalario(Double.parseDouble(txtSalario.getText().replace(",", ".")));
			funcionario.setCodigo_departamento(0);
			funcionario.setCodigo_departamentoGerenciar(0);
			funcionario.setSenha(Integer.parseInt(txtSenha.getText()));
			
			try {
				new FuncionarioController().cadastrarFuncionario(funcionario);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}