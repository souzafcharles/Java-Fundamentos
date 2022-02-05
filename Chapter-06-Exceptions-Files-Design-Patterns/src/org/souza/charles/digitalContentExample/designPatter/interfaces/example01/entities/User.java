package org.souza.charles.digitalContentExample.designPatter.interfaces.example01.entities;

import org.souza.charles.digitalContentExample.designPatter.interfaces.example01.utils.Authenticatable;

import java.io.Serializable;

public class User extends Pessoa implements Authenticatable, Serializable {

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void logout() {

    }
}
