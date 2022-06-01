package com.company;

//Aquesta refactoritzacio trata d'una conversio de Euros a Pesetes
//Refactoritzacion: RENAME, reanomenarem una variable CONSTANT FINAL

public class /* Conversor */ Rename {

    private static final float CHANGE_EUROS_TO_PESETES_RATE= 166.386f;

    public float conv (float c) {
        float x = c * CHANGE_EUROS_TO_PESETES_RATE;
        return x;
    }
}


/* CODI FONT SENSE REFACTORITZAR

public class Conversor {

    public float conv (float c) {
        float x = c * 166.386f;
        return x;
    }
}
 */