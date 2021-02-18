
package com.valuemomentum.training.collections;import java.lang.*;
public class Student8 implements Comparable<Student8> {
    int rollNo;
    String name;
    int age;
    public Student8(int rollNo, String name, int age) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student8 st) {
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
   
}