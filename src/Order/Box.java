package Order;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felixmayo
 */
public class Box {
    private float size;      // class instance variables
    private int grade;
    private boolean sealableTop;
    private int colourPrint;
    private boolean reBottom;
    private boolean reCorners;

    
    // Constructor
    public Box(float boxSize,  int boxGrade, boolean boxSealableTop) {
        this.size = boxSize;
        this.grade = boxGrade;
        this.sealableTop = boxSealableTop;

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

    
    public double getBasicCost(){
      double cost = 0.0;
     double gradeCost = 0;
     switch (grade){
         
         case 1:
             gradeCost = 0.55;
             break;
         case 2:
             gradeCost = 0.65;
             break;
         case 3:
             gradeCost = 0.82;
             break;
         case 4:
             gradeCost = 0.98;
             break;
         case 5:
             gradeCost = 1.5;
             break;
         default:
             System.out.println("ERROR IN GRADING COST");
             break;
           }
     cost+= gradeCost*size;
     return cost;
    }
    
    
    public double getCost() {
     return getBasicCost();
    }

}
