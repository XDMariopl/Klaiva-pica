package Picerija;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	static DecimalFormat df= new DecimalFormat("0.00");
	static String[]yesOrNo={"Ja","Ne"};
	static String[]size={"small","medium","large"};
	static String[]topings={"-","Peperoni","mocorelas siers"};
	static String[]whatpica={"Vezuva","Margarita","Havajiešu"};
	static String[]drinks={"-","Coca-Cola","Sprite","Fanta"};
	static String picaslieums,piedevas,dzeriens,pizzaName;
	static ArrayList<Pica> pizza = new ArrayList<Pica>();
	static int pizzaCount=0;
	static boolean vienadas=true;
	static int cikpicas,i=0;
	
	static void picasPas(){
		pizzaName=(String) JOptionPane.showInputDialog(null,"Vezuva 10.00 Eur| Margarita 9.00 Eur| Hvajiesu 11.00 Eur","Pica",JOptionPane.QUESTION_MESSAGE,null,whatpica,whatpica[0]);
		picaslieums=(String) JOptionPane.showInputDialog(null,"Small -2.00 Eur| Medium +0.00 Eur| Large +4.00 Eur","Lielums",JOptionPane.QUESTION_MESSAGE,null,size,size[1]);
		piedevas=(String) JOptionPane.showInputDialog(null,"Peperoni +2.40 Eur| Mocorelas siers +2.20 Eur|","Piedevas", JOptionPane.QUESTION_MESSAGE,null,topings,topings[0]);
		dzeriens=(String) JOptionPane.showInputDialog(null,"Coca-Cola +2.00 Eur| Sprite +1.85 Eur| Fanta +1.90 Eur","Dzerieni", JOptionPane.QUESTION_MESSAGE,null,drinks,drinks[0]);
		pizza.add(new Pica(pizzaName,picaslieums,piedevas,dzeriens));
	}
	
	static void pasutijums(){
		String adrese=(String)JOptionPane.showInputDialog("Ievadi uz kuru adresi sutisiet picu.");
		String StrCheck="";
		double sum=0;
		do{
		cikpicas=Integer.parseInt(JOptionPane.showInputDialog("Cik picas pasutisiet?"));
		}while(cikpicas<=0);
		if(cikpicas!=1){
			if(JOptionPane.showInputDialog(null,"Vai visas picas bus vienadas","?",JOptionPane.QUESTION_MESSAGE,null,yesOrNo,yesOrNo[0])=="Ne"){
				vienadas=false;
			}
		}
		if(vienadas==true){
			picasPas();
			StrCheck+=pizza.get(pizzaCount).check();
			sum=pizza.get(pizzaCount).picaSumma()*cikpicas;
			pizzaCount++;
			JOptionPane.showMessageDialog(null, StrCheck+"| *"+cikpicas+"\nbez PVN:"+sum+"\nar PVN:"+df.format(sum+(sum*0.21))+"\n"+adrese);
		}else{
			for(i=0+pizzaCount;i<cikpicas;i++){
				picasPas();
				sum+=pizza.get(i).picaSumma();
				StrCheck+=pizza.get(i).check()+" | "+pizza.get(i).picaSumma()+"\n";
			}
			pizzaCount+=i;
			JOptionPane.showMessageDialog(null, StrCheck+"\nbez PVN: "+sum+"\nar PVN:"+df.format(sum+(sum*0.21))+"\n"+adrese);
		}
	}
	static void uzvietas(){
		String StrCheck="";
		double sum=0;
		do{
		cikpicas=Integer.parseInt(JOptionPane.showInputDialog("Cik picas pasutisiet?"));
		}while(cikpicas<=0);
		if(cikpicas!=1){
			if(JOptionPane.showInputDialog(null,"Vai visas picas bus vienadas","?",JOptionPane.QUESTION_MESSAGE,null,yesOrNo,yesOrNo[0])=="Ne"){
				vienadas=false;
			}
		}
		if(vienadas==true){
			picasPas();
			StrCheck+=pizza.get(pizzaCount).check();
			sum=pizza.get(pizzaCount).picaSumma()*cikpicas;
			pizzaCount++;
			JOptionPane.showMessageDialog(null, StrCheck+"| *"+cikpicas+"\nbez PVN: "+sum+"\nar PVN:"+df.format(sum+(sum*0.21)));
		}else{
			for(i=0+pizzaCount;i<cikpicas;i++){
				picasPas();
				sum+=pizza.get(i).picaSumma();
				StrCheck+=pizza.get(i).check()+" | "+pizza.get(i).picaSumma()+"\n";
			}
			pizzaCount+=i;
			JOptionPane.showMessageDialog(null, StrCheck+"\nbez PVN: "+sum+"\nar PVN: "+df.format(sum+(sum*0.21)));
		}
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
				JOptionPane.showMessageDialog(null, "Programa tik apturēta");
				System.exit(0);
			}
			
		}while(!izvele.equalsIgnoreCase("stop"));
		

	}

}
