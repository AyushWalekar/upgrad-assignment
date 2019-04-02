/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

/**
 * Student class - Object of this class stores student's info.
 * @author ayush
 */
class Student implements Comparable<Student> {

    String name;
    float cgpa;
    int tokenNumber;
    /**
     * Creates Student object with provided values
     * @param name
     * @param cgpa
     * @param tokenNumber 
     */
    public Student(String name, float cgpa, int tokenNumber) {
        this.name = name;
        this.cgpa = cgpa;
        this.tokenNumber = tokenNumber;
    }

    /**
     * Comparator to set the priorities conditions
     * @param st
     * @return 
     */
    @Override
    public int compareTo(Student st) {
        if (cgpa > st.cgpa) {
            return -1;
        } else if (cgpa < st.cgpa) {
            return 1;
        } else if (name.compareTo(st.name) < 0) {
            return -1;
        } else if (name.compareTo(st.name) > 0) {
            return 1;
        } else if (name.compareTo(st.name) == 0) {
            if (tokenNumber > st.tokenNumber) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }

}
