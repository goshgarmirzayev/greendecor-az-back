package com.goshgarmirzayev.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Table(name = "product",schema = "data")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
    private Integer id;
    private String name;
    private String about;
    private double price;
}
