package com.inventario.model;//Es el paquete donde se encuentra la clase

public class Product {// se declara la clase product y se declaran los atributos de la clase
    private int id; // identidicador del producto
    private String name; // nombre del producto
    private double price; // precio del prodcuto
    private int quantity; // cantidad del producto

    public Product(int id, String name, double price, int quantity) { // es el constuctor de la clase prdoucto y contiene los parametros para poder inicializar otro objeto
        this.id = id; //Asigna el parametro id del constructor al atributo id de la clase usando this para distinguir entre el atributo de la clase y el parámetro.
        this.name = name; //Asigna el parametro name del constructor al atributo name de la clase usando this para distinguir entre el atributo de la clase y el parámetro.
        this.price = price; //Asigna el parametro ´price del constructor al atributo price de la clase usando this para distinguir entre el atributo de la clase y el parámetro.
        this.quantity = quantity; //Asigna el parametro quantity del constructor al atributo quantity de la clase usando this para distinguir entre el atributo de la clase y el parámetro.
    }
    //Metodo getter para obtener el id del producto
    public int getId() {
        return id;
    }
    //Metodo setter para establecer el id del producto.
    public void setId(int id) {
        this.id = id;
    }
    //Metodo getter para obtener el name del producto
    public String getName() {
        return name;
    }
    //Metodo setter para establecer el name del producto.
    public void setName(String name) {
        this.name = name;
    }
    //Metodo getter para obtener el precio del producto
    public double getPrice() {
        return price;
    }
    //Metodo setter para establecer el price del producto.
    public void setPrice(double price) {
        this.price = price;
    }
    //Metodo getter para obtener el quantity del producto
    public int getQuantity() {
        return quantity;
    }
    //Metodo setter para establecer el quantity del producto.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}