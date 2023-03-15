package Picerija;

import javax.swing.JOptionPane;

public class Main {
	static void pasutijums(){
		
	}
	
	static void uzvietas(){
		
	}

	public static void main(String[] args) {
		String[] options = {"Pasutijums","Uz vietas","stop"};
		String izvele;
		do{
			izvele=(String)JOptionPane.showInputDialog(null,"Izvelies ka edisiet picu?","How?",JOptionPane.QUESTION_MESSAGE,null, options,options[0]);
			switch(izvele){
			case"Pasutijums":
				pasutijums();
				break;
				
			case"Uz vietas":
				uzvietas();
				break;
				
			case"stop":
				JOptionPane.showMessageDialog(null, "Programa tik apturçta");
				System.exit(0);
			}
			
		}while(!izvele.equalsIgnoreCase("stop"));
		

	}

}
