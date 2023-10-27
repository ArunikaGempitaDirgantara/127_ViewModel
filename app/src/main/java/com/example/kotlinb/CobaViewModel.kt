package com.example.kotlinb

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import com.example.kotlinb.Data.DataForm as DataForm

class CobaViewModel: ViewModel (){
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var jenisKL: String by mutableStateOf("")
        private set
    var address: String by mutableStateOf("")
        private set
    var email: String by mutableStateOf("")
        private set
    var stts: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData (nm: String, tlp: String, jk: String, alm: String, eml: String, st: String)
    {
        namaUsr = nm;
        noTlp = tlp;
        jenisKL = jk;
        address = alm;
        email = eml;
        stts = st
    }

    fun setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setstts(pilihStts: String) {
        _uiState.update { currentState ->currentState.copy(stts = pilihStts) }
    }
}