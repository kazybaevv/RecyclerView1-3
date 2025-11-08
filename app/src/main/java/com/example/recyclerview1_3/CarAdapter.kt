package com.example.recyclerview1_3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview1_3.databinding.ItemCarsBinding

class CarAdapter(private val carList: List<CarModel>, val onClick: (CarModel) -> Unit) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarViewHolder {
        return CarViewHolder(
            ItemCarsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int
    ) {
        holder.onBind(carList[position])
    }

    override fun getItemCount() = carList.size


   inner class CarViewHolder(private val binding: ItemCarsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(carModel: CarModel) {
            binding.carName.text = carModel.name
            binding.carPrice.text = carModel.price
            binding.releaseDate.text = carModel.releaseDate
            Glide.with(binding.cars).load(carModel.img).into(binding.cars)

            binding.root.setOnClickListener {
                onClick(carModel)
            }
        }
    }
}





