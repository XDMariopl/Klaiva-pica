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
			str+=picaTopings+" |\n";
		}
		if(!Drinks.equals("-")) {
			str+=Drinks+"|";
		}
		return str;
	}

}
