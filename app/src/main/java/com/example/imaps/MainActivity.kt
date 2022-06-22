package com.example.imaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

data class Person(val name:String,val age:Int)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = createContacts()
        rvContacts.adapter = ContactsAdapter(this,contacts)
        rvContacts.layoutManager = LinearLayoutManager(this)
//        Log.i("MSG",": "+createContacts())
    }
}

private fun createContacts(): List<Person> {
    val contacts = mutableListOf<Person>()
    for (i in 1..100)
    {
        contacts.add(Person("Person $i",i))
    }
    return contacts
}
