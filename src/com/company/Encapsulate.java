package com.company;

//Aquesta refactoritzacio trata d'encapsular els metodes i atributs que no son necessaris desde dafora de la classe
//Refactoritzacion: Encapsulate, crearem els setters i getters perque no es pot accedir a la informacio de les variables,
//ja que els posarem privades, d'aquesta manera,
// amb els setters i getters podrem accedir a la informacio de les variables o modificar-la

public class /* Costumer */ Encapsulate {

    String name;
    int id;

    public /* Costumer */ Encapsulate() {
        init();
    }

    public void init() {
        name = "Eugene Krabs";
        id = 42;
    }

    public String toString() {
        return id + ":" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


/* CODI FONT SENSE REFACTORITZAR

    public class Encapsulate {

        String name;
        int id;

        public Encapsulate() {
            init();
        }

        public void init() {
            name = "Eugene Krabs";
            id = 42;
        }

        public String toString() {
            return id + ":" + name;
        }
    }
 */