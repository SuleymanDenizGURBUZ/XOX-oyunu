package com.suleymandeniz.xox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.suleymandeniz.xox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var TV: ActivityMainBinding
    var oyuncu ="p1"
    var puanx = 0
    var puanO = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TV = ActivityMainBinding.inflate(layoutInflater)
        setContentView(TV.root)
        TV.buttonhile.setOnClickListener {

            alert("X")
        }
        TV.b1.setOnClickListener{
            butonlar(TV.b1)
        }
        TV.b2.setOnClickListener{
            butonlar(TV.b2)
        }
        TV.b3.setOnClickListener{
            butonlar(TV.b3)
        }
        TV.b4.setOnClickListener{
            butonlar(TV.b4)
        }
        TV.b5.setOnClickListener{
            butonlar(TV.b5)
        }
        TV.b6.setOnClickListener{
            butonlar(TV.b6)
        }
        TV.b7.setOnClickListener{
            butonlar(TV.b7)
        }
        TV.b8.setOnClickListener{
            butonlar(TV.b8)
        }
        TV.b9.setOnClickListener{
            butonlar(TV.b9)
        }

    }
    fun butonlar(button: Button){
        if(button.text == ""){
            if(oyuncu == "p1"){
                button.text = "X"
                oyuncu = "p2"
            }
            else{
                button.text = "O"
                oyuncu = "p1"
            }
        }
        durumlar()
    }
    fun durumlar(){
        if ((TV.b1.text == "X" && TV.b2.text == "X" && TV.b3.text == "X")||
            (TV.b4.text == "X" && TV.b5.text == "X" && TV.b6.text == "X")||
            (TV.b7.text == "X" && TV.b8.text == "X" && TV.b9.text == "X")||

            (TV.b1.text == "X" && TV.b4.text == "X" && TV.b7.text == "X")||
            (TV.b2.text == "X" && TV.b5.text == "X" && TV.b8.text == "X")||
            (TV.b3.text == "X" && TV.b6.text == "X" && TV.b9.text == "X")||

            (TV.b1.text == "X" && TV.b5.text == "X" && TV.b9.text == "X")||
            (TV.b3.text == "X" && TV.b5.text == "X" && TV.b7.text == "X")){
            println("agla (O), (X) kazandı böhöhöhöhöhöhöhöhyt ")
            alert("X")
        }

        else if
            ((TV.b1.text == "O" && TV.b2.text == "O" && TV.b3.text == "O")||
            (TV.b4.text == "O" && TV.b5.text == "O" && TV.b6.text == "O")||
            (TV.b7.text == "O" && TV.b8.text == "O" && TV.b9.text == "O")||

            (TV.b1.text == "O" && TV.b4.text == "O" && TV.b7.text == "O")||
            (TV.b2.text == "O" && TV.b5.text == "O" && TV.b8.text == "O")||
            (TV.b3.text == "O" && TV.b6.text == "O" && TV.b9.text == "O")||

            (TV.b1.text == "O" && TV.b5.text == "O" && TV.b9.text == "O")||
            (TV.b3.text == "O" && TV.b5.text == "O" && TV.b7.text == "O")){
            println("agla (X), (O) kazandı böhöhöhöhöhöhöhöhyt ")
            alert("O")
        }
        else if((TV.b1.text != "")&&(TV.b2.text !="")&&(TV.b3.text != "")&&
            (TV.b4.text != "")&&(TV.b5.text !="")&&(TV.b6.text != "")&&
            (TV.b7.text != "")&&(TV.b8.text !="")&&(TV.b9.text != "")){
            println("berabere")
            alert("Tie")
        }

    }
    fun alert(wins: String){
        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(wins)
        alertDialog.setMessage("$wins !!! Play Again?")
        alertDialog.setPositiveButton("Yes") { dialog, which ->
            clear()
            if (wins == "X") {
                puanx++
            } else if(wins == "O"){
                puanO++

            }
            else{
                println("berabere")
            }
            //TV.textViewScore.setText("Score: X: $puanx      O: ${puanO}")
            TV.skorX.setText("skor = X:$puanx")
            TV.skorO.setText("skor = O:$puanO")
            Toast.makeText(applicationContext,"Reset", Toast.LENGTH_SHORT).show()

        }.setNegativeButton("No") { dialog, which ->
            finish()
        }
        alertDialog.show()
    }

    fun clear(){
        TV.b1.text= ""
        TV.b2.text= ""
        TV.b3.text= ""
        TV.b4.text= ""
        TV.b5.text= ""
        TV.b6.text= ""
        TV.b7.text= ""
        TV.b8.text= ""
        TV.b9.text= ""
    }
}