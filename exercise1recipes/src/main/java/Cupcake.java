/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frizz
 */
public class Cupcake {
    private int id;
    private String top;
    private String bottom;
    private double price;

    @Override
    public String toString() {
        return "Cupcake{" + "id=" + id + ", top=" + top + ", bottom=" + bottom + ", price=" + price + '}';
    }

    public Cupcake(int id, String top, String bottom, double price) {
        this.id = id;
        this.top = top;
        this.bottom = bottom;
        this.price = price;
    }
}
