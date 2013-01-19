
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Experiment extends JFrame{	
	  public Experiment() {
			       setTitle("Simple example");
			       setSize(300, 200);
			       setLocationRelativeTo(null);
			       setDefaultCloseOperation(EXIT_ON_CLOSE);
			    }
		
			    public static void main(String[] args) {
			        SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                Example ex = new Example();
			                ex.setVisible(true);
			            }
			        });
			    }
			}
	
