package com.rktowardstechno.groceryapps

import androidx.lifecycle.ViewModel
import com.rktowardstechno.groceryapps.GroceryItems
import com.rktowardstechno.groceryapps.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModal(private val repository: GroceryRepository) : ViewModel() {
     fun insert(items: GroceryItems) = GlobalScope.launch {
         repository.insert(items)
     }
     fun delete(items: GroceryItems) = GlobalScope.launch {
         repository.delete(items)
     }
    fun getAllGroceryItems() = repository.getAllItems()

}














