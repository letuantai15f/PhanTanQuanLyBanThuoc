package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;

public class frmQuanLyThuoc extends JPanel {

	private JFrame frame;
	private JTextField jtftim;
	private JTable table;
	private JTextField jtftenthuoc;
	private JTextField jtfloaithuoc;
	private JTextField jtfsoluong;
	private JTextField jtfdongia;
	private JTextField jtftenncc;
	private JTextField jtfdiachi;
	private JTextField jtfnuocsx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
					frmQuanLyThuoc window = new frmQuanLyThuoc();
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
	public frmQuanLyThuoc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1031, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		setLayout(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 0));
		panel_1.setBounds(0, 0, 1370, 700);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtim = new JButton("Tìm");
		jbtim.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtim.setBackground(new Color(41, 242, 255));
//		jbtim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jbtim.setBounds(836, 41, 93, 33);
		panel_1.add(jbtim);
		
		JButton jbthem = new JButton("Thêm");
		jbthem.setBackground(Color.CYAN);
		jbthem.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbthem.setForeground(Color.BLACK);
		jbthem.setBounds(359, 270, 107, 33);
		panel_1.add(jbthem);
		
		JButton jbxoa = new JButton("Xóa");
		jbxoa.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbxoa.setBackground(Color.CYAN);
		jbxoa.setBounds(528, 270, 93, 33);
		panel_1.add(jbxoa);
		
		JButton jbsua = new JButton("Sửa");
		jbsua.setBackground(Color.CYAN);
		jbsua.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbsua.setBounds(693, 270, 89, 33);
		panel_1.add(jbsua);
		
		JButton jblammoi = new JButton("Làm mới");
		jblammoi.setBackground(Color.CYAN);
		jblammoi.setFont(new Font("Tahoma", Font.BOLD, 15));
		jblammoi.setBounds(845, 270, 107, 33);
		panel_1.add(jblammoi);
		
		JLabel jlbtimkiemthuoc = new JLabel("Tìm kiếm:");
		jlbtimkiemthuoc.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbtimkiemthuoc.setBounds(465, 44, 114, 32);
		panel_1.add(jlbtimkiemthuoc);
		
		JLabel jlbQuanLyThuoc = new JLabel("Quản lý thuốc");
		jlbQuanLyThuoc.setFont(new Font("Tahoma", Font.BOLD, 39));
		jlbQuanLyThuoc.setBounds(10, 29, 333, 48);
		panel_1.add(jlbQuanLyThuoc);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 310, 979, 372);
		String column[] = { "Mã thuốc","Tên thuốc","Loại thuốc", "Ngày SX","Hạn SD","Đơn giá","Số lượng","Tên NCC","Địa chỉ","Nước SX"};
		DefaultTableModel modelthuoc = new DefaultTableModel(column, 0);
		
		JLabel jlbtenthuoc = new JLabel("Tên thuốc:");
		jlbtenthuoc.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbtenthuoc.setBounds(31, 115, 107, 32);
		panel_1.add(jlbtenthuoc);
		
		JLabel jlbloaithuoc = new JLabel("Loại thuốc:");
		jlbloaithuoc.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbloaithuoc.setBounds(359, 115, 114, 32);
		panel_1.add(jlbloaithuoc);
		
		JLabel jlbsoluong = new JLabel("Số lượng:");
		jlbsoluong.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbsoluong.setBounds(703, 117, 120, 26);
		panel_1.add(jlbsoluong);
		
		JLabel jlbdongia = new JLabel("Đơn giá:");
		jlbdongia.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbdongia.setBounds(31, 170, 93, 32);
		panel_1.add(jlbdongia);
		
		JLabel jlbtenncc = new JLabel("Tên NCC:");
		jlbtenncc.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbtenncc.setBounds(31, 225, 102, 27);
		panel_1.add(jlbtenncc);
		
		JLabel jlbngaysx = new JLabel("Ngày SX:");
		jlbngaysx.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbngaysx.setBounds(359, 167, 93, 32);
		panel_1.add(jlbngaysx);
		
		JLabel jtxdiachi = new JLabel("Địa chỉ:");
		jtxdiachi.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxdiachi.setBounds(359, 221, 80, 32);
		panel_1.add(jtxdiachi);
		
		JLabel jlbhansd = new JLabel("Hạn SD:");
		jlbhansd.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbhansd.setBounds(701, 172, 81, 32);
		panel_1.add(jlbhansd);
		
		JLabel jlbnuocsx = new JLabel("Nước SX:");
		jlbnuocsx.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbnuocsx.setBounds(701, 223, 93, 32);
		panel_1.add(jlbnuocsx);
		
		JDateChooser jdatehansd = new JDateChooser();
		jdatehansd.setBounds(803, 170, 178, 32);
		jdatehansd.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jdatehansd);
		
		JDateChooser jdatengaysx = new JDateChooser();
		jdatengaysx.setBounds(473, 170, 190, 32);
		jdatengaysx.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jdatengaysx);
		
		jtftenthuoc = new JTextField();
		jtftenthuoc.setBounds(145, 113, 172, 32);
		jtftenthuoc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtftenthuoc);
		jtftenthuoc.setColumns(10);
		
		jtfloaithuoc = new JTextField();
		jtfloaithuoc.setBounds(473, 114, 190, 32);
		jtfloaithuoc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtfloaithuoc);
		jtfloaithuoc.setColumns(10);
		
		jtfsoluong = new JTextField();
		jtfsoluong.setBounds(803, 111, 178, 32);
		jtfsoluong.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtfsoluong);
		jtfsoluong.setColumns(10);
		
		jtfdongia = new JTextField();
		jtfdongia.setBounds(143, 168, 172, 32);
		jtfdongia.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtfdongia);
		jtfdongia.setColumns(10);
		
		jtftenncc = new JTextField();
		jtftenncc.setBounds(142, 223, 172, 32);
		jtftenncc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtftenncc);
		jtftenncc.setColumns(10);
		
		jtfdiachi = new JTextField();
		jtfdiachi.setBounds(473, 222, 189, 32);
		jtfdiachi.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtfdiachi);
		jtfdiachi.setColumns(10);
		
		jtfnuocsx = new JTextField();
		jtfnuocsx.setBounds(803, 221, 178, 32);
		jtfnuocsx.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtfnuocsx);
		jtfnuocsx.setColumns(10);
		panel_1.add(scrollPane);
		
		table = new JTable(modelthuoc);
		scrollPane.setViewportView(table);
		
		jtftim = new JTextField();
		jtftim.setBounds(573, 40, 228, 32);
		jtftim.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(jtftim);
		jtftim.setColumns(10);
		
		JLabel jlbbg = new JLabel("");
		jlbbg.setIcon(new ImageIcon("C:\\Users\\Tai\\Desktop\\PhanTanQuanLyBanThuoc\\img\\bgbutton2.jpg"));
		jlbbg.setBounds(0, 0, 1025, 700);
		panel_1.add(jlbbg);
		
		
//		
	add(panel_1);
	}
}
