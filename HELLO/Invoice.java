// 
// Decompiled by Procyon v0.5.36
// 

package vn.edu.ptit;

import java.util.ArrayList;

public class Invoice
{
    private int id;
    private Rule rule;
    private Student st;
    private ArrayList<Subject> alSubject;
    private double amount;
    
    public Invoice(final Rule rule) {
        this.rule = rule;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public Rule getRule() {
        return this.rule;
    }
    
    public void setRule(final Rule rule) {
        this.rule = rule;
    }
    
    public Student getSt() {
        return this.st;
    }
    
    public void setSt(final Student st) {
        this.st = st;
    }
    
    public ArrayList<Subject> getAlSubject() {
        return this.alSubject;
    }
    
    public void setAlSubject(final ArrayList<Subject> alSubject) {
        this.alSubject = alSubject;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    public void setAmount(final double amount) {
        this.amount = amount;
    }
}
