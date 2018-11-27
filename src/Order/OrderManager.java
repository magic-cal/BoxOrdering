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
        this.addBox(5, 6, 7, 3, true);
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
    
    public int testNo(String toTest){
        int newNo =-1;
        try{
            newNo= Integer.parseInt(toTest);
        }catch(Exception e){
            System.out.println("ERROR");
        }
        
        return newNo;
    }
    
        public int type() {
      //calculates the grade type of the Box
     int boxType = 0;

        if (grade >= 1 && grade <= 3 && colourPrint == 0 && reBottom == false && reCorners == false ) {
            boxType = 1;
        }

        else if (grade >= 2 && grade <= 4 && colourPrint == 1 && reBottom == false && reCorners == false ) {
            boxType = 2;
        }

        else if (grade >= 2 && grade <= 5 && colourPrint == 2 && reBottom == false && reCorners == false ) {
            boxType = 3;
        }

        else if (grade >= 2 && grade <= 5 && colourPrint == 2 && reBottom == true && reCorners == false ) {
            boxType = 4;
        }

        else if (grade >= 3 && grade <= 5 && colourPrint == 2 && reBottom == true && reCorners == true ) {
            boxType = 5;
        }

     return boxType;
    }
}

