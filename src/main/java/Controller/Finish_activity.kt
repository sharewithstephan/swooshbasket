package Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import Utilities.EXTRA_PLAYER
import com.example.swooshbasket.R
import kotlinx.android.synthetic.main.activity_finish_activity.*
import model.Player

class Finish_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_activity)
        val player= intent.getParcelableExtra<Player>(EXTRA_PLAYER)
//        val league= intent.getStringExtra(EXTRA_LEAGUE)!!
//        val skill= intent.getStringExtra(EXTRA_SKILL)!!

      //  searchLeaguesText.text="Looking for $league $skill league near you..."
        searchLeaguesText.text="Looking for ${player?.league} ${player?.skill} league near you..."
    }
}