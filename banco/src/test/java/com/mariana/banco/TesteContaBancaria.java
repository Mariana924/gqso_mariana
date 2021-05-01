package com.mariana.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.mariana.banco.ContaBancaria.SaldoInsuficiente;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteContaBancaria {
    
    ContaBancaria contaBancaria;

    @BeforeEach
    public void setUp(){
        contaBancaria = new ContaBancaria();
    }
       

    @Test
    public void testeSacar() throws SaldoInsuficiente {
    assertEquals(contaBancaria.saldo() - 50, contaBancaria.sacar(300));
    assertThrows(ContaBancaria.SaldoInsuficiente.class, () -> contaBancaria.sacar(300));

}
