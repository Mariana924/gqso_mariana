package projetojava;

public class TesteBanco {
    Banco banco;

    @Test
    public void testeDepositar() {
        assertEquals(banco.saldo() + 100, banco.depositar(100));
    }

}