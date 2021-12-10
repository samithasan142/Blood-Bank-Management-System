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
class User {
    
    private int DonationNumber,GivenAmount;
    private String Hospital,CollectionDate;
    
    public User(int DonationNumber,String Hospital,String CollectionDate,int GivenAmount){
        
        this.DonationNumber=DonationNumber;
        this.Hospital = Hospital;
        this.CollectionDate =CollectionDate;
        this.GivenAmount = GivenAmount;
    
    
    }

    public int getDonationNumber() {
        return DonationNumber;
    }

    public int getGivenAmount() {
        return GivenAmount;
    }

    public String getHospital() {
        return Hospital;
    }

    public String getCollectionDate() {
        return CollectionDate;
    }
    
    
}
