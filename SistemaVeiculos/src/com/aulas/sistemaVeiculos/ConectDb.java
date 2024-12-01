package com.aulas.sistemaVeiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectDb {
   
    private static final String URL = "jdbc:mysql://localhost:3306/veiculos";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    // Método para obter conexão com o banco
    public static Connection conectar() {
        Connection conexao = null;
        try {
            //  driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
        return conexao;
    }

    public static void main(String[] args) {
        // Testando a conexão
        conectar();
    }
}
