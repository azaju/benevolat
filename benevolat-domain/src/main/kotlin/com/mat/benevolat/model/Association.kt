package com.mat.com.mat.benevolat.model

import com.mat.benevolat.model.Membre

data class Association (val name: String, val siren:String, val addresse: String, val membres: List<Membre>)
