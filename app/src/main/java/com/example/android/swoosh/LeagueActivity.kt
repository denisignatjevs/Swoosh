package com.example.android.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {
    // all Kotlin Classes final by default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // так делается переход на другую activity(layout)
    fun leagueNextClicked(view: View) {
        val leagueIntent = Intent(this, SkillActivity::class.java)
        startActivity(leagueIntent)
    }
}
