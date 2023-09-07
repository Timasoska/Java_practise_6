public class Student implements Comparable {
    int idNumber = 0;
    Student(int idNumber){
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.idNumber - ((Student) o).idNumber;
    }
}
