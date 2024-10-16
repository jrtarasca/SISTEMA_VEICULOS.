public class Bicicleta {

    private String modelo;
    private String marca;
    private String cor;
    private String material;
    private int qtdMarchas;
    private String amortecedor;  

    // Construtor
    public Bicicleta(String modelo, String marca, String cor, String material, int qtdMarchas, String amortecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.qtdMarchas = qtdMarchas;
        this.amortecedor = amortecedor; 
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public String getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor) {
        this.amortecedor = amortecedor;
    }

    // Método status que retorna as informações da bicicleta
    
    public String status() {
        return "insert into " + this.getClass().getSimpleName() + 
               "(modelo, marca, cor, material, qtdMarchas, amortecedor) values ('" +
               modelo + "', '" + marca + "', '" + cor + "', '" + material + "', " +
               qtdMarchas + ", '" + amortecedor + "');";
    }
}
