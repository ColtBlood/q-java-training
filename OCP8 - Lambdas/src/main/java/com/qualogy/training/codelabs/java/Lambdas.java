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

    /**
     * Lambdas know different type of lambdas, where as a Function takes an input and returns it, there can also be Lambdas
     * which take an input and returns a boolean, these lambdas are called Predicates. their basic existence is to do a validation
     * generally.
     * A Predicate still has a type reference which declares the input type, in this case this Predicate will do its business
     * only on Integers
     */
    public Predicate<Integer> create_a_lambda_which_returns_true_if_the_integer_is_above_5(){
        return null;
    }

    /**
     * Just like before, we are going to see how you can execute a Predicate lambda, this time you will get an input param
     * which is the Predicate and no matter what you pass in there(must be an Integer though) it will always return you true
     */
    public boolean execute_a_predicate_lambda(Predicate<Integer> alwaysTrue){
        return false;
    }

    /**
     * Another type of Lambda is a Consumer, a consumer is as the name itself states a function which consumes something,
     * in laymans terms if i eat a burger i got nothing to return to you as i ate it. Another principle with a Consumer
     * which differs with the burger example is that you do not adjust the content of it.
     * So lets create one, this method expects a Consumer to be returned, which takes a List and the List consists of Strings.
     * The consumer will have to log every entry it gets to System.out.println
     */
    public Consumer<List<String>> create_a_lambda_which_logs_all_the_entries_without_changing_the_list_itself(){
        return null;
    }

    /**
     * As always, we are going to execute the Lambda, a Consumer this time.
     * What the consumer does, we dont know, but we can be sure it will not alter our list. you will not have to return
     * anything but you will have to execute the consumer. There is no List supplied, so create your own List.
     */
    public void execute_a_consumer_lambda(Consumer<List<String>> ssssh_its_a_secret){
        return;
    }

    /**
     * So we just have Consumers, which we can keep feeding data but will not return us anything, now we are going to look
     * at a lambda which does it the other way round, we do not feed it anything but it will keep returning us something
     * every time, nice right? free stuff.
     * Lets create a supplier which will give us numbers, these numbers should always be above 100, you can do this with
     * just random numbers above or just always 101 or something like that, as long as they are above 100
     */
    public Supplier<Integer> create_a_lambda_which_returns_an_integer_which_is_always_above_100(){
        return null;
    }

    /**
     * For executing a Supplier it is quite simple, you get a random generator, it doesn't require any arguments, it just
     * returns you stuff, in this case a Double, you will get a random number generator which is Math::random
     */
    public Double execute_a_supplier_lambda(Supplier<Double> randomNumberGenerator){
        return null;
    }

    /**
     * So we had quite some lambdas and we like them, right? so if we use a whole lot of lambdas we could have some
     * performance issues, think about boxing, boxing primitives to classes so if we pass in a 7 it will box it to an
     * Integer(7) and back etc so with like 50 lambdas all over our code that kind of takes a hit. So there are some lambdas
     * which are based on primitives, find the class and return the class type.
     * So there are more types of these lambdas but for now knowing of their existence is fine.
     */
    public Class find_a_predicate_which_accepts_primitive_longs_so_no_boxing(){
        return null;
    }
}
