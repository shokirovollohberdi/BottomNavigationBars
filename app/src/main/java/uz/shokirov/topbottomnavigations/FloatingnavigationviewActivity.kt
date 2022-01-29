package uz.shokirov.topbottomnavigations

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.shokirov.topbottomnavigations.databinding.ActivityFloatingnavigationviewBinding

class FloatingnavigationviewActivity : AppCompatActivity() {
    lateinit var binding: ActivityFloatingnavigationviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFloatingnavigationviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingNavigationView.backgroundTintList = ColorStateList.valueOf(
            Color.parseColor(
                "#009688"
            )
        );
        binding.floatingNavigationView.setOnClickListener {
            binding.floatingNavigationView.open()
        }

    }
}