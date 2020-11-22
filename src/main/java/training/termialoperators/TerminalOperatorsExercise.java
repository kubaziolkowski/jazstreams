package training.termialoperators;

import jdk.dynalink.Operation;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        set.add(stream.toString());
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
        list.add(stream.sorted(Comparator.reverseOrder()).toString());
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {
        return stream.toArray(size->new String[size]);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {
        return stream.collect(Collectors.toSet());
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {
        return stream.collect(Collectors.toList());
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {
        return stream.collect(Collectors.joining());
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return 0;
    }

    @Override
    public int longestWordLength(Stream<String> stream) {

        return stream.max(s->s.length()).get();
    }

    @Override
    public String longestWord(Stream<String> stream) {
        return "";
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return Map.of();
    }
}
