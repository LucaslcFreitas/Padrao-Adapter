public class DoencaAdapter extends DoencaNome {

    private IDoenca doencaNome;

    public DoencaAdapter(IDoenca doencaNome) {
        this.doencaNome = doencaNome;
    }

    public String recuperarDoenca() {
        if (this.getDoenca().equals("J11.0")){
            doencaNome.setDoenca("Influenza com Pneumonia");
        } else if (this.getDoenca().equals("A90")){
            doencaNome.setDoenca("Dengue");
        } else if (this.getDoenca().equals("B34.2")) {
            doencaNome.setDoenca("Covid-19");
        } else if (this.getDoenca().equals("M51.1")) {
            doencaNome.setDoenca("Transtornos de discos lombares");
        } else if (this.getDoenca().equals("A15")) {
            doencaNome.setDoenca("Tuberculose Respiratória");
        }

        return doencaNome.getDoenca();
    }

    public void salvarDoenca() {
        if (doencaNome.getDoenca().equals("Influenza com Pneumonia")) {
            this.setDoenca("J11.0");
        } else if (doencaNome.getDoenca().equals("Dengue")) {
            this.setDoenca("A90");
        } else if (doencaNome.getDoenca().equals("Covid-19")) {
            this.setDoenca("B34.2");
        } else if (doencaNome.getDoenca().equals("Transtornos de discos lombares")) {
            this.setDoenca("M51.1");
        } else if (doencaNome.getDoenca().equals("Tuberculose Respiratória")) {
            this.setDoenca("A15");
        }
    }
}
