package com.flair.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.flair.R
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoardActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)


        btnRecyclerView.setOnClickListener(this)
        btnCheckBox.setOnClickListener(this)

    }


    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnRecyclerView -> {
                Toast.makeText(this, "Item Click on btnRecyclerView " , Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MainActivity::class.java)
                        //  intent.putExtra(INTENT_USER_ID, user.id)

                startActivity(intent)

            }

            R.id.btnCheckBox -> {
                Toast.makeText(this, "Item Click on btnCheckBox" , Toast.LENGTH_SHORT).show()
            }

            else -> {

            }
        }

    }
}
