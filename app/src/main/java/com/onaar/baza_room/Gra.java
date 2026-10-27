package com.onaar.baza_room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public int minLiczbaOsob;
    public int maksLiczbaOsob;
    public int kategoriaWiekowa;
    public String kategoria;

    public Gra(String nazwa, int minLiczbaOsob, int maksLiczbaOsob, int kategoriaWiekowa, String kategoria) {
        this.nazwa = nazwa;
        this.minLiczbaOsob = minLiczbaOsob;
        this.maksLiczbaOsob = maksLiczbaOsob;
        this.kategoriaWiekowa = kategoriaWiekowa;
        this.kategoria = kategoria;
    }

    public Gra() {
    }
}
