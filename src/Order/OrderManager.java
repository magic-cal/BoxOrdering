package Order;


import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Callum
 */
public class OrderManager {
    ArrayList <Box> boxes = new ArrayList<Box>();
    public OrderManager(){
        this.addBox(0, 0, 0, 0, true);
    }
    
    public void addBox(float width, float length, float height,int grade,boolean sealedTop){
        float size = getSize(width,length,height);
        boxes.add(new BoxType2(size,grade,sealedTop));
    }
    
    public void removeBox(int boxIndex){
        boxes.remove(boxIndex);
    }
    
    
    private float getSize(float width, float length, float height){
        float size = width*length*height;
        return size;
    }
    
    public ArrayList<Box> getBoxes(){
        return boxes;
    }
    
    public double getAllCosts(){
        double totalCost = 0.00;
        for (Box currentBox: boxes){
            totalCost+=currentBox.getCost();
        }
        return totalCost;
    }
    
    public int getNumBoxes(){
        return boxes.size();
    }
    
}

