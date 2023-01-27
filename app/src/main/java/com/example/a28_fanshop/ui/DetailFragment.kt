package com.example.a28_fanshop.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a28_fanshop.R
import com.example.a28_fanshop.data.model.Fan
import com.example.a28_fanshop.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val fan = requireArguments().getParcelable<Fan>("fan")

        if (fan != null) {
            binding.detailFanImage.setImageResource(fan.imageResource)
            binding.detailNameText.text = fan.name
            binding.detailDescriptionText.text = fan.description
            binding.detailPriceText.text = "${fan.price} Euro"

            if (!fan.isSale) {
                binding.detailSaleText.visibility = View.GONE
            }
        } else {
            binding.detailFanImage.setImageResource(R.drawable.round_broken_image_24)
        }
    }
}
