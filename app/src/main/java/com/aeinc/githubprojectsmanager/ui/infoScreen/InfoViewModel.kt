package com.aeinc.githubprojectsmanager.ui.infoScreen

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aeinc.githubprojectsmanager.data.RepositoryImpl
import com.aeinc.githubprojectsmanager.domain.models.SmartModelRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class InfoViewModel(
): ViewModel() {
    private val repository =  RepositoryImpl()
    private val _status: MutableStateFlow<SmartModelRepository?> = MutableStateFlow(null)
    val status = _status.asStateFlow()

    init {
        takeResponse()
    }

    fun takeResponse(){
        viewModelScope.launch(Dispatchers.IO) {
            _status.value = repository.takeResponse()
        }
    }
}