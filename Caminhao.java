public class Caminhao extends Automovel {

    private int qtdEixos;  // Quantidade de eixos do caminhão
    private double pesoBruto;  // Peso bruto do caminhão (em toneladas)

    // Construtor
    public Caminhao(String modelo, String anoFab, String montadora, String cor, double km,
                    int qtdEixos, double pesoBruto) {
        super(modelo, anoFab, montadora, cor, km);  // Chama o construtor da classe mãe Automovel
        this.qtdEixos = qtdEixos;
        this.pesoBruto = pesoBruto;
    }

    // Getters e Setters
    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    // Método status que retorna as informações do caminhão
    @Override
    public String status() {
               return "inset into " + this.getClass().getSimpleName()+"(modelo,anoFab,montadora,cor,km,qtdEixos,pesoBruto) values ('"+getModelo()+"', "+getAnoFab()+"', "+getMontadora()+"', "+getCor()+"', "+getKm()+"', "+getQtdEixos()+"', "+getPesoBruto()+");";
    }
}
