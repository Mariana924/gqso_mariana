package com.mariana.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteContaBancaria {
    
    ContaBancaria contaBancaria;

    @Test
    public void testeSaque() {
    assertEquals(50, contaBancaria.sacar(50));

}
