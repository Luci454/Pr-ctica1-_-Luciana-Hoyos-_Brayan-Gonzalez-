package Proyecto1_BrayanGonzalez_LucianaHoyos;

public class FrontWingFlap extends PitCrewTeam implements TeamDriverB{
    private int energy = 100;

    //Constructors
    public FrontWingFlap(String name, String rolName, String timeIntoTheCrew, char Boss){
        super(name, rolName, timeIntoTheCrew, Boss);
    }
    public FrontWingFlap(PitCrewTeam Member){

    }
    //Getters & Setters
    public int getEnergy() {
        return energy;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    //Other Methods
    //Evaluates if the energy of the member is enough to continue with the solicitated task.
    private int FrontWingFlapAction(){
        int complete = 0;
        if (energy > 0){
            this.energy = energy-35;
            System.out.println("\nThe Front Wing Flap apply aerodynamic changes to the front wing.");
            complete = 1;
        }else{
            System.out.println("\nThe Front Wing Flap is  already tired.");
            complete = 0;
        }
        return complete;
    }
    //The presentation is diferent for each member of the crew.
    @Override
    public void presentation(PitCrewTeam Member, F1Team team) {
        String RBoss = "";
        if(Character.toUpperCase(Member.getBoss()) == 'A'){
            RBoss = "Driver A";
        } else if(Character.toUpperCase(Member.getBoss())== 'B'){
            RBoss = "Driver B";
        }else{
            RBoss = team.getOwner();
        }
        System.out.println("\n" + Member.getName() + " is the name of the " + Member.getRolName() + " and works for the boss:  " + RBoss + " and is " + Member.getTimeIntoTheCrew() + " into the team."+ " The "+ Member.getRolName() + " energy is: " +this.energy+".");
    }
    public int PitAction(PitCrewTeam member, F1Team team){
        int x = FrontWingFlapAction();
        return x;
    }
}
