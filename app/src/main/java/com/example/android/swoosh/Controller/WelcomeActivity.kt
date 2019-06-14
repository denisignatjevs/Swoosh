package com.example.android.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.android.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

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
