package uz.shokirov.topbottomnavigations

import android.R
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import devlight.io.library.ntb.NavigationTabBar
import uz.shokirov.topbottomnavigations.databinding.ActivityDevlightBinding


class DevlightActivity : AppCompatActivity() {
    lateinit var binding: ActivityDevlightBinding

    //thi is documentation https://github.com/Devlight/NavigationTabBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDevlightBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val models: ArrayList<NavigationTabBar.Model> = ArrayList()


        models.add(
            NavigationTabBar.Model.Builder(
                resources.getDrawable(uz.shokirov.topbottomnavigations.R.drawable.clock),
                Color.LTGRAY
            ).title("Clock")
                .badgeTitle("NTB")
                .build()
        )
        models.add(
            NavigationTabBar.Model.Builder(
                resources.getDrawable(uz.shokirov.topbottomnavigations.R.drawable.cup),
                Color.BLUE
            ).title("Cup")
                .badgeTitle("with")
                .build()
        )
        models.add(
            NavigationTabBar.Model.Builder(
                resources.getDrawable(uz.shokirov.topbottomnavigations.R.drawable.diploma),
                Color.CYAN
            ).title("Diploma")
                .badgeTitle("state")
                .build()
        )
        models.add(
            NavigationTabBar.Model.Builder(
                resources.getDrawable(uz.shokirov.topbottomnavigations.R.drawable.flag),
                Color.RED
            ).title("Flag")
                .badgeTitle("icon")
                .build()
        )
        binding.ntb.setModels(models);
        binding.ntb.setTitleMode(NavigationTabBar.TitleMode.ACTIVE);
        binding.ntb.setBadgeGravity(NavigationTabBar.BadgeGravity.BOTTOM);
        binding.ntb.setBadgePosition(NavigationTabBar.BadgePosition.CENTER);
        binding.ntb.setTypeface("fonts/custom_font.ttf");
        binding.ntb.setIsBadged(true);
        binding.ntb.setIsTitled(true);
        binding.ntb.setIsTinted(true);
        binding.ntb.setIsBadgeUseTypeface(true);
        binding.ntb.setBadgeBgColor(Color.RED);
        binding.ntb.setBadgeTitleColor(Color.WHITE);
        binding.ntb.setIsSwiped(true);
        binding.ntb.setBgColor(Color.BLACK);
        binding.ntb.setBadgeSize(10f);
        binding.ntb.setTitleSize(15f);
        binding.ntb.setIconSizeFraction(0.5f)
        binding.ntb.setBehaviorEnabled(true)
        binding.ntb.deselect();

    }
}