package com.example.swooshbasket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill_.*
import model.Player

class Skill_Activity : BaseActivity() {
    //var league= ""
    //var skill= ""
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_)
       //league= intent.getStringExtra(EXTRA_LEAGUE)!!
        player= intent.getParcelableExtra(EXTRA_PLAYER)!!
        //println(league)
    }

    fun onSkillFinichClicked(view: View){

        if(player.skill!="")
        {
            val finishActivity=Intent(this, Finish_activity::class.java)
           // finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            //finishActivity.putExtra(EXTRA_PLAYER,pla)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked=false
        player.skill= "baller"
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked= false
        player.skill="beginner"
    }
}