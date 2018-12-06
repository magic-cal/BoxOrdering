package Order;

//import java.text.NumberFormat;
/**
 *
 * @author Callum
 */
public class BoxType2 extends Box {

    /**
     *
     * @param boxSize
     * @param boxGrade
     * @param boxSealableTop
     * @param boxQuantity
     * Constructor for Box type 2. 
     */
    public BoxType2(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
        this.colourPrint = 1;
    }
    /**
     *
     * @return total cost of the box. 
     * Calculates the total cost of the box.
     * Adds the cost of one colour. 
     */
    @Override
    public double getCost() {
        double cost = super.getCost();
        double basicCost = super.getBasicCost();

//      Adding for the cost of the Colouring 
//      12% of the Original cost.
        cost += basicCost * 0.12;
        return cost;
    }

}
