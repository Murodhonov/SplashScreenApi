package uz.umarxon.splashscreenapi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    init {
        viewModelScope.launch {
            doSomething()
            _isLoading.value = false
        }
    }

    private suspend fun doSomething(){
        //You can replace your own work here (ex: calling api, fetching data and etc....)
        delay(3000)
    }
}