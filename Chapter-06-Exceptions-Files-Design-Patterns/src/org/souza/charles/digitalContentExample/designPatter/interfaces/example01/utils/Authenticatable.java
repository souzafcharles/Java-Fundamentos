package org.souza.charles.digitalContentExample.designPatter.interfaces.example01.utils;

public interface Authenticatable {

    String MSG_LOGOUT = "Logout";

    boolean login(String username, String password);

    void logout();

}

