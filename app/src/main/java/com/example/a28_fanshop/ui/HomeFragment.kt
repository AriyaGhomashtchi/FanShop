package com.example.a28_fanshop.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a28_fanshop.adapter.FanAdapter
import com.example.a28_fanshop.data.Datasource
import com.example.a28_fanshop.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val datasource = Datasource()
        val fanList = datasource.getFans()

        binding.homeFanRecycler.adapter = FanAdapter(fanList)
    }

}