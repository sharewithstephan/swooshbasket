package com.example.swooshbasket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Skill_Activity : BaseActivity() {
    var league= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_)
       league= intent.getStringExtra(EXTRA_LEAGUE)!!
        println(league)
    }
}