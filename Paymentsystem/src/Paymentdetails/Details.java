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
public class Details {
    String p_sname,p_smail,p_course;
    int p_cid,p_paid,p_due;
    public Details(){
        
    }
    public Details(String p_sname,String p_smail,String p_course,int p_cid,int p_paid,int p_due)
    {
    this.p_sname=p_sname;
    this.p_smail=p_smail;
    this.p_course=p_course;
    this.p_cid=p_cid;
    this.p_paid=p_paid;
    this.p_due=p_due;
    }
    public String get_name()
    {
        return p_sname;
    }
    public String get_mail()
    {
        return p_smail;
    }
    public String get_course()
    {
        return p_course;  
    }
    public int get_cid()
    {
        return p_cid;
    }
    public int get_amt()
    {
        return p_paid;
    }
    public int get_due()
    {
        return p_due;
    }
}
