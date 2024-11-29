package com.aulas.sistemaVeiculos;
import java.sql.*;
import java.util.Scanner;

public class comandos {

    public static void inserirVeiculo(Connection conexao, int tipo, Scanner scanner) throws SQLException {
        String sql = null;

        if (tipo == 1) { // Caminhão
            sql = "INSERT INTO Caminhao (modelo, anoFab, montadora, cor, km, qtdEixos, pesoBruto) VALUES (?, ?, ?, ?, ?, ?, ?)";
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano de Fabricação: ");
            int anoFab = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Montadora: ");
            String montadora = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Quilometragem: ");
            double km = scanner.nextDouble();
            System.out.print("Quantidade de Eixos: ");
            int qtdEixos = scanner.nextInt();
            System.out.print("Peso Bruto: ");
            double pesoBruto = scanner.nextDouble();

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, modelo);
                stmt.setInt(2, anoFab);
                stmt.setString(3, montadora);
                stmt.setString(4, cor);
                stmt.setDouble(5, km);
                stmt.setInt(6, qtdEixos);
                stmt.setDouble(7, pesoBruto);
                stmt.executeUpdate();
                System.out.println("Caminhão inserido com sucesso!");
            }
        } else if (tipo == 2) { // Doméstico
            sql = "INSERT INTO Domestico (modelo, anoFab, montadora, cor, km, qtdPassageiro, tipoFreio, airBag) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano de Fabricação: ");
            int anoFab = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Montadora: ");
            String montadora = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Quilometragem: ");
            double km = scanner.nextDouble();
            System.out.print("Quantidade de Passageiros: ");
            int qtdPassageiro = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Tipo de Freio: ");
            String tipoFreio = scanner.nextLine();
            System.out.print("Possui AirBag? (true/false): ");
            boolean airBag = scanner.nextBoolean();

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, modelo);
                stmt.setInt(2, anoFab);
                stmt.setString(3, montadora);
                stmt.setString(4, cor);
                stmt.setDouble(5, km);
                stmt.setInt(6, qtdPassageiro);
                stmt.setString(7, tipoFreio);
                stmt.setBoolean(8, airBag);
                stmt.executeUpdate();
                System.out.println("Veículo doméstico inserido com sucesso!");
            }
        } else if (tipo == 3) { // Motocicleta
            sql = "INSERT INTO Motocicleta (modelo, anoFab, montadora, cor, km, cilindradas, torque) VALUES (?, ?, ?, ?, ?, ?, ?)";
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano de Fabricação: ");
            int anoFab = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Montadora: ");
            String montadora = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Quilometragem: ");
            double km = scanner.nextDouble();
            System.out.print("Cilindradas: ");
            int cilindradas = scanner.nextInt();
            System.out.print("Torque: ");
            double torque = scanner.nextDouble();

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, modelo);
                stmt.setInt(2, anoFab);
                stmt.setString(3, montadora);
                stmt.setString(4, cor);
                stmt.setDouble(5, km);
                stmt.setInt(6, cilindradas);
                stmt.setDouble(7, torque);
                stmt.executeUpdate();
                System.out.println("Motocicleta inserida com sucesso!");
            }
        } else {
            System.err.println("Tipo inválido!");
        }
    }

    public static void atualizarVeiculo(Connection conexao, int tipo, int id, Scanner scanner) throws SQLException {
        String sql = null;

        if (tipo == 1) {
            sql = "UPDATE Caminhao SET modelo = ?, anoFab = ?, montadora = ?, cor = ?, km = ?, qtdEixos = ?, pesoBruto = ? WHERE ID = ?";
        } else if (tipo == 2) {
            sql = "UPDATE Domestico SET modelo = ?, anoFab = ?, montadora = ?, cor = ?, km = ?, qtdPassageiro = ?, tipoFreio = ?, airBag = ? WHERE ID = ?";
        } else if (tipo == 3) {
            sql = "UPDATE Motocicleta SET modelo = ?, anoFab = ?, montadora = ?, cor = ?, km = ?, cilindradas = ?, torque = ? WHERE ID = ?";
        } else {
            System.err.println("Tipo inválido!");
            return;
        }

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoFab = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Montadora: ");
        String montadora = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Quilometragem: ");
        double km = scanner.nextDouble();
        scanner.nextLine();

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, modelo);
            stmt.setInt(2, anoFab);
            stmt.setString(3, montadora);
            stmt.setString(4, cor);
            stmt.setDouble(5, km);
            if (tipo == 1) {
                System.out.print("Quantidade de Eixos: ");
                stmt.setInt(6, scanner.nextInt());
                System.out.print("Peso Bruto: ");
                stmt.setDouble(7, scanner.nextDouble());
            } else if (tipo == 2) {
                System.out.print("Quantidade de Passageiros: ");
                stmt.setInt(6, scanner.nextInt());
                scanner.nextLine();
                System.out.print("Tipo de Freio: ");
                stmt.setString(7, scanner.nextLine());
                System.out.print("Possui AirBag? (true/false): ");
                stmt.setBoolean(8, scanner.nextBoolean());
            } else {
                System.out.print("Cilindradas: ");
                stmt.setInt(6, scanner.nextInt());
                System.out.print("Torque: ");
                stmt.setDouble(7, scanner.nextDouble());
            }
            stmt.setInt(8, id);
            stmt.executeUpdate();
            System.out.println("Veículo atualizado com sucesso!");
        }
    }

    public static void deletarVeiculo(Connection conexao, int tipo, int id) throws SQLException {
        String sql = null;

        if (tipo == 1) sql = "DELETE FROM Caminhao WHERE ID = ?";
        else if (tipo == 2) sql = "DELETE FROM Domestico WHERE ID = ?";
        else if (tipo == 3) sql = "DELETE FROM Motocicleta WHERE ID = ?";
        else {
            System.err.println("Tipo inválido!");
            return;
        }

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            if (linhas > 0) System.out.println("Veículo deletado com sucesso!");
            else System.out.println("ID não encontrado!");
        }
    }

    public static void listarVeiculos(Connection conexao, int tipo) throws SQLException {
        String sql = null;

        if (tipo == 1) sql = "SELECT * FROM Caminhao";
        else if (tipo == 2) sql = "SELECT * FROM Domestico";
        else if (tipo == 3) sql = "SELECT * FROM Motocicleta";
        else {
            System.err.println("Tipo inválido!");
            return;
        }

        try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("Modelo: " + rs.getString("modelo"));
                System.out.println("Ano de Fabricação: " + rs.getInt("anoFab"));
                System.out.println("Montadora: " + rs.getString("montadora"));
                System.out.println("Cor: " + rs.getString("cor"));
                System.out.println("KM: " + rs.getDouble("km"));
                if (tipo == 1) {
                    System.out.println("Quantidade de Eixos: " + rs.getInt("qtdEixos"));
                    System.out.println("Peso Bruto: " + rs.getDouble("pesoBruto"));
                } else if (tipo == 2) {
                    System.out.println("Quantidade de Passageiros: " + rs.getInt("qtdPassageiro"));
                    System.out.println("Tipo de Freio: " + rs.getString("tipoFreio"));
                    System.out.println("AirBag: " + rs.getBoolean("airBag"));
                } else {
                    System.out.println("Cilindradas: " + rs.getInt("cilindradas"));
                    System.out.println("Torque: " + rs.getDouble("torque"));
                }
                System.out.println("=========================");
            }
        }
    }
}
