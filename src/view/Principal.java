package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("PicaPonto");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 119);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_admin = new JButton("Administra\u00E7\u00E3o");
		btn_admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddCliente cli = new AddCliente();
				cli.setVisible(true);
				setVisible(false);
				
			}
		});
		btn_admin.setBounds(10, 11, 224, 23);
		contentPane.add(btn_admin);
		
		JButton btn_pc = new JButton("Passar Cart\u00E3o");
		btn_pc.setBounds(10, 45, 224, 23);
		contentPane.add(btn_pc);
	}

}
