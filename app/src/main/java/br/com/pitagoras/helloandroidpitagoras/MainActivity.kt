package br.com.pitagoras.helloandroidpitagoras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "<<<FGV>>>"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_send.setOnClickListener {
            lerDados()
        }
//        val tv_first = findViewById<TextView>(R.id.tv_first_text)
//        tv_first.text = getString(R.string.um_texto_qq)
    }

    fun lerDados() {
        val course_name = et_course.text.toString()
        tv_answare.text = tv_answare.text.toString() + ": " + course_name
    }
}