public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(16),
                new Student(154),
                new Student(145),
                new Student(14)
        };


        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j+1] = students[j];
            }
            students[j+1] = current;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
