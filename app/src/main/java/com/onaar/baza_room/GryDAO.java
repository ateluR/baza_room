
package com.onaar.baza_room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface GryDAO {

    @Insert
    public void wstawGreDoBazy(Gra gra);

    @Insert
    public void wstawGryDoBazy(Gra... gra);

    @Delete
    public void usunZBazy(Gra gra);

    @Update
    public void aktualizujeGre(Gra gra);

    @Query("SELECT * FROM gry")
    public List<Gra> zwrocWszystkieGry();

    @Query("SELECT nazwa FROM gry WHERE minLiczbaOsob = :ile")
    public List<String> zwrocNazwyGierDlaLiczbyOsob(int ile);
}
