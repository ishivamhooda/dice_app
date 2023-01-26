package com.example.a3_dice_app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
//            val toast=Toast.makeText(this,"Dice Rolled !",Toast.LENGTH_SHORT).show()
//            resultTextView.setText("6")
            rollDice()
        }
    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()

        val diceImage:ImageView=findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_six_faces_four)
        val drawableResource=when (diceRoll){
            1 -> R.drawable.dice_six_faces_one
            2 -> R.drawable.dice_six_faces_two
            3 -> R.drawable.dice_six_faces_three
            4 -> R.drawable.dice_six_faces_four
            5 -> R.drawable.dice_six_faces_five
            else-> R.drawable.dice_six_faces_six
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription.toString()

        //Reformat your code
        //Now you'll reformat your code to make sure it follows recommended code formatting conventions for Android.
        //
        //In the MainActivity.kt class, select all the text in the file with the keyboard shortcut Control+A on Windows (or Command+A on Mac). Or you could go to the menu in Android Studio Edit > Select All.
        //With all the text selected in the file, go to the Android Studio menu Code > Reformat Code or use the keyboard shortcut Ctrl+Alt+L (or Command+Option+L on Mac).

    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}