package com.example.swooshbasket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill_.*

class Skill_Activity : BaseActivity() {
    var league= ""
    var skill= ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_)
       league= intent.getStringExtra(EXTRA_LEAGUE)!!
        //println(league)
    }

    fun onSkillFinichClicked(view: View){

        if(skill!="")
        {
            val finishActivity=Intent(this, Finish_activity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked=false
        skill= "baller"
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked= false
        skill="beginner"
    }
}