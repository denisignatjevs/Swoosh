package com.example.android.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // так делается кнопка с переходом на другой layout
        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java) // explicit intent(we go from one
            // activity to another. implicit intent - you don't know witch activity you will use, explicit intent -
            // you know witch activity you will use
            startActivity(leagueIntent)
        }
    }
}
