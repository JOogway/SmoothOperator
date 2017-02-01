package dev;

import dev.Actioners.AsciPorn;
import dev.Actioners.Fetcher;

import java.io.IOException;


public class CommandResponder {
    static void getTypeOfOperationFromOpt(int opt) throws IOException {

    switch (opt){
        case 1:
            break;
        case 2:
            System.out.println("Activating url fetcher.");
            System.out.print("Enter url: ");
            System.out.print(" ");
            Fetcher f = new Fetcher(InputReader.getURL());
            break;
        case 3:
            AsciPorn ap = new AsciPorn();
            System.out.println(ap.returnPorn());
            ap.askForMore();
        case 6:
            System.exit(1);
        }
    }

}
