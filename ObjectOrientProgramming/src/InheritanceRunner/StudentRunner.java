package InheritanceRunner;

public class StudentRunner {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("KimJeaHyeok");
//		student.setEmail("gksrnrrl6gh@naver.com");
//		 
//		Person person = new Person();
//		person.setName("김재혁");
//		person.setEmail("gksrnrrl6gh@naver.com");
//		person.setPhoneNumber("010-2725-7066");
//		String value = person.toString();
//	System.out.println(value);
//	System.out.println(person);
		Employee employee = new Employee("KimJeahyeok","Programmer Analyst");
		
		employee.setEmail("gksrnrrl6gh@naver.com");
		employee.setTitle("치킨");
		employee.setEmployer("Programmer Analyst");
		employee.setEmployeeGrade("A");
		
	//System.out.println(employee);
	
	}

}
