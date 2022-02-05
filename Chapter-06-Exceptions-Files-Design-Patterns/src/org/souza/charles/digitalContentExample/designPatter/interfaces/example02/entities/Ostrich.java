package org.souza.charles.digitalContentExample.designPatter.interfaces.example02.entities;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.interfaces.example02.utils.Runner;

public class Ostrich extends Bird implements Runner {
    @Override
    public void run(int velocity) {

    }

    @Override
    public void stop() {
        Runner.super.stop();
    }
}
