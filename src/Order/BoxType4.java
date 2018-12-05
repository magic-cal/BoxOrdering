package Order;

/**
 *
 * @author up827158, up867238
 */
public class BoxType4 extends BoxType3 {

    public BoxType4(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        this.reBottom = true;
    }

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
