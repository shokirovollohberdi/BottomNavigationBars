package uz.shokirov.topbottomnavigations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.shokirov.topbottomnavigations.databinding.ActivityLooperBottomNavBarBinding

class LooperBottomNavBarActivity : AppCompatActivity() {
    lateinit var binding: ActivityLooperBottomNavBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLooperBottomNavBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}