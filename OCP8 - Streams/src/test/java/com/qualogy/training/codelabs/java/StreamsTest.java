package com.qualogy.training.codelabs.java;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class StreamsTest {
    private Streams test = new Streams();

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
    }

    @Test
    public void extract_stream(){
        Stream stream = test.collection_to_stream(Collections.EMPTY_LIST);

        assertNotNull(stream);
    }


    @Test
    public void extract_collection(){
        Collection collection = test.stream_to_collection(Stream.empty());

        assertNotNull(collection);
    }

    @Test
    public void filter_list(){
        Collection result = test.filter_collection_using_stream_given_function((e) -> !e.startsWith("Bad "), inputList);

        assertEquals(4, result.size());
    }

    @Test
    public void log_every_entry(){
        PrintStream originalStream = System.out;
        PrintStream mockStream = mock(PrintStream.class);
        System.setOut(mockStream);

        Collection result = test.logging_every_entry_in_the_collection_using_system_out_println(inputList);

        assertEquals(inputList, result);

        verify(mockStream, times(7)).println(any(String.class));
        verify(mockStream).println("Bad Apple");

        System.setOut(originalStream);
    }

    @Test
    public void string_collection_to_integer_collection(){
        Collection<String> input = Arrays.asList("1", "2", "4", "16", "9");
        Collection<Integer> expectedOutput = Arrays.asList(1, 2, 4, 16, 9);

        Collection<Integer> result = test.convert_every_entry_from_string_to_integer(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void merge_collections(){
        Collection<String> input1 = Arrays.asList("1", "2", "4", "16", "9");
        Collection<String> input2 = Arrays.asList("a", "b", "c", "d", "f");
        Collection<Collection<String>> jointInput = Arrays.asList(input1, input2);

        Collection<String> result = test.merge_a_collection_of_collection_into_one_collection(jointInput.stream());

        Collection<String> expectedOutput = Arrays.asList("1", "2", "4", "16", "9", "a", "b", "c", "d", "f");

        assertEquals(expectedOutput, result);
    }
}
