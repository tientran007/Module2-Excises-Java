package com.tientranjav.oop;

public class main {
    static class Student {
        int id;
        String name;
        int classId;
        String email;
        float mathScore;
        float historyScore;
        static int a = 0;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student(int id, int classId, float mathScore, float historyScore) {
            this.id = id;
            this.classId = classId;
            this.mathScore = mathScore;
            this.historyScore = historyScore;
        }

        public String toString() {
            return "Id: " + id + "; Name: " + name + "; ClassID: " + classId + "; Email: " + email + "; Math Score: " + mathScore + "; History Score: " + historyScore;
        }

        public float gpa() {
             return (mathScore + historyScore) / 2;
        }
    }

    public static void main(String[] args) {
        Student tien = new Student(1, 8, 8.5f, 9.5f);
        tien.name = "Tran Quang Tien";
        tien.email = "tqtteams1st@gmail.com";
        System.out.println(tien);
        System.out.println("GPA Math and History: " + tien);
    }
}