package com.chamis.andre.services;

import com.chamis.andre.annotation.Injectable;

@Injectable
public class PrintingService {
    public void print(String s) {
        System.out.println(s);
    }
}
