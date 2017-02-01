package dev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by joogway on 30.01.17.
 */
public class InputReader {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int readCommand() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    public static String readResponse() throws IOException {
        return br.readLine();
    }
    public static String getURL() throws IOException {
        return br.readLine();
    }
}
