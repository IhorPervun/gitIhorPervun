import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static final ArrayList<University> students = new ArrayList<>();

    public static void main(String[] args) {

        addStudents();
        students.sort(Comparator
                .comparing(University::getSurname)
                .thenComparing(University::getName, Comparator.reverseOrder()));
        students.forEach(University::print);
    }

    public static void addStudents() {
        students.add(new University("Pervun", "Ihor", "TYU", 3, 18));
        students.add(new University("Negrii", "Anna", "WER", 1, 22));
        students.add(new University("Kalyuzhny", "Bohdan", "SDF", 2, 20));
        students.add(new University("Serdyuk", "Victoria", "ASD", 5, 18));
        students.add(new University("Monko", "Ruslan", "ZXC", 5, 23));
        students.add(new University("Kalyuzhny", "Ruslan", "HJK", 4, 18));
        students.add(new University("Negrii", "Victoria", "IOP", 1, 19));
    }
}

