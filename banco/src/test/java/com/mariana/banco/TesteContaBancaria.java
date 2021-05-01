package com.mariana.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteContaBancaria {
    
    ContaBancaria contaBancaria;

    @BeforeEach
    public void setUp(){
        contaBancaria = new ContaBancaria();
    }
       

    @Test
    public void testeSaque() {
    assertEquals(50, contaBancaria.sacar(50));

}
