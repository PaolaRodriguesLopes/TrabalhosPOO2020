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
    private Integer code;
    private String name;
    private String jobPosition;
    private String nationalIdentity;
    private Double salary;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [code=" + code + ", jobPosition=" + jobPosition + ", name=" + name + ", nationalIdentity="
                + nationalIdentity + ", salary=" + salary + "]";
    }

   

    
    

}