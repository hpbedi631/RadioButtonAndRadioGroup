package com.example.radiobuttonandradiogroup

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/* My name is Harshdeep Bedi and my student number is N01358063. I wrote the code because it was part of my practice lab,
I wrote this code on September 22 and this code should be checking which radiobutton out of the three radio buttons is selected
and then displaying the proper fruit in the Toast and textView.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radio1) {
                Toast.makeText(this, radio1.text.toString(), Toast.LENGTH_SHORT).show()
                textView.text = radio1.text
            }
            if (checkedId == R.id.radio2) {
                Toast.makeText(this, radio2.text.toString(), Toast.LENGTH_SHORT).show()
                textView.text = radio2.text
            }
            if (checkedId == R.id.radio3) {
                Toast.makeText(this, radio3.text.toString(), Toast.LENGTH_SHORT).show()
                textView.text = radio3.text
            }
        }
    }
}