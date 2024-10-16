public class Concessionaria {

    public static void main(String[] args) {

        // Criando instância de Doméstico
        Domestico domestico = new Domestico(
                "Sedan",      
                "200O",        
                "Toyota",     
                "Branco",    
                200000,        
                5,            
                "ABS",         
                "Sim"          
        );

        // Criando instância de Motocicleta
        Motocicleta motocicleta = new Motocicleta(
                "CB1000 RR",     
                "2022",       
                "Honda",      
                "Preta",   
                5000,         
                1000,          
                85.0          
        );

        // Criando instância de Caminhão
        Caminhao caminhao = new Caminhao(
                "Grande",
                "2024",         
                "Mercedes-Benz", 
                "Branco",        
                0,          
                3,               
                16.5            
        );

        // Criando instância de Bicicleta
        Bicicleta bicicleta = new Bicicleta(
                "Mountain Bike", 
                "Caloi",        
                "Preta",         
                "Alumínio",      
                21,            
                "Sim"           
        );

        // Criando instância de Skate
        Skate skate = new Skate(
                "Skate normal",    
                "Supreme", 
                "Azul",      
                "Seca"    
        );

        // Exibindo status dos objetos criados
        System.out.println("Automovel doméstico:");
        System.out.println(domestico.status());

        System.out.println("\nMotocicleta:");
        System.out.println(motocicleta.status());

        System.out.println("\nCaminhão:");
        System.out.println(caminhao.status());

        System.out.println("\nBicicleta:");
        System.out.println(bicicleta.status());

        System.out.println("\nSkate:");
        System.out.println(skate.status());
    }
}
