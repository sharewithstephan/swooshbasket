package Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import Utilities.EXTRA_PLAYER
import com.example.swooshbasket.R
import kotlinx.android.synthetic.main.activity_skill_.*
import model.Player

class Skill_Activity : BaseActivity() {
    //var league= ""
    //var skill= ""
    lateinit var player: Player


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_)
       //league= intent.getStringExtra(EXTRA_LEAGUE)!!
        player= intent.getParcelableExtra(EXTRA_PLAYER)!!
        //println(league)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null)
        {
            player=savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }

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