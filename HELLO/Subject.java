// 
// Decompiled by Procyon v0.5.36
// 

package vn.edu.ptit;

public class Subject
{
    private String name;
    private String code;
    private int credit;
    
    public Subject() {
    }
    
    public Subject(final String name, final String code, final int credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public int getCredit() {
        return this.credit;
    }
    
    public void setCredit(final int credit) {
        this.credit = credit;
    }
    
    @Override
    public String toString() {
        return "Subject{name=" + this.name + ", code=" + this.code + ", credit=" + this.credit + '}';
    }
}
