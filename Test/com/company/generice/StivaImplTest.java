package com.company.generice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StivaImplTest {

    @Test
    void test1() {

        String text = "Ana are mere ";

        Stiva<Character> stiva = new StivaImpl();


        for(int i=0;i<text.length();i++){

             stiva.push(text.charAt(i));
        }

        text="";


        while (stiva.isEmpty()==false){


            text+=stiva.peek();

            stiva.pop();
        }



        System.out.println(text);

    }

   @Test
    void test2() {
        String text="{[])}";
     //   System.out.println(paranteze(text));
       System.out.println(toateParantezele(text));
}
boolean paranteze(String text) {

    Stiva<Character> stiva = new StivaImpl();
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == '(') {
            stiva.push(text.charAt(i));
        } else if (stiva.isEmpty() == false && stiva.peek() == '(')
        {
            stiva.pop();

        }else {
            return true;
        }
    }
    return stiva.isEmpty();
}

boolean toateParantezele(String text){
    Stiva<Character> stiva = new StivaImpl();


    for(int i=0;i<text.length();i++){

        if (text.charAt(i) == '(' || text.charAt(i)=='[' || text.charAt(i)=='{') {

            stiva.push(text.charAt(i));
        } else if(text.charAt(i)==')'){

              if(stiva.isEmpty()||stiva.peek()!='('){

                   return false;
              }
              stiva.pop();
        }
        else if(text.charAt(i)==']'){
            if(stiva.isEmpty()||stiva.peek()!='['){
                return false;

            }
            stiva.pop();
        }
        else if(text.charAt(i)=='}'){
            if(stiva.isEmpty()||stiva.peek()!='{'){
                return false;
            }
            stiva.pop();
        }


    }
    return stiva.isEmpty();

    }



}




