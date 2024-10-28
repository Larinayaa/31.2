/*
Hanna Kovalchuk gr 53
 */
import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            Student[] students = {
                    new Student("Лиза", List.of(5,9,1,7,8,9)),
                    new Student("Вова", List.of(6,9,11,4,5)),
                    new Student("Катя", List.of(8,9,5,9,10,7)),
                    new Student("Саша", List.of(4,7,6,5,5,9))
            };
            System.out.println("Перечень студентов...");
            print(students); //просто вывод студентов
            Arrays.sort(students);
            System.out.println("Происходит сортировка по возрастанию среднего балла...");
            print(students);
            System.out.println("Сортировка окончена.");
        }

        public static void print(Student[] students){
            for (Student student:students){
                System.out.println(student);
            }
        }
    }
