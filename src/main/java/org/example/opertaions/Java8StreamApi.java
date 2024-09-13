package org.example.opertaions;

import java.util.Arrays;
import java.util.List;

public class Java8StreamApi {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Nagaraju","Mahesh","Somu","Software","","Java8Features","filter");
        FilterOperation fl=new FilterOperation();
        List<String>names=fl.filterNames(list,"");
        //enumrate results from list
        names.stream().forEach(s->System.out.println(s));
    }
}
