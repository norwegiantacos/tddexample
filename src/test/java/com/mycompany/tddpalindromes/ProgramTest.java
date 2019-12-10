/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tddpalindromes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author uwtsd-student
 */
public class ProgramTest {
    
    public ProgramTest() {
    }
    
    @Test
    public void testOneCharacterPalindrome()
    {
        String input = "a";
        boolean expected = true;
        
        boolean actual = Program.checkIfPalindrome(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testZeroCharacterPalindrome()
    {
        String input = "";
        boolean expected = false;
        
        boolean actual = Program.checkIfPalindrome(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSingleSpaceWithCharacterRemoval()
    {
        String input = "a ";
        String expected = "a";
        
        String actual = Program.removeSpaces(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNoSpaceRemoval()
    {
        String input = "hello";
        String expected = "hello";
        
        String actual = Program.removeSpaces(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testBeginningSpaceRemoval()
    {
        String input = "     hello";
        String expected = "hello";
        
        String actual = Program.removeSpaces(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultipleSpaceRemoval()
    {
        String input = " h e l l o ";
        String expected = "hello";
        
        String actual = Program.removeSpaces(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLongStringSpaceRemoval()
    {
        String input = "Hello, this is a fairly long string";
        String expected = "Hello,thisisafairlylongstring";
        
        String actual = Program.removeSpaces(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSingleSpaceCharacterPalindrome()
    {
        String input = " ";
        boolean expected = false;
        
        boolean actual = Program.checkIfPalindrome(input);
        
        assertEquals(expected, actual);
    }
    
    /*@Test
    public void testTwoCharacterPalindrome()
    {
        String input = "aa";
        boolean expected = true;
        
        boolean actual = Program.checkIfPalindrome(input);
        
        assertEquals(expected, actual);
    }*/
    
    @Test
    public void testMakeLowerCaseAlreadyLowerCaseCharacter()
    {
        String input = "a";
        String expected = "a";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseUpperCaseCharacter()
    {
        String input = "A";
        String expected = "a";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseJustPunctuation()
    {
        String input = "!";
        String expected = "!";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseAlreadyLowerCaseSentence()
    {
        String input = "hello this is lower case";
        String expected = "hello this is lower case";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseUpperCaseSentence()
    {
        String input = "HELLO THIS IS UPPER CASE";
        String expected = "hello this is upper case";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseMixedCaseSentence()
    {
        String input = "HeLlO tHiS iS mIxEd CaSe";
        String expected = "hello this is mixed case";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseMixedCaseSentenceWithPunctuation()
    {
        String input = "HeLlO__ tHiS iS mIxEd CaSe!!!!";
        String expected = "hello__ this is mixed case!!!!";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeLowerCaseMixedCaseSentenceWithNumbers()
    {
        String input = "HeLlO987 tHiS iS mIxEd CaSe0123";
        String expected = "hello987 this is mixed case0123";
        
        String actual = Program.makeLowerCase(input);
        
        assertEquals(expected, actual);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
