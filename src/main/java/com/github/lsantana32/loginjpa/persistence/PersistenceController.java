package com.github.lsantana32.loginjpa.persistence;

import com.github.lsantana32.loginjpa.logic.User;
import com.github.lsantana32.loginjpa.persistence.exceptions.NonexistentEntityException;

import javax.persistence.NoResultException;

public class PersistenceController {
    
    UserJpaController ujc = new UserJpaController();
    
    public String validateUser(User user) {
        String message;
        try {
            User userBD= ujc.findUserWithUserName(user.getUsername());
            if (userBD.getPassword().equals(user.getPassword())){
                message = "Welcome "+user.getUsername();
            }
            else {
                message = "The password is incorrect";
            }
        }catch (NoResultException e){
            message = "The user "+user.getUsername()+" no exists";
        }
        return message;
    }

   
    
}
