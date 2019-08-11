package packZad10;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Zapisywacz<T> {
    private T ob;
    private static final Gson GSON = new Gson();

    public void zapiszDoPliku(T ob) {
        String objectToString = GSON.toJson(ob);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("singleT.json"))) {
            printWriter.print(objectToString);
        } catch (IOException e) {
            System.err.println("Błąd wejścia-wyjścia.");
        }
    }

    public void utworzListeIZapiszDoPliku(T ...v) {
        List<T> lista = new ArrayList<>(Arrays.asList(v));
        String listToString = GSON.toJson(lista);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("listOfT.json"))) {
            printWriter.print(listToString);
        } catch (IOException e) {
            System.err.println("Błąd wejścia-wyjścia.");
        }
    }
}
