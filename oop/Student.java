package com.tientranjav.oop;

class Student {
    int id;
    String name;
    int classId;
    String email;
    float mathScore;
    float historyScore;

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    ;

    public Student(int id, int classId, float mathScore, float historyScore) {
        this.id = id;
        this.classId = classId;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
    }

    ;


    public String toString() {
        return "Id: " + id + "Name: " + name + "ClassID: " + classId + "Email: " + email + "Math Score: " + mathScore + "History Score: " + historyScore;
    }

    public float gpa() {
        return (mathScore + historyScore) / 2;
    }

    ;
}

