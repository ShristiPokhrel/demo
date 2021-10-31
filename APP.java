package unit11;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class APP {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Hello from Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JLabel helloLabel=newJLabel("Hello World!");
		helloLabel.setBounds(50,50,80,50);
		
	}

}
