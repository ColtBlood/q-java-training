package com.qualogy.training.codelabs.java;

import java.util.List;

public class DataTypes {


    /**
     * You are given a list, you have to fill this list with class types of the different primitives
     * As this is a starting topic i will give you a hand in how to add the different datatypes to the list.
     *
     * Additional info:
     * Java knows two type of data types, one being primitives and the other being complex objects
     * The difference between the two is that one, the primitive, contains just one type of plain data
     * think of an int, an int just contains a number such as 6 but you cannot call any methods on this type
     * Where a complex object methods can be instantiated on,
     * such as Integer.valueOf("6")
     */
    public List return_a_list_of_primitive_types(List<Class> list){

        list.add(int.class);

        return list;
    }

    /**
     * Now we have come to the other part of the types, the complex types.
     * Return a list of complex types from java, and example is given for Integer
     */
    public List return_a_list_of_java_complex_types(List<Class> list){

        list.add(Integer.class);

        return list;
    }
}
