import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class WeatherApiClient {

    public static void main(String[] args) {
        try {
            // Public Weather REST API
            String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=13.08&longitude=80.27&current_weather=true";

            // Convert String to URI (no deprecated warning)
            URI uri = new URI(apiUrl);
            URL url = uri.toURL();

            // Open HTTP connection
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Read response
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            String line;
            System.out.println("Weather API Response:\n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
