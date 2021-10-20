package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;

public class frmQuanLyKhachHang extends JPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmQuanLyKhachHang window = new frmQuanLyKhachHang();
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
	public frmQuanLyKhachHang() {
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
		panel_1.setBackground(new Color(153, 255, 153));
		panel_1.setBounds(0, 0, 1031, 700);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("QLKH");
		btnNewButton.setBounds(457, 392, 330, 153);
		panel_1.add(btnNewButton);
		
		add(panel_1);
	}
}
