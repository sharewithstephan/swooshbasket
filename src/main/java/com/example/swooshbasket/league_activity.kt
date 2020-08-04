package com.example.swooshbasket

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league_activity.*
import model.Player

class league_activity : BaseActivity(){

    //var selectedLeague= ""
    var player= Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
       // selectedLeague="mens"
      player.league="mens"
    }


    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
       // selectedLeague="womens"
       player.league="womens"
    }

    fun onCoedClicked(view: View){
      mensLeagueBtn.isChecked=false
      womensLeagueBtn.isChecked=false
      //selectedLeague="co-ed"
      player.league="co-ed"
    }

    fun leagueNextclicked(view: View){
        if(player.league!="")
        {
            val skillActivity= Intent(this, Skill_Activity::class.java)
           // skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please Select a League",Toast.LENGTH_SHORT).show()
        }




    }




}