package org.example.CreationalDesignPatterns.AbstractFactory;

interface StudentFactory {
    Student createStudent(String name, int studentID);
}