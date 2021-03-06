package com.appdetex.sampleparserjavaproject;
import java.io.*;

/**
 * GooglePlayTest class
 *
 * Simple app used to iterate through all urls generated by GooglePlayTop.
 * The url is inputted into the GooglePlayWebScrap class and the result is
 * save to a file.
 */
public class GooglePlayTest {
    /**
     * main Method
     * Open file of urls. Iterate though file. Call GooglePlayWebScrap. Save results.
     * @throws Exception url
     */
    public static void main(String[] args) throws Exception{
        PrintWriter writer = new PrintWriter("results_urls.txt", "UTF-8");
        BufferedReader reader = new BufferedReader(new FileReader("test_urls.txt"));
        String line;
        try{
            while ((line = reader.readLine()) != null) {
                Main gpwc = new Main(line);
                gpwc.retrieve_data();
//                //Testing  MainNoSoup
//                String[] rd = gpwc.retrieve_data();
//                gpwc.clean_data(rd);
                writer.println(gpwc.output_data());
            }
            writer.close();
        }
        catch (IOException e){}
    }
}

