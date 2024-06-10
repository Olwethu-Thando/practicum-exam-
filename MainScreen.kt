package com.example.practicumexam
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)
        val tempertureInput =findViewById<EditText>(R.id.temptureInput)
        val saveButton=findViewById<Button>(R.id.saveButton)
        val ClearButton =findViewById<Button>(R.id.ClearButton)
        val detailedviewButton= findViewById<Button>(R.id.DetailedViewButton)
        saveButton.setOnClickListener {
            Toast.makeText(this , "data saved ", Toast.LENGTH_SHORT).show()
        }
        ClearButton.setOnClickListener {
            tempertureInput.setText("")

                detailedviewButton.setOnClickListener {
                val intent =Intent(this , DetailedScreen::class.java)
                val temperturesText=tempertureInput.text.toString()
                val temperturesArray=temperturesText.split(",").map { it.trim().toFloat() }
                val averageTemperture=temperturesArray.average()
                startActivity(intent)
            }
        }
    }

}
