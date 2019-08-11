package packZad10;

import com.google.gson.Gson;

public class MainX {
    public static void main(String[] args) {
        System.out.println();

        GSONwork gsoNwork = new GSONwork();

        String fromJson = gsoNwork.stringFromGSON();
        System.out.println(fromJson);
    }
}
