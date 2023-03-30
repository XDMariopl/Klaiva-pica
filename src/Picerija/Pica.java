package Picerija;

public class Pica {
	String picaName;
	String picaSize;
	String picaTopings;
	String Drinks;
	
	Pica(String picaName,String picaSize,String picaTopings,String Drinks){
		this.picaName=picaName;
		this.picaSize=picaSize;
		this.picaTopings=picaTopings;
		this.Drinks=Drinks;
	}
	String check(){
		String str="Pica: "+picaName+" "+picaSize+" ";
		
		if(!picaTopings.equals("-")) {
			str+=picaTopings+" |";
		}
		if(!Drinks.equals("-")) {
			str+=Drinks+" |";
		}
		return str;
	}
	
	double picaSumma(){
		double sum=0;
		switch(picaName) {
		case "Vezuva":
			sum+=10;
			sum+=sizeSumma()+toppingSumma()+drinkSumma();
		break;
		case "Margarita":
			sum+=9;
			sum+=sizeSumma()+toppingSumma()+drinkSumma();
		break;
		case "Havajiešu":
			sum+=11;
			sum+=sizeSumma()+toppingSumma()+drinkSumma();
		break;
		}
		return sum;
	}
	double sizeSumma(){
		double sum=0;
		switch(picaSize) {
		case "small":	sum-=2;	break;
		case "large":	sum+=4;	break;
		}
		return sum;
	}
	
	double toppingSumma(){
		double sum=0;
		switch(picaTopings) {
		case "Peperoni":	sum+=2.40;	break;
		case "mocorelas siers":	sum+=2.20;	break;
		}
		return sum;
	}
	
	double drinkSumma(){
		double sum=0;
		switch(Drinks) {
		case "Coca-Cola":	sum+=2;	break;
		case "Sprite":	sum+=1.85;	break;
		case "Fanta":	sum+=1.9;	break;
		}
		return sum;
	}

}
