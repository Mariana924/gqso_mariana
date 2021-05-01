package com.mariana.banco;

public class ContaBancaria {
    
    private double saldo = 50;

    public double sacar( double v){

        setSaldo(saldo() - v);
 
        return saldo();

        
    }
    

    public double saldo() {
        return this.saldo;
    }

    private void setSaldo(double v) {
        this.saldo = v;
    }
}
