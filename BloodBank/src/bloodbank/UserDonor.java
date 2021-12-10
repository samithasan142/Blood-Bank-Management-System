/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

/**
 *
 * @author User
 */
class UserDonor{
    private int donor_ID;
    private String donor_name,donor_age,donor_gender,donor_Bloodgroup,donor_reg_date,City_ID,staff_ID,Eligibility;
    public UserDonor(int donor_ID,String donor_name,String donor_age,String donor_gender,String donor_Bloodgroup,String donor_reg_date,String City_ID,String staff_ID,String Eligibility)
    {
        this.donor_ID=donor_ID;
        this.donor_name=donor_name;
        this.donor_age=donor_age;
        this.donor_gender=donor_gender;
        this.donor_Bloodgroup=donor_Bloodgroup;
        this.donor_reg_date=donor_reg_date;
        this.City_ID=City_ID;
        this.staff_ID=staff_ID;
        this.Eligibility=Eligibility;
        
        
    }
    
    public int getdonor_ID(){
    return donor_ID;
    }
    public String getdonor_name(){
    
    return donor_name;
    }
    
     public String getdonor_age(){
    
    return donor_age;
    }
     
      public String getdonor_gender(){
    
    return donor_gender;
    }
      
       public String getdonor_Bloodgroup(){
    
    return donor_Bloodgroup;
    }
        public String getdonor_reg_date(){
    
    return donor_reg_date;
    }
        
         public String getCity_ID(){
    
    return City_ID;
    }
         
          public String getstaff_ID(){
    
    return staff_ID;
    }
           public String getEligibility(){
    
    return Eligibility;
    }
            
    
}
