public class Vehicules {
    private boolean enMovement;
    public  Vehicules(){
        this.enMovement=false;
    }

    public boolean getEnmovement(){
        return this.enMovement;
    }


    public void verifierFeu(Feu feu) {
        if (feu.getCouleur().equals("Vert"))
            this.enMovement=true;
        else
            this.enMovement=false;

    }

}
