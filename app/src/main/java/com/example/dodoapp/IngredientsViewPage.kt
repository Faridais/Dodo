package com.example.dodoapp

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dodoapp.databinding.ActivityIngredientsViewPageBinding

class IngredientsViewPage : AppCompatActivity() {

    private var _binding: ActivityIngredientsViewPageBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: IngredientsViewModel

    private val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    private val comboAdapter = ComboAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityIngredientsViewPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[IngredientsViewModel::class.java]

        val intent = intent

        val category = intent.getIntExtra("CATEGORY", 0)
        val pos = intent.getIntExtra("POSITION", 0)


        val ingredientsComboList = getIngredients(category)

        setupAdapter(ingredientsComboList, pos)

        updatePage(ingredientsComboList)


        comboAdapter.onItemClick = { elementPosition ->
            val intent = Intent()
            var position_element = elementPosition

            intent.putExtra("ELEMENT_POSITION", position_element)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.backIngredientsButton.setOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setupAdapter(ingredientsComboList: List<Food>, pos: Int) {
        comboAdapter.submitList(ingredientsComboList)

        binding.ingredientsChoice.adapter = comboAdapter
        binding.ingredientsChoice.layoutManager = layoutManager
        binding.ingredientsChoice.scrollToPosition(pos)

        binding.numberChoice.text =
            "${pos + 1} / ${ingredientsComboList.size}"
    }

    private fun updatePage(ingredientsComboList: List<Food>) {
        binding.ingredientsChoice.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            @SuppressLint("SetTextI18n")
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE && layoutManager.findLastCompletelyVisibleItemPosition() >= 0) {
                    binding.numberChoice.text =
                        "${layoutManager.findLastCompletelyVisibleItemPosition() + 1} / ${ingredientsComboList.size}"
                }
            }
        })
    }


    fun getIngredients(category: Int): List<Food> {
        return viewModel.dataSource.getList(category)
    }

}