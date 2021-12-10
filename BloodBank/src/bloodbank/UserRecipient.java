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
class UserRecipient {
    private int recipient_ID;
    private String recipient_name, recipient_age, recipient_gender, recipient_Bloodgroup, recipient_Bloodquantity, City_ID, staff_ID, recipient_reg_date;
    
    public UserRecipient(int recipient_ID, String recipient_name, String recipient_age, String recipient_gender, String recipient_Bloodgroup, String recipient_Bloodquantity, String City_ID, String staff_ID, String recipient_reg_date){
        this.recipient_ID = recipient_ID;
        this.recipient_name = recipient_name;
        this.recipient_age = recipient_age;
        this.recipient_gender = recipient_gender;
        this.recipient_Bloodgroup = recipient_Bloodgroup;
        this.recipient_Bloodquantity = recipient_Bloodquantity;
        this.City_ID = City_ID;
        this.staff_ID = staff_ID;
        this.recipient_reg_date = recipient_reg_date;
    }
    
    public int getrecipient_ID(){
        return recipient_ID;
    }
    public String getrecipient_name(){
        return recipient_name;
    }
    public String getrecipient_age(){
        return recipient_age;
    }
    public String getrecipient_gender(){
        return recipient_gender;
    }
    public String getrecipient_Bloodgroup(){
        return recipient_Bloodgroup;
    }
    public String getrecipient_Bloodquantity(){
        return recipient_Bloodquantity;
    }
    public String getCity_ID(){
        return City_ID;
    }
    public String getstaff_ID(){
        return staff_ID;
    }
    public String getrecipient_reg_date(){
        return recipient_reg_date;
    }
}
