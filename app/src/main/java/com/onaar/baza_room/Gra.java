package com.onaar.baza_room;

import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public int minLiczbaOsob;
    public int maksLiczbaOsob;
    public int kategoriaWiekowa;
    public String kategoria;

    public Gra(String kategoria, int kategoriaWiekowa, int maksLiczbaOsob, int minLiczbaOsob, String nazwa) {
        this.kategoria = kategoria;
        this.kategoriaWiekowa = kategoriaWiekowa;
        this.maksLiczbaOsob = maksLiczbaOsob;
        this.minLiczbaOsob = minLiczbaOsob;
        this.nazwa = nazwa;
    }
}
