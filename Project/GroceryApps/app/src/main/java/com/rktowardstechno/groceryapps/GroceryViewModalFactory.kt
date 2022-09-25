package com.rktowardstechno.groceryapps
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rktowardstechno.groceryapps.GroceryRepository
import com.rktowardstechno.groceryapps.GroceryViewModal

class GroceryViewModalFactory (private val repository: GroceryRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T: ViewModel> create(modelClass: Class<T>):T{
        return GroceryViewModal(repository) as T
    }
}