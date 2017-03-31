package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.GereCliente;

public class AddCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JLabel lblPrimeiroNome;
	private JTextField txt_pnome;
	private JLabel lblUltimoNome;
	private JTextField txt_unome;
	private JLabel lblMorada;
	private JTextField txt_morada;
	private JLabel lblContacto;
	private JTextField txt_contacto;
	
	private GereCliente gc;

	/**
	 * Create the frame.
	 */
	public AddCliente(GereCliente gcc) {
		
		gc = gcc;
		
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
		
		txt_username = new JTextField();
		txt_username.setBounds(225, 27, 180, 20);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		JLabel lblNomeDoCliente = new JLabel("Nome de Login do Cliente:");
		lblNomeDoCliente.setBounds(30, 30, 185, 14);
		contentPane.add(lblNomeDoCliente);
		
		lblPrimeiroNome = new JLabel("Primeiro nome:");
		lblPrimeiroNome.setBounds(30, 55, 185, 14);
		contentPane.add(lblPrimeiroNome);
		
		txt_pnome = new JTextField();
		txt_pnome.setColumns(10);
		txt_pnome.setBounds(225, 52, 180, 20);
		contentPane.add(txt_pnome);
		
		lblUltimoNome = new JLabel("Ultimo nome:");
		lblUltimoNome.setBounds(30, 80, 185, 14);
		contentPane.add(lblUltimoNome);
		
		txt_unome = new JTextField();
		txt_unome.setColumns(10);
		txt_unome.setBounds(225, 77, 180, 20);
		contentPane.add(txt_unome);
		
		lblMorada = new JLabel("Morada:");
		lblMorada.setBounds(30, 105, 185, 14);
		contentPane.add(lblMorada);
		
		txt_morada = new JTextField();
		txt_morada.setBounds(225, 102, 180, 20);
		contentPane.add(txt_morada);
		txt_morada.setColumns(10);
		
		lblContacto = new JLabel("Contacto:");
		lblContacto.setBounds(30, 130, 185, 14);
		contentPane.add(lblContacto);
		
		txt_contacto = new JTextField();
		txt_contacto.setColumns(10);
		txt_contacto.setBounds(225, 127, 180, 20);
		contentPane.add(txt_contacto);
		
		JButton btn_addCli = new JButton("Inserir Cliente");
		btn_addCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_username.getText().equals("") || txt_pnome.getText().equals("") || txt_unome.getText().equals("") || txt_morada.getText().equals("") || txt_contacto.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Os campos devem estar todos preenchidos!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
				}else{
					String username = txt_username.getText();
					String pnome	= txt_pnome.getText();
					String unome	= txt_unome.getText();
					String morada	= txt_morada.getText();
					String contato	= txt_contacto.getText();
					
					gc.addCliente(username, pnome, unome, morada, contato);
					
					JOptionPane.showMessageDialog(null, 
							"Utilizador bem inserido!", 
							"Sucesso!", 
							JOptionPane.INFORMATION_MESSAGE
					);
					
					//System.out.printf(gc.getArCliente().get(0).getUsername());

					AddCartao addCartao = new AddCartao(gc);
					addCartao.setVisible(true);
					setVisible(false);
				}
			}
		});
		btn_addCli.setBounds(67, 166, 145, 23);
		contentPane.add(btn_addCli);
		
		JButton btn_cleanFields = new JButton("Limpar Campos");
		btn_cleanFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_username.setText("");
				txt_pnome.setText("");
				txt_unome.setText("");
				txt_morada.setText("");
				txt_contacto.setText("");
			}
		});
		btn_cleanFields.setBounds(222, 166, 145, 23);
		contentPane.add(btn_cleanFields);
	}
}
