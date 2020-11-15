package com.github.satoshun.example

import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.github.satoshun.example.databinding.MainFragBinding

class MainFragment : Fragment(R.layout.main_frag) {
  private val binding: MainFragBinding get() = MainFragBinding.bind(requireView())

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.show.setOnClickListener {
      val controller = ViewCompat.getWindowInsetsController(binding.keyboard)!!
      controller.show(WindowInsetsCompat.Type.ime())
    }

    binding.hide.setOnClickListener {
      val controller = ViewCompat.getWindowInsetsController(binding.keyboard)!!
      controller.hide(WindowInsetsCompat.Type.ime())
    }

    binding.statusbar.setOnClickListener {
      val controller = ViewCompat.getWindowInsetsController(binding.root)!!
      controller.isAppearanceLightStatusBars = !controller.isAppearanceLightStatusBars
    }

    binding.navigationBar.setOnClickListener {
      val controller = ViewCompat.getWindowInsetsController(binding.root)!!
      controller.isAppearanceLightNavigationBars = !controller.isAppearanceLightNavigationBars
    }
  }
}
