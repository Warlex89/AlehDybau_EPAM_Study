package com.company.Tasks.Task_1.Classes_Action;

public class SwitchPanel {
    public void run(String usersStatus){
        switch (usersStatus){
            case "admin" -> new AdminPanel().mP.mainPanel();
            case "user" -> new UserPanel().mP.mainPanel();
        }
    }
}
