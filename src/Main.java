//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Feu feu = new Feu();
        feu.changerCouleur("Vert");
        Pietons p=new Pietons(true,12,13);
        Vehicules v=new Vehicules(true,13,15);
        System.out.println(p.testerMovement(feu));
        System.out.println(v.calculerDistance(p));
        System.out.println(v.calculerAngle(p));
        System.out.println(v.verifierArret(p,3,180));

//Travail inspiré de chatgbt.
    }
}