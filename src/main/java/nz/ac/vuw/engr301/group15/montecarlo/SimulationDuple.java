package nz.ac.vuw.engr301.group15.montecarlo;

import java.util.ArrayList;
import net.sf.openrocket.simulation.SimulationOptions;
import net.sf.openrocket.simulation.SimulationStatus;

public class SimulationDuple {
  private SimulationOptions simulationOptions;
  private SimulationStatus simulationStatus;

  public SimulationDuple(SimulationOptions simulationOptions, SimulationStatus simulationStatus) {
    this.simulationOptions = simulationOptions;
    this.simulationStatus = simulationStatus;
  }

  public SimulationOptions getSimulationOptions() {
    return simulationOptions;
  }

  public void setSimulationOptions(SimulationOptions simulationOptions) {
    this.simulationOptions = simulationOptions;
  }

  public SimulationStatus getSimulationStatus() {
    return simulationStatus;
  }

  public void setSimulationStatus(SimulationStatus simulationStatus) {
    this.simulationStatus = simulationStatus;
  }

  /**
   * Gets the statuses from a list of duples.
   *
   * @param simulationDuples the duple list
   * @return a list of statuses
   */
  public static ArrayList<SimulationStatus> getStatuses(
          ArrayList<SimulationDuple> simulationDuples
  ) {
    ArrayList<SimulationStatus> simulationStatuses = new ArrayList<>();

    for (SimulationDuple simulationDuple : simulationDuples) {
      simulationStatuses.add(simulationDuple.getSimulationStatus());
    }

    return simulationStatuses;
  }

  /**
   * Gets the options from a list of duples.
   *
   * @param simulationDuples the duple list
   * @return a list of options
   */
  public static ArrayList<SimulationOptions> getOptions(
          ArrayList<SimulationDuple> simulationDuples
  ) {
    ArrayList<SimulationOptions> simulationOptions = new ArrayList<>();

    for (SimulationDuple simulationDuple : simulationDuples) {
      simulationOptions.add(simulationDuple.getSimulationOptions());
    }

    return simulationOptions;
  }
}
