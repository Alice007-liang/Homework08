
public class Student implements Comparable<Student> {
	
	private String id;
	private String name;
	private Integer age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student s) {
		//主要条件 按照年龄排序
		int num = this.getAge()-s.getAge();
		//次要条件1 年龄相同，学号不一定相同
		num = num==0?this.getId().compareTo(s.getId()):num;
		//次要条件2 年龄，学号相同，姓名不一定相同
		num = num==0?this.getName().compareTo(s.getName()):num;
		
		return num;
	}
	
	

}

