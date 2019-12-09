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
    
    @Test
    public void testTwoCharacterPalindrome()
    {
        String input = "aa";
        boolean expected = true;
        
        boolean actual = Program.checkIfPalindrome(input);
        
        assertEquals(expected, actual);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
