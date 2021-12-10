/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

/**
 *
 * @author Asus
 */
class UserCheckStaff {
    
      
    private String donor_name;
    private int staff_ID;
    private String staff_Name;
    private String staff_phNo;

    public UserCheckStaff(String donor_name, int staff_ID, String staff_Name, String staff_phNo) {
        this.donor_name = donor_name;
        this.staff_ID = staff_ID;
        this.staff_Name = staff_Name;
        this.staff_phNo = staff_phNo;
    }

    public String getdonor_name() {
        return donor_name;
    }

    public int getstaff_ID() {
        return staff_ID;
    }

    public String getstaff_Name() {
        return staff_Name;
    }

    public String getstaff_phNo() {
        return staff_phNo;
    }
    
}
