package com.example;

import org.bson.types.ObjectId;
import java.util.List;
import java.util.ArrayList;

public class Funcionario {
    private ObjectId id;
    private String nome;
    private String setor;
    private String cargo;
    private List<Treinamento> treinamentos = new ArrayList<>();

    public Funcionario() {
        // Construtor vazio
    }

    public Funcionario(String nome, String setor, String cargo) throws Exception{
        if(nome == null || nome.isEmpty()){
            throw new Exception("Nome não pode ser nulo ou vazio");
        }
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Treinamento> getTreinamentos(){
        return treinamentos;
    }

    public void setTreinamentos(List<Treinamento> treinamentos){
        this.treinamentos = treinamentos;
    }
} 