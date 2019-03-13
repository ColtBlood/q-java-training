package com.qualogy.training.codelabs.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class LambdasTest {
    private Lambdas test = new Lambdas();

    @Before
    public void setup(){
    }

    @Test
    public void create_a_simple_method_which_doubles_the_integer_value(){
        assertEquals(new Integer(14), test.create_a_simple_method_which_doubles_the_integer_value(7));
    }

    @Test
    public void create_a_anonymous_class_with_a_subtype_of_illegal_argument_exception(){
        final IllegalArgumentException result = test.create_a_anonymous_class_with_a_subtype_of_illegal_argument_exception();
        assertNotNull(result);
        assertNotEquals(IllegalArgumentException.class, result.getClass());
    }

    @Test
    public void create_a_short_hand_function_aka_lambda_that_concats_processed_at_the_end(){
        assertEquals("string_processed", test.create_a_short_hand_function_aka_lambda_that_concats_processed_at_the_end().apply("string_"));
    }

    @Test
    public void return_the_previously_created_method(){
        Function<Integer, Integer> result = test.return_the_previously_created_method();
        assertNotNull(result);
        assertEquals(new Integer(14), result.apply(7));
    }

    @Test
    public void execute_a_function_lambda(){
        assertEquals("7", test.execute_a_function_lambda(String::valueOf, 7));
    }

    @Test
    public void create_a_function_which_guarantees_the_input_to_be_of_the_same_type_as_the_return_type(){
        assertEquals(UnaryOperator.class, test.find_a_function_type_which_guarantees_the_input_to_be_of_the_same_type_as_the_return_type());
    }

    @Test
    public void create_a_lambda_which_returns_true_if_the_integer_is_above_5(){
        assertTrue(test.create_a_lambda_which_returns_true_if_the_integer_is_above_5().test(6));
        assertFalse(test.create_a_lambda_which_returns_true_if_the_integer_is_above_5().test(5));
    }

    @Test
    public void execute_a_predicate_lambda(){
        assertTrue(test.execute_a_predicate_lambda((in) -> true));
    }

    @Test
    public void create_a_lambda_which_logs_all_the_entries_without_changing_the_list_itself(){
        PrintStream originalStream = System.out;
        PrintStream mockStream = mock(PrintStream.class);
        System.setOut(mockStream);

        final String entry3 = "darkside";
        final String entry1and2 = "something";
        List<String> inputList = Arrays.asList(entry1and2, entry1and2, entry3);

        test.create_a_lambda_which_logs_all_the_entries_without_changing_the_list_itself().accept(inputList);

        verify(mockStream, times(3)).println(any(String.class));
        assertEquals(entry1and2, inputList.get(0));
        assertEquals(entry1and2, inputList.get(1));
        assertEquals(entry3, inputList.get(2));
        assertEquals(3, inputList.size());

        System.setOut(originalStream);
    }

    @Test
    public void execute_a_consumer_lambda(){
        Consumer<List<String>> cons = mock(Consumer.class);

        test.execute_a_consumer_lambda(cons);

        verify(cons).accept(anyList());
    }

    @Test
    public void create_a_lambda_which_returns_an_integer_which_is_always_above_100(){
        Supplier<Integer> result = test.create_a_lambda_which_returns_an_integer_which_is_always_above_100();

        Arrays.stream(new String[5])
            .forEach((x) -> {assertTrue(result.get() > 100);});
    }

    @Test
    public void execute_a_supplier_lambda(){
        assertNotNull(test.execute_a_supplier_lambda(Math::random));
    }

    @Test
    public void create_a_predicate_which_accepts_primitive_longs_so_no_boxing(){
        assertEquals(LongPredicate.class, test.find_a_predicate_which_accepts_primitive_longs_so_no_boxing());
    }

    @After
    public void cleanUp(){
    }
}
