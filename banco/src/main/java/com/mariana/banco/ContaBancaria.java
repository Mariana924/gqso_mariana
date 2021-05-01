package com.mariana.banco;

public class ContaBancaria {
    
    private double saldo = 50;


    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }


    public double sacar( double v) throws SaldoInsuficiente {

        if(saldo< v){
           throw new SaldoInsuficiente();
        }
        setSaldo(saldo() - v);
 
        return saldo();

        
    }
    

    public double saldo() {
        return this.saldo;
    }

    public void setSaldo(double v) {
        this.saldo = v;
    }
}
