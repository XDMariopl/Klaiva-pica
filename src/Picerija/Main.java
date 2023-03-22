package Picerija;

import javax.swing.JOptionPane;

public class Main {
	static String[]yesOrNo={"Ja","Ne"};
	static String[]size={"small(-3.00 Eur)","medium(orìinalâ cena)","large(+4.00 Eur)"};
	static String[]topings={"-","Peperoni","ðokolade","cilveku gaïa","mocorelas siers"};
	static String[]whatpica={"Vezuva","Margarita","Havajieðu"};
	static String adrese,picaslieums,piedevas,dzeriens="",pizzaName;
	static boolean vienadas=true;
	static int cikpicas;
	
	static void picasPas(){
		pizzaName=(String) JOptionPane.showInputDialog(null,"Izveleis kadu picu","Pica",JOptionPane.QUESTION_MESSAGE,null,whatpica,whatpica[0]);
		picaslieums=(String) JOptionPane.showInputDialog(null,"Izvelies picas lielumu","Lielums",JOptionPane.QUESTION_MESSAGE,null,size,size[1]);
		piedevas=(String) JOptionPane.showInputDialog(null,"Izvelies picas piedevas","Piedevas", JOptionPane.QUESTION_MESSAGE,null,topings,topings[0]);
		
	}
	
	static void pasutijums(){
		adrese=(String)JOptionPane.showInputDialog("Ievadi uz kuru adresi sutîsiet picu.");
		do{
		cikpicas=Integer.parseInt(JOptionPane.showInputDialog("Cik picas pasutisiet?"));
		}while(cikpicas<=0);
		if(cikpicas!=1){
			if(JOptionPane.showInputDialog(null,"Vai visas picas bus vienâdas","?",JOptionPane.QUESTION_MESSAGE,null,yesOrNo,yesOrNo[0])=="Ne"){
				vienadas=false;
			}
		}
		if(vienadas==true){
			picasPas();
		}else{
			for(int i=0;i<cikpicas;i++){
				picasPas();
			}
		}
		
		
		
		
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
