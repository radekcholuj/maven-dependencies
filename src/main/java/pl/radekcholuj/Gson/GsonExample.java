package pl.radekcholuj.Gson;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Person p1 = new Person("Jurek", 22);
        Person p2 = new Person("Marysia", 81);

        System.out.println(p1);
        System.out.println(p2);

        Gson gson = new Gson();
        String json = gson.toJson(p1);

        System.out.println(json);

        Person[] people = {p1, p2};
        System.out.println(gson.toJson(people));
    }
}
