package Order;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author felixmayo
 */
public class boxOrder {

    private int ID;
    private Object box;// class instance variables
    private int quantity;

    // Constructor
    public boxOrder(int boxID, Object boxObject, int boxQuantity) {
        ID = boxID;
        box = boxObject;
        quantity = boxQuantity;
    }

}
