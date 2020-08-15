package com.valhalla.nybooks.ui.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.valhalla.nybooks.R
import com.valhalla.nybooks.data.model.Book
import kotlinx.android.synthetic.main.activity_main.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbarMain)

        with(recyclerBooks) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())

        }

    }

    fun getBooks(): List<Book> {
        return listOf(
            Book("title", "autor"),
            Book("title2", "autor2"),
            Book("title3", "autor3")
        )
    }
}