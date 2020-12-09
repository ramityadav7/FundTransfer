package com.poc.fundtransfer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FundTransferProvider : MFViewProvider{
    override fun inflate(context: Context, parent: ViewGroup?, navigationId: Int): View {
        return LayoutInflater.from(context)
            .inflate(R.layout.view_dashboard, parent, false).apply {
                var button = this.findViewById<Button>(R.id.button)
                button.setOnClickListener {
                    button.findNavController().navigate(navigationId)
//                    findNavController().createDeepLink().setDestination(R.id.FundTransferFragment).createPendingIntent().send()
                }
            }
    }
}