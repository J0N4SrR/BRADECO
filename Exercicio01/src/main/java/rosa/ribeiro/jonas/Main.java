package rosa.ribeiro.jonas;

import rosa.ribeiro.jonas.impl.Modem;

public class Main {
    public static void main(String[] args) {

        Modem meuModem = new Modem();

        System.out.println("--- Testando Conexão ---");
        meuModem.dial("555-1234");


        System.out.println("\n--- Testando a Comunicação de Dados ---");
        meuModem.send('H');
        meuModem.recv();

        System.out.println("\n--- Finalizando a Conexão ---");
        meuModem.hangup();

        try {
            meuModem.send('X');
        } catch (IllegalStateException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}