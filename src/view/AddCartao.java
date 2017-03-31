package view;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.GereCartao;
import controller.GereCliente;

public class AddCartao extends JFrame {

	private JPanel contentPane;
	private JTextField txt_pnome;
	private JTextField txt_contacto;
	private JTextField txt_morada;
	private JTextField txt_unome;
	private JTextField txt_cartao;

	private GereCliente gc;
	private String		guardaNome;
	
	
	/**
	 * Create the frame.
	 */
	public AddCartao(GereCliente gcc) {
		
		gc = gcc;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome de Login do Cliente:");
		label.setBounds(30, 14, 185, 14);
		contentPane.add(label);

		
		Choice choice = new Choice();
		choice.setBounds(225, 8, 180, 20);
		
		txt_pnome = new JTextField();
		txt_pnome.setEditable(false);
		txt_pnome.setColumns(10);
		txt_pnome.setBounds(225, 36, 180, 20);
		contentPane.add(txt_pnome);
		
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
		
		txt_contacto = new JTextField();
		txt_contacto.setEditable(false);
		txt_contacto.setColumns(10);
		txt_contacto.setBounds(225, 111, 180, 20);
		contentPane.add(txt_contacto);
		
		txt_morada = new JTextField();
		txt_morada.setEditable(false);
		txt_morada.setColumns(10);
		txt_morada.setBounds(225, 86, 180, 20);
		contentPane.add(txt_morada);
		
		txt_unome = new JTextField();
		txt_unome.setEditable(false);
		txt_unome.setColumns(10);
		txt_unome.setBounds(225, 61, 180, 20);
		contentPane.add(txt_unome);
		
		JButton btn_goBack = new JButton("Sair");
		btn_goBack.setBounds(222, 167, 145, 23);
		contentPane.add(btn_goBack);
		
		JLabel lblNumeroDoCartao = new JLabel("Numero do Cartao:");
		lblNumeroDoCartao.setBounds(30, 142, 185, 14);
		contentPane.add(lblNumeroDoCartao);
		
		txt_cartao = new JTextField();
		txt_cartao.setColumns(10);
		txt_cartao.setBounds(225, 139, 180, 20);
		contentPane.add(txt_cartao);

		for (int i=0; i< gc.getArCliente().size(); i++){
			choice.add(gc.getArCliente().get(i).getUsername());
			guardaNome = gc.getArCliente().get(i).getUsername();
			txt_pnome.setText(gc.getArCliente().get(i).getUsername());
			txt_unome.setText(gc.getArCliente().get(i).getPrimeiro_nome());
			txt_contacto.setText(gc.getArCliente().get(i).getContacto());
			txt_morada.setText(gc.getArCliente().get(i).getMorada());
		}
		contentPane.add(choice);
		
		JButton btn_associar = new JButton("Associar Cart\u00E3o");
		btn_associar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_cartao.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Os campos devem estar todos preenchidos!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
				}else{
					String cartao = txt_cartao.getText();
					GereCartao gcartao = new GereCartao();
					gcartao.addCartao( cartao, guardaNome);
					
					JOptionPane.showMessageDialog(null, 
							"Username: "+guardaNome+
							"\nPrimeiro Nome: "+txt_pnome.getText()+
							"\nUltimo Nome: "+txt_unome.getText()+
							"\nMorada: "+txt_morada.getText()+
							"\nContacto: "+txt_contacto.getText()
							, "Cartão Associado!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn_associar.setBounds(67, 167, 145, 23);
		contentPane.add(btn_associar);
	}
}
