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
                case 1:
                    System.out.println("box 1");
                    boxes.add(new BoxType1(size,grade,sealedTop,quantity));
                    return 1;
                case 2:
                    System.out.println("box 2");
                    boxes.add(new BoxType2(size,grade,sealedTop,quantity));
                    return 2;
                case 3:
                    System.out.println("box 3");
                    boxes.add(new BoxType3(size,grade,sealedTop,quantity));
                    return 3;
                case 4:
                    System.out.println("box 4");
                    boxes.add(new BoxType4(size,grade,sealedTop,quantity));
                    return 4;
                case 5:
                    System.out.println("box 5");
                    boxes.add(new BoxType5(size,grade,sealedTop,quantity));
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
    
        public int checkInput(String boxHeight, String boxWidth, String boxLength, String quantity){
            try {
                Integer.parseInt(boxHeight);
            }
            catch(Exception e){
                System.out.println("exception, not valid integer");
                return 1;
            }
             try {
                Integer.parseInt(boxWidth);
            }
            catch(Exception e){
                System.out.println("exception, not valid integer");
                return 2;
            }
              try {
                Integer.parseInt(boxLength);
            }
            catch(Exception e){
                System.out.println("exception, not valid integer");
                return 3;
            }
               try {
                Integer.parseInt(quantity);
            }
            catch(Exception e){
                System.out.println("exception, not valid integer");
                return 4;
            }
            
            int boxHeight_int = Integer.parseInt(boxHeight);
                int boxWidth_int = Integer.parseInt(boxWidth);
                int boxLength_int = Integer.parseInt(boxLength);
                int quantity_int = Integer.parseInt(quantity);
  
            int check = 0;
              if (boxHeight_int<0 || boxHeight_int>999) {
                  check = 1;
              }
              else if (boxWidth_int<0 || boxWidth_int>999) {
                  check = 2;
              }
              else if (boxLength_int<0 || boxLength_int>999) {
                  check = 3;
              }
              else if (quantity_int <0 || quantity_int>100) {
                  check = 4;
              }
              return check;
              
        }
    }

