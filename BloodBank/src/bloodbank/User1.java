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
class User1 {
    
     private int BagNumber,QuantityAvailable;
     
    private String RedBloodCells,WhiteBloodCells,Platelets,Plasma,Heamoglobin;
    
    private int donorID;

    public User1(int BagNumber, int QuantityAvailable, String RedBloodCells, String WhiteBloodCells, String Platelets, String Plasma, String Heamoglobin, int donorID) {
        this.BagNumber = BagNumber;
        this.QuantityAvailable = QuantityAvailable;
        this.RedBloodCells = RedBloodCells;
        this.WhiteBloodCells = WhiteBloodCells;
        this.Platelets = Platelets;
        this.Plasma = Plasma;
        this.Heamoglobin = Heamoglobin;
        this.donorID = donorID;
    }

    public int getBagNumber() {
        return BagNumber;
    }

    public int getQuantityAvailable() {
        return QuantityAvailable;
    }

    public String getRedBloodCells() {
        return RedBloodCells;
    }

    public String getWhiteBloodCells() {
        return WhiteBloodCells;
    }

    public String getPlatelets() {
        return Platelets;
    }

    public String getPlasma() {
        return Plasma;
    }

    public String getHeamoglobin() {
        return Heamoglobin;
    }

    public int getDonorID() {
        return donorID;
    }

  
    
    
}
