package com.example;

public class Treinamento {
    private String Curso;
    private String data;
    private String status;

    public Treinamento(){}

    public Treinamento(String curso, String data, String status){
        this.Curso = curso;
        this.data = data;
        this.status = status;
    }

    public String getCurso(){
        return Curso;
    }

    public void setCurso(String curso){
        this.Curso = curso;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    
}
