package com.chamis.andre.services;

import com.chamis.andre.annotation.Injectable;

@Injectable
public class TalkingService {
    private final PrintingService printingService;

    public TalkingService(PrintingService printingService) {
        this.printingService = printingService;
    }

    public void sayHello() {
        printingService.print("Hello!");
    }

    public void sayGoodbye() {
        printingService.print("Goodbye!");
    }
}
