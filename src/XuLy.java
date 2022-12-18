import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		sv.nhap(scan);
		sv.tinhDiemTB();
		sv.xepLoai();
		sv.xuat();
	}

}
