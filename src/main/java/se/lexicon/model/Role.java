package se.lexicon.model;

public enum Role {

    TECHNICAL_SUPPORT(3000),
    ENGINEER(4000),
    SALE(3000),
    MANAGER(4000),
    DEVELOPER(3000),
    HUMAN_RESOURCE(3000),
    CEO(6000);

    private double bonus;


    //Constructor
    Role(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


}
