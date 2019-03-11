package com.qualogy.training.codelabs.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Optional.empty;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StreamsTest {
    public static final Predicate<String> FILTER_FUNCTION = (e) -> !e.startsWith("Bad ");
    public static final List<Integer> LIST_OF_NUMBERS = Arrays.asList(1, 2, 4, 16, 9);
    private Streams test = new Streams();
    private PrintStream originalStream;
    private PrintStream mockStream;

    private List<String> inputList;

    @Before
    public void setup(){
        inputList = new ArrayList<>();
        inputList.add("Bad Apple");
        inputList.add("Healthy Banana");
        inputList.add("Sour Lemon");
        inputList.add("Bad Lime");
        inputList.add("Bad Shrimp");
        inputList.add("Shiny Apple");
        inputList.add("Perfect Orange");

        originalStream = System.out;
        mockStream = mock(PrintStream.class);
        System.setOut(mockStream);
    }

    @Test
    public void collection_to_stream(){
        Stream stream = test.collection_to_stream(Collections.EMPTY_LIST);

        assertNotNull(stream);
    }


    @Test
    public void stream_to_collection(){
        Collection collection = test.stream_to_collection(Stream.empty());

        assertNotNull(collection);
    }

    @Test
    public void filter_collection_using_stream_given_function(){
        Collection result = test.filter_collection_using_stream_given_function(FILTER_FUNCTION, inputList);

        assertEquals(4, result.size());
    }

    @Test
    public void logging_every_entry_in_the_collection_using_system_out_println(){
        Collection result = test.logging_every_entry_in_the_collection_using_system_out_println(inputList);

        assertEquals(inputList, result);

        verify(mockStream, times(7)).println(any(String.class));
        verify(mockStream).println("Bad Apple");
    }

    @Test
    public void convert_every_entry_from_string_to_integer(){
        Collection<String> input = Arrays.asList("1", "2", "4", "16", "9");

        Collection<Integer> result = test.convert_every_entry_from_string_to_integer(input);

        assertEquals(LIST_OF_NUMBERS, result);
    }

    @Test
    public void merge_a_collection_of_collection_into_one_collection(){
        Collection<String> input1 = Arrays.asList("1", "2", "4", "16", "9");
        Collection<String> input2 = Arrays.asList("a", "b", "c", "d", "f");
        Collection<Collection<String>> jointInput = Arrays.asList(input1, input2);

        Collection<String> result = test.merge_a_collection_of_collection_into_one_collection(jointInput);

        Collection<String> expectedOutput = Arrays.asList("1", "2", "4", "16", "9", "a", "b", "c", "d", "f");

        assertEquals(expectedOutput, result);
    }

    @Test
    public void count_the_amount_of_entries_in_the_collection(){
        assertEquals(7, test.count_the_amount_of_entries_in_the_collection(inputList));
    }

    @Test
    public void chain_different_stream_operations_log_filter_log_and_count_the_collection(){
        assertEquals(4, test.chain_different_stream_operations_log_filter_log_and_count_the_collection(FILTER_FUNCTION, inputList));

        verify(mockStream, times(11)).println(any(String.class));
        verify(mockStream).println("Bad Apple");
    }

    @Test
    public void sum_all_numbers_in_the_collection(){
        assertEquals(new Integer(32), test.sum_all_numbers_in_the_collection(LIST_OF_NUMBERS));
    }

    @Test
    public void validate_if_collection_contains_a_string(){
        Collection input = Arrays.asList(42, 2L, 0x54, false, "target string", test, empty());
        assertTrue(test.validate_if_collection_contains_a_string(input));
    }

    @Test
    public void validate_if_collection_only_has_integers_above_5(){
        Collection<Integer> input = Arrays.asList(6, 17, 2040592, 9);
        assertTrue(test.validate_if_collection_only_has_integers_above_5(input));
    }

    @Test
    public void remove_all_duplicates_from_the_stream_without_using_filter(){
        Collection input = Arrays.asList("first", "second", "third", "first", "duplicate again", "duplicate again", "last");

        assertEquals(5, test.remove_all_duplicates_from_the_stream_without_using_filter(input).size());
    }

    @Test
    public void trim_the_collection_to_a_maximum_size(){
        assertEquals(5, test.trim_the_collection_to_a_maximum_size(inputList).size());
    }

    @After
    public void cleanUp(){
        System.setOut(originalStream);
    }
}
