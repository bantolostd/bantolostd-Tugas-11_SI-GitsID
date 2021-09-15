package id.gits.si.tugas11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMasuk = findViewById<Button>(R.id.btnMasuk)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)

        btnMasuk.setOnClickListener() {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnDaftar.setOnClickListener() {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
