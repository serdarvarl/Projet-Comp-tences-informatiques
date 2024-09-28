public class Pietons {
    private boolean enMovementP;
    double axeXP;
    double axeYP;
    public Pietons(){
        this.enMovementP=enMovementP;

    }

    public boolean isEnMovementP() {
        return enMovementP;
    }

    public double getAxeXP() {
        return axeXP;
    }

    public double getAxeYP() {
        return axeYP;
    }

    public boolean testerMovement(Feu feu){
        if (feu.getCouleur().equals("rouge"))
            return this.enMovementP=true;
        else
            return this.enMovementP= false;
    }
}
