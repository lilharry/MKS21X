import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("toC");
	b.addActionListener(this);
	b.setActionCommand("toC");
	JButton b2 = new JButton("toF");
	b2.addActionListener(this);
	b2.setActionCommand("toF");


	t = new JTextField(10);

	JCheckBox c = new JCheckBox("OverClock");
	j = new JLabel("Meaning of life is... ");
	pane.add(c);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }
    
    public static double CtoF(double t){
	return t * 1.8 + 32.0;
    }
    public static double FtoC(double t){
	return (t - 32.0)/1.8;
    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("toC")){
	    String s = t.getText();
	    try{
		j.setText(""+FtoC(Integer.parseInt(s)));
	    }catch (NumberFormatException x){
	        System.out.println("Use a valid integer!");
	    }
	}
	if(event.equals("toF")){
	    String s = t.getText();
	    try{
		j.setText(""+CtoF(Integer.parseInt(s)));
	    }catch (NumberFormatException x){
		System.out.println("Use a valid integer!");
	    }
	}
    }
 
    
    
}
