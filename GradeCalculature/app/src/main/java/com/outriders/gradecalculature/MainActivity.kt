package com.outriders.gradecalculature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtInput1 = findViewById<TextInputEditText>(R.id.Input1)
        var txtInput2 = findViewById<TextInputEditText>(R.id.Input2)
        var POEInput = findViewById<TextInputEditText>(R.id.POEInput)
        var ICETask = findViewById<TextInputEditText>(R.id.ICETask)

        var OutPut1 = findViewById<TextView>(R.id.Output1)
        var OutPut2 = findViewById<TextView>(R.id.output2)
        var OutPut3 = findViewById<TextView>(R.id.output3)
        var ICETaskOut = findViewById<TextView>(R.id.output4)

        var Average = findViewById<TextView>(R.id.output5)
        var Total = findViewById<TextView>(R.id.output6)

        var button = findViewById<Button>(R.id.Calculate)

        button.setOnClickListener {
            var NewtxtInput1 = txtInput1.text.toString().toInt()
            if(NewtxtInput1 > 50){
                OutPut1.text = "Pass"
            }else{
                OutPut1.text = "Fail"
            }

            var NewtxtInput2 = txtInput2.text.toString().toInt()
            if(NewtxtInput2 > 50){
                OutPut2.text = "Pass"
            }else{
                OutPut2.text = "Fail"
            }

            var NewtxtInput3 = POEInput.text.toString().toInt()
            if(NewtxtInput3 > 50){
                OutPut3.text = "Pass"
            }else{
                OutPut3.text = "Fail"
            }

            var NewtxtInput4= ICETask.text.toString().toInt()
            if(NewtxtInput3 > 50){
                ICETaskOut.text = "Pass"
            }else{
                ICETaskOut.text = "Fail"
            }

            var AverageSum = (NewtxtInput1/100)+NewtxtInput2+NewtxtInput3/+NewtxtInput4/4
            Average.text = AverageSum.toString()

            var totalSum = NewtxtInput1+NewtxtInput2+NewtxtInput3/+NewtxtInput4
            Total.text = totalSum.toString()

        }
    }
}