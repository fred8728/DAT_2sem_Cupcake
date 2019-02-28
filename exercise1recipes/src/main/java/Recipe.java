/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// lelolole
/**
 *
 * @author frizz
 */
public class Recipe {
    private int id;
    private String dish;
    private String instructions;

    public Recipe(int id, String dish, String instructions) {
        this.id = id;
        this.dish = dish;
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" + "id=" + id + ", dish=" + dish + ", instructions=" + instructions + '}';
    }
    
    
}
