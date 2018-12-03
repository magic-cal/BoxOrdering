package Order;
/**
 *
 * @author up827158
 */

public class BoxType3 extends Box {
    private int colourPrint;
    public BoxType3(float boxSize, int boxGrade, boolean boxSealableTop) {
        super(boxSize, boxGrade, boxSealableTop);
        this.colourPrint = 2;
        
    }

            @Override
    public double getCost() {
        double cost = 0.00;
        double basicCost = super.getBasicCost();
//      Adding for the cost of the Colouring 
//      15% of the Original cost.
        cost += basicCost*1.15;
        return cost;
    }
}
