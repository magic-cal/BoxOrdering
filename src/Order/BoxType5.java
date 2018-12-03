package Order;
/**
 *
 * @author up827158, up867238
 */

public class BoxType5 extends BoxType4 {
    private int colourPrint;
    public BoxType5(float boxSize, int boxGrade, boolean boxSealableTop,int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        
        this.colourPrint = 2;
        
    }

            @Override
    public double getCost() {
        double cost = super.getCost();
        double basicCost = super.getBasicCost();
//      Adding for the cost of the Colouring, Reinforced Bottom and Reinforced Corners
//      15% + 13% + 12% added to the Original cost.
        cost += basicCost*0.12;

        return cost;
    }
}
