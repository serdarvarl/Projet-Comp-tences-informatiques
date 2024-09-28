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
        return Math.sqrt(dx * dx + dy * dy); // Calcul de la distance euclidienne
    }
    public double calculerAngle(Pietons pieton) {
        double dx = pieton.getAxeXP() - this.axeXV;
        double dy = pieton.getAxeYP() - this.axeYV;
        return Math.atan2(dy, dx);
    }
    public void verifierArret(Pietons pieton, double distanceSeuil, double angleSeuil) {
        double distance = calculerDistance(pieton);
        double angle = Math.toDegrees(calculerAngle(pieton)); // Convertir l'angle en degrés

        if (distance <= distanceSeuil && Math.abs(angle) <= angleSeuil) {
            this.enMovement = true;
            System.out.println("Le véhicule s'arrête.");
        } else {
            this.enMovement = false;
            System.out.println("Le véhicule continue.");
        }
    }


}
