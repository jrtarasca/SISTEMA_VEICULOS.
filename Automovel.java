class Automovel {

    private String modelo;
    private String anoFab;
    private String montadora;
    private String cor;
    private double km;

    // Construtor com os parâmetros do automóvel
    public Automovel(String modelo, String anoFab, String montadora, String cor, double km) {
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.montadora = montadora;
        this.cor = cor;
        this.km = km;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    // Método status que retorna as informações do automóvel
    public String status() {
        return "Modelo: " + modelo + ", Ano de Fabricação: " + anoFab + 
               ", Montadora: " + montadora + ", Cor: " + cor + ", Quilometragem: " + km + " km";
    }
}
