package Order;

import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class OrderManager {

    ArrayList<Box> boxes = new ArrayList();

    public OrderManager() {
//        this.addBox();
    }
//    boxWidth,boxLength,boxHeight,cardboardGrade,colourPrint,reBottom,reCorners,sealableTop,quantity

    public int addBox(float width, float length, float height, int grade,
            int colourPrint, boolean reBottom, boolean reCorners,
            boolean sealedTop, int quantity) {
        float size = getSize(width, length, height);

//            @TODO Check valid inputs
//          if(these are invalid){
//              return -2;
//          }
        switch (boxType(grade, colourPrint, reBottom, reCorners)) {
            case 1:
                System.out.println("box 1");
                boxes.add(new BoxType1(size, grade, sealedTop, quantity));
                return 1;
            case 2:
                System.out.println("box 2");
                boxes.add(new BoxType2(size, grade, sealedTop, quantity));
                return 2;
            case 3:
                System.out.println("box 3");
                boxes.add(new BoxType3(size, grade, sealedTop, quantity));
                return 3;
            case 4:
                System.out.println("box 4");
                boxes.add(new BoxType4(size, grade, sealedTop, quantity));
                return 4;
            case 5:
                System.out.println("box 5");
                boxes.add(new BoxType5(size, grade, sealedTop, quantity));
                return 5;
            default:
                System.out.println("ERROR BOX SORT DEFAULT");
                return -1;
        }

    }

    public void removeBox(int boxIndex) {
        boxes.remove(boxIndex);
    }

    private float getSize(float width, float length, float height) {
        //calculates surface area of the Box
        float size = (2 * length * width) + (2 * length * height) + (2 * height * width);
//        In Meters squared
        size = (float) (size);
        return size;
    }

    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    public double getAllCosts() {

        double totalCost = 0.00;
        for (Box currentBox : boxes) {
            totalCost += currentBox.getCost();
        }
        return totalCost;
    }

    public int getNumBoxes() {
        int boxNo = 0;
        for (Box box : boxes) {
            boxNo += box.getQuantity();
        }
        return boxNo;
    }

    public int testNo(String toTest) {
        int newNo = -1;
        try {
            newNo = Integer.parseInt(toTest);
        } catch (Exception e) {
            System.out.println("Integer Error");
        }
        return newNo;
    }

    public float testFloat(String toTest) {
        float newNo = -1;
        try {
            newNo = Float.parseFloat(toTest);
        } catch (Exception e) {
            System.out.println("Float Error");
        }
        return newNo;
    }

    public int boxType(int grade, int colourPrint, boolean reBottom, boolean reCorners) {
        //calculates the grade type of the Box
        int boxType = -1;

        if (grade >= 1 && grade <= 3 && colourPrint == 0 && !reBottom && !reCorners) {
            boxType = 1;
        } else if (grade >= 2 && grade <= 4 && colourPrint == 1 && !reBottom && !reCorners) {
            boxType = 2;
        } else if (grade >= 2 && grade <= 5 && colourPrint == 2 && !reBottom && !reCorners) {
            boxType = 3;
        } else if (grade >= 2 && grade <= 5 && colourPrint == 2 && reBottom && !reCorners) {
            boxType = 4;
        } else if (grade >= 3 && grade <= 5 && colourPrint == 2 && reBottom && reCorners) {
            boxType = 5;
        }

        return boxType;
    }

    public boolean checkInput(String boxHeight, String boxWidth, String boxLength, String quantity) {
        float boxHeight_float;
        float boxWidth_float;
        float boxLength_float;
        float quantity_int;
        try {
            boxHeight_float = Float.parseFloat(boxHeight);
            boxWidth_float = Float.parseFloat(boxWidth);
            boxLength_float = Float.parseFloat(boxLength);
            quantity_int = Integer.parseInt(quantity);
        } catch (Exception e) {
            System.out.println("exception, not valid integer");
            return true;
        }

        int check = 0;
        if (boxHeight_float < 0 || boxHeight_float > 999.99) {
            return true;
        } else if (boxWidth_float < 0 || boxWidth_float > 999.99) {
            return true;
        } else if (boxLength_float < 0 || boxLength_float > 999.99) {
            return true;
        } else if (quantity_int < 0 || quantity_int > 100) {
            return true;
        }
        return false;

    }

    public boolean checkInputInt(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("exception, not valid integer");
            return false;
        }

        int userInput_int = Integer.parseInt(userInput);

        if (userInput_int < 1 || userInput_int > 999) {
            return false;
        }
        return true;
    }

    public boolean checkInputFloat(String userInput) {
        float userInput_int;
        try {
            userInput_int = Float.parseFloat(userInput);
        } catch (Exception e) {
            System.out.println("exception, not valid integer");
            return false;
        }

        if (userInput_int < 0 || userInput_int > 999) {
            return false;
        }
        return true;
    }

    public Box getLatestBox() {   //function that returns the latest box (for order content table - needed to display in table )
        return boxes.get(boxes.size() - 1);
    }
}
