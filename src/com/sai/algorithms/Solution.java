package com.sai.algorithms;

import java.util.Stack;

public class Solution {
    
    static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')'){
        return true;
    }
       else
         return false;
    }
     
    static boolean areParenthesisBalanced(char exp[])
    {
        Stack<Character> st = new Stack<>();
        Boolean found = false;
        char c1='0';
      
       for(int i=0;i<exp.length;i++)
       {
           
          if (exp[i] == '(' && exp[i] != ')')
            st.push(exp[i]);
          
      
          if (exp[i] == ')')
          {
                  
             if (st.isEmpty())
               {
                   return false;
               } 
             char c = st.pop();
      
              if ( !isMatchingPair(c, exp[i]) )
               {
            	   if((c != '(' && exp[i] == ')') ||(c == '(' && exp[i] != ')')){
            		    found = true;
            		    c1=c;
            	    	continue;
            	    }else 
                       return false;
               }else if(isMatchingPair(c, exp[i])){
            	   if(found){
            		   System.out.print(""+c+c1+exp[i]);
            		   found=false;
            	   }else{
            		   System.out.print(""+c+exp[i]);
            	   }
               }
          }
          if (exp[i] != '(' && exp[i] != ')')
        	  st.push(exp[i]);
           
       }
         
       
       if (st.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } 
    } 
    
    static boolean areParenthesisBalanced1(char exp[])
    {
        Stack<Character> st = new Stack<>();
        Boolean found = false;
        char c1='0';
      
       for(int i=0;i<exp.length;i++)
       {
           
          if (exp[i] == '(' && exp[i] != ')'){
            st.push(exp[i]);
          }
          
      
          if (exp[i] == ')')
          {
                  
             if (st.isEmpty())
               {
                   return false;
               } 
             char c = st.pop();
      
              if ( !isMatchingPair(c, exp[i]) )
               {
            	   if((c != '(' && exp[i] == ')') ||(c == '(' && exp[i] != ')')){
            		    found = true;
            		    c1=c;
            	    	continue;
            	    }else 
                       return false;
               }else if(isMatchingPair(c, exp[i])){
            	   if(found){
            		   System.out.print(""+c+c1+exp[i]);
            		   found=false;
            	   }else{
            		   System.out.print(""+c+exp[i]);
            	   }
               }
          }
          if (exp[i] != '(' && exp[i] != ')'){
        	  st.push(exp[i]);
          }
           
       }
         
       
       if (st.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } 
    } 
    
    public static void main(String args[] ) throws Exception {
        
        //Scanner s = new Scanner(System.in);
       // String input = "(x)())()";
    	 String input = "()()))";
        char[] ch = input.toCharArray();
        
       // areParenthesisBalanced(ch);
        System.out.println();
        areParenthesisBalanced1(ch);
        
        
    }
}