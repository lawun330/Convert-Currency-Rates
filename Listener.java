import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class Listener extends JDialog implements ActionListener {

  // instance variable to store answer
  public String answer;

  // implementation of a method in ActionListener interface
  public void actionPerformed(ActionEvent e) {
    answer = e.getActionCommand(); // label of the button that generated event "e"
    dispose(); // destroy all components
  }
}
