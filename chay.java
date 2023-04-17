package baitap;

import java.util.Scanner;

public class chay {
	private static Scanner sc;
	public static void main(String[]args)
	{
		SinhVienNhap a = new SinhVienNhap();
		SinhVienNhap b ;
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			a.menu();
			n=sc.nextInt();
			switch(n)
			{
			case 1: 
			{
				b = new SinhVienNhap();
				a.nhapSinhvien(b);
				break;
			}
			case 2:
			{
				b=new SinhVienNhap();
				a.xuatSinhVien(b);
				break;
			}
			default:
				break;
			}
			}
			while(n!=0);
		}
		}

