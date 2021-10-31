package unit11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignUp extends JFrame{
	public SignUp(){
		setSize(500,500);
		setTitle("Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); 
		JTextField firstName=new JTextField(10);
		firstName.setBounds(40,50,180,40);
		add(firstName);	
		
		JTextField lastName=new JTextField();
		lastName.setBounds(250,50,180,40);
		add(lastName);
		
		JTextField userName=new JTextField();
		userName.setBounds(40,100,390,40);
		add(userName);
		
		JPasswordField passwordField=new JPasswordField();
		passwordField.setBounds(40,150,390,40);
		add(passwordField);
		
		JLabel birthdayLabel=new JLabel("Birthday?");
		birthdayLabel.setBounds(40,200,90,30);
		add(birthdayLabel);
		JComboBox<String>option=new JComboBox<>();
		option.setBounds(30,250,90,30);
		option.addItem("Jan");
		option.addItem("Feb");
		option.addItem("Mar");
		option.addItem("Apr");
		option.addItem("May");
		option.addItem("Jun");
		option.addItem("Jul");
		option.addItem("Aug");
		option.addItem("Sept");
		option.addItem("Oct");
		option.addItem("Nov");
		option.addItem("Dec");
		
		JComboBox<String>dayOption=new JComboBox<>();
		dayOption.setBounds(150,250,90,30);
		dayOption.addItem("1");
		dayOption.addItem("2");
		dayOption.addItem("3");
		dayOption.addItem("4");
		dayOption.addItem("5");
		dayOption.addItem("6");
		dayOption.addItem("7");
		dayOption.addItem("8");
		dayOption.addItem("9");
		dayOption.addItem("10");
		dayOption.addItem("11");
		dayOption.addItem("12");
		dayOption.addItem("13");
		dayOption.addItem("14");
		dayOption.addItem("15");
		dayOption.addItem("16");
		dayOption.addItem("17");
		dayOption.addItem("18");
		dayOption.addItem("19");
		dayOption.addItem("20");
		dayOption.addItem("21");
		dayOption.addItem("22");
		dayOption.addItem("23");
		dayOption.addItem("24");
		dayOption.addItem("25");
		dayOption.addItem("26");
		dayOption.addItem("27");
		dayOption.addItem("28");
		dayOption.addItem("29");
		dayOption.addItem("30");
		dayOption.addItem("31");
		
		JComboBox<String>yearOption=new JComboBox<>();
		yearOption.setBounds(270,250,90,30);
		yearOption.addItem("2021");
		yearOption.addItem("2020");
		yearOption.addItem("2019");
		
		JLabel gender=new JLabel("Gender?");
		gender.setBounds(40,300,90,30);
		add(gender);
		JRadioButton r1=new JRadioButton("Female");    
		JRadioButton r2=new JRadioButton("Male");    
		JRadioButton r3=new JRadioButton("Custom");  
		r1.setBounds(40,320,90,30);    
		r2.setBounds(140,320,90,30);
		r3.setBounds(230,320,90,30);
		ButtonGroup bg=new ButtonGroup(); 
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		option.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(option);
		
		add(dayOption);
		add(yearOption);
		add(gender);
		add(r1);
		add(r2);
		add(r3);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SignUp();
	}
}