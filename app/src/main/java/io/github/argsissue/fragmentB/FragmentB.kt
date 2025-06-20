package io.github.argsissue.fragmentB

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import io.github.argsissue.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private val viewModel: FragmentBViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentBBinding.inflate(inflater, container, false).root
}