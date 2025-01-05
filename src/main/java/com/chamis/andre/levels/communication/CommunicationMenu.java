package com.chamis.andre.levels.communication;

import com.chamis.andre.annotation.Action;
import com.chamis.andre.domain.MenuLevel;
import com.chamis.andre.exception.UnknownLevelException;
import com.chamis.andre.levels.home.HomeMenu;
import com.chamis.andre.services.TalkingService;

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
