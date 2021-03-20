package pl.radekcholuj.chucknorris;

import io.chucknorris.client.ChuckNorrisClient;
import io.chucknorris.client.Joke;

public class ChuckNorris {
    public static void main(String[] args) {

        // create the chuck norris client
        ChuckNorrisClient client = new ChuckNorrisClient();

// get a random joke and print it
        Joke joke = client.getRandomJoke();
        System.out.println(joke.getValue());
    }
}
