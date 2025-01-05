package org.easy.menu.levels.home;

import org.easy.menu.annotation.Action;
import org.easy.menu.annotation.Home;
import org.easy.menu.domain.MenuLevel;
import org.easy.menu.exception.UnknownLevelException;
import org.easy.menu.levels.communication.CommunicationMenu;

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
