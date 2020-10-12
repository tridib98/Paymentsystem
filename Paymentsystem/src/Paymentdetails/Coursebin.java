/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paymentdetails;

/**
 *
 * @author Tridib
 */
public class Coursebin {
    int cou_id,cou_fee;
    String cou_name;
    public Coursebin()
    {}
    public Coursebin(int cou_id,String cou_name,int cou_fee)
    {
        this.cou_id=cou_id;
        this.cou_name=cou_name;
        this.cou_fee=cou_fee;
    }
    public int get_id()
    {
        return cou_id;
    }
    public String get_name()
    {
        return cou_name;
    }
    public int get_fees()
    {
        return cou_fee;
    }
}
