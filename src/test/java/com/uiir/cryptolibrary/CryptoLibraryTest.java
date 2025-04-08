package com.uiir.cryptolibrary;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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


    public void testСaesarDecipher()
    {
        System.out.println("======TEST Метод дешифрования Цезаря=======");
        System.out.println("Ввод: Khoor");
        System.out.println("Вывод " + cryptoLibrary.caesarCipher("Khoor", 3));
    }

    public void testСaesarCipher()
    {
        System.out.println("======TEST Метод шифрования Цезаря=======");
        System.out.println("Ввод: Hello");
        System.out.println("Вывод " + cryptoLibrary.caesarCipher("Hello", 3));
    }

}
