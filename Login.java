package unit11;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Login extends JFrame{
public Login() {
	JFrame frame=new JFrame();
	frame.setSize(400,400);
	frame.setTitle("Login");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	JLabel usernameLabel=new JLabel("Username:");
	usernameLabel.setBounds(50,50,80,20);
	frame.add(usernameLabel);
	JTextField usernameField=new JTextField();
	usernameField.setBounds(150,50,100,20);
	frame.add(usernameField);
//	password
	JLabel passwordLabel=new JLabel("Password:");
	passwordLabel.setBounds(50,80,80,20);
	frame.add(passwordLabel);
	JTextField passwordField=new JTextField();
	passwordField.setBounds(150,80,100,20);
	frame.add(passwordField);
/*	login
	JButton loginButton=new JButton("Login");
	loginButton.setBounds(150,120,100,20);
	frame.add(loginButton);
	loginButton.addActionListener();
	

	}*/
	frame.setVisible(true);
}
public static void main(String[] args) {
	new Login();
}
}
/*class LoginController implements ActionListener{
 * @Override
	public void actionPerformed(ActionEvent e){
	String username=usernameField.gettext();
	String password=passwordField.gettext();
	System.out.println("username is:"+username);
	if(username.length()<=5)
	JOptionPane.showMessageDailaog(null,"Username length should be greater than 5");
	System.out.println("password is:"+password);
	JOptionPane.showMessageDialog(null,"Hello World");
 */

