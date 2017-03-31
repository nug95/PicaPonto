package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPrimeiroNome;
	private JTextField textField_1;
	private JLabel lblUltimoNome;
	private JTextField textField_2;
	private JLabel lblMorada;
	private JTextField textField_3;
	private JLabel lblContacto;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCliente frame = new AddCliente();
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
	public AddCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 260);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(225, 27, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomeDoCliente = new JLabel("Nome de Login do Cliente:");
		lblNomeDoCliente.setBounds(30, 30, 185, 14);
		contentPane.add(lblNomeDoCliente);
		
		lblPrimeiroNome = new JLabel("Primeiro nome:");
		lblPrimeiroNome.setBounds(30, 55, 185, 14);
		contentPane.add(lblPrimeiroNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(225, 52, 180, 20);
		contentPane.add(textField_1);
		
		lblUltimoNome = new JLabel("Ultimo nome:");
		lblUltimoNome.setBounds(30, 80, 185, 14);
		contentPane.add(lblUltimoNome);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 77, 180, 20);
		contentPane.add(textField_2);
		
		lblMorada = new JLabel("Morada:");
		lblMorada.setBounds(30, 105, 185, 14);
		contentPane.add(lblMorada);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 102, 180, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblContacto = new JLabel("Contacto:");
		lblContacto.setBounds(30, 130, 185, 14);
		contentPane.add(lblContacto);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(225, 127, 180, 20);
		contentPane.add(textField_4);
		
		JButton btnInserirCliente = new JButton("Inserir Cliente");
		btnInserirCliente.setBounds(67, 166, 145, 23);
		contentPane.add(btnInserirCliente);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(222, 166, 145, 23);
		contentPane.add(btnLimparCampos);
	}
}
