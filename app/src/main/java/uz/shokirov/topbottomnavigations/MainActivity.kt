package uz.shokirov.topbottomnavigations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.shokirov.topbottomnavigations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDevlight.setOnClickListener {
            startActivity(Intent(this, DevlightActivity::class.java))
        }
        binding.btnFloating.setOnClickListener {
            startActivity(Intent(this, FloatingnavigationviewActivity::class.java))
        }
        binding.btnScoll.setOnClickListener {
            startActivity(Intent(this, LooperBottomNavBarActivity::class.java))
        }
    }
}