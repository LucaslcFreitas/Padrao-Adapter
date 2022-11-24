public class Atestado {
    private IDoenca doenca;
    private DoencaAdapter persistencia;

    public Atestado() {
        doenca = new DoencaNome();
        persistencia = new DoencaAdapter(doenca);
    }

    public void setDoenca(String nome) {
        doenca.setDoenca(nome);
        persistencia.salvarDoenca();
    }

    public String getDoenca() {
        return persistencia.recuperarDoenca();
    }

    // Método apenas para mostrar que está convertendo CID para nome através do adaptador
    public String getCID() {
        return persistencia.getDoenca();
    }
}
