package Order;

import java.text.NumberFormat;


/**
 *
 * @author Callum
 */

public class BoxType1 extends Box {
    // Constructor
    public BoxType1(float boxSize, int boxGrade, boolean boxSealableTop) {
        super(boxSize,boxGrade,boxSealableTop);
    }
    
    
        @Override
    public double getCost() {
        double cost = 0.00;
        double basicCost = super.getBasicCost();
//      Adding for the cost of the Colouring 
//      12% of the Original cost.
        cost += basicCost*0.12;
        return cost;
    }
}