package tagliaferro.adriano.firstapp.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import org.jetbrains.anko.find
import tagliaferro.adriano.firstapp.R
import tagliaferro.adriano.firstapp.adapters.ForecastListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList: RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        toast("Adriano")
        toast("Aprendendo Kotlin", Toast.LENGTH_LONG)
    }

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tu 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - RAiny - 22/17",
            "Fri 6/27 - Foggy - 21/10"
    )

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}
