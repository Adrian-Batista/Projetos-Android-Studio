package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)


        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            textView.setText(R.string.texto_inicial)

            val dado = Dado(50)
            val resultado = dado.rolar()
            textView.setText(resultado.toString())

            /*val toast = Toast.makeText(this,R.string.texto_inicial, Toast.LENGTH_SHORT)
            toast.show()*/
        }


    }
    fun clickButton(view : View){
       /* val textView: TextView = findViewById(R.id.textView)
        textView.setText(R.string.texto_inicial)*/
        val toast = Toast.makeText(this,R.string.texto_inicial, Toast.LENGTH_SHORT)
        toast.show()

    }
}