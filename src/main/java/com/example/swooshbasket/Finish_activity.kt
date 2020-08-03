package com.example.swooshbasket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish_activity.*

class Finish_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_activity)
        val league= intent.getStringExtra(EXTRA_LEAGUE)!!
        val skill= intent.getStringExtra(EXTRA_SKILL)!!

        searchLeaguesText.text="Looking for $league $skill league near you..."

    }
}