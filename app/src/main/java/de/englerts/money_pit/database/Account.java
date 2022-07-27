package de.englerts.money_pit.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "accounts")
public class Account {

    @PrimaryKey
    public int id;

    public String name;
    public String description;
    public float value;
}
