package com.google.firebase.example.rgm342955071.viewmodel

import androidx.lifecycle.ViewModel
import com.google.firebase.example.rgm342955071.Filters

/**
 * ViewModel for [com.google.firebase.example.rgm342955071.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
