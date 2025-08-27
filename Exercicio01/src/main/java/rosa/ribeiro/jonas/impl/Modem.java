package rosa.ribeiro.jonas.impl;

import rosa.ribeiro.jonas.interfaces.ComunicaDados;
import rosa.ribeiro.jonas.interfaces.GerenciaConexao;

public class Modem implements GerenciaConexao, ComunicaDados {
    private boolean isConnected = false;

    @Override
    public void send(char c) {
        if(!this.isConnected){
         throw new IllegalStateException("Não está conectado, não é possivel comunicar dados...");
        }
        System.out.println("Comunicando dados: " + c);
    }

    @Override
    public char recv() {
        if(!this.isConnected){
            throw new IllegalStateException("Não está conectado, não é possivel comunicar dados...");
        }
        System.out.println("Recebendo dados...");

        return 'A';
    }

    @Override
    public void dial(String pno) {
        System.out.println("Discando para " + pno + "...");
        this.isConnected = true;
    }

    @Override
    public void hangup() {
        System.out.println("Desligando a chamada.");
        this.isConnected = false;
    }
}
