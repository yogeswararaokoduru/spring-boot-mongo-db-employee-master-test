package com.org.haritha.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
public class Dept implements Serializable {

    @Id
    private int id;
    private String name;
    private String address;
    private String location;


}
