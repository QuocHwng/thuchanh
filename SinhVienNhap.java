package baitap;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienNhap {
	private String maSV;
	private String hoTen;
	private String diaChi;
	private String sDT;
	ArrayList<SinhVienNhap>svn;
	
	public SinhVienNhap()
	{
		svn = new ArrayList<>();
	}
	
	public SinhVienNhap(String maSV, String hoTen, String diaChi, String sDT)
	{
		this.maSV = maSV;
		this.hoTen= hoTen;
		this.diaChi = diaChi;
		this.sDT = sDT;
	}
	
	public String getMaSV()
	{
		return maSV;
	}
	public void setMaSV(String maSV) 
	{
		this.maSV = maSV;
	}
	
	public String getHoTen()
	{
		return hoTen;
	}
	public void setHoTen(String hoTen)
	{
		this.hoTen = hoTen;
	}
	
	public String getDiaChi()
	{
		return diaChi;
	}
	public void setDiaChi(String diaChi)
	{
		this.diaChi = diaChi;
	}
	
	public String getSDT()
	{
		return sDT;
	}
	public void setSDT(String sDT)
	{
		this.sDT = sDT;
	}
	@Override
	public String toString()
	{
		return "Ma Sinh Vien: " + maSV + "Ho Ten: " + hoTen + "Dia chi: " + diaChi + "So dien thoai: " + sDT;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma Sinh Vien:");
		maSV=sc.nextLine();
		System.out.println("Ho Ten: ");
		hoTen=sc.nextLine();
		System.out.println("Dia Chi: ");
		diaChi=sc.nextLine();
		System.out.println("So Dien Thoai: ");
		sDT=sc.nextLine();
	}
	public void hien()
	{
		System.out.println(""+ getMaSV() +"                  "+ getHoTen() + "               " + getDiaChi() + "               " + getSDT());
	}
	public void nhapSinhvien(SinhVienNhap a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("So Luong sinh vien can them: ");
		int n = sc.nextInt();
		for (int i = 0; i<n;i++)
		{
			System.out.println("Sinh vien thu:" + (i+1)+":");
			a.nhap();
			svn.add(a);		}
	}
	
	public void xuatSinhVien(SinhVienNhap a)
	{
		System.out.println("MaSV             "+ "Ho ten           Dia chi          SDT");
				
		for (SinhVienNhap x: svn)
		{
			if (x instanceof SinhVienNhap)
			{
				x.hien();
			}
		}
	}
	
	public void menu()
	{
		System.out.println("Ban muon lam gi?");
		System.out.println("1. Nhap thong tin");
		System.out.println("2. Xuat danh sach sinh vien");
		System.out.println("Nhan phim 0 de thoat");
	}
	
}

