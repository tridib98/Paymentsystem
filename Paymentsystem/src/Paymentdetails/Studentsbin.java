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
public class Studentsbin {
    int s_id;
    String s_name,s_enroll,s_contact,s_pass;
            public Studentsbin(){
            }
            public Studentsbin(int s_id,String s_name,String s_enroll,String s_contact,String s_pass){
                this.s_id=s_id;
                this.s_enroll=s_enroll;
                this.s_name=s_name;
                this.s_contact=s_contact;
                this.s_pass=s_pass;
                
            }
            public String get_name(){
                return s_name;
            }
             public String get_enroll(){
                return s_enroll;
            }
              public String get_contact(){
                return s_contact;
            }
               public String get_password(){
                return s_pass;
            }
               public int get_id(){
                return s_id;
            }
            
            }

