// 
// Decompiled by Procyon v0.5.36
// 

package view;

import java.util.Iterator;
import vn.edu.ptit.Subject;
import vn.edu.ptit.Invoice;

public class InvoiceView
{
    public static void show(final Invoice invoice) {
        System.out.println("Mã sinh viên: " + invoice.getSt().getCode());
		System.out.println("Họ tên: " + invoice.getSt().getName());
		System.out.println("Các môn học:");
		for(final Subject subject: invoice.getAlSubject()) {
			System.out.println(subject);
		}
		System.out.println("Học phí phải nộp là: " + invoice.getAmount());
		System.out.println("Theo QĐ: " + invoice.getRule().getCode());
    }
}
