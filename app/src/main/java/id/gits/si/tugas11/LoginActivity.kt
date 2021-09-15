package id.gits.si.tugas11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnDaftar = findViewById<TextView>(R.id.btnDaftar)
        val btnDaftar2 = findViewById<TextView>(R.id.btnDaftar2)
        val btnKembali = findViewById<TextView>(R.id.btnKembali)

        btnDaftar.setOnClickListener() {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        btnDaftar2.setOnClickListener() {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        btnKembali.setOnClickListener() {
            super.onBackPressed();
        }
    }
}