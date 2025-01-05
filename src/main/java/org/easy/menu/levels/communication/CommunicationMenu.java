package org.easy.menu.levels.communication;

import org.easy.menu.annotation.Action;
import org.easy.menu.domain.MenuLevel;
import org.easy.menu.exception.UnknownLevelException;
import org.easy.menu.levels.home.HomeMenu;
import org.easy.menu.services.TalkingService;

public class CommunicationMenu extends MenuLevel {
    private final TalkingService talkingService;

    public CommunicationMenu(TalkingService talkingService) {
        this.talkingService = talkingService;
    }

    @Override
    public String getLabel() {
        return "Communication Menu";
    }

    @Action(label = "Back to Home", order = 1)
    public void backToHome() throws UnknownLevelException {
        System.out.println("Navigating to home...");
        super.navigate(HomeMenu.class);
    }

    @Action(label = "Hi!", order = 3)
    public void sayHello() {
        talkingService.sayHello();
    }

    @Action(label = "Bye!", order = 2)
    public void sayGoodbye() {
        talkingService.sayGoodbye();
    }

    @Action(label = "Exit", order = 0)
    public void exit() {
        System.exit(0);
    }
}
