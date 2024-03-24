package Proyecto1_BrayanGonzalez_LucianaHoyos;

public class Main {
    public static void main(String[] args) {
        //Instantiate all the members of the pit crew team, taking in account the amount of them that shall work for each driver.
        System.out.println("\n\nNow we are going to instantiate all the members of the pit crew team, taking in account the amount of them that shall work for each driver. \n\n");
        F1Team Ferrari = new F1Team("Ferrari Team", 1929, "Enzo Ferrari");
        int totalPitActions = 0;
        PitCrewTeam TYREGUNNER1 = new PitCrewTeam("Pedro Alvarez", "Tyre Gunner", " 2 years ", 'A');
        TyreGunner TyreGunner1 = new TyreGunner(TYREGUNNER1);

        TyreGunner1.presentation(TYREGUNNER1, Ferrari);
        TyreGunner1.PitAction(TYREGUNNER1, Ferrari);

        PitCrewTeam TYREGUNNER2 = new PitCrewTeam("Juan Arboleda", "Tyre Gunner","3 moths ",'A');
        TyreGunner TyreGunner2 = new TyreGunner(TYREGUNNER2);

        TyreGunner2.presentation(TYREGUNNER2, Ferrari);
        TyreGunner2.PitAction(TYREGUNNER2, Ferrari);

        PitCrewTeam TYREGUNNER3 = new PitCrewTeam("Alfred Bolognesa", "Tyre Gunner","5 moths ",'A');
        TyreGunner TyreGunner3 = new TyreGunner(TYREGUNNER3);

        TyreGunner3.presentation(TYREGUNNER3, Ferrari);
        TyreGunner3.PitAction(TYREGUNNER3, Ferrari);

        PitCrewTeam TYREGUNNER4 = new PitCrewTeam("Alejadra Duque", "Tyre Gunner","5 years ",'A');
        TyreGunner TyreGunner4 = new TyreGunner(TYREGUNNER4);

        TyreGunner4.presentation(TYREGUNNER4, Ferrari);
        TyreGunner4.PitAction(TYREGUNNER4, Ferrari);

        PitCrewTeam LOLLIPOP = new PitCrewTeam("Juan Duque", "Lollipop","5 years ",'A');
        Lollipop Lollipop = new Lollipop (LOLLIPOP);

        Lollipop.presentation(LOLLIPOP, Ferrari);
        Lollipop.PitAction(LOLLIPOP, Ferrari);

        PitCrewTeam TYREOFF1 = new PitCrewTeam ("Juana Vergara","Tyre Off","10 years ", 'B' ); 
        TyreOff TyreOff1 = new TyreOff (TYREOFF1);

        TyreOff1.presentation(TYREOFF1, Ferrari);
        TyreOff1.PitAction(TYREOFF1, Ferrari);

        PitCrewTeam TYREOFF2 = new PitCrewTeam ("Luciana Hoyos","Tyre Off","2 years ", 'B' ); 
        TyreOff TyreOff2 = new TyreOff (TYREOFF2);

        TyreOff2.presentation(TYREOFF2, Ferrari);
        TyreOff2.PitAction(TYREOFF2, Ferrari);

        PitCrewTeam TYREOFF3 = new PitCrewTeam ("Diego Fernando","Tyre Off","4 months ", 'B' ); 
        TyreOff TyreOff3 = new TyreOff (TYREOFF3);

        TyreOff3.presentation(TYREOFF3, Ferrari);
        TyreOff3.PitAction(TYREOFF3, Ferrari);

        PitCrewTeam TYREOFF4 = new PitCrewTeam ("Juanes Alonso","Tyre Off","6 years ", 'B' ); 
        TyreOff TyreOff4 = new TyreOff (TYREOFF4);

        TyreOff4.presentation(TYREOFF4, Ferrari);
        TyreOff4.PitAction(TYREOFF4, Ferrari);

        PitCrewTeam STEADIER1 = new PitCrewTeam ("Andres Agudelo", "Steadier", "10 months ", 'B');
        Steadier Steadier1 = new Steadier(STEADIER1);

        Steadier1.presentation(STEADIER1, Ferrari);
        Steadier1.PitAction(STEADIER1, Ferrari);

        PitCrewTeam STEADIER2 = new PitCrewTeam("Cristiano Ronaldo dos Santos Aveiro ", "Steadier", "7 years ", 'S');
        Steadier Steadier2 = new Steadier(STEADIER2);

        Steadier2.presentation(STEADIER2, Ferrari);
        Steadier2.PitAction(STEADIER2, Ferrari);

        PitCrewTeam TYREON1 = new PitCrewTeam ("Susana Pérez", "Tyre On", "7 years ", 'S');
        TyreOn TyreOn1 = new TyreOn (TYREON1);

        TyreOn1.presentation(TYREON1, Ferrari); 
        TyreOn1.PitAction(TYREON1, Ferrari);

        PitCrewTeam TYREON2 = new PitCrewTeam ("Rosita Ocampo", "Tyre On", "1 year ", 'S');
        TyreOn TyreOn2 = new TyreOn (TYREON2);

        TyreOn2.presentation(TYREON2, Ferrari); 
        TyreOn2.PitAction(TYREON2, Ferrari);

        PitCrewTeam TYREON3 = new PitCrewTeam ("Emiliano Osorio", "Tyre On", "1 month ", 'S');
        TyreOn TyreOn3 = new TyreOn (TYREON3);

        TyreOn3.presentation(TYREON3, Ferrari); 
        TyreOn3.PitAction(TYREON3, Ferrari);

        PitCrewTeam TYREON4 = new PitCrewTeam ("Juan Miguel chaparro", "Tyre On", "3 months ", 'S');
        TyreOn TyreOn4 = new TyreOn (TYREON4);

        TyreOn4.presentation(TYREON4, Ferrari); 
        TyreOn4.PitAction(TYREON4, Ferrari);

        PitCrewTeam REARJACK1 = new PitCrewTeam("Matias Panini","Rear Jack", "26 days ", 'S');
        RearJack rearjack1 = new RearJack(REARJACK1);

        rearjack1.presentation(REARJACK1, Ferrari);
        rearjack1.PitAction(REARJACK1, Ferrari);

        PitCrewTeam REARJACK2 = new PitCrewTeam("Emma Posada","Rear Jack", "4 months ", 'S');
        RearJack rearjack2 = new RearJack(REARJACK2);

        rearjack2.presentation(REARJACK2, Ferrari);
        rearjack2.PitAction(REARJACK2, Ferrari);

        PitCrewTeam FRONTJACK1 = new PitCrewTeam("Gustavo Marinez", "Front Jack", "7 years ", 'S');
        FrontJack frontJack1 = new FrontJack(FRONTJACK1);

        frontJack1.presentation(FRONTJACK1, Ferrari);
        frontJack1.PitAction(FRONTJACK1, Ferrari);

        PitCrewTeam FRONTJACK2 = new PitCrewTeam("Hamilton", "FrontJack", "9 months ", 'S');
        FrontJack frontJack2 = new FrontJack(FRONTJACK2);

        frontJack2.presentation(FRONTJACK2, Ferrari);
        frontJack2.PitAction(FRONTJACK2, Ferrari);

        PitCrewTeam FRONTWINGFLAP = new PitCrewTeam("Verstapenn", "Front Wing Flap", "20 days ", 's');
        FrontWingFlap frontwingflap = new FrontWingFlap(FRONTWINGFLAP);

        frontwingflap.presentation(FRONTWINGFLAP, Ferrari);
        frontwingflap.PitAction(FRONTWINGFLAP, Ferrari);
        
        PitCrewTeam FRONTWINGFLAP2 = new PitCrewTeam ("Francissco Alvarez", "Front Wing Flap", "9 months ", 'S');
        FrontWingFlap frontwingflap2 = new FrontWingFlap(FRONTWINGFLAP2);
        
        frontwingflap2.presentation(FRONTWINGFLAP2, Ferrari);
        frontwingflap2.PitAction(FRONTWINGFLAP2, Ferrari);

        
        //Use the pits
        System.out.println("\n\n\nNow we are going to use the pits when a driver arrives to see how it works.\n\n");
        totalPitActions += TyreGunner1.PitAction(TYREGUNNER1, Ferrari);
        totalPitActions += TyreGunner2.PitAction(TYREGUNNER2, Ferrari);
        totalPitActions += TyreGunner3.PitAction(TYREGUNNER3, Ferrari);
        totalPitActions += TyreGunner4.PitAction(TYREGUNNER4, Ferrari);
        totalPitActions += Lollipop.PitAction(LOLLIPOP, Ferrari);
        totalPitActions += TyreOff1.PitAction(TYREOFF1, Ferrari);
        totalPitActions += TyreOff2.PitAction(TYREOFF2, Ferrari);
        totalPitActions += TyreOff3.PitAction(TYREOFF3, Ferrari);
        totalPitActions += TyreOff4.PitAction(TYREOFF4, Ferrari);
        totalPitActions += TyreOn1.PitAction(TYREON1, Ferrari);
        totalPitActions += TyreOn2.PitAction(TYREON2, Ferrari);
        totalPitActions += TyreOn3.PitAction(TYREON3, Ferrari);
        totalPitActions += TyreOn4.PitAction(TYREON4, Ferrari);
        totalPitActions += Steadier1.PitAction(STEADIER1, Ferrari);
        totalPitActions += Steadier2.PitAction(STEADIER2, Ferrari);
        totalPitActions += rearjack1.PitAction(REARJACK1, Ferrari);
        totalPitActions += rearjack2.PitAction(REARJACK2, Ferrari);
        totalPitActions += frontJack1.PitAction(FRONTJACK1, Ferrari);
        totalPitActions += frontJack2.PitAction(FRONTJACK2, Ferrari);
        totalPitActions += frontwingflap.PitAction(FRONTWINGFLAP, Ferrari);
        totalPitActions += frontwingflap2.PitAction(FRONTWINGFLAP2, Ferrari);


        TYREGUNNER1.enterToPit(totalPitActions);
    }
}
