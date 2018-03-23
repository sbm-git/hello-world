package person;

public class Person {
	String rollNum;
	String name;
	
	public Person(String rollNum, String name){
		this.rollNum = rollNum;
		this.name = name;
		
	}

	
	public String printPerson(){
		return ("Roll Num " + this.rollNum + " name " + this.name);
	}
}
