package Proyecto1_BrayanGonzalez_LucianaHoyos;
public class F1Team {
    // Properties
    private String name;
    private int yearOfFundation;
    private String owner;
    
    // Constructor
    public F1Team(String name, int yearOfFundation, String owner) {
        this.name = name;
        this.yearOfFundation = yearOfFundation;
        this.owner = owner;
    }

    // Setters & Getters
    public String getName() {
        return this.name;
    }

    public int getYearOfFundation() {
        return this.yearOfFundation;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfFundation(int yearOfFundation) {
        this.yearOfFundation = yearOfFundation;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Other methods
    //This method prints organazedly the info about the team.
    public void information(){
        System.out.println("\nName of the team: " + this.name + "\nYear of fundation: " + this.yearOfFundation+ "\nThe owner of the team: " + this.owner);
    }

}
