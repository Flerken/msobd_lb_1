package com.uiir.cryptolibrary;


public class CryptoLibrary {

    // Метод шифрования Цезаря
    public String caesarCipher(String input, int shift) {
        if (shift == 0) {
            return input;
        }

        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                output.append((char) ((c - base + shift) % 26 + base));
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

    // Метод дешифрования Цезаря
    public String caesarDecipher(String input, int shift) {
        return caesarCipher(input, 26 - shift);
    }

    // Метод XOR шифрования
    public String xorCipher(String input, int key) {
        byte[] inputBytes = input.getBytes();
        byte[] outputBytes = new byte[inputBytes.length];

        for (int i = 0; i < inputBytes.length; i++) {
            outputBytes[i] = (byte) (inputBytes[i] ^ key);
        }

        return new String(outputBytes);
    }

    // Метод XOR дешифрования
    public String xorDecipher(String input, int key) {
        return xorCipher(input, key);
    }
}
