package Order;

//import java.text.NumberFormat;


/**
 *
 * @author Callum
 */

public class BoxType2 extends Box {
        private int colourPrint;
    // Constructor
    public BoxType2(float boxSize, int boxGrade, int boxColourPrint, boolean boxReBottom, boolean boxReCorners, boolean boxSealableTop, int boxQuantity) {
        super(boxSize, boxGrade,boxColourPrint, boxSealableTop, boxReBottom, boxReCorners ,boxQuantity);
        this.colourPrint = 1;
        this.sealableTop = getSealableTop();
        this.reBottom = getReBottom();
        this.reCorners = getReCorners();
        this.quantity = getQuantity();
    }
    
    
        @Override
        public double getCost() {
        double basicCost = super.getBasicCost();
        double extraCost = super.getExtraCost(colourPrint, reBottom, reCorners, sealableTop);
        double cost = basicCost * (1 + extraCost);
        
        return cost;
    }
}
