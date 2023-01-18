package com.example.dodoapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dodopizzapractice.databinding.ActivityItemBinding

class ItemActivity : AppCompatActivity() {
    private var _binding: ActivityItemBinding? = null
    private val binding get() = _binding!!


    private var ingredientsList: MutableList<Food>? = null
    private val adapter = IngredientsAdapter()

    private var currentCategory: Int = -1
    private var currentPosition: Int = -1

    private lateinit var viewModel: ItemViewModel

    private val activityResultLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result!!.resultCode == Activity.RESULT_OK) {
            var updatedElement = result.data!!.extras!!.getInt("ELEMENT_POSITION", 0)
            getChildData(updatedElement)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel=ViewModelProvider(this)[ItemViewModel::class.java]

        val bundle = intent.extras?.get("PIZZA") as Food
        binding.comboChoiceRV.adapter = adapter

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.comboChoiceRV.layoutManager = layoutManager
        //getting data from Main Activity
        getParentData(bundle)
        //parse data into visual elements
        setupIngredientsList(bundle)
        //adapter's onclick method, data transfer to child activity
        setupListener()
        binding.backButton.setOnClickListener {
            finish()
        }

    }

    private fun setupIngredientsList(bundle:Food){
        // taking data from bundle (parent activity) and submitting it to adapter
        ingredientsList = bundle.ingredients?.toMutableList()
        adapter.submitList(ingredientsList ?: emptyList())
    }

    private fun setupListener(){
        //data transfer to next activity and launching ActivityResultLauncher
        adapter.onItemClick = { category, b ->
            val intent = Intent(this, IngredientsViewPage::class.java)
            intent.putExtra("CATEGORY", category)
            intent.putExtra("POSITION", b)

            currentCategory = category
            currentPosition = b

            activityResultLauncher.launch(intent)
        }
    }

    private fun getParentData(bundle: Food){

        val image = bundle!!.imageId
        val name = bundle.name
        val description = bundle.description
        val price = bundle.price

        binding.pizzaImage.setImageResource(image)
        binding.name.text = name
        binding.description.text = description
        binding.price.text = "Добавить в корзину за ${price.toString()},00c"
    }

    private fun getChildData(updatedElement: Int) {
        val listFood = viewModel.dataSource.getList(currentCategory)
        ingredientsList!![currentPosition] = listFood[updatedElement]
        adapter.submitList(ingredientsList!!)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}