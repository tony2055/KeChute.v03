package br.com.antoniorm80282.kechute

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplashScreenActivity : AppCompatActivity() {

    private val SPLAH_DISPLAY_LENGTH = 3500L

    lateinit var ivLogo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        ivLogo = findViewById(R.id.ivLogo)
        carregar()
    }

    fun carregar(){
        val anim = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)
        anim.reset()

        ivLogo!!.clearAnimation()
        ivLogo!!.startAnimation(anim)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity,
                    MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            this@SplashScreenActivity.finish()
        }, SPLAH_DISPLAY_LENGTH)
    }
}
