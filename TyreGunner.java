package Proyecto1_BrayanGonzalez_LucianaHoyos;
public class TyreGunner extends PitCrewTeam implements TeamDriverA{
    //Propierties
    private int energy = 100;

    //Constructors
    public TyreGunner(String name, String rolName, String timeIntoTheCrew, char Boss){
        super(name, rolName, timeIntoTheCrew, Boss);
    }
    public TyreGunner(PitCrewTeam Member){

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
    private int TyreGunnerAction(){
        int complete = 0;
        if (energy > 0){
            this.energy = energy-25;
            System.out.println("\nThe Tyre Gunner operates the pneumatic wheel gun to remove and install the wheel nut.");
            complete = 1;
        }else{
            System.out.println("\nThe Tyre Gunner is  already tired.");
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
        System.out.println("\n" + Member.getName() + " is the name of the " + Member.getRolName() + " and works for the boss:  " + RBoss + " and is " + Member.getTimeIntoTheCrew() + " into the team."+ " The "+ Member.getRolName() + " energy is: " +this.energy + ".");
    }
    public int PitAction(PitCrewTeam member, F1Team team){
        int x = TyreGunnerAction();
        return x;
    }
}
