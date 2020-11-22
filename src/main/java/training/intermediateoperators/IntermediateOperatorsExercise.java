package training.intermediateoperators;

import javax.lang.model.element.Element;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {


    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {
        return words.stream().filter(word->word.length()>5);
    }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {
        return words.stream().filter(word->word.length()>5).limit(3);
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {
        return words.stream().filter(word->word.length()>5).limit(3).sorted(Comparator.reverseOrder());
    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {
        return words.stream().map(String::length);
    }

    @Override
    public Stream<Integer> staircase() {
        return Stream.empty();
    }
}
