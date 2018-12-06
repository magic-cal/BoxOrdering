package Order;

/**
 *
 * @author up827158, up867238
 */
public class BoxType4 extends BoxType3 {

    /**
     *
     * @param boxSize
     * @param boxGrade
     * @param boxSealableTop
     * @param boxQuantity
     * Constructor for box type 4
     */
    public BoxType4(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        this.reBottom = true;
    }

    /**
     *
     * @return total cost of the box. 
     * Calculates the total cost of the box. 
     * Adds additional cost for reinforced bottom
     */
    @Override
    public double getCost() {
        double cost = super.getCost();
        double basicCost = super.getBasicCost();
//      Adding for the cost of the Colouring and Reinforced Bottom 
//      15% + 13% added to the Original cost.
        cost += basicCost * 0.13;
        return cost;
    }
}
