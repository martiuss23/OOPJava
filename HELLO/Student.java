// 
// Decompiled by Procyon v0.5.36
// 

package vn.edu.ptit;

public class Student
{
    private String code;
    private String name;
    
    public Student() {
    }
    
    public Student(final String code, final String name) {
        this.code = code;
        this.name = name;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
}
