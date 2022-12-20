package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable {
	private String ma;
	private String ten;
	private String lop;
	private Date ngaysinh;
	private float gpa;
	
	public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
		this.ma = String.format("B20DCCN%03d", id);
		this.ten = ten;
		this.lop = lop;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
	}
	
}
