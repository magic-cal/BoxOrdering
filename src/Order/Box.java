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
public abstract class Box {
    private float size;      // class instance variables
    private int grade;
    private boolean sealableTop;
    private int colourPrint;
    private boolean reBottom;
    private boolean reCorners;
    private int quantity;

    public Box() {
    }

    
    // Constructor
    public Box(float boxSize,  int boxGrade, boolean boxSealableTop, int boxQuantity) {
        this.size = boxSize;
        this.grade = boxGrade;
        this.sealableTop = boxSealableTop;
        this.quantity = boxQuantity;

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

    public boolean getSealableTop(){
        return sealableTop;
    }


    //Methods

    

    
    public double getBasicCost(){
      double cost = 0.0;
     double gradeCost = 0;
        System.out.println("Grade: "+grade);
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
        double cost = 0.00;
        double basicCost = getBasicCost();
       if(getSealableTop())cost += basicCost*0.10;
        cost += basicCost;
     return cost*=quantity;
    }

}
