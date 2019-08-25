package com.sxbot.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

import java.util.ArrayList
import java.util.Date

import io.objectbox.Box

class MainActivity : AppCompatActivity() {

    private var editText1: EditText? = null
    private val textView: TextView? = null
    private var add: Button? = null
    private val text = ArrayList<Data>()
    private var listView: ListView? = null
    private var notebox: Box<Note>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notebox = ObjectBox.boxStore!!.boxFor(Note::class.java)
        editText1 = findViewById<View>(R.id.editText) as EditText
        listView = findViewById<View>(R.id.list) as ListView
        add = findViewById<View>(R.id.button) as Button


        val o = View.OnClickListener {
            text.add(Data(editText1!!.text.toString()))
            val note = Note()
            note.text = editText1!!.text.toString()
            note.createdAt = Date()
            notebox!!.put(note)
        }

        add!!.setOnClickListener(o)
        val notes = NotesAdapter(this, text)
        listView!!.adapter = notes


    }


}
