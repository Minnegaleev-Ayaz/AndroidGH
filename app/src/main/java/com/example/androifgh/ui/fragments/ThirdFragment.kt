package com.example.androifgh.ui.fragments

import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.androifgh.R
import com.example.androifgh.base.BaseFragment
import com.example.androifgh.databinding.FragmentThirdBinding
import com.example.androifgh.utils.ParamsKey

class ThirdFragment: BaseFragment(R.layout.fragment_third) {
    private var _viewBinding: FragmentThirdBinding?=null
    private val viewBinding: FragmentThirdBinding get() = _viewBinding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = FragmentThirdBinding.inflate(inflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString(ParamsKey.MESSAGE_KEY) ?: ""
        with (viewBinding) {
            if (text.isNotEmpty()) {
                tvThird.text = text
            } else {
                tvThird.text = "Третий экран"
            }
        }
    }
    override fun onDestroyView() {
        _viewBinding = null
        super.onDestroyView()
    }
    companion object{
        fun newInstance(message: String) = ThirdFragment().apply {
            arguments = Bundle().apply {
                putString(ParamsKey.MESSAGE_KEY,message)
            }
        }
    }
}