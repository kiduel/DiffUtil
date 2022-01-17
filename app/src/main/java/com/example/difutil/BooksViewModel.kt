package com.example.difutil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.difutil.model.Book
import kotlinx.coroutines.launch

class BooksViewModel : ViewModel() {

    fun fetchBooks(): LiveData<List<Book>> {
        val result = MutableLiveData<List<Book>>()
        viewModelScope.launch {
            val booksList = Util.createDummyData()
            result.postValue(booksList)
        }
        return result
    }
}