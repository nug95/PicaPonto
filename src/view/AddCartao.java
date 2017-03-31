package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Choice;

public class AddCartao extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCartao frame = new AddCartao();
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
	public AddCartao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome de Login do Cliente:");
		label.setBounds(30, 14, 185, 14);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(225, 36, 180, 20);
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("Primeiro nome:");
		label_1.setBounds(30, 39, 185, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Ultimo nome:");
		label_2.setBounds(30, 64, 185, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Morada:");
		label_3.setBounds(30, 89, 185, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Contacto:");
		label_4.setBounds(30, 114, 185, 14);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(225, 111, 180, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(225, 86, 180, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(225, 61, 180, 20);
		contentPane.add(textField_4);
		
		JButton btn_associar = new JButton("Associar Cart\u00E3o");
		btn_associar.setBounds(67, 167, 145, 23);
		contentPane.add(btn_associar);
		
		JButton btn_limpar = new JButton("Limpar Campos");
		btn_limpar.setBounds(222, 167, 145, 23);
		contentPane.add(btn_limpar);
		
		Choice choice = new Choice();
		choice.setBounds(225, 8, 180, 20);
		contentPane.add(choice);
		
		JLabel lblNumeroDoCartao = new JLabel("Numero do Cartao:");
		lblNumeroDoCartao.setBounds(30, 142, 185, 14);
		contentPane.add(lblNumeroDoCartao);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(225, 139, 180, 20);
		contentPane.add(textField);
	}
}
