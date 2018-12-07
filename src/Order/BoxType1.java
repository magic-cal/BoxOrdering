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
     * @param boxSize size of the box to be created
     * @param boxGrade grade of the box to be created
     * @param boxSealableTop if the box should be sealable
     * @param boxQuantity quantity of the box to be created
     * Constructor for box type 1
     */
    public BoxType1(float boxSize, int boxGrade, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade, boxSealableTop, boxQuantity);
    }


}
