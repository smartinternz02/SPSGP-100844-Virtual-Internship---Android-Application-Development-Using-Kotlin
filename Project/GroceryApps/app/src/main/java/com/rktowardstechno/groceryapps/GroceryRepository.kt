package com.rktowardstechno.groceryapps

import com.rktowardstechno.groceryapps.GroceryDatabase
import com.rktowardstechno.groceryapps.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {
    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}