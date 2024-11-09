package com.github.lsantana32.loginjpa.logic;

import com.github.lsantana32.loginjpa.persistence.PersistenceController;

public class LogicController {

    PersistenceController pc = new PersistenceController();
    
    public void validateUser(String userName, String password) {
        User user = new User();
        user.setNameUser(userName);
        user.setPassword(password);
        
        pc.validateUser(user);
    }
    
}
