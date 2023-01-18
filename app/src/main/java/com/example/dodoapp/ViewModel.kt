package com.example.dodoapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//VIEW MODEL
class MainViewModel : ViewModel() {

    private val dataSource = DataSource()

    var categories = mutableListOf(
        FoodCategory(1, "Комбо", true),
        FoodCategory(2, "Закуски", false),
        FoodCategory(3, "Напитки", false),
        FoodCategory(4, "Пицца", false),
        FoodCategory(5, "Десерты", false),
        FoodCategory(6, "Соусы", false),
        FoodCategory(7, "Другие товары", false),
    )

    fun getUpdatedCategories(selectedCategoryId: Int): List<FoodCategory> {
        viewModelScope.launch(Dispatchers.IO) {

        }
        return categories.map {
            val newObj = FoodCategory(
                id = it.id,
                category = it.category,
                isSelected = it.id == selectedCategoryId
            )
            newObj
        }
    }

    fun getFoodById(id: Int = 1): List<Food> {
        return dataSource.getList(id)
    }

    override fun onCleared() {
        super.onCleared()
    }
}

class ItemViewModel: ViewModel(){
    val dataSource=DataSource()

    var categories = mutableListOf(
        FoodCategory(1, "Комбо", true),
        FoodCategory(2, "Закуски", false),
        FoodCategory(3, "Напитки", false),
        FoodCategory(4, "Пицца", false),
        FoodCategory(5, "Десерты", false),
        FoodCategory(6, "Соусы", false),
        FoodCategory(7, "Другие товары", false),
    )

    fun updateCategories(newCategories: List<FoodCategory>) {
        categories = newCategories.toMutableList()
    }

    fun getFoodById(id: Int = 1): List<Food> {
        return dataSource.getList(id)
    }

    override fun onCleared() {
        super.onCleared()
    }

}
class IngredientsViewModel:ViewModel(){
    public val dataSource = DataSource()
    var categories = mutableListOf(
        FoodCategory(1, "Комбо", true),
        FoodCategory(2, "Закуски", false),
        FoodCategory(3, "Напитки", false),
        FoodCategory(4, "Пицца", false),
        FoodCategory(5, "Десерты", false),
        FoodCategory(6, "Соусы", false),
        FoodCategory(7, "Другие товары", false),
    )

    fun updateCategories(newCategories: List<FoodCategory>) {
        categories = newCategories.toMutableList()
    }

    fun getFoodById(id: Int = 1): List<Food> {
        return dataSource.getList(id)
    }

    override fun onCleared() {
        super.onCleared()
    }
}