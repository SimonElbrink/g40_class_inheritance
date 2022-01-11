package se.lexicon.model;

public enum Role {

    CEO(6000),
    MANAGER(4000),
    DEVELOPER(3000),
    SUPPORT(3000),
    HUMAN_RESOURCE(3000),
    ENGINEER(4000);

    private double bonus;


    //Constructor
    Role(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


}
