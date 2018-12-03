package Order;

import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class OrderManager {
    ArrayList <Box> boxes = new ArrayList<Box>();
    public OrderManager(){
//        this.addBox();
    }
//    boxWidth,boxLength,boxHeight,cardboardGrade,colourPrint,reBottom,reCorners,sealableTop,quantity
    public int addBox(float width, float length, float height,int grade,
            int colourPrint, boolean reBottom, boolean reCorners,
            boolean sealedTop, int quantity){
            float size = getSize(width,length,height);
            
//            @TODO Check valid inputs
//          if(these are invalid){
//              return -2;
//          }


            switch (boxType(grade,colourPrint,reBottom,reCorners)){
//                @todo ADD OTHER BOX TYPES HERE
                case 1:
                    System.out.println("box 1");
//                    boxes.add(new BoxType1());
                    return 1;
                case 2:
                    System.out.println("box 2");
                    boxes.add(new BoxType2(size,grade,sealedTop,quantity));
                    return 2;
                case 3:
                    System.out.println("box 3");
                    return 3;
                case 4:
                    System.out.println("box 4");
                    return 4;
                case 5:
                    System.out.println("box 5");
                    return 5;
                default:
                    System.out.println("ERROR BOX SORT DEFAULT");
                    return -1;  
            }
    }
    
    public void removeBox(int boxIndex){
        boxes.remove(boxIndex);
    }
   
    
    private float getSize(float width, float length, float height){
        //calculates surface area of the Box
        float size = (2*length*width)+(2*length*height)+(2*height*width);
        return size;
    }
    
    public ArrayList<Box> getBoxes(){
        return boxes;
    }
    
    public double getAllCosts(){

        double totalCost = 0.00;
        for (Box currentBox: boxes){
            totalCost+=currentBox.getCost();
        }
        return totalCost;
    }
    
    public int getNumBoxes(){
        return boxes.size();
    }
    
    public int testNo(String toTest){
        int newNo =-1;
        try{
            newNo= Integer.parseInt(toTest);
        }catch(Exception e){
            System.out.println("ERROR");
        }
        return newNo;
    }
    
    public int boxType(int grade, int colourPrint,boolean reBottom,boolean reCorners) {
      //calculates the grade type of the Box
     int boxType = -1;

        if (grade >= 1 && grade <= 3 && colourPrint == 0 && !reBottom && !reCorners) {
            boxType = 1;
        }

        else if (grade >= 2 && grade <= 4 && colourPrint == 1 && !reBottom && !reCorners ) {
            boxType = 2;
        }

        else if (grade >= 2 && grade <= 5 && colourPrint == 2 && !reBottom && !reCorners) {
            boxType = 3;
        }

        else if (grade >= 2 && grade <= 5 && colourPrint == 2 && reBottom && !reCorners) {
            boxType = 4;
        }

        else if (grade >= 3 && grade <= 5 && colourPrint == 2 && reBottom && reCorners  ) {
            boxType = 5;
        }

     return boxType;
    }
    
        public boolean checkInput(String boxHeight, String boxWidth, String boxLength, String quantity){
            try {
                Integer.parseInt(boxHeight);
                Integer.parseInt(boxWidth);
                Integer.parseInt(boxLength);
                Integer.parseInt(quantity);
            }
            catch(Exception e){
                System.out.println("exception, not valid integer");
                return true;
            }

            
            int boxHeight_int = Integer.parseInt(boxHeight);
            int boxWidth_int = Integer.parseInt(boxWidth);
            int boxLength_int = Integer.parseInt(boxLength);
            int quantity_int = Integer.parseInt(quantity);
  
            int check = 0;
              if (boxHeight_int<0 || boxHeight_int>999) {
                  return true;
              }
              else if (boxWidth_int<0 || boxWidth_int>999) {
                  return true;
              }
              else if (boxLength_int<0 || boxLength_int>999) {
                  return true;
              }
              else if (quantity_int <0 || quantity_int>100) {
                  return true;
              }
              return false;
              
        }
    
public boolean checkInput2(String userInput){
    try {
            Integer.parseInt(userInput);
        }
    catch(Exception e){
        System.out.println("exception, not valid integer");
        return false;
        }
    
    int userInput_int = Integer.parseInt(userInput);
    
    if (userInput_int<0 || userInput_int>999) {
        return false;
    }
    return true;
}
}

