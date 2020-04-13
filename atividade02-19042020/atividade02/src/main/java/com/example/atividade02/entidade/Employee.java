package com.example.atividade02.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Employee implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private Integer matricula;
    private String nome;
    private String cargo;
    private String cpf;
    private Double salario;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", cpf=" + cpf + ", matricula=" + matricula + ", nome=" + nome
                + ", salario=" + salario + "]";
    }

    
    

}