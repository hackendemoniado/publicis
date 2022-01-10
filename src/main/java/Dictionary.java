import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public final class Dictionary {
    private static Dictionary instance;
    private static ArrayList<String> englishWords = new ArrayList();

    Dictionary() {
        this.createDictionary();
    }

    public static Dictionary getInstance() {
        if (instance == null) {
            instance = new Dictionary();
        }

        return instance;
    }

    public boolean isEnglishWord(String word) {
        return englishWords.parallelStream().anyMatch((a) -> {
            return a.equalsIgnoreCase(word);
        });
    }

    private void createDictionary() {
        try {
            File myObj = new File("src/main/resources/english_mock.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                englishWords.add(data);
            }

            myReader.close();
        } catch (FileNotFoundException var4) {
            System.out.println("An error ocurred");
            var4.printStackTrace();
        }

    }
}
