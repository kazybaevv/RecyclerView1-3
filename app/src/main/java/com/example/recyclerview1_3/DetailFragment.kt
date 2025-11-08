package com.example.recyclerview1_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.recyclerview1_3.databinding.FragmentDetailBinding
import com.example.recyclerview1_3.databinding.ItemCarsBinding


class DetailFragment : Fragment() {

    private  lateinit var binding: FragmentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val model = arguments?.getSerializable("key") as CarModel?

        if (model != null){
            Glide.with(binding.imgCar).load(model.img).into(binding.imgCar)

            binding.carTitle.text = model.name
            binding.carPrice.text = model.price
            binding.carReleaseDate.text = model.releaseDate
        }
    }

    }
