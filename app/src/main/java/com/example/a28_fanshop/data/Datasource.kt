package com.example.a28_fanshop.data

import com.example.a28_fanshop.R
import com.example.a28_fanshop.data.model.Fan

class Datasource {

    fun getFans(): List<Fan> {
        return listOf(
            Fan(
                "Toolnation i5",
                45.57,
                R.drawable.fan1,
                "very nice standard sized fan!",
                false
            ),
            Fan(
                "la Plastica",
                20.00,
                R.drawable.fan2,
                "cheap but does it's job",
                true
            ),
            Fan(
                "Golden Breeze",
                130.00,
                R.drawable.fan3,
                "best fan on the market",
                false
            ),
            Fan(
                "il plastico due",
                35.00,
                R.drawable.fan4,
                "a new version of an alltime classic",
                true
            ),
            Fan(
                "Tornado Tower",
                80.50,
                R.drawable.fan5,
                "the coolest tower you can find",
                false
            )
        )
    }
}