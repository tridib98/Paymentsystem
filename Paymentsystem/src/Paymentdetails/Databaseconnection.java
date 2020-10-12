/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paymentdetails;

import java.awt.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amar
 */
public class Databaseconnection {
    
    Connection con;
    Statement smt;
    public Databaseconnection()
     {
        try
        {
           Class.forName("com.mysql.jdbc.Driver"); 
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
           smt = con.createStatement();
           
        }
        catch(Exception e) 
         {
             e.printStackTrace();
         }    
     }
    public boolean add_student(String nam,String en,String phone,String pw){
        boolean flag=false;
        try {
            String q = "INSERT INTO student (name,enroll_no,contact,password) values ('"+nam+"','"+en+"','"+phone+"','"+pw+"')";
            smt.execute(q);
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public boolean add_admin(String aname,String aemail,String apassword){
        boolean flag=false;
        try {
            String q = "INSERT INTO admin (name,email,password) values ('"+aname+"','"+aemail+"','"+apassword+"')";
            smt.execute(q);
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public ArrayList<Adminb> getAdmin(String aemail){
    ArrayList<Adminb> al=new ArrayList<Adminb>();
    String q= "SELECT * FROM admin WHERE email = '"+aemail+"'";
     ResultSet res=null;
        try {
     res=smt.executeQuery(q);
     while(res.next()){
          al.add(new Adminb(res.getInt(1),res.getString(2),res.getString(3),res.getString(4)));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
 return al;    
 }
    public ArrayList<Studentsbin> getAllstudents(){
    ArrayList<Studentsbin> obj=new ArrayList<Studentsbin>();
    String q= "SELECT * FROM student";
     ResultSet res=null;
        try {
     res=smt.executeQuery(q);
     while(res.next()){
          obj.add(new Studentsbin(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
 return obj;    
 }
    
    public boolean addcourse(String co_name,int co_fee){
        boolean flag=false;
        try {
            String u = "INSERT INTO courses (c_name,c_fees) values ('"+co_name+"','"+co_fee+"')";
            smt.execute(u);
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
     public ArrayList<Coursebin> getAllCourse(){
    ArrayList<Coursebin> al=new ArrayList<Coursebin>();
    String q= "SELECT * FROM courses";
     ResultSet res=null;
        try {
     res=smt.executeQuery(q);
     while(res.next()){
          al.add(new Coursebin(res.getInt(1),res.getString(2),res.getInt(3)));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
 return al;    
 }
    /*  public boolean add_admin(String name,String email,String pass){
        boolean flag=false;
        try {
            String q = "INSERT INTO admin (a_name,a_email,a_pass) values ('"+name+"','"+email+"','"+pass+"')";
            smt.execute(q);
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }*/
      
     
      
      public boolean add_payment(int c_id,int s_id,int amount){
        boolean flag=false;
        int total=0;
        int due;
        ResultSet res=null; 
        try{
           String q1="SELECT c_fees FROM courses WHERE c_id = '"+c_id+"'"; 
          res = smt.executeQuery(q1);
          while(res.next()){
         total=res.getInt(1);
        }
        }
        catch(SQLException ex){
          Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);  
        }
        if(total!=0){
     try {
            due=total-amount;
            String q = "INSERT INTO payment (s_id,c_id,paid,due) values ('"+s_id+"','"+c_id+"','"+amount+"','"+due+"')";
            smt.execute(q);
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }}
        return flag;
        }
      
       
      public boolean update_payment(int c_id,int s_id,int amount){
        boolean flag=false;
         ResultSet res=null;
         int paid=0,due=0;
         try{
           String q1="SELECT paid , due FROM payment WHERE c_id = '"+c_id+"' AND s_id = '"+s_id+"'"; 
          res = smt.executeQuery(q1);
          while(res.next()){
         // al.add(new Coures(res.getInt(1),res.getString(2),res.getInt(3)));
         paid=res.getInt(1);
         due=res.getInt(2);
         paid=paid+amount;
         due=due-amount;
        }
        }
        catch(SQLException ex){
          Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);  
        }
         if(paid!=0 && due!=0){
     try{
           String q = "UPDATE payment SET paid = '"+paid+"' , due = '"+due+"' WHERE s_id = '"+s_id+"' AND c_id = '"+c_id+"'";//p_id IN (SELECT p_id FROM payment WHERE s_id = '"+s_id+"' AND c_id = '"+c_id+"' 
           PreparedStatement smtt = con.prepareStatement(q);
           smtt.executeUpdate();
           smtt.close();
         flag=true;
        }
        catch(SQLException ex){
          Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);  
        }} 
        return flag;
        }
      
      public ArrayList<Details> getPaymentDetails(){
    ArrayList<Details> al=new ArrayList<Details>();
    String q="SELECT student.name,student.enroll_no,courses.c_name,payment.id,payment.paid,payment.due FROM ((payment INNER JOIN student ON payment.s_id=student.id) INNER JOIN courses ON payment.c_id=courses.c_id)";
     ResultSet res=null;
        try {
     res=smt.executeQuery(q);
     while(res.next()){
          al.add(new Details(res.getString(1),res.getString(2),res.getString(3),res.getInt(4),res.getInt(5),res.getInt(6)));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
 return al;    
 }
      
   public boolean update_contact(String en,String phone){
        boolean flag=false;
        ResultSet res=null; 
        int x=0;
        try {
           /* String v="SELECT id FROM student WHERE enroll_no = '"+en+"'"; 
            x=res.getInt(1);
            if(x!=0){*/
            String u = "UPDATE student SET contact = '"+phone+"' WHERE enroll_no = '"+en+"'";
            smt.execute(u);
            flag=true;
            //else{flag=false;}
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }   
      
      
       
      
    
      
     
     
    
    
 /*ppuublic boolean Checklogin(String email,String password)
  {
      boolean flag = false;
      
      String q = "select * from student where email='"+email+"' AND password='"+password+"'";
      
        try {
            ResultSet rs = smt.executeQuery(q);
            
            rs.next();
            //String id, String user_id, String user_name, String password, String role
            if(rs.getRow()>0)
            {
              flag = true;  
            }   
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      return flag;
      
  } */  
 
 
 /*public boolean Addperson(String name, String ph, String address)
 {
     boolean flag = true;
        try {
            String q = "INSERT INTO person (name,ph,address) values ('"+name+"','"+ph+"','"+address+"')";
            smt.execute(q);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
 }
 public ArrayList<students> getAll(){
    ArrayList<students> al=new ArrayList<>();
    String q= "SELECT * FROM person";
     ResultSet res=null;
        try {
     res=smt.executeQuery(q);
     while(res.next()){
          //al.add(new students(res.getInt(1),res.getString(2),res.getString(2),res.getString(4)));
        }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
 return al;    
 }*/
 
 
    

    
}
