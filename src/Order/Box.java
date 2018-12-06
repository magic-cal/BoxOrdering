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
    protected int colourPrint;
    protected boolean reBottom;
    protected boolean reCorners;
    private int quantity;


    /**
     *
     * @param boxSize
     * @param boxGrade
     * @param boxSealableTop
     * @param boxQuantity
     * Constructor for box.
     */
    public Box(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        this.size = boxSize;
        this.grade = boxGrade;
        this.sealableTop = boxSealableTop;
        this.quantity = boxQuantity;

    }

    //Accessor Methods

    /**
     *
     * @return size
     */
    public float getSize() {
        return size;
    }

    /**
     *
     * @return Box Grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return Box colours. 
     */
    public int getColourPrint() {
        return colourPrint;
    }

    /**
     *
     * @return Box reinforced bottom true/false
     */
    public boolean getReBottom() {
        return reBottom;
    }

    /**
     *
     * @return Box reinforced corners true/false
     */
    public boolean getReCorners() {
        return reCorners;
    }

    /**
     * 
     * @return box sealable  top 
     */
    public boolean getSealableTop() {
        return sealableTop;
    }

    /**
     *
     * @return box quantity
     */
    public int getQuantity() {
        return quantity;
    }

    //Methods

    /**
     *
     * @return basic cost of the box (pre extras)
     * Calculates the basic cost (pre extras) of the box. 
     */
    public double getBasicCost() {
        double cost = 0.0;
        double gradeCost = 0;
        System.out.println("Grade: " + grade);
        switch (grade) {

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
                gradeCost = 1.50;
                break;
            default:
                System.out.println("ERROR IN GRADING COST");
                break;
        }
        cost += gradeCost * size;
        cost *= quantity;
        return cost;
    }

    /**
     *
     * @return total cost of the box. 
     * Calculates the total cost of the box. 
     */
    public double getCost() {
        double cost = 0.00;
        double basicCost = getBasicCost();
        if (getSealableTop()) {
            cost += basicCost * 0.10;
        }
        cost += basicCost;
        return cost *= quantity;
    }

}
