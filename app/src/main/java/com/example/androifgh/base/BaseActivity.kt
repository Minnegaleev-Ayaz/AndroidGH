package com.example.androifgh.base

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androifgh.utils.ActionType

abstract class BaseActivity: AppCompatActivity() {

    protected abstract val fragmentContainerId: Int
    abstract fun goToScreen(
        actionType: ActionType,
        destination: BaseFragment,
        tag: String? = null,
        isAddToBackStack: Boolean = true,
    )
}