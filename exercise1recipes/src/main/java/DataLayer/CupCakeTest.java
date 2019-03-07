/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author frizz
 */
public class CupCakeTest {
    private int id;
    private String top;
    private String bottom;
    private double price;

    public CupCakeTest(int id, String top, String bottom, double price) {
        this.id = id;
        this.top = top;
        this.bottom = bottom;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTop() {
        return top;
    }

    public String getBottom() {
        return bottom;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Cupcake{" + "id = " + id + ", top = " + top + ", bottom = " + bottom + ", price = " + price + '}';
    }

}