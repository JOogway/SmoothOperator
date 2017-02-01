package dev;


import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        while (true) {
            int opt = 0;
            if (opt == 0) {
                Asker.askAboutOperation();
                opt = InputReader.readCommand();
                CommandResponder.getTypeOfOperationFromOpt(opt);
            }
        }
    }
}
