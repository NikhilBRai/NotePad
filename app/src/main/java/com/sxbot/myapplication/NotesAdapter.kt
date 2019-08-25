package com.sxbot.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

import java.util.ArrayList


class NotesAdapter(context: Context, private val sticker: List<Data>) : ArrayAdapter<Data>(context, 0, sticker) {

    private val layoutInflater: LayoutInflater

    init {

        this.layoutInflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {


            convertView = layoutInflater.inflate(R.layout.test, parent, false)
        }
        val current = sticker[position]

        val adap = convertView!!.findViewById<View>(R.id.adap1) as TextView

        adap.text = current.sticker



        return convertView
    }
}
