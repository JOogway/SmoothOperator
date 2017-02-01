package dev.Actioners;

import dev.InputReader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

public class Fetcher {
    private String stringLink;
    private URL link = new URL("http://www.google.com/");
    private URLConnection yc = link.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(
            yc.getInputStream()));

    public Fetcher() throws IOException {

    }

    public Fetcher(String link) throws IOException {
        this.stringLink = link;
        this.link = new URL("http://"+link+"/");
        fetchDataFromURL();
    }

    public void setURL(String link) throws MalformedURLException {
        this.stringLink = link;
        this.link = new URL("http://"+link+"/");
    }
    public void fetchDataFromURL() throws IOException {
        System.out.println("Do you want to store this data in file?(y/n");
        String response = InputReader.readResponse();
        if (Objects.equals(response, "y") || Objects.equals(response, "yes") || Objects.equals(response, "yeah") || Objects.equals(response, "ye")){
            PrintWriter fw = new PrintWriter(stringLink+".html");
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                System.out.println(inputLine);
            fw.println(inputLine);
            }
            fw.close();
            in.close();
        }else {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }


    }
}
