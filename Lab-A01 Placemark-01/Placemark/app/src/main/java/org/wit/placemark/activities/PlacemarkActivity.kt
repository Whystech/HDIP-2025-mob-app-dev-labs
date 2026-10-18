package org.wit.placemark.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.ajalt.timberkt.Timber
import com.google.android.material.snackbar.Snackbar
import org.wit.placemark.databinding.ActivityPlacemarkBinding
import org.wit.placemark.models.PlacemarkModel
import timber.log.Timber.i


class PlacemarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlacemarkBinding
    var placemark = PlacemarkModel()
    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlacemarkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.plant(Timber.DebugTree())
        i("Placemark Activity Started...")

        binding.btnAdd.setOnClickListener() {
            placemark.title = binding.placemarkTitle.text.toString()
            placemark.description = binding.placemarkDescription.text.toString()
            if (placemark.title.isNotEmpty() && placemark.description.isNotEmpty()) {
                i("add Button Pressed: ${placemark.title}, placemarks are:")
                placemarks.add(placemark)
                i("Placemarks are $placemarks")

                Toast
                    .makeText(this, "Added ${placemark.title}, with description ${placemark.description} current placemarks are $placemarks", Toast.LENGTH_LONG  )
                    .show()

            }
            else {
                Snackbar
                    .make(it,"Title or description empty.", Snackbar.LENGTH_LONG)
                    .show()
            }
        }

    }
}