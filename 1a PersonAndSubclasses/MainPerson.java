
//MainPerson.java
	
class MainPerson
{
	public static void main(String args[]){
		Person p2 = new Person("XYZ","BlockX");
		System.out.println(p2);

		p2.setAddress("Block2");
		System.out.println("Name :" +p2.getName()+" Address :  " +p2.getAddress());
		
		Student s2 = new Student("Rita","Block1","CSE",2016,15000);
		System.out.println(s2);

		s2.setProgram("ECE");
		s2.setYear(2015);
		s2.setFee(20000);
		System.out.println("Program :" +s2.getProgram()+"Year : " +s2.getYear()+ "Fee : "+s2.getFee());

		Staff s4 = new Staff("Gita","Block3","KV School",50000);
		System.out.println(s4);

		s4.setSchool("Tagore School");
		s4.setPay(60000);
		System.out.println("School : "+s4.getSchool()+ "Pay : " +s4.getPay());
	}
}
