package com.first.test.models;

import javax.persistence.*;

@Entity
@Table(name = "new_table")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "base")
    private String pizzaName;
    @Column(name = "sauce")
    private String pizzaSauce;
    @Column(name = "topping_non_veg")
    private String nonVegTopping;
    @Column(name = "topping_veg")
    private String vegTopping;

    public Pizza(){

    }

    public Pizza(Integer id, String pizzaName, String pizzaSauce, String nonVegTopping, String vegTopping) {
        this.id = id;
        this.pizzaName = pizzaName;
        this.pizzaSauce = pizzaSauce;
        this.nonVegTopping = nonVegTopping;
        this.vegTopping = vegTopping;
    }

    public Pizza(String pizzaName, String pizzaSauce, String nonVegTopping, String vegTopping) {
        this.setPizzaName(pizzaName);
        this.setPizzaSauce(pizzaSauce);
        this.setNonVegTopping(nonVegTopping);
        this.setVegTopping(vegTopping);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaSauce() {
        return pizzaSauce;
    }

    public void setPizzaSauce(String pizzaSauce) {
        this.pizzaSauce = pizzaSauce;
    }

    public String getNonVegTopping() {
        return nonVegTopping;
    }

    public void setNonVegTopping(String nonVegTopping) {
        this.nonVegTopping = nonVegTopping;
    }

    public String getVegTopping() {
        return vegTopping;
    }

    public void setVegTopping(String vegTopping) {
        this.vegTopping = vegTopping;
    }
}
