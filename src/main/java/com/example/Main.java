package com.example;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        FuncionarioDAO dao = new FuncionarioDAO();

        //Inserir funcionário
        Funcionario novo = new Funcionario("Ana", "RH", "Limpeza");
        dao.inserirFuncionario(novo);

        //Listar todos os funcionários
        System.out.println("\nFuncionários cadastrados:");
        for (Funcionario funcionario : dao.listFuncionario()){
            System.out.println(funcionario.getNome() + " " + funcionario.getSetor() + " " + funcionario.getCargo());
        }

        //Buscar por nome
        System.out.println("\nBuscando por nome:");
        Funcionario encontrado = dao.buscarPorNome("João Silva");
        if (encontrado != null){
            System.out.println("ID: " + encontrado.getId());
            System.out.println("Nome: " + encontrado.getNome());
            System.out.println("Setor: " + encontrado.getSetor());
            System.out.println("Cargo: " + encontrado.getCargo());
        }

        //Buscar por ID
        System.out.println("\nBuscando por ID:");
        Funcionario encontrado2 = dao.buscarPorID(encontrado.getId());
        if (encontrado2 != null){
            System.out.println("ID: " + encontrado2.getId());
            System.out.println("Nome: " + encontrado2.getNome());
            System.out.println("Setor: " + encontrado2.getSetor());
            System.out.println("Cargo: " + encontrado2.getCargo());
        }
    }
}