package com.leetcode.solution.mid;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test {

    static class Student implements Comparable<Student> {
        private String name;
        private String address;
        private Integer age;

        public Student(String name,String address,Integer age){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", age=" + age +
                    '}';
        }
        public Integer getAge(){
            return age;
        }



        @Override
        public int compareTo(Student student) {
            return this.age - student.getAge();
        }
    }
    public static void main(String[] args) {
        List list = new ArrayList<Student>();
        list.add(new Student("1", "2", 5));
        list.add(new Student("2", "3", 3));
        Collections.sort(list);
        System.out.println(list);
    }

}
