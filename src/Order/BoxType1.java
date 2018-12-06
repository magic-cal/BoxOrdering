package Order;

import java.text.NumberFormat;

/**
 *
 * @author Callum
 */
public class BoxType1 extends Box {

    // Constructor

    /**
     *
     * @param boxSize
     * @param boxGrade
     * @param boxSealableTop
     * @param boxQuantity
     * Constructor for box type 1
     */
    public BoxType1(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
    }

//    @Override
//    public double getCost() {
//        double cost = super.getCost();
//        return cost;
//    }

}
