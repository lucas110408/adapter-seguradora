package adapter;

public class ClassificacaoAdapter extends ClassificacaoPontuacao {

    private IClassificacao classificacaoLetra;

    public ClassificacaoAdapter(IClassificacao classificacaoLetra) {
        this.classificacaoLetra = classificacaoLetra;
    }

    public String recuperarClassificacao() {
        if (this.getPontuacao() >= 900.0f)
            classificacaoLetra.setClassificacao("A");
        else
            if (this.getPontuacao() >= 700.0f)
                classificacaoLetra.setClassificacao("B");
            else
                if (this.getPontuacao() >= 500.0f)
                    classificacaoLetra.setClassificacao("C");
                else
                    classificacaoLetra.setClassificacao("D");
        return classificacaoLetra.getClassificacao();
    }

    public void salvarClassificacao() {
        if (classificacaoLetra.getClassificacao().equals("A"))
            this.setPontuacao(900.0f);
        else
            if (classificacaoLetra.getClassificacao().equals("B"))
                this.setPontuacao(700.0f);
            else
                if (classificacaoLetra.getClassificacao().equals("C"))
                    this.setPontuacao(500.0f);
                else
                    this.setPontuacao(0.0f);
    }
}
