package id.gits.si.tugas11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnMasuk = findViewById<TextView>(R.id.btnMasuk)
        val btnKembali = findViewById<TextView>(R.id.btnKembali)

        btnMasuk.setOnClickListener() {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnKembali.setOnClickListener() {
            super.onBackPressed();
        }
    }
}