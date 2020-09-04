package br.com.pitagoras.helloandroidpitagoras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_send.setOnClickListener {
            readData()
        }
//        val tv_first = findViewById<TextView>(R.id.tv_first_text)
//        tv_first.text = getString(R.string.um_texto_qq)
    }

    private fun readData() {
        val courseName = et_course.text.toString()
        val text = getString(R.string.tv_answare)
        tv_answare.text = "$text : $courseName"
    }
}