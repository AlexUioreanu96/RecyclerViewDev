package com.example.recyclerviewdev.data

import com.example.recyclerviewdev.R
import com.example.recyclerviewdev.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {


        return listOf<Affirmation>(Affirmation(R.string.affirmation1))
    }
}