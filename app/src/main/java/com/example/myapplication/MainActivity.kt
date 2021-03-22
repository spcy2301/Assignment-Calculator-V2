package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener() {
            if (number.text.toString() == "0") {
                number.setText("1")
            } else {
                var s1 = number.text.toString()!!.plus(1)
                number.setText(s1)
            }
            two.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("2")
                } else {
                }
                var s2 = number.text.toString().plus(2)
                number.setText(s2)
            }
            three.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("3")
                } else {
                }
                var s3 = number.text.toString().plus(3)
                number.setText(s3)
            }
            four.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("4")
                } else {
                }
                var s4 = number.text.toString().plus(4)
                number.setText(s4)
            }
            five.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("5")
                } else {
                }
                var s5 = number.text.toString().plus(5)
                number.setText(s5)
            }
            six.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("6")
                } else {
                }
                var s6 = number.text.toString().plus(6)
                number.setText(s6)
            }
            seven.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("7")
                } else {
                }
                var s7 = number.text.toString().plus(7)
                number.setText(s7)
            }
            eight.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("8")
                } else {
                }
                var s8 = number.text.toString().plus(8)
                number.setText(s8)
            }
            nine.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("9")
                } else {
                }
                var s9 = number.text.toString().plus(9)
                number.setText(s9)
            }
            zero.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("0")
                } else {
                }
                var s0 = number.text.toString().plus(0)
                number.setText(s0)
            }
            b1.setOnClickListener() {
                if (number.text.toString() == "0") {
                    number.setText("0")
                } else {
                }
                var s0 = number.text.toString().plus(0)
                number.setText(s0)
            }
        }
        clear.setOnClickListener(){
            number.setText("0")
        }
        del.setOnClickListener(){
            if(number.text.toString().length<=1){
                number.setText("0")
            }else{
                number.text = number.text.dropLast(1)
            }
        }

    }
}