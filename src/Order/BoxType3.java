package Order;

/**
 *
 * @author up827158, up867238
 */

public class BoxType3 extends BoxType2 {

    public BoxType3(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        this.colourPrint = 2;
    }

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
