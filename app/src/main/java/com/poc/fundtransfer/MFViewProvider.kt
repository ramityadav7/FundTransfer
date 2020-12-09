package com.poc.fundtransfer

import android.content.Context
import android.view.View
import android.view.ViewGroup

interface MFViewProvider {
    fun inflate(context: Context, parent: ViewGroup?, navigationId: Int): View
}