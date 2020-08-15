package com.valhalla.nybooks.ui.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.valhalla.nybooks.R
import kotlinx.android.synthetic.main.activity_main.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarMain.title = "Books"
        setSupportActionBar(toolbarMain)
    }
}