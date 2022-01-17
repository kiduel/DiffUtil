package com.example.difutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.difutil.databinding.ActivityMainBinding
import com.example.difutil.model.Book
import org.kiva.lending.interview.interviewapp.network.adapter.BooksRVAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL


class MainActivity : AppCompatActivity() {
    private val booksViewModel: BooksViewModel by viewModels()
    lateinit var binding: ActivityMainBinding
    lateinit var booksRVAdapter: BooksRVAdapter
    var booksList : List<Book> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        booksViewModel.fetchBooks().observe(this, {
            booksList = it
            setUpRecyclerView(booksList)
        })

        var index = 1
        binding.deleteItem.setOnClickListener {
            val newList = ArrayList<Book>(booksList)
            booksRVAdapter.submitBooks(newList.subList(index++, booksList.size-1))
        }

    }

    private fun setUpRecyclerView(booksList: List<Book>) {
        binding.booksRV.apply {
            booksRVAdapter = BooksRVAdapter(booksList)
            adapter = booksRVAdapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(DividerItemDecoration(baseContext, VERTICAL))
        }
    }
}