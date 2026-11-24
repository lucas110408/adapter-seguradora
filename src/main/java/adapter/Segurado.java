package adapter;

public class Segurado {

    IClassificacao classificacao;
    ClassificacaoAdapter persistencia;

    public Segurado() {
        classificacao = new ClassificacaoLetra();
        persistencia = new ClassificacaoAdapter(classificacao);
    }

    public void setClassificacao(String letra) {
        classificacao.setClassificacao(letra);
        persistencia.salvarClassificacao();
    }

    public String getClassificacao() {
        return persistencia.recuperarClassificacao();
    }

    public float getPontuacao() {
        return persistencia.getPontuacao();
    }

}
