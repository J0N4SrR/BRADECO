package rosa.ribeiro.jonas.interfaces;

/**
 * A interface Modem original viola o Princípio da Responsabilidade Única (SRP)
 * porque acumula duas responsabilidades distintas: gerenciar uma conexão telefônica e comunicar dados.
 * Desse forma, a interface foi substituída por {@link GerenciaConexao} e {@link ComunicaDados}.
 */
@Deprecated
public interface Modem {
    void dial(String pno);
    void hangup();
    void send(char c);
    char recv();
}
