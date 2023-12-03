package org.example.CreationalDesignPatterns.FactoryPattern;

interface StudentFactory {
    Student createStudent(String name, int studentID);
}
