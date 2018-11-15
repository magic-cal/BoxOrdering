/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felixmayo
 */
public class box {
    private float size;      // class instance variables
    private int grade; 
    private int colourPrint;
    private boolean reBottom;
    private boolean reCorners;
    private int quantity;
    // Constructor
    public box() {
    }
    // Constructor
    public box(float boxSize,  int boxGrade, boolean boxReBottom, boolean boxReCorners, int boxQuantity) {
        size = boxSize;
        grade = boxGrade;
        reBottom = boxReBottom;
        reCorners = boxReCorners;
        quantity = boxQuantity;
    } 
    //Accessor Methods
    public float getSize() {
     return size;
    }
    
    public int getGrade() {
     return grade;
    }
    
    public int getColourPrint() {
     return colourPrint;
    }
    
    public boolean getReBottom() {
     return reBottom;
    }
    
    public boolean getReCorners() {
     return reCorners;
    }
   
    
    //Methods
    
    public int type() {
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
    
    public double cost() {
     double cost = 0.0;
     
     
     return cost;
    }
    
}
