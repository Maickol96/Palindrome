package com.linexperts.palindromo.model;

public class PalindromeResponse {
    private final int lengthCadena;
    private final int isPalindromo;
    private final int lengthCaracteresEspeciales;

    public PalindromeResponse(int lengthCadena, int isPalindromo, int lengthCaracteresEspeciales) {
        this.lengthCadena = lengthCadena;
        this.isPalindromo = isPalindromo;
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }

    public int getLengthCadena() {
        return lengthCadena;
    }

    public int getIsPalindromo() {
        return isPalindromo;
    }

    public int getLengthCaracteresEspeciales() {
        return lengthCaracteresEspeciales;
    }
}
