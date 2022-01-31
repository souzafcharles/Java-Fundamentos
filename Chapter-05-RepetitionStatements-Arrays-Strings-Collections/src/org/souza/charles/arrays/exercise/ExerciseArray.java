package org.souza.charles.arrays.exercise;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 30, 2022
 */

import java.util.Scanner;

public class ExerciseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float grades[] = new float[10];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the students grade: ");
            grades[i] = sc.nextFloat();
        }

        float totalGrades = 0;
        for (int i = 0; i < grades.length; i++) {
            totalGrades += grades[i];
        }
        float averageGrades = totalGrades/grades.length;
        System.out.println("The students average is " + averageGrades);
        sc.close();
    }
}
