package nz.ac.vuw.engr301.group15.gui;

import org.jfree.chart.ChartPanel;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GraphWindow {
  private JComboBox<String> graphTypeComboBox;
  private JButton saveToFileButton;
  private JPanel rootPanel;
  private JButton exitButton;
  private JButton reRunButton;
  private JPanel graphPanel;

  private JTable simulationTable;

  /**
   * Constructor.
   */
  public GraphWindow(){

  }

  public JTable getSimulationTable() {
    return simulationTable;
  }

  public void addToGraph(ChartPanel chartPanel){
    graphPanel.add(chartPanel);
  }
  public JPanel getRootPanel() {
    return this.rootPanel;
  }

  public JPanel getGraphPanel() {
    return this.graphPanel;
  }

  public void setReRunButtonListener(ActionListener listener) {
    this.reRunButton.addActionListener(listener);
  }

  public void setVisible(boolean flag) {
    rootPanel.setVisible(flag);
  }

  public void doUIStuff() {
    exitButton.addActionListener(new ExitAction());
  }
}