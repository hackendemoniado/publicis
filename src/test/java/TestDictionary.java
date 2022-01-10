import org.junit.Test;

import java.util.ArrayList;

public class TestDictionary {

    @Test
    public void testEnglishWordsItIsPresentOnDictionary(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutationList = permutationChallenge.permute("music");
        Dictionary dictionary = Dictionary.getInstance();
        ArrayList<String> englishwords = new ArrayList<>();
        for (String w: permutationList){
            if (dictionary.isEnglishWord(w)){
                englishwords.add(w);
            }
        }
        assert  englishwords.stream().allMatch(dictionary::isEnglishWord);
    }

    @Test
    public void testCountTheAmountOfEnglishWords(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutationList = permutationChallenge.permute("music");
        Dictionary dictionary = Dictionary.getInstance();
        ArrayList<String> englishwords = new ArrayList<>();
        for (String w: permutationList){
            if (dictionary.isEnglishWord(w)){
                englishwords.add(w);
            }
        }
        assert  englishwords.size() == 8;
    }

    @Test
    public void testEnglishWordsItIsNotPresentOnDictionary(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutationList = permutationChallenge.permute("pork");
        Dictionary dictionary = Dictionary.getInstance();
        ArrayList<String> englishwords = new ArrayList<>();
        for (String w: permutationList){
            if (dictionary.isEnglishWord(w)){
                englishwords.add(w);
            }
        }
        assert  englishwords.size() == 0;
    }

    @Test
    public void testNullValue(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutation= permutationChallenge.permute(null);
        assert permutation== null;
    }

    @Test
    public void testCountTheAmountOfPermutationCharacters(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutation= permutationChallenge.permute("null");
        System.out.println(permutation.size());
        assert permutation.size() == 31;
    }

}
