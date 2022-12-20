package danhsachsinhvien1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream bif = new BufferedInputStream(new FileInputStream("SV.in"));
		ObjectInputStream obi = new ObjectInputStream(bif);
		ArrayList<SinhVien> dsSinhVien = (ArrayList<SinhVien>) obi.readObject();
		for(SinhVien sv : dsSinhVien)
			System.out.println(sv);
	}
}
