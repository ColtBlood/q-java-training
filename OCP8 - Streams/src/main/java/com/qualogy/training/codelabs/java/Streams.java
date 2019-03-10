package com.qualogy.training.codelabs.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    /*
    * This method gets a collection and expects a stream to be returned
    **/
    public Stream collection_to_stream(Collection collection){

        return collection.stream();
    }

    /*
    * This method gets a stream and expects any type of collection to be returned.
    **/
    public Collection stream_to_collection(Stream stream){

        return (Collection)stream
                .collect(Collectors.toCollection(ArrayList::new));
        /*
        or for example
        return (Collection)stream
                .collect(Collectors.toList());
         */
    }

    /**
     * This method accepts both a filter predicate and a collection, you will not have to write the filter yourself you can use the one given.
     * after filtering the collection return a new collection which was filtered.
     */
    public Collection<String> filter_collection_using_stream_given_function(Predicate<String> filterFunction, Collection<String> collection){

        return collection
                .stream()
                .filter(filterFunction)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * This method accepts a collection and returns a collection. go over the collection and log every entry using System.out.println()
     * the returned collection is expected to be the same collection as in untempered
     */
    public Collection logging_every_entry_in_the_collection_using_system_out_println(Collection<String> collection){
        return collection
                .stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        /*
        * or:
        collection
                .stream()
                .forEach(System.out::println);
        * */
    }

    /**
     * This method expects a collection containing only strings, given that all strings in this collection contain numbers we can convert it into a collection of integers
     */
    public Collection<Integer> convert_every_entry_from_string_to_integer(Collection<String> collection){
        return collection
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

    }

    /**
     * This method takes a stream instead of a collection to make it more cumbersome that you might extract the collections and do .addAll on them (you can still do it but lets stick to the training
     * You get a stream which contains Collections, merge these two collections into a single collection and return this
     */
    public Collection<String> merge_a_collection_of_collection_into_one_collection(Stream<Collection<String>> stream){
        return stream
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
