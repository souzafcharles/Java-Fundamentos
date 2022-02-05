package org.souza.charles.playlistExample.exception.example01;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
public class ExceptionHandlingClassification {

    public static void main(String[] args) {

        try {
            int val = 10 / 0;
            int[] values = new int[3];
            System.out.println(values[4]);
            String name = null;
            System.out.println(name.length());
            int number = Integer.parseInt("zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Cannot access position 4 of array!");
            System.err.println(e.getMessage());
            e.printStackTrace();

        } catch (NullPointerException e) {
            System.err.println("Could not return length, variable name not instantiated!");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Could not perform conversion!");
        }catch(Exception e) {
            System.err.println("Error executing the program!");
        }finally {
            System.out.println("It will always pass here!");
        }
    }
}
