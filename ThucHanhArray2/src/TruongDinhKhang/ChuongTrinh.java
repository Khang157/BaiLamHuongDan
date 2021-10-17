package TruongDinhKhang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChuongTrinh {
	private ArrayList<SanPham> nameList = new ArrayList<SanPham>(0);
	private JFrame frmSnPhm;
	private JTextField txtNhapDG;
	private JTextField txtNhapTen;
	private JTextField txtNhapMa;
	private JTextField txtTim;
	private JTextField txtNhapMa1;
	private JTextField txtNhapMa2;
	private JTextField txtNhapTen1;
	private JTextArea AreaShow,AreaSearch;
	private JTextField txtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChuongTrinh window = new ChuongTrinh();
					window.frmSnPhm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChuongTrinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSnPhm = new JFrame();
		frmSnPhm.setTitle("S\u1EA3n ph\u1EA9m");
		frmSnPhm.setBounds(100, 100, 764, 559);
		frmSnPhm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSnPhm.getContentPane().setLayout(null);
		
		JLabel lblNhapMa = new JLabel("M\u00E3SP");
		lblNhapMa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhapMa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapMa.setBounds(10, 30, 52, 14);
		frmSnPhm.getContentPane().add(lblNhapMa);
		
		JLabel lblNhapTen = new JLabel("T\u00EAnSP");
		lblNhapTen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhapTen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapTen.setBounds(194, 30, 46, 14);
		frmSnPhm.getContentPane().add(lblNhapTen);
		
		JLabel lblNhapDG = new JLabel("\u0110\u01A1n gi\u00E1");
		lblNhapDG.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhapDG.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapDG.setBounds(398, 29, 46, 17);
		frmSnPhm.getContentPane().add(lblNhapDG);
		
		txtNhapDG = new JTextField();
		txtNhapDG.setBounds(454, 28, 130, 20);
		frmSnPhm.getContentPane().add(txtNhapDG);
		txtNhapDG.setColumns(10);
		
		txtNhapTen = new JTextField();
		txtNhapTen.setBounds(247, 27, 130, 20);
		frmSnPhm.getContentPane().add(txtNhapTen);
		txtNhapTen.setColumns(10);
		
		txtNhapMa = new JTextField();
		txtNhapMa.setBounds(66, 27, 130, 20);
		frmSnPhm.getContentPane().add(txtNhapMa);
		txtNhapMa.setColumns(10);
		
		JButton btnAdd = new JButton("Th\u00EAmSP");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addList(nameList);
				showList(nameList);
			}
		});
		btnAdd.setBounds(607, 26, 89, 23);
		frmSnPhm.getContentPane().add(btnAdd);
		
		AreaShow = new JTextArea();
		AreaShow.setBounds(131, 183, 453, 199);
		frmSnPhm.getContentPane().add(AreaShow);
		
		JButton btnTim = new JButton("T\u00ECm ki\u1EBFm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x ="Không tìm thấy";		
				for(int i = 0; i< nameList.size(); i++) {
					if(nameList.get(i).getMaSP().equals(txtTim.getText()))
						txtField.setText(nameList.get(i).getMaSP()+ "---" + nameList.get(i).getTenSP() +"---"+nameList.get(i).getDonGia());
				}

			
				
			}
		});
		btnTim.setBounds(209, 112, 89, 23);
		frmSnPhm.getContentPane().add(btnTim);
		
		txtTim = new JTextField();
		txtTim.setBounds(66, 113, 130, 20);
		frmSnPhm.getContentPane().add(txtTim);
		txtTim.setColumns(10);
		
		JPanel panelXoa = new JPanel();
		panelXoa.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "X\u00F3a SP", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelXoa.setBounds(39, 393, 271, 90);
		frmSnPhm.getContentPane().add(panelXoa);
		panelXoa.setLayout(null);
		
		JLabel lblStateX = new JLabel("H\u00E3y nh\u1EADp m\u00E3SP!! ");
		lblStateX.setForeground(Color.RED);
		lblStateX.setBounds(96, 11, 99, 14);
		panelXoa.add(lblStateX);
		
		JButton btnXoa = new JButton("X\u00F3a");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x ="Không tìm thấy";		
				for(int i = 0; i< nameList.size(); i++) {
					if(nameList.get(i).getMaSP().equals(txtNhapMa1.getText()))
					{
						  nameList.remove(i);
						  x = "Đã xóa thành công!!";
						  showList(nameList);
						  lblStateX.setText("Đã xóa!!");
					}					
				}
				JFrame s = new JFrame("Thông báo");
				JOptionPane.showMessageDialog(s, x,"Kết quả",JOptionPane.INFORMATION_MESSAGE);	
			}
		});
		btnXoa.setBounds(96, 56, 89, 23);
		panelXoa.add(btnXoa);
		
		txtNhapMa1 = new JTextField();
		txtNhapMa1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblStateX.setText("Đang đợi");
			}
		});		
		txtNhapMa1.setBounds(66, 25, 145, 20);
		panelXoa.add(txtNhapMa1);
		txtNhapMa1.setColumns(10);
		
		JLabel lblNhapMa1 = new JLabel("M\u00E3SP");
		lblNhapMa1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapMa1.setBounds(10, 28, 46, 14);
		panelXoa.add(lblNhapMa1);
		
		JPanel panelSua = new JPanel();
		panelSua.setLayout(null);
		panelSua.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "S\u1EEDa SP", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelSua.setBounds(362, 393, 334, 90);
		frmSnPhm.getContentPane().add(panelSua);
		
		JLabel lblStateS1 = new JLabel("H\u00E3y nh\u1EADp m\u00E3SP!! ");
		lblStateS1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStateS1.setForeground(Color.RED);
		lblStateS1.setBounds(52, 11, 100, 14);
		panelSua.add(lblStateS1);
		
		JLabel lblStateS2 = new JLabel("H\u00E3y nh\u1EADp t\u00EAnSP!! ");
		lblStateS2.setHorizontalAlignment(SwingConstants.CENTER);
		lblStateS2.setForeground(Color.RED);
		lblStateS2.setBounds(211, 11, 113, 14);
		panelSua.add(lblStateS2);
		
		txtNhapMa2 = new JTextField();
		txtNhapMa2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblStateS1.setText("Đang đợi");
			}
		});
		txtNhapMa2.setBounds(66, 27, 86, 20);
		panelSua.add(txtNhapMa2);
		txtNhapMa2.setColumns(10);
		
		txtNhapTen1 = new JTextField();
		txtNhapTen1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblStateS2.setText("Đang đợi");
			}
		});
		txtNhapTen1.setColumns(10);
		txtNhapTen1.setBounds(224, 27, 100, 20);
		panelSua.add(txtNhapTen1);
		
		
		
		JButton btnSua = new JButton("S\u1EEDa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x ="Không tìm thấy";		
				for(int i = 0; i< nameList.size(); i++) {
					if (nameList.get(i).getMaSP().equals(txtNhapMa2.getText())) {
						x = "Đã đổi tên sản phẩm";
						nameList.get(i).setTenSP(txtNhapTen1.getText());
						showList(nameList);
						lblStateS2.setText("Đổi thành công!!");
					}		
				}		
				JFrame s = new JFrame("Thông báo");
				JOptionPane.showMessageDialog(s, x,"Kết quả",JOptionPane.INFORMATION_MESSAGE);	
			}
		});
		btnSua.setBounds(127, 58, 89, 23);
		panelSua.add(btnSua);
		
		JLabel lblNhapTen1 = new JLabel("T\u00EAnSP");
		lblNhapTen1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapTen1.setBounds(170, 30, 46, 14);
		panelSua.add(lblNhapTen1);
		
		JLabel lblNhapMa2 = new JLabel("M\u00E3SP");
		lblNhapMa2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapMa2.setBounds(10, 30, 46, 14);
		panelSua.add(lblNhapMa2);
		
		JLabel lblNhapMa_1 = new JLabel("MãSP");
		lblNhapMa_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhapMa_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhapMa_1.setBounds(10, 116, 52, 14);
		frmSnPhm.getContentPane().add(lblNhapMa_1);
		
		txtField = new JTextField();
		txtField.setEditable(false);
		txtField.setBounds(451, 112, 187, 23);
		frmSnPhm.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Bảng hiển thị");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(228, 158, 247, 14);
		frmSnPhm.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kết quả tìm kiếm");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(334, 116, 110, 14);
		frmSnPhm.getContentPane().add(lblNewLabel_1);
	}
	void addList(ArrayList<SanPham> a) {
		String id = txtNhapMa.getText();
		txtNhapMa.setText("");
		String name = txtNhapTen.getText();
		txtNhapTen.setText("");
		Double price = Double.parseDouble(txtNhapDG.getText());
		txtNhapDG.setText("");
		
		SanPham sp = new SanPham(id, name, price);
		a.add(sp);
	}
	void showList (ArrayList<SanPham> a) {
		AreaShow.setText("");
		for(int i=0;i<a.size();i++)
		{
			AreaShow.append("\n"+ a.get(i).getMaSP()+ "---" + a.get(i).getTenSP()+"---" +a.get(i).getDonGia());
		}
	}
}
