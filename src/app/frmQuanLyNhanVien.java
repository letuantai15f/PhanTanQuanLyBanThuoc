package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmQuanLyNhanVien extends JPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmQuanLyNhanVien window = new frmQuanLyNhanVien();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmQuanLyNhanVien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1031, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 1031, 700);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("QLNV");
		btnNewButton.setBounds(262, 159, 289, 136);
		panel_1.add(btnNewButton);
		
		add(panel_1);
	}

}
