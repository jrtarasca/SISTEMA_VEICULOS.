package com.aulas.sistemaVeiculos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class VeiculosCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=======================================");
        System.out.println(" Bem-vindo ao Sistema de Gerenciamento ");
        System.out.println("=======================================");

        try (Connection conexao = ConectDb.conectar()) {
            if (conexao == null) {
                System.err.println("Erro ao conectar ao banco de dados. Encerrando o programa.");
                return;
            }

            while (continuar) {
                // Menu principal
                System.out.println("\n=== Menu Principal ===");
                System.out.println("1. Inserir Veículo");
                System.out.println("2. Atualizar Veículo");
                System.out.println("3. Deletar Veículo");
                System.out.println("4. Listar Veículos");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir o \n

                switch (opcao) {
                    case 1:
                        // Inserir Veículo
                        System.out.println("\n=== Inserir Veículo ===");
                        System.out.println("1. Caminhão");
                        System.out.println("2. Doméstico");
                        System.out.println("3. Motocicleta");
                        System.out.print("Escolha o tipo: ");
                        int tipoInserir = scanner.nextInt();
                        scanner.nextLine(); // Consumir o \n

                        try {
                            comandos.inserirVeiculo(conexao, tipoInserir, scanner);
                        } catch (SQLException e) {
                            System.err.println("Erro ao inserir veículo: " + e.getMessage());
                        }
                        break;

                    case 2:
                        // Atualizar Veículo
                        System.out.println("\n=== Atualizar Veículo ===");
                        System.out.println("1. Caminhão");
                        System.out.println("2. Doméstico");
                        System.out.println("3. Motocicleta");
                        System.out.print("Escolha o tipo: ");
                        int tipoAtualizar = scanner.nextInt();
                        scanner.nextLine(); // Consumir o \n

                        System.out.print("Digite o ID do veículo a ser atualizado: ");
                        int idAtualizar = scanner.nextInt();
                        scanner.nextLine(); // Consumir o \n

                        try {
                            comandos.atualizarVeiculo(conexao, tipoAtualizar, idAtualizar, scanner);
                        } catch (SQLException e) {
                            System.err.println("Erro ao atualizar veículo: " + e.getMessage());
                        }
                        break;

                    case 3:
                        // Deletar Veículo
                        System.out.println("\n=== Deletar Veículo ===");
                        System.out.println("1. Caminhão");
                        System.out.println("2. Doméstico");
                        System.out.println("3. Motocicleta");
                        System.out.print("Escolha o tipo: ");
                        int tipoDeletar = scanner.nextInt();
                        scanner.nextLine(); // Consumir o \n

                        System.out.print("Digite o ID do veículo a ser deletado: ");
                        int idDeletar = scanner.nextInt();
                        scanner.nextLine(); // Consumir o \n

                        try {
                            comandos.deletarVeiculo(conexao, tipoDeletar, idDeletar);
                        } catch (SQLException e) {
                            System.err.println("Erro ao deletar veículo: " + e.getMessage());
                        }
                        break;

                    case 4:
                        // Listar Veículos
                        System.out.println("\n=== Listar Veículos ===");
                        System.out.println("1. Caminhão");
                        System.out.println("2. Doméstico");
                        System.out.println("3. Motocicleta");
                        System.out.print("Escolha o tipo: ");
                        int tipoListar = scanner.nextInt();
                        scanner.nextLine(); // Consumir o \n

                        try {
                            comandos.listarVeiculos(conexao, tipoListar);
                        } catch (SQLException e) {
                            System.err.println("Erro ao listar veículos: " + e.getMessage());
                        }
                        break;

                    case 0:
                        // Sair
                        System.out.println("Encerrando o programa. Até logo!");
                        continuar = false;
                        break;

                    default:
                        System.err.println("Opção inválida, escolha uma opção válida.");
                        break;
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }

        scanner.close();
    }
}
