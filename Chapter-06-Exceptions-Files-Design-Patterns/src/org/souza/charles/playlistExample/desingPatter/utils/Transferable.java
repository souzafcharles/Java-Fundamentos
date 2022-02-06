package org.souza.charles.playlistExample.desingPatter.utils;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
public interface Transferable {

    boolean performDoc (int bankNumber, int agencyNumber, int accountNumber, double value);

    boolean performTed (int bankNumber, int agencyNumber, int accountNumber, double value);

    default boolean performInternalTransfer(int agencyNumber, int accountNumber, double value) {
        return true;
    }
}
