package Order;

/**
 *
 * @author up827158, up867238
 */

public class BoxType3 extends BoxType2 {

    /**
     *
     * @param boxSize
     * @param boxGrade
     * @param boxSealableTop
     * @param boxQuantity
     * Constructor for box type 3 
     */
    public BoxType3(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        this.colourPrint = 2;
    }

     /**
     *
     * @return total cost of the box. 
     * Calculates the total cost of the box. 
     * Adds additional cost from one colour to two. 
     */
    @Override
    public double getCost() {
        double cost = super.getCost();
        double basicCost = super.getBasicCost();
//      Adding for the cost of the Colouring 
//      (3% plus the 12 from the sub class) of the Original cost.
        cost += basicCost * 0.03;
        return cost;
    }

}
