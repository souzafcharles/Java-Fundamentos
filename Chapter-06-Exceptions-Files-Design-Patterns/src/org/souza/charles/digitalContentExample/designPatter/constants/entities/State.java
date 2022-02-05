package org.souza.charles.digitalContentExample.designPatter.constants.entities;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */

public class State {
    private String stateName;
    private String stateAbbreviations;

    public State(String stateName, String stateAbbreviations) {
        this.stateName = stateName;
        this.stateAbbreviations = stateAbbreviations;
    }
}
