package Order;


/**
 *
 * @author Callum
 */

public class BoxType2 extends Box {
        private int colourPrint;
    // Constructor
    public BoxType2(float boxSize, int boxGrade, boolean boxSealableTop) {
        super(boxSize,boxGrade,boxSealableTop);
        this.colourPrint = 1;
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