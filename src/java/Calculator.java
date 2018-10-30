/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author P003-12
 */
@ManagedBean
@RequestScoped
public class Calculator {

    public Calculator(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long a;
    public long b;
    public long res;

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }
    
    public long getRes() {
        return res;
    }

    public void setRes(long res) {
        this.res = res;
    }

    public void sum() {
        res = a + b;
    }

    public void sub() {
        res = a - b;
    }

    public void mult() {
        res = a * b;
    }

    public void divs() {
        res = a / b;
    }
}
