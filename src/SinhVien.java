import java.util.Scanner;
/*
 * Người tạo: Trần Quốc Cường
 * Ngày tạo: 18/12/2022
 * Mục đích: 
 */
public class SinhVien {
	//1.Các thuộc tính
	private String tenSV;
	private String maSV;
	private float diemToan;
	private float diemLi;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;
	
	//2. Các phương thức get, set
	public String getTenSV() {
		return this.tenSV;
	}
	public void setTenSV(String ten) {
		this.tenSV = ten;
	}
	public String getMaSV() {
		return this.maSV;
	}
	public void setMaSV(String ma) {
		this.maSV = ma;
	}
	public float getDiemToan() {
		return this.diemToan;
	}
	public void setDiemToan(float toan) {
		this.diemToan = toan;
	}
	public float getDiemLi() {
		return this.diemLi;
	}
	public void setDiemLi(float li) {
		this.diemLi = li;
	}
	public float getDiemHoa() {
		return this.diemHoa;
	}
	public void setDiemHoa(float hoa) {
		this.diemHoa = hoa;
	}
	
	//3. Các phương thức khởi tạo
	public SinhVien() {
	}
	public SinhVien(String ten, String ma, float toan, float li, float hoa) {
		this.tenSV = ten;
		this.maSV = ma;
		this.diemToan = toan;
		this.diemLi = li;
		this.diemHoa = hoa;
	}
	//4. Các phương thức nhập, xuất
	public void nhap(Scanner scan) {
		System.out.print("\nNhap ten SV: ");
		tenSV = scan.nextLine();
		System.out.print("\nNhap ma SV: ");
		maSV = scan.nextLine();
		System.out.print("\nNhap diem toan: ");
		diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("\nNhap diem li: ");
		diemLi = Float.parseFloat(scan.nextLine());
		System.out.print("\nNhap diem hoa: ");
		diemHoa = Float.parseFloat(scan.nextLine());
	}
	public void xuat() {
		System.out.println("Sinh viên: " + tenSV + "\t Điểm TB: " + diemTB + "\t Xếp loại: "+ xepLoai);
	}
	//5. Các nghiệp vụ
	public void tinhDiemTB() {
		this.diemTB = (diemToan + diemLi + diemHoa)/3; 
	}
	public void xepLoai() {
		if(this.diemTB >= 9) {
			this.xepLoai = "Xuất sắc"; 
		}else if(this.diemTB >= 8 ) {
			this.xepLoai = "Giỏi";
		}else if(this.diemTB >= 7 ) {
			this.xepLoai = "Khá";
		}else if(this.diemTB >= 6 ) {
			this.xepLoai = "Trung bình khá";
		}else if(this.diemTB >= 5 ) {
			this.xepLoai = "Trung bình";
		}else {
			this.xepLoai = "Yếu";
		}
	}

}
