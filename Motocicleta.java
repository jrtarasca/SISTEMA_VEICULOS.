public class Motocicleta extends Automovel {

    private int cilindradas;  // Representa o deslocamento do motor (cc)
    private double torque;     // Torque da motocicleta (Nm)

    // Construtor
    public Motocicleta(String modelo, String anoFab, String montadora, String cor, double km,
                       int cilindradas, double torque) {
        super(modelo, anoFab, montadora, cor, km);  // Chama o construtor da classe mãe Automovel
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // Getters e Setters
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    // Método status que retorna as informações da motocicleta
    public String status() {
        return "insert into " + this.getClass().getSimpleName() + 
               "(modelo, anoFab, montadora, cor, km, cilindradas, torque) values ('" +
               getModelo() + "', '" + getAnoFab() + "', '" + getMontadora() + "', '" +
               getCor() + "', " + getKm() + ", " + cilindradas + ", " + torque + ");";
    }
}

