package junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfterBeforeTest {

	@BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Person("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Person("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }
}
