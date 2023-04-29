package se.yrgo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_STUDENT")
public class Student {
    // @Transient för att det inte ska bli en kolumn i tabellen
    private String enrollmentID;
    private String name;
    /*
     * @ManyToOne // works as a foreign key
     * 
     * @JoinColumn(name = "TUTOR_FK")
     * private Tutor tutor;
     */
    private Integer numberOfCourses;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Student() {
    }

    public Student(String name, String enrollmentID) {
        this.name = name;
        this.numberOfCourses = 10;
        this.enrollmentID = enrollmentID;
    }

    public int getId() {
        return id;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(String enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "NUM_COURSES")
    public Integer getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(Integer numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public void setId(int id) {
        this.id = id;
    }
    /*
     * public void allocateTutor(Tutor tutor) {
     * this.tutor = tutor;
     * }
     * 
     * public String getTutorName() {
     * return this.tutor.getName();
     * }
     * 
     * public Tutor getTutor() {
     * return tutor;
     * }
     */

    @Override
    public String toString() {
        return "Student: enrollmentID=" + enrollmentID + ", name = " + name + " " + ", id = "
                + id
                + "]";
    }
}
