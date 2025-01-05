package org.easy.menu.services;

import org.easy.menu.annotation.Injectable;

@Injectable
public class PrintingService {
    public void print(String s) {
        System.out.println(s);
    }
}
