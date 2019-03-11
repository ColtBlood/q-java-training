package com.qualogy.training.codelabs.java;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {

    /*
    * This method gets a collection and expects a stream to be returned
    **/
    public Stream collection_to_stream(Collection collection){
        return null;
    }

    /*
    * This method gets a stream and expects any type of collection to be returned.
    **/
    public Collection stream_to_collection(Stream stream){
        return null;
    }

    /**
     * This method accepts both a filter predicate and a collection, you will not have to write the filter yourself you can use the one given.
     * after filtering the collection return a new collection which was filtered.
     */
    public Collection<String> filter_collection_using_stream_given_function(Predicate<String> filterFunction, Collection<String> collection){
        return null;
    }

    /**
     * This method accepts a collection and returns a collection. go over the collection and log every entry using System.out.println()
     * the returned collection is expected to be the same collection as in untempered
     */
    public Collection logging_every_entry_in_the_collection_using_system_out_println(Collection<String> collection){
        return null;
    }

    /**
     * This method expects a collection containing only strings, given that all strings in this collection contain numbers we can convert it into a collection of integers
     */
    public Collection<Integer> convert_every_entry_from_string_to_integer(Collection<String> collection){
        return null;

    }

    /**
     * This method takes a collection which contains Collections, merge these two collections into a single collection and return the result
     */
    public Collection<String> merge_a_collection_of_collection_into_one_collection(Collection<Collection<String>> collection){
        return null;
    }

    /**
     * This method takes a collection, using the stream obtain the amount of entries within the collection and return it
     */
    public long count_the_amount_of_entries_in_the_collection(Collection collection){
        return 0;
    }

    /**
     * This method takes a collection and expects you to chain what you have learned in your previous codelabs, in the previous codelab only one operation was called upon the stream, this test requires you to call multiple
     * log to system out println upon entry, filter your stream, log the outcome of that and count the results
     */
    public long chain_different_stream_operations_log_filter_log_and_count_the_collection(Predicate<String> filterFunction, Collection collection){
        return 0;
    }

    /**
     * This method gets a collection containing numbers, sum all the elements in the list and return it
     */
    public Integer sum_all_numbers_in_the_collection(Collection<Integer> collection){
        return null;
    }

    /**
     * This method gets a collection which contains all kind of objects, check if it contains a String
     */
    public boolean validate_if_collection_contains_a_string(Collection collection){
        return false;
    }

    /**
     * This method gets a collection which contains only Integers, check if all integers are above 5
     */
    public boolean validate_if_collection_only_has_integers_above_5(Collection<Integer> collection){
        return false;
    }

    /**
     * This method gets a collection of objects, in this case Strings, there are duplicates within this collection, you have to filter out the duplicates
     * You have learned the .filter method before so try solving this codelab without using the .filter function
     */
    public Collection remove_all_duplicates_from_the_stream_without_using_filter(Collection collection){
       return null;
    }

    /**
     * You will get a collection which has a size of 7, trim it down to 5 using streams
     */
    public Collection trim_the_collection_to_a_maximum_size(Collection collection){
        return null;
    }
}
