package Chapter3.Exercises4.Task1;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~olliv/olio/korvike.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }
        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            String line;
            ArrayList<Double> temperature = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if(line.split(",")[0].equals("1.1.2023")){
                    temperature.add(Double.valueOf(line.split(",")[3]));
                    System.out.println(line);
                }
            }
            double allTemperatures = 0;
            for (double temp : temperature){
                allTemperatures += temp;
            }
            System.out.println(allTemperatures/temperature.size());
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}