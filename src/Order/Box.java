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
    public Box(float boxSize, int boxGrade, int boxColourPrint, boolean boxReBottom, boolean boxReCorners, boolean boxSealableTop, int boxQuantity) {
        this.size = boxSize;
        this.grade = boxGrade;
        this.colourPrint = boxColourPrint;
        this.sealableTop = boxSealableTop;
        this.reBottom = boxReBottom;
        this.reCorners = boxReCorners;
        this.quantity = boxQuantity;

    }

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
    public int getQuantity(){
        return quantity;
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
     cost += gradeCost*size;
     cost *= quantity;
     return cost;
    }

    public double getExtraCost(int colourPrint, boolean reBottom, boolean reCorners, boolean sealableTop){
        double percentage = 0.00;
        
        if (colourPrint == 1){
            percentage += 0.12;}
        
        else if (colourPrint == 2){
            percentage += 0.15;}
        else if (colourPrint == 0){
            percentage +=0;}
    
        if (getReBottom()){
            percentage += 0.13;}
        
        if (getReCorners()){
            percentage += 0.12;}
        
        if (getSealableTop()){
            percentage += 0.1;}
        

        return percentage;
    }
    public double getCost() {
        double cost = 0.00;
        double basicCost = getBasicCost();
        double extras = getExtraCost(colourPrint, reBottom, reCorners, sealableTop);
        cost += basicCost*(extras + 1);
     return cost *= quantity;
    }

}
