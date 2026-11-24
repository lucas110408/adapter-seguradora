package adapter;

public class ClassificacaoLetra implements IClassificacao {

    private String letra;

    @Override
    public String getClassificacao() {
        return this.letra;
    }

    @Override
    public void setClassificacao(String letra) {
        this.letra = letra;
    }
}
