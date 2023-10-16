package com.example.androifgh.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.androifgh.R
import com.example.androifgh.base.BaseActivity
import com.example.androifgh.base.BaseFragment
import com.example.androifgh.databinding.FragmentFirstBinding
import com.example.androifgh.utils.ActionType
import com.example.androifgh.utils.ParamsKey

class FirstFragment : BaseFragment(R.layout.fragment_first) {
    private var _viewBinding: FragmentFirstBinding? = null
    private val viewBinding: FragmentFirstBinding get() = _viewBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = FragmentFirstBinding.inflate(inflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(viewBinding) {
            btnEnter.setOnClickListener {
                (requireActivity() as BaseActivity)?.goToScreen(
                    actionType = ActionType.REPLACE,
                    destination = SecondFragment.newInstance(etMessage.text.toString()),
                    tag = ParamsKey.SECOND_FRAGMENT_TAG,
                    isAddToBackStack = true
                )
                (requireActivity() as BaseActivity)?.goToScreen(
                    actionType = ActionType.REPLACE,
                    destination = ThirdFragment.newInstance(etMessage.text.toString()) ,
                    tag = ParamsKey.THIRD_FRAGMENT_TAG,
                    isAddToBackStack = true
                )

            }
        }

    }

    override fun onDestroyView() {
        _viewBinding = null
        super.onDestroyView()
    }
    companion object{
        fun newInstance(message: String) = FirstFragment().apply {
            arguments = Bundle().apply {
                putString(ParamsKey.MESSAGE_KEY,message)
            }
        }
    }

}