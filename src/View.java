

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class View extends JFrame {
	
	private JTextField Num1,Num2,Result;
	private static final String[] Operations =
	{"Add + ","Sub - ","Multi ×","Div ÷","sqr"};
	private JButton[] buttons; 
    private double firstNum,secNum;
    private JLabel firstNumLabel , secNumLabel,resultLabel;
	private JPanel p1,p2,p3;
	public View() {
		// TODO Auto-generated constructor stub
		super("Simple Calculator using MVC");
		firstNumLabel= new JLabel(" First Number");
		secNumLabel= new JLabel("Second Number");
		resultLabel= new JLabel("Result");
        Num1= new JTextField (12);
        Num2= new JTextField (12);
        Result= new JTextField (12);
        Result.setEditable(false);	
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();        
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
        p3.setLayout(new GridLayout(1,4));
		p1.add(firstNumLabel);
		p1.add(Num1);
		p1.add(secNumLabel);
		p1.add(Num2);
		p2.add(resultLabel);
		p2.add(Result);
		buttons = new JButton[Operations.length];
		for ( int i = 0; i < Operations.length; i++ )
		{
		buttons[i] = new JButton( Operations[ i ] );
		p3.add( buttons[ i ] );
		}
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
	    }

	public  Double getFirstNumber(){
		firstNum= Double.parseDouble(Num1.getText());
		return firstNum;
	
	}
	public  Double getSecondNumber(){
		secNum= Double.parseDouble(Num2.getText());
		return secNum;
	}
	
	public void setResult(double x){
		Result.setText(Double.toString(x));
	}
	
	
	public  void addListner (ActionListener e){
	 buttons[0].addActionListener(e);
		
	}
	
	public  void subListner (ActionListener e){
		 buttons[1].addActionListener(e);
			
		}
	
	public  void multListner (ActionListener e){
		 buttons[2].addActionListener(e);
			
		}
	public  void divListner (ActionListener e){
		 buttons[3].addActionListener(e);
			
		}
	public  void sqrListner (ActionListener e){
		 buttons[4].addActionListener(e);
			
		}
	
	public void errorMessage (String s){
		JOptionPane.showMessageDialog(this ,s, "Error Message",JOptionPane.ERROR_MESSAGE);
	}
	}
