import static java.lang.Math.*;

public class Vehicules {
    private boolean enMovement;
    double axeXV;
    double axeYV;


    public Vehicules() {
        this.enMovement = false;
    }

    public boolean getEnmovement() {
        return this.enMovement;
    }


    public void verifierFeu(Feu feu) {
        if (feu.getCouleur().equals("Vert"))
            this.enMovement = true;
        else
            this.enMovement = false;

    }
    public double calculerDistance(Pietons pieton) {
        double dx = this.axeXV - pieton.getAxeXP();
        double dy = this.axeYV - pieton.getAxeYP();
        return sqrt(pow(dx,2) + pow(dy,2));
    }
    public double calculerAngle(Pietons pieton) {
        double dx = pieton.getAxeXP() - this.axeXV;
        double dy = pieton.getAxeYP() - this.axeYV;
        return atan2(dy, dx);
    }
    public void verifierArret(Pietons pieton, double distanceSeuil, double angleSeuil) {
        double distance = calculerDistance(pieton);
        double angle =toDegrees(calculerAngle(pieton)); // Convertir l'angle en degrés

        if (distance <= distanceSeuil && abs(angle) <= angleSeuil) {
            this.enMovement = true;
            System.out.println("Le véhicule s'arrête.");
        } else {
            this.enMovement = false;
            System.out.println("Le véhicule continue.");
        }
    }
}
