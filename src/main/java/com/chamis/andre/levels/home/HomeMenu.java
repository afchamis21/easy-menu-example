package com.chamis.andre.levels.home;

import com.chamis.andre.annotation.Action;
import com.chamis.andre.annotation.Home;
import com.chamis.andre.domain.MenuLevel;
import com.chamis.andre.exception.UnknownLevelException;
import com.chamis.andre.levels.communication.CommunicationMenu;

@Home
public class HomeMenu extends MenuLevel {

    @Override
    public String getLabel() {
        return "Home";
    }

    @Action(label = "Exit", order = 0)
    public void exit() {
        System.exit(0);
    }

    @Action(label = "Go to Comm Menu", order = 1)
    public void goToCommunication() throws UnknownLevelException {
        System.out.println("Navigating to Communications Menu...");

        super.navigate(CommunicationMenu.class);
    }
}
