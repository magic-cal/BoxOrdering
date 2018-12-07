package Order;
/**
 *
 * @author UP879195, UP825573 ,UP827158, UP867238
 */

public class BoxType5 extends BoxType4 {

    /**
     *
     * @param boxSize size of the box 
     * @param boxGrade grade of the box 
     * @param boxSealableTop if the box is sealable
     * @param boxQuantity quantity of the box
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
        cost += basicCost * 0.12;
        return cost;
    }
}
