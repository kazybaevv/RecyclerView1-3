package com.example.recyclerview1_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.recyclerview1_3.databinding.FragmentDetailBinding
import com.example.recyclerview1_3.databinding.ItemCarsBinding


class DetailFragment : Fragment() {

    private  lateinit var binding: FragmentDetailBinding

    private val args:DetailFragmentArgs by navArgs()

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
        val model = args.model
with(binding){
    imgCar.loadImg(model.img)
           carTitle.text = model.name
            carPrice.text = model.price
            carReleaseDate.text = model.releaseDate
        }
   }
    fun ImageView.loadImg(img: String){
        Glide.with(this).load(img).into(this)
    }
    }

class DetailFragmentsArgs {

}
