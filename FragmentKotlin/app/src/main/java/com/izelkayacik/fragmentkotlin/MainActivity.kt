 package com.izelkayacik.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun firstFragment(view: View)
    {
        //JAVA'da fragmentManagar get olarak kullanılırken kotlin de support olarak kullanılır.
        val fragmentManager = supportFragmentManager
        //Başlatma ve değişiklikler yapabilmek için Transaction kullanırız.
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout, firstFragment).commit()
    }

    fun secondFragment(view: View)
    {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.add(R.id.frameLayout, secondFragment).commit()
    }
}