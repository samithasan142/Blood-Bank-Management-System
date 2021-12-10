package bloodbank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class UserStaff {
    private int staff_ID;
    private String staff_Name, staff_phNo;
    private int staff_salary;
    
    public UserStaff(int staff_ID, String staff_Name, String staff_phNo,int staff_salary){
        this.staff_ID = staff_ID;
        this.staff_Name = staff_Name;
        this.staff_phNo = staff_phNo;
         this.staff_salary =staff_salary;
    }
    
    public int getstaff_ID(){
        return staff_ID;
    }
    public String getstaff_Name(){
        return staff_Name;
    }
    public String getstaff_phNo(){
        return staff_phNo;
    }
    
    public int getstaff_salary(){
        return staff_salary;
    }

}
