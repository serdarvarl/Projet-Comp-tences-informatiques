//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Feu feu = new Feu();
        feu.changerCouleur("Vert");
        System.out.println(feu.getCouleur());
        Pietons p=new Pietons();
        p.testerMovement(feu);
        System.out.println(p.getEnMovementP());
        feu.changerCouleur("vert");
        p.testerMovement(feu);
        System.out.println(p.getEnMovementP());

//Travail inspiré de chatgbt.
    }
}