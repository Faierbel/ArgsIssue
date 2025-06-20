package io.github.argsissue.fragmentB

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class FragmentBViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val args = FragmentBArgs.fromSavedStateHandle(savedStateHandle)
}