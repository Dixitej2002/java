public class Student1 implements Comparable<Student1>{
    private String name;
    private int age ;

    Student1(){

    }
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
	@Override
	public int compareTo(Student1 o) {
		return this.age - o.age;
	}



}
