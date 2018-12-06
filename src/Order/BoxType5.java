package Order;
/**
 *
 * @author UP879195, UP825573 ,UP827158, UP867238
 */

public class BoxType5 extends BoxType4 {

    /**
     *
     * @param boxSize
     * @param boxGrade
     * @param boxSealableTop
     * @param boxQuantity
     * Constructor for box type 5
     */
    public BoxType5(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        this.reCorners = true;
    }

    /**
     *
     * @return total cost of the box. 
     * Calculates the total cost of the box. 
     * Adds additional cost for reinforced corners.
     */
    @Override
    public double getCost() {
        double cost = super.getCost();
        double basicCost = super.getBasicCost();
//      Adding for the cost of the Colouring, Reinforced Bottom and Reinforced Corners
//      15% + 13% + 12% added to the Original cost.
        cost += basicCost * 0.12;
        return cost;
    }
}
