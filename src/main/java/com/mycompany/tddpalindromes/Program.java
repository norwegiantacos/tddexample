/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tddpalindromes;

import java.util.Scanner;

/**
 *
 * @author uwtsd-student
 */
public class Program 
{
    public static Scanner stdin = new Scanner(System.in);
    
    public static void main(String[] args)
    {
    }
    
    public static boolean checkIfPalindrome(String phrase)
    {
        phrase = removeSpaces(phrase);
        
        //Check to see if phrase is one letter - one letter is always a palindrome
        if(phrase.length() == 1)
        {
            return true;
        }
        
        return false;
    }
    
    public static String removeSpaces(String phrase)
    {
        char[] phraseCharacters = phrase.toCharArray();
        
        String result = "";
        for(int i = 0;i<phrase.length();i++)
        {
            if(phraseCharacters[i] != ' ')
            {
                result = result + phraseCharacters[i];
            }
        }
        
        return result;
    }
    
    /*Useful information about characters:
    
    A char is a representation of a decimal value in the "ascii table" https://www.asciitable.com/
    You'll notice that (upper case) A is 65, B is 66, C is 67, Z is 90.
    Lower case values are also represented: a is 97, b is 98, c is 99, z is 122.
    We can actually perform maths on characters.  For example:
    
    char c = 'a'; //lower case a, 97
    c += 1; //98 (b)
    c += 10; //108 (l)
    
    In fact, we can treat a character exactly like we'd treat an integer - in doing so, we compare it to an integer value in the ascii table.
    This means we can use characters in, say, if() tests, compared to either other characters or numeric values.
    
    if(c > 'l')
    
    would evaluate to true if c was a value of 109 (m) or higher in the ascii table.
    
    We can use this to our advantage in the following functions.
    
    */
    
    public static String makeLowerCase(String phrase)
    {
        char[] phraseCharacters = phrase.toCharArray();
        String lowerCasePhrase = "";
        
        for(int i=0;i<phrase.length();i++)
        {
            if(phraseCharacters[i] >= 'A' && phraseCharacters[i] <= 'Z')
            {
                //This is an upper case character
                lowerCasePhrase += (char)(phraseCharacters[i] + 32); //static difference between A and a
            }
            else
            {
                lowerCasePhrase += (char)phraseCharacters[i];
            }
        }
        
        
        return lowerCasePhrase;
    }
    
    public static String removePunctuation(String phrase)
    {
        
        
        return "";
    }
}
