package com.qualogy.training.codelabs.java;

import java.util.List;
import java.util.function.*;

public class Lambdas {
    //TODO: add answers and powerpoint!!!! && extra assignments

    /**
     * So lets start off easy, Lambdas consist of two aspects which java already knows from previous versions.
     * The first aspect is, a lambda is basically a method that you pass on rather than execute.
     * So lets start and create a method that takes an Integer, doubles the value and return that
     */
    public Integer create_a_simple_method_which_doubles_the_integer_value(Integer input){
        return 0;
    }

    /**
     * Another aspect which java already knows which is used in older version is creating anonymous subclasses; giving you the ability to create a class without actually having to write a class.
     * The same is with lambdas(unless you use references), you are able to pass on a lambda without the need to declare a method, so anonymous methods rather.
     * So lets test your skills on creating anonymous subclasses first.
     * Using IllegalArgumentException create a anonymous class
     */
    public IllegalArgumentException create_a_anonymous_class_with_a_subtype_of_illegal_argument_exception(){
        return null;
    }

    /**
     * Ok with the basics of lambdas in mind lets create our first lambda using a anonymous syntax/shorthand
     * for a little hint the syntax for such a case is () -> {} or without brackets: [argument] -> [expression]
     * Create a function which takes a String and returns a String, this function should take any type of string and concat "processed" behind it
     */
    public Function<String, String> create_a_short_hand_function_aka_lambda_that_concats_processed_at_the_end(){
        return null;
    }

    /**
     * Other than creating your own lambda you can also refer to a method/function of an instance, try doing this.
     * return the method/function: create_a_simple_method_which_doubles_the_integer_value
     */
    public Function<Integer, Integer> return_the_previously_created_method(){
        return null;
    }

    /**
     * Now lets see what the receiving and of the previous assignment looks like, you have a method which accept a function, now you have to execute it.
     * The type reference of the integerConverter tells you it takes an integer as in input parameter and returns a String as an output parameter
     * There for you also get an input argument which you can pass along
     */
    public String execute_a_function_lambda(Function<Integer, String> integerConverter, Integer input){
        return null;
    }

    /**
     * So looking at the deceleration of a Function<T, R> with type references for Input and Output it can be cumbersome
     * if your Input and Output are of the same type to declare that every time, there is a subtype of the interface Function
     * which can help you here, it only has one type reference which is then used for both the Input and Output
     * Find out what it is and return that class type
     */
    public Class find_a_function_type_which_guarantees_the_input_to_be_of_the_same_type_as_the_return_type(){
        return null;
    }

    public Predicate<Integer> create_a_lambda_which_returns_true_if_the_integer_is_above_5(){
        return null;
    }

    public boolean execute_a_predicate_lambda(Predicate<Integer> alwaysTrue){
        return false;
    }

    public Consumer<List<String>> create_a_lambda_which_logs_all_the_entries_without_changing_the_list_itself(){
        return null;
    }

    public void execute_a_consumer_lambda(Consumer<List<String>> ssssh_its_a_secret){
        return;
    }

    public Supplier<Integer> create_a_lambda_which_returns_an_integer_which_is_always_above_100(){
        return null;
    }

    public Double execute_a_supplier_lambda(Supplier<Double> randomNumberGenerator){
        return null;
    }

    public Predicate create_a_predicate_which_accepts_primitive_longs_so_no_boxing(){
        return null;
    }
}
