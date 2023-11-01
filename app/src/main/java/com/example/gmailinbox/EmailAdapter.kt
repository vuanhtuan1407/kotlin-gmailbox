package com.example.gmailinbox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class EmailAdapter(val emails: ArrayList<Email>): BaseAdapter() {
    override fun getCount(): Int {
        return emails.size
    }

    override fun getItem(position: Int): Any {
        return emails[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val emailView: View = LayoutInflater.from(parent?.context).inflate(R.layout.email_items, parent, false)
        val (senderName, subject, preview, timeStamp) = emails[position]

        emailView.findViewById<TextView>(R.id.senderName).text = senderName
        emailView.findViewById<TextView>(R.id.subject).text = subject
        emailView.findViewById<TextView>(R.id.preview).text = preview
        emailView.findViewById<TextView>(R.id.timestamp).text = timeStamp
        return emailView
    }
}