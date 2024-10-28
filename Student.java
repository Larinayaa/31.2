import java.util.ArrayList;
import java.util.List;
public class Student implements Comparable<Student>{
    private String name;
    private List<Integer> rates;
    private double number;
    public Student(String name, List<Integer> rates) {
        this.name = name;
        this.rates = new ArrayList<>(rates);
        this.number = ratingOcenok();
    }
    @Override
    public String toString() {
        return "Студент: " + name +
                ". Оценки: " + rates + ". (Средний балл: " + number +")";
    }
    public double getNumber() {
        return number;
    }
    private double ratingOcenok(){ //вычисление среднего балла
        if (rates==null || rates.size()==0){
            return 0;
        }
        double summa = 0.0;
        for (Integer i : rates){
            summa +=i;
        }
        return summa /rates.size();
    }
    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(number, otherStudent.number);
    }
}
