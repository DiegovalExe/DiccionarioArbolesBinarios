public class Palabra {
    private String espaniol;
    private String ingles;
    private String frances;

    public Palabra(String espaniol, String ingles, String frances) {
        this.espaniol = espaniol;
        this.ingles = ingles;
        this.frances = frances;
    }

    public String getEspaniol() {
        return espaniol;
    }

    public void setEspaniol(String espaniol) {
        this.espaniol = espaniol;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getFrances() {
        return frances;
    }

    public void setFrances(String frances) {
        this.frances = frances;
    }
}
