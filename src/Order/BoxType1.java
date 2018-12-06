package Order;

import java.text.NumberFormat;

/**
 *
 * @author UP879195, UP825573 ,UP827158, UP867238
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
