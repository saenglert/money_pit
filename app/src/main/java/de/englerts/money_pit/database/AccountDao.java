package de.englerts.money_pit.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AccountDao {

    @Insert
    void insertAll(Account... accounts);

    @Delete
    void delete(Account account);

    @Query("SELECT * FROM accounts")
    List<Account> getAll();

    @Query("SELECT * FROM accounts WHERE id=:id")
    Account getById(int id);
}
