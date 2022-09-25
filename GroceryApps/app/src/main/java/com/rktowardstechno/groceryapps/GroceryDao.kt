package com.rktowardstechno.groceryapps

import androidx.lifecycle.LiveData
import androidx.room.*
import com.rktowardstechno.groceryapps.GroceryItems

@Dao
interface GroceryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query("SELECT * FROM grocerry_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}







