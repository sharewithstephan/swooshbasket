package com.example.swooshbasket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class league_activity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }

    fun leagueNextclicked(view: View){
        val skillActivity= Intent(this, Skill_Activity::class.java)
        startActivity(skillActivity)


    }
}