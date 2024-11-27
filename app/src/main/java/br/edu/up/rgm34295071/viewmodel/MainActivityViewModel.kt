package br.edu.up.rgm34295071.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.rgm34295071.Filters

/**
 * ViewModel for [br.edu.up.rgm34295071.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
