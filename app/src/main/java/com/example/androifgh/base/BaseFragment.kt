package com.example.androifgh.base

import android.text.Layout
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.example.androifgh.ui.fragments.SecondFragment

abstract class BaseFragment(@LayoutRes layout: Int): Fragment(layout) {
}