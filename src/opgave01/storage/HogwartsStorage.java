package opgave01.storage;

import opgave01.models.Character;
import opgave01.models.House;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class HogwartsStorage {
    private ArrayList<Character> characters = new ArrayList<>();

    public HogwartsStorage() {
        Gson gson = new GsonBuilder().create();
        try (HttpClient client = HttpClient.newHttpClient()){
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://hp-api.onrender.com/api/characters/students"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            characters = gson.fromJson(response.body(), new TypeToken<List<Character>>(){}.getType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Character> getHouseGryffindor() {
        return new ArrayList<>(characters
                .stream()
                .filter(c -> c.getHouse() == House.GRYFFINDOR)
                .sorted()
                .toList()
        );
    }

    public ArrayList<Character> getHouseSlytherin() {
        return new ArrayList<>(characters
                .stream()
                .filter(c -> c.getHouse() == House.SLYTHERIN)
                .sorted()
                .toList()
        );
    }
}
