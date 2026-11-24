package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguradoTest {

    @Test
    void deveRetornarClassificacaoSegurado() {
        Segurado segurado = new Segurado();
        segurado.setClassificacao("B");

        assertEquals("B", segurado.getClassificacao());
    }

    @Test
    void deveRetornarPontuacaoSegurado() {
        Segurado segurado = new Segurado();
        segurado.setClassificacao("B");

        assertEquals(700.0f, segurado.getPontuacao());
    }

    @Test
    void deveRetornarPontuacaoZeroParaClassificacaoD() {
        Segurado segurado = new Segurado();
        segurado.setClassificacao("D");

        assertEquals(0.0f, segurado.getPontuacao());
    }

}
