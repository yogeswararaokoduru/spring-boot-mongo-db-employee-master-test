package com.org.haritha.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table
@Setter
@Getter
public class Employee implements Serializable {

    @Id
    private Integer id;
    private String empName;
    private double empAddress;
    private String empPno;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(double empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPno() {
        return empPno;
    }

    public void setEmpPno(String empPno) {
        this.empPno = empPno;
    }
}
