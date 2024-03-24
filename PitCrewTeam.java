package Proyecto1_BrayanGonzalez_LucianaHoyos;

public class PitCrewTeam {
    // Properties
    private String name;
    private String rolName;
    private String timeIntoTheCrew;
    private char Boss;
    public int contador = 0;

    // Constructors
    public PitCrewTeam(String name, String rolName, String timeIntoTheCrew, char Boss) {
        this.name = name;
        this.rolName = rolName;
        this.timeIntoTheCrew = timeIntoTheCrew;
        this.Boss = Boss;
    }
    public PitCrewTeam(){
        
    }
    
    // Setters & Getters
    public String getName() {
        return this.name;
    }

    public String getRolName() {
        return this.rolName;
    }

    public String getTimeIntoTheCrew() {
        return this.timeIntoTheCrew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public void setTimeIntoTheCrew(String time) {
        this.timeIntoTheCrew = time;
    }
    public char getBoss() {
        return Boss;
    }
    public void setBoss(char boss) {
        Boss = boss;
    }
    
    // Other methods
    public void enterToPit(int complete){
        
        AllTeam(complete);

    }
    //Based on the effectiveness of the entire crew, this method evaluates if the change was fast or not.
    private void AllTeam(int complete) {
        if(complete == 21){
            System.out.println("\nThe driver got in and out of the pits in good time.");
        }else if (complete <21){
            System.out.println("\nThe driver got in and out of the pits with a delay due to the workers fatigue.");
        }else{
            System.out.println("\nMaybe we got a problem.");
        }
        toRest();
    }
    //This method prints that the team is going to rest after being used.
    private void toRest() {
        contador += 1;
        System.out.println("\nThe team is going to rest.");
        System.out.println("The pits have been used " + contador + " times.");

    }
}