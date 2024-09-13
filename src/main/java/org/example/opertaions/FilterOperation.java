package org.example.opertaions;


import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {

    public List<String> filterNames(List<String> names, String choice){
        List<String> result = null;
        //java 17 feature Enhanced Switch Case Statement
        // eliminated break
        // can be use different types instead of constant type in the case statement
        // expression can use in case statement/label using lambda
        switch (choice){
            case "m"-> result=names.stream().filter(n->n.contains(choice)).collect(Collectors.toList());
            case "l"->result=names.stream().filter(l->l.length()>=8).collect(Collectors.toList());
            default -> result=names.stream().filter(u->u.startsWith("S")).collect(Collectors.toList());
        }
           return result;
    }
}
