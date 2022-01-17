package org.kiva.lending.interview.interviewapp.network.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.difutil.R
import com.example.difutil.Util
import com.example.difutil.databinding.SingleRowBinding
import com.example.difutil.model.Book

class BooksRVAdapter(private var booksList: List<Book> = listOf()) :
    RecyclerView.Adapter<BooksRVAdapter.BookViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookViewHolder {
        val binding =
            SingleRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = booksList[position]
        val holderBinding = holder.singleRowBinding
        holderBinding.bookTitle.text = book.title
        holderBinding.bookAuthor.text = book.author

        Glide.with(holderBinding.root.context)
            .load(book.bookCover)
            .placeholder(R.drawable.ic_baseline_menu_book)
            .into(holderBinding.bookCoverImage)
    }

    fun submitBooks(items : List<Book>){
        val oldList = booksList
        val diffResult : DiffUtil.DiffResult = DiffUtil.calculateDiff(
            BookDiffUtil(oldList, items)
        )
        this.booksList = items
        diffResult.dispatchUpdatesTo(this)
    }

    override fun getItemCount(): Int = booksList.size

    class BookViewHolder(val singleRowBinding: SingleRowBinding) :
        RecyclerView.ViewHolder(singleRowBinding.root)

    class BookDiffUtil(var oldList : List<Book>, var newList : List<Book>) : DiffUtil.Callback(){
        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].id == newList[newItemPosition].id
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }

    }
}