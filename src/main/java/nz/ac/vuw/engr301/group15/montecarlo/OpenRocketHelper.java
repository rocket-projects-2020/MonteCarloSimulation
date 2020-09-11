package nz.ac.vuw.engr301.group15.montecarlo;

import java.io.InputStream;
import net.sf.openrocket.document.OpenRocketDocument;
import net.sf.openrocket.document.Simulation;
import net.sf.openrocket.simulation.exception.SimulationException;
import net.sf.openrocket.file.*;
import java.io.File;

import net.sf.openrocket.simulation.listeners.*;

/**
 * An OpenRocket Helper
 *
 * @author Michael, Georgia
 */
public class OpenRocketHelper {

    public OpenRocketHelper() {
    }

    /**
     * Load .ork document.
     *
     * @param rocketFile  Name of file to load
     */
    public OpenRocketDocument loadORDocument(InputStream rocketFile) throws RocketLoadException {
        GeneralRocketLoader gen = new GeneralRocketLoader(new File("rocket-1-1-9.ork"));
        return gen.load(rocketFile);
    }

    /**
     * Runs a single simulation.
     *
     * @param simulation    Simulation object to run
     * @param listener      Listener to add to simulation
     */
    public void runSimulation(Simulation simulation, AbstractSimulationListener listener) {
        simulation.getOptions().randomizeSeed();
        try {
            simulation.simulate(listener);
        } catch (SimulationException exception) {
            exception.printStackTrace();
        }
    }

}
