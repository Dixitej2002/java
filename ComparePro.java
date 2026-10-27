import java.util.ArrayList;
import java.util.Collections;

public class ComparePro {
    public static void main(String[] args) {
        ArrayList<Student1> std = new ArrayList<>();

        std.add(new Student1("Amit", 21));
        std.add(new Student1("Dixit", 25));
        std.add(new Student1("Sarita", 12));

        Collections.sort(std);

        for(Student1 s : std){
            System.out.println(s.getName() + " " + s.getAge());
        }

    }
}