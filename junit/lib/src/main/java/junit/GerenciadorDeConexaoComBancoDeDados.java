package junit;

import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {

	private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Person person) {
        //insere pessoa no DB
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Person person) {
        //remove pessoa no DB
        LOGGER.info("removeu dados");
    }
}
