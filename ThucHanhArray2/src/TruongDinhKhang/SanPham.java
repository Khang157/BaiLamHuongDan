package TruongDinhKhang;

public class SanPham {
	private String MaSP,TenSP;
	private Double DonGia;
	public SanPham() {
		this.MaSP = "";
		this.TenSP = "";		
		this.DonGia = 0.0;
	}
	public SanPham(String MaSP, String TenSP, Double DonGia) {
		this.MaSP = MaSP;
		this.TenSP = TenSP;		
		this.DonGia = DonGia;
	}
	public String getMaSP()
	{
		return MaSP;
	}
	public String getTenSP()
	{
		return TenSP;
	}
	public Double getDonGia()
	{
		return DonGia;
	}
	//setter
	void setMaSP(String MaSP)
	{
		this.MaSP = MaSP;
	}
	void setTenSP(String TenSP)
	{
		this.TenSP = TenSP;
	}
	void setDonGia(Double DonGia)
	{
		this.DonGia = DonGia;
	}
}
