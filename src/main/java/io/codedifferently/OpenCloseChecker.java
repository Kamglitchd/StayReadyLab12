package io.codedifferently;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OpenCloseChecker {
    public static boolean openClose(String openChar) {
        Map<String, String> parenthesis = new HashMap<>();
        parenthesis.put("(", ")");
        parenthesis.put("{","}");
        parenthesis.put("[","]");
        parenthesis.put("<",">");
        parenthesis.put("\"","\"");
        parenthesis.put("'","'");
        Stack<Character> braceStack = new Stack();
        for(char c: openChar.toCharArray()) {
            if (parenthesis.containsKey(c)) {
                braceStack.push(c);
            }if(parenthesis.containsValue(parenthesis.get(c))){
                braceStack.pop();
            }

        }
        System.out.println(braceStack);
        return braceStack.isEmpty();
    }

}

