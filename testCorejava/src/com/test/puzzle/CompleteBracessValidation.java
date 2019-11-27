package com.test.puzzle;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CompleteBracessValidation {

    public static void main(String[] args) {
        Map<Character, Character> totalBrackess= createTotalBrabess();
        System.out.println(legalBracesExpresion("({[[]}})", totalBrackess));

    }
    
    private static Map<Character, Character> createTotalBrabess() {
        
        Map<Character, Character> totalBrackess= new HashMap<>();
        totalBrackess.put('{', '}');
        totalBrackess.put('(', ')');
        totalBrackess.put('[', ']');
        
        return totalBrackess;
    }

    static boolean legalBracesExpresion(String expression, Map<Character, Character> totalBrackess){
   
       
     //string to char array
       char[] expArray = expression.toCharArray();
        
        Stack<Character> bracesStack= new Stack<Character>();
        int i=0;
        if (expArray.length%2!=0)
        {
            System.out.println("odd number, so terminating the program");
            return false;
        }
        while(expArray.length!=i)
        {
            if(bracesStack.isEmpty())
            {
                System.out.println("added Expresion"+expArray[i]+"now stack: "+bracesStack.size());
                bracesStack.add(expArray[i]);
                System.out.println(""+bracesStack.toString());
            }else if(totalBrackess.get(bracesStack.peek())!=null && expArray[i]==totalBrackess.get(bracesStack.peek()))
            {
                System.out.println("expression in stack: "+ bracesStack.peek()+"Expression Array char : "+totalBrackess.get(expArray[i]));
                bracesStack.pop();
                System.err.println(""+bracesStack.toString());
            }else{
                bracesStack.add(expArray[i]);
                System.out.println(""+bracesStack.toString());
            }
            i++;
        }
        if(bracesStack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    

}
