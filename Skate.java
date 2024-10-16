public class Skate {

    private String modelo;
    private String marca;
    private String cor;
    private String tipoRodas;  

    // Construtor
    public Skate(String modelo, String marca, String cor, String tipoRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.tipoRodas = tipoRodas;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }

    public String status() {
        return "insert into " + this.getClass().getSimpleName() + 
               "(modelo, marca, cor, tipoRodas) values ('" +
               modelo + "', '" + marca + "', '" + cor + "', '" + tipoRodas + "');";
    }
}

