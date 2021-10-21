package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class frmMain extends JFrame implements ActionListener  {

	private JFrame frame;
	private JLabel jlbgetngay;
	private Panel pMain;
	frmQuanLyThuoc QuanLyThuoc=new frmQuanLyThuoc();
	frmQuanLyKhachHang frmQuanLyKhachHang=new frmQuanLyKhachHang();
	frmQuanLyNhanVien frmQuanLyNhanVien=new frmQuanLyNhanVien();
	frmQuanLyThongKe frmQuanLyThongKe=new frmQuanLyThongKe();
	
	private JButton jbtquanlykhachhang;
	private JTabbedPane tabbedPane1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
					frmMain window = new frmMain();
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
	public frmMain() {
		initialize();
		getTime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 0, 1285, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(0, 0, 254, 671);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel jlbmenu = new JLabel("MENU");
		jlbmenu.setBounds(60, 11, 130, 60);
		jlbmenu.setFont(new Font("Tahoma", Font.PLAIN, 49));
		jlbmenu.setForeground(new Color(255, 255, 204));
		panel_1.add(jlbmenu);
		
		JButton jbquanlythuoc = new JButton("Quản lý thuốc");
		jbquanlythuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(0);
			}
		});
		jbquanlythuoc.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbquanlythuoc.setBackground(new Color(51, 204, 204));
		jbquanlythuoc.setForeground(new Color(255, 255, 255));
		jbquanlythuoc.setBounds(0, 93, 254, 60);
		panel_1.add(jbquanlythuoc);
		
		JButton jbquanlyhoadon = new JButton("Quản lý hóa đơn");
		jbquanlyhoadon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(1);
			}
		});
		
		jbquanlyhoadon.setForeground(new Color(255, 255, 255));
		jbquanlyhoadon.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbquanlyhoadon.setBackground(new Color(51, 204, 204));
		jbquanlyhoadon.setBounds(0, 165, 254, 60);
		panel_1.add(jbquanlyhoadon);
		
		jbtquanlykhachhang = new JButton("Quản lý khách hàng");
		jbtquanlykhachhang.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbtquanlykhachhang.setForeground(new Color(255, 255, 255));
		jbtquanlykhachhang.setBackground(new Color(51, 204, 204));
		jbtquanlykhachhang.setBounds(0, 237, 254, 60);
		panel_1.add(jbtquanlykhachhang);
		
		JButton jbquanlynhanvien = new JButton("Quản lý nhân viên");
		jbquanlynhanvien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(3);
			}
		});
		jbquanlynhanvien.setBackground(new Color(51, 204, 204));
		jbquanlynhanvien.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbquanlynhanvien.setForeground(new Color(255, 255, 255));
		jbquanlynhanvien.setBounds(0, 310, 254, 60);
		panel_1.add(jbquanlynhanvien);
		
		JButton jbtquanlythongke = new JButton("Quản lý thống kê");
		jbtquanlythongke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(4);
			}
		});
		jbtquanlythongke.setBounds(0, 383, 254, 60);
		panel_1.add(jbtquanlythongke);
		jbtquanlythongke.setForeground(new Color(255, 255, 255));
		jbtquanlythongke.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbtquanlythongke.setBackground(new Color(51, 204, 204));
		
		JButton jbtdangxuat = new JButton("Đăng xuất");
		jbtdangxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			}
		});
		jbtdangxuat.setForeground(new Color(255, 255, 255));
		jbtdangxuat.setBackground(new Color(51, 204, 204));
		jbtdangxuat.setFont(new Font("Tahoma", Font.PLAIN, 21));
		jbtdangxuat.setBounds(0, 600, 254, 60);
		panel_1.add(jbtdangxuat);
		
		JLabel jlbmnv = new JLabel("Mã nhân viên:");
		jlbmnv.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbmnv.setForeground(new Color(255, 255, 255));
		jlbmnv.setBounds(0, 556, 121, 33);
		panel_1.add(jlbmnv);
		
		JLabel jlbgetmanv = new JLabel("NV123");
		jlbgetmanv.setForeground(new Color(255, 255, 255));
		jlbgetmanv.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbgetmanv.setBounds(131, 565, 113, 14);
		panel_1.add(jlbgetmanv);
		
		JLabel jlbngay = new JLabel("Ngày:");
		jlbngay.setForeground(new Color(255, 255, 255));
		jlbngay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbngay.setBounds(0, 522, 59, 23);
		panel_1.add(jlbngay);
		
		 jlbgetngay = new JLabel("");
		jlbgetngay.setForeground(new Color(255, 255, 255));
		jlbgetngay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbgetngay.setBounds(60, 520, 184, 27);
		panel_1.add(jlbgetngay);
		
		 tabbedPane1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane1.setBounds(253, -49, 1026, 715);
		panel.add(tabbedPane1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane1.addTab("New tab", null, QuanLyThuoc, null);
		
		JPanel panel_3 = new JPanel();
		
		frmQuanLyHoaDon frmQuanLyHoaDon = new frmQuanLyHoaDon();
		tabbedPane1.addTab("New tab", null, frmQuanLyHoaDon, null);
		tabbedPane1.addTab("New tab", null, frmQuanLyKhachHang, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane1.addTab("New tab", null, frmQuanLyNhanVien, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane1.addTab("New tab", null,frmQuanLyThongKe , null);
		
		JPanel panel_4 = new JPanel();
		
		
		
		
		jbtquanlykhachhang.addActionListener(this);
		
		
		
	}
	public void getTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		LocalDate now=LocalDate.now();
		String s= now.toString();
		jlbgetngay.setText(s);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(jbtquanlykhachhang)) {
			tabbedPane1.setSelectedIndex(2);
		
//			System.out.println("123");
		}
	}
}
