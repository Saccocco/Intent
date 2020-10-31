package jp.techacademy.sachiko.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnclickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)

    }

    override fun onClick(v: View?){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
