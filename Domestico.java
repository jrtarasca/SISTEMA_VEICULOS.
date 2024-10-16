public class Domestico extends Automovel {

    private int qtdPassageiros;
    private String tipoFreio;
    private String airbag; 

    // Construtor
    public Domestico(String modelo, String anoFab, String montadora, String cor, double km,
                     int qtdPassageiros, String tipoFreio, String airbag) {
        super(modelo, anoFab, montadora, cor, km);  // Chama o construtor da classe mãe Automovel
        this.qtdPassageiros = qtdPassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;  
    }

    // Getters e Setters
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public String getAirbag() { 
        return airbag;
    }

    public void setAirbag(String airbag) {  // Define o valor como String
        this.airbag = airbag;
    }
    public String status() {
        return "insert into " + this.getClass().getSimpleName() + 
               "(modelo, anoFab, montadora, cor, km, qtdPassageiros, tipoFreio, airbag) values ('" +
               getModelo() + "', '" + getAnoFab() + "', '" + getMontadora() + "', '" +
               getCor() + "', " + getKm() + ", " + qtdPassageiros + ", '" +
               tipoFreio + "', '" + airbag + "');";
    }
}
