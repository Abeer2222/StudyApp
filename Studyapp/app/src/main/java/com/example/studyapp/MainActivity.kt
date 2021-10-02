package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.studyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SheetClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popSheet()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)//2 cardView in each row
            adapter = CardAdapter(sheetList, mainActivity)
        }
    }

    override fun OnClick(sheet: Sheet) {
        val intent = Intent(applicationContext, DetailsActivity::class.java)
        intent.putExtra(SHEET_ID_EXTRA, sheet.id)
        startActivity(intent)

    }

    private fun popSheet() {
        val sheet1 = Sheet(
            R.drawable.plant,//initialize the sheet obj
            //"Author: Victoria",
            "String of pearls ",
            "This plant has a trail of oval “beads” that makes the succulent unique. It’s a fast growing plant, so give it room to grow. It works great in hanging baskets or on shelves.\n" +
                    "\n" +
                    "Light: Bright, indirect lighting.\n" +
                    "\n" +
                    "Water: It’s drought tolerant due to storing water in its leaves. Let soil dry out before watering.\n" +
                    "\n" +
                    "Pet friendly: No. Not safe for pets if ingested.\n" +
                    "\n" +
                    "Plant parent level: Beginner.\n" +
                    "\n" +
                    "Pro tip: You can trim the length if the “bead trails” become too long."
        )
        sheetList.add(sheet1)

        val sheet2 = Sheet(
            R.drawable.p1,
            // "Victoria",
            "Monstera",
            "Also known as the Swiss cheese plant for its holes, the Monstera is iconic from many 70’s photographs, album covers, or advertisements.\n" +
                    "\n" +
                    "With its aerial roots, the Monsteraloves to climb and spread out. Be sure to place it somewhere where it can take up some room. Buyer beware: This plant is pricey and will set you back a few bucks.\n" +
                    "\n" +
                    "Light: Give it bright, indirect light. Avoid placing it in direct sunlight.\n" +
                    "\n" +
                    "Water: Water whenever the soil starts to dry out.\n" +
                    "\n" +
                    "Pet friendly: No. This plant is poisonous.\n" +
                    "\n" +
                    "Plant parent level: Beginner.\n" +
                    "\n" +
                    "Pro tip: Occasionally wipe leaves off for any dust particles."
        )
        sheetList.add(sheet2)

        val sheet3 = Sheet(
            R.drawable.p2,
            //  "Victoria",
            "Zenzi ZZ",
            "Zamioculcas zamiifolia\n" +
                    "he Zenzi ZZ plant is the little sib of the larger ZZ plant. With its dark green leaves and thick stems, it’s perfect as a desk plant (plus, it might make you want to go to work!).\n" +
                    "\n" +
                    "Light: It does best in a shaded area. Avoid direct sunlight.\n" +
                    "\n" +
                    "Water: It’s drought tolerant so only water whenever the soil starts to dry out.\n" +
                    "\n" +
                    "Pet friendly: No.\n" +
                    "\n" +
                    "Plant parent level: Beginner.\n" +
                    "\n" +
                    "Pro tip: Less water is better for this little guy. Too much water can make its stem and roots rot."
        )
        sheetList.add(sheet3)

        val sheet4 = Sheet(
            R.drawable.p3,
            // "Victoria",
            "Dracaena corn",
            "The dracaena corn plant is easy to maintain, and with its yellow and green leaves, it can brighten up your living space. This plant also made the list of air-filtering plants from the NASA clean air study.\n" +
                    "\n" +
                    "Light: It loves bright, indirect light, and fluorescent lighting. Avoid direct sunlight.\n" +
                    "\n" +
                    "Water: Water when soil becomes slightly dry at the top. Be sure not to overwater because the tips will turn brown.\n" +
                    "\n" +
                    "Pet friendly: No. Toxic to animals.\n" +
                    "\n" +
                    "Plant parent level: Beginner.\n" +
                    "\n" +
                    "Pro tip: Don’t use leaf shine on corn plants. They’re not a fan."
        )
        sheetList.add(sheet4)

        sheetList.add(sheet1)

    }


}