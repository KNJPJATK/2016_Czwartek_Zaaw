package kolo;

/**
 * Created by rpi on 13.10.2016.
 */
public class Student extends Person {

    private String indexNo;

    public Student(String firstName, String lastName, int age, String indexNo) {
        super(firstName, lastName, age);
        this.indexNo = indexNo;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNo='" + indexNo + '\'' +
                '}';
    }
}
