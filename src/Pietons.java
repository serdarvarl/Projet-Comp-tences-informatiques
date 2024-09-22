public class Pietons {
    private boolean enMovementP;
    public Pietons(){
        this.enMovementP=enMovementP;

    }
    public boolean getEnMovementP(){
        return this.enMovementP=enMovementP;
    }
    public boolean testerMovement( Feu feu){
        if (feu.getCouleur().equals("rouge"))
            return this.enMovementP=true;
        else
            return this.enMovementP= false;
    }
}
