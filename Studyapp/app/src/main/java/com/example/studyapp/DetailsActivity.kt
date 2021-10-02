package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studyapp.databinding.ActivityDetailsBinding
import com.example.studyapp.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sheetID = intent.getIntExtra(SHEET_ID_EXTRA, -1)
        val sheet = sheetFromID(sheetID)
        if (sheet != null) {
            binding.cover.setImageResource(sheet.cover)
            binding.title.text = sheet.title
            binding.description.text = sheet.description
            binding.description

        }
    }

    private fun sheetFromID(sheetID: Int): Sheet? {
        for (sheet in sheetList) {
            if (sheet.id == sheetID)
                return sheet
        }
        return null

    }
}