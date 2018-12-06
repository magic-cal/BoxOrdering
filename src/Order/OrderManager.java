package Order;

import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class OrderManager {

    ArrayList<Box> boxes;

    /**
     *Constructor for the order manager.
     * Creates an ArrayList of boxes.
     */
    public OrderManager() {
        boxes = new ArrayList();
    }

    /**
     *
     * @param width
     * @param length
     * @param height
     * @param grade
     * @param colourPrint
     * @param reBottom
     * @param reCorners
     * @param sealedTop
     * @param quantity
     * @return the output code (which box has been created or Not)
     * 
     * Adds a box to the ArrayList of Boxes if the box can be provided by 
     * flexbox.
     */
    public int addBox(float width, float length, float height, int grade,
            int colourPrint, boolean reBottom, boolean reCorners,
            boolean sealedTop, int quantity) {
        float size = getSize(width, length, height);
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

    /**
     *
     * @param boxIndex which position to remove. 
     * Removes a box from a specified index. 
     */
    public void removeBox(int boxIndex) {
        boxes.remove(boxIndex);
    }

    /**
     *
     * @param width
     * @param length
     * @param height
     * @return Calculates the size of a box based on length, width and height. 
     * Calculates the size of a box based on length, width and height. 
     */
    private float getSize(float width, float length, float height) {
        //calculates surface area of the Box
        float size = (2 * length * width) + (2 * length * height) + (2 * height * width);
//        In Meters squared
        size = (float) (size);
        return size;
    }

    /**
     *
     * @return ArrayList of boxes 
     * Gives the list of All Boxes 
     */
    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    /**
     *
     * @return sum of all box costs.
     * Calculates the sum of all boxes. 
     */
    public double getAllCosts() {

        double totalCost = 0.00;
        for (Box currentBox : boxes) {
            totalCost += currentBox.getCost();
        }
        return totalCost;
    }

    /**
     *
     * @return total number of boxes
     * calculates total number of boxes.
     * 
     */
    public int getNumBoxes() {
        int boxNo = 0;
        for (Box box : boxes) {
            boxNo += box.getQuantity();
        }
        return boxNo;
    }

    /**
     *
     * @param toTest the string to test. 
     * @return if the string was valid as an integer.
     */
    public int testInt(String toTest) {
        int newNo = -1;
        try {
            newNo = Integer.parseInt(toTest);
        } catch (Exception e) {
            System.out.println("Integer Error");
        }
        return newNo;
    }
    /**
     *
     * @param toTest the string to test. 
     * @return if the string was valid as an float.
     */
    public float testFloat(String toTest) {
        float newNo = -1;
        try {
            newNo = Float.parseFloat(toTest);
        } catch (Exception e) {
            System.out.println("Float Error");
        }
        return newNo;
    }

    /**
     *
     * @param grade 
     * @param colourPrint
     * @param reBottom
     * @param reCorners
     * @return the type of the box that can be created or -1 if not. 
     * Selects the correct type of box based on inputs. -1 if cannot be created 
     * 
     */
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

    /**
     *
     * @param boxHeight
     * @param boxWidth
     * @param boxLength
     * @param quantity
     * @return if all data is valid, return true. 
     * Checks if passed inputs are valid. 
     */
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
        if (boxHeight_float < 0 || boxHeight_float > 5.0) {
            return true;
        } else if (boxWidth_float < 0 || boxWidth_float > 5.0) {
            return true;
        } else if (boxLength_float < 0 || boxLength_float > 5.0) {
            return true;
        } else if (quantity_int < 0 || quantity_int > 999) {
            return true;
        }
        return false;

    }

    /**
     *
     * @param userInput
     * @return if User input is valid return true, else false
     * Validates user Input if int.
     */
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

        /**
     *
     * @param userInput
     * @return if User input is valid return true, else false
     * Validates user Input if float.
     */
    public boolean checkInputFloat(String userInput) {
        float userInput_int;
        try {
            userInput_int = Float.parseFloat(userInput);
        } catch (Exception e) {
            System.out.println("exception, not valid integer");
            return false;
        }

        if (userInput_int < 0 || userInput_int > 5) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return The last box to be added to the ArrayList. 
     * Gets the last box added to the ArrayList of boxes. 
     */
    public Box getLatestBox() {   //function that returns the latest box (for order content table - needed to display in table )
        return boxes.get(boxes.size() - 1);
    }
}
