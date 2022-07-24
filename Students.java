package assignment4;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println(id);		
	}
	public void getStudentInfo(String name,String email)
	{
	
		System.out.println(name);
		System.out.println(email);
	}
	public void getStudentInfo(int phonenumber,String dept)
	{
	System.out.println(phonenumber);
	System.out.println(dept);
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(123);
		s.getStudentInfo("Dhevasena", "dheva@gmail.com");
		s.getStudentInfo(91823827,"CSE");

	}

}
