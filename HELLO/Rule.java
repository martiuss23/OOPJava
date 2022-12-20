// 
// Decompiled by Procyon v0.5.36
// 

package vn.edu.ptit;

public class Rule
{
    private String code;
    private String name;
    private double creditPrice;
    
    public Rule(final String code, final String name, final double creditPrice) {
        this.code = code;
        this.name = name;
        this.creditPrice = creditPrice;
    }
    
    public Rule() {
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
    
    public double getCreditPrice() {
        return this.creditPrice;
    }
    
    public void setCreditPrice(final double creditPrice) {
        this.creditPrice = creditPrice;
    }
}
