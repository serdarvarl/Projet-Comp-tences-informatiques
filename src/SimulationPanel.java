import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SimulationPanel extends JPanel {
    private Vehicules vehicle;
    private Pietons pedestrian;
    private Feu trafficLight;
    private Timer timer; // Timer for updating the simulation

    public SimulationPanel() {
        // Initialize the objects
        trafficLight = new Feu();
        trafficLight.changerCouleur("Vert"); // Set initial color to Green

        vehicle = new Vehicules(true, 100, 200); // Create a vehicle
        pedestrian = new Pietons(true, 200, 300); // Create a pedestrian

        // Timer to update the simulation every 100 ms (10 FPS)
        timer = new Timer(100, e -> updateSimulation());
    }

    public void startSimulation() {
        timer.start(); // Start the timer to run the simulation
    }

    private void updateSimulation() {
        // Update vehicle and pedestrian movement logic based on traffic light
        boolean vehicleMoving = vehicle.verifierArret(pedestrian, 100, 180); // Check if vehicle should stop
        boolean pedestrianMoving = pedestrian.testerMovement(trafficLight); // Check if pedestrian should move

        if (vehicleMoving) {
            // Move the vehicle to the left
            vehicle.axeXV -= 2;
        }

        if (pedestrianMoving) {
            // Move the pedestrian upward
            pedestrian = new Pietons(true, pedestrian.getAxeXP(), pedestrian.getAxeYP() - 2);
        }

        // Redraw the scene
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the traffic light
        g.setColor(trafficLight.getCouleur().equals("Vert") ? Color.GREEN : Color.RED);
        g.fillRect(50, 50, 20, 60); // Traffic light box

        // Draw the vehicle
        g.setColor(Color.BLUE);
        g.fillRect((int) vehicle.axeXV, (int) vehicle.axeYV, 50, 30); // Draw the car

        // Draw the pedestrian
        g.setColor(Color.ORANGE);
        g.fillOval((int) pedestrian.getAxeXP(), (int) pedestrian.getAxeYP(), 20, 20); // Draw the pedestrian
    }
}
