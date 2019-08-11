package packZad10;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GSONwork {
    private static final Gson GSON = new Gson();

    public String stringFromGSON() {
        List<Auto> listInt = new ArrayList<Auto>(Arrays.asList(new Auto("Volvo", 3), new Auto("Opel", 4)));

        String fromGSON = GSON.toJson(listInt);

        return fromGSON;
    }
}
