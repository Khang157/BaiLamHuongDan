package clc61;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;

public class TruongDinhkhang {

	private JFrame frmCcPhpTon;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	//Quản lý việc chỉ được chọn 1 trong 2 nút ở cùng 1 thời điểm
	private ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TruongDinhkhang window = new TruongDinhkhang();
					window.frmCcPhpTon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TruongDinhkhang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frmCcPhpTon = new JFrame();
		frmCcPhpTon.setForeground(Color.WHITE);
		frmCcPhpTon.setBackground(Color.WHITE);
		frmCcPhpTon.setTitle("Tính chỉ số BMI");
		frmCcPhpTon.setBounds(100, 100, 450, 300);
		frmCcPhpTon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCcPhpTon.getContentPane().setLayout(null);
		
		JLabel lblthongtin = new JLabel("Welcome");
		lblthongtin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblthongtin.setForeground(Color.RED);
		lblthongtin.setHorizontalAlignment(SwingConstants.CENTER);
		lblthongtin.setToolTipText("H\u1EBF l\u00F4");
		lblthongtin.setBounds(72, 11, 292, 49);
		frmCcPhpTon.getContentPane().add(lblthongtin);
		
		txtA = new JTextField();
		txtA.setBounds(90, 71, 86, 20);
		frmCcPhpTon.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(90, 102, 86, 20);
		frmCcPhpTon.getContentPane().add(txtB);
		txtB.setColumns(10);

		
		JLabel lblA = new JLabel("Chiều cao:");
		lblA.setHorizontalAlignment(SwingConstants.TRAILING);
		lblA.setBounds(10, 74, 60, 14);
		frmCcPhpTon.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("Cân nặng:");
		lblB.setHorizontalAlignment(SwingConstants.TRAILING);
		lblB.setBounds(10, 105, 60, 14);
		frmCcPhpTon.getContentPane().add(lblB);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Region", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 0)));
		panel.setBounds(218, 71, 194, 132);
		frmCcPhpTon.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton radNAsian = new JRadioButton("Non Asian");
		radNAsian.setBounds(6, 91, 109, 23);
		panel.add(radNAsian);
		
		JRadioButton radAsian = new JRadioButton("Asian");
		radAsian.setBounds(6, 33, 109, 23);
		panel.add(radAsian);
		
		// Button group
		bg.add(radAsian);
		bg.add(radNAsian);
		
		txtC = new JTextField();
		JLabel lbl5 = new JLabel("");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		JLabel lbl5_1 = new JLabel("");
		lbl5_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl5_1.setBounds(10, 236, 414, 14);
		frmCcPhpTon.getContentPane().add(lbl5_1);
		txtC.setBounds(90, 183, 86, 20);
		frmCcPhpTon.getContentPane().add(txtC);
		txtC.setColumns(10);
		JLabel lblNewLabel = new JLabel("BMI:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(24, 186, 46, 14);
		frmCcPhpTon.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("T\u00EDnh BMI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strA = txtA.getText();
				String strB = txtB.getText();
				// đổi sang con số để tính toán
				double a = Double.parseDouble(strA);
				double b = Double.parseDouble(strB);
				
				float c = (float) (b/(a*a/10000));
			
				txtC.setText(String.valueOf(c));	
				

				
				String lblx = "BMI < 18.5 Bạn hơi gầy nên lưu ý ăn nhiều hơn và tập luyện thể dục !!";
				String lbly = "BMI 18 - 25  Bạn có 1 cơ thế cân đối tiếp tục giữ vững phong độ nhé !!";
				String lblz = "BMI 25 - 30 làm nóng người và cùng nhau bước vào tập luyện để loại bỏ phần thừa";	
				String lblz1 = "cân nào !!";
				String lblm = "BMI 30 - 40 Bạn đang trong giai đoạn béo phì cấp 1 hãy tập luyện thể dục nhiều hơn!!";
				String lbln = "BMI 40 - 50 Đây là lời cảnh cáo đừng lười biến nửa và hãy đứng dạy tập thể dục đi!!";
				String lblk = "BMI > 50 Hãy đi gặp bác sĩ để sinh họ tư vấn nếu bạn không muốn phải nằm trên";
				String lblk1 = "giường bệnh!!!";
				
				String lblyy = "BMI 23 - 25 làm nóng người và cùng nhau bước vào tập luyện để loại bỏ phần thừa";	
				String lblzz = "BMI 25 - 30 Nếu không muốn béo phì tốt nhất bạn nên tập thể dục đi!!";	
				
				if(radNAsian.isSelected() == true){	
					if(c<18.5) {					
						lbl5.setText(lblx);
					}if(c >= 18.5 && c < 25){
						lbl5.setText(lbly);
					}if(c >= 25 && c < 30){
						lbl5.setText(lblz);
						lbl5_1.setText(lblz1);
					}if(c >= 30){
						lbl5.setForeground(Color.RED);
						lbl5_1.setForeground(Color.RED);
						if(c >= 30 && c <= 40){
							lbl5.setText(lblm);
						}if(c > 40 && c < 50){
							lbl5.setText(lbln);
						}if(c > 50){
							lbl5.setText(lblk);
							lbl5_1.setText(lblk1);
						}
					}				
				}
				if(radAsian.isSelected() == true){	
				
					if(c<18.5) {					
						lbl5.setText(lblx);
					}if(c >= 18.5 && c < 23){
						lbl5.setText(lbly);
					}if(c >= 23 && c < 25){
						lbl5.setText(lblyy);
						lbl5_1.setText(lblz1);
					}if(c >= 25 && c < 30){
						lbl5.setText(lblzz);					
					}if(c >= 30){
						lbl5.setForeground(Color.RED);
						lbl5_1.setForeground(Color.RED);
						if(c >= 30 && c <= 40){
							lbl5.setText(lblm);
						}if(c > 40 && c < 50){
							lbl5.setText(lbln);
						}if(c > 50){
							lbl5.setText(lblk);
							lbl5_1.setText(lblk1);
						}
					}				
				}
			}
		}
		);
		btnNewButton.setBounds(90, 148, 86, 20);
		frmCcPhpTon.getContentPane().add(btnNewButton);
		
		
		lbl5.setBounds(10, 214, 414, 20);
		frmCcPhpTon.getContentPane().add(lbl5);
		
	
		
		
		
	}
}
