package com.example.imaps

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_person.view.*

class ContactsAdapter(val context: Context, val contacts: List<Person>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    //    Create a new view - EXPENSIVE
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_person,parent,false)
        return ViewHolder(view)
    }

// Count how many items are in a dataset
    override fun getItemCount() = contacts.size

// Bind data at pos into ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.tvName
        val tvAge = itemView.tvAge
        fun bind(contact: Person) {
            tvName.text = contact.name
            tvAge.text = "Age: ${contact.age}"
        }
    }
}
