public class DoencaNome implements IDoenca {
    private String nome;

    @Override
    public String getDoenca() {
        return nome;
    }

    @Override
    public void setDoenca(String doenca) {
        this.nome = doenca;
    }
}
