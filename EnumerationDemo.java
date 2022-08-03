package test;
enum Family {
	CATHY(27,"female" ),
	REJATH(32, "male"),
	MARIAM(1, "female");
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	private Family(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	private  int age;
	private  String sex;
	

}

public class EnumerationDemo{
	public static void main(String[] args) {
	if(	Family.CATHY.getAge()>18) {
		System.out.println("Major");
	}
	Family member = Family.CATHY;
	System.out.println(member.getSex());
	
	Empliyee e = new Empliyee(22, 33);
	Empliyee e2 = e;
	e2.setAge(10000);
	System.out.println(e.getAge());
	}



}
