package com.uiir.cryptolibrary;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class CryptoLibraryTest extends TestCase
{
    private final CryptoLibrary cryptoLibrary = new CryptoLibrary();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CryptoLibraryTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CryptoLibraryTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void testСaesarDecipher()
    {
        assertEquals("Nkrru", cryptoLibrary.caesarCipher("Khoor", 3));
        System.out.println("Метод дешифрования Цезаря ✔");
    }

    @org.junit.Test
    public void testСaesarCipher()
    {
        assertEquals("Khoor", cryptoLibrary.caesarCipher("Hello", 3));
        System.out.println("Метод шифрования Цезаря ✔");
    }

    @org.junit.Test
    public void testXorCipher()
    {
        assertEquals("M`iij", cryptoLibrary.xorCipher("Hello", 5));
        System.out.println("Метод XOR шифрования ✔");
    }

    @org.junit.Test
    public void testXorDecipher()
    {
        assertEquals("Hello", cryptoLibrary.xorDecipher("M`iij", 5));
        System.out.println("Метод XOR дешифрования ✔");
    }


}
