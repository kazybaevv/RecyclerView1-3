package com.example.recyclerview1_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerview1_3.databinding.FragmentMainBinding


class MainFragment : Fragment() {

 private  lateinit var binding : FragmentMainBinding
 private lateinit var adapter: CarAdapter
 private var listCar = arrayListOf<CarModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = CarAdapter(listCar)
        binding.rvCars.adapter
    }
    fun  loadData(){
        listCar.add(CarModel(
            img = "https://s.auto.drom.ru/img1/catalog/photos/fullsize/chevrolet/camaro/chevrolet_camaro_31036.jpg",
            name = "Chevrolet Camaro", price = "50000$",
            releaseDate = "2011"),
            )
        listCar.add(CarModel(
            img = "https://kolesa-photos.kcdn.online/kolesa-read/2018/10/29/0ee343610e72bc40bb9184979744bcd01f753731-1193x671.jpg",
            name = "Toyota Camry", price = "25000$",
            releaseDate = "2019"),
        )
        listCar.add(CarModel(
            img = "https://www.bmw-m.com/content/dam/bmw/marketBMW_M/www_bmw-m_com/all-models/m-automobile/m5-limousine/2024/bmw-m5-posi-disclaimer-ig-01-16x9.jpg",
            name = "BMW M5", price = "35000$",
            releaseDate = "2021"),
        )
        listCar.add(CarModel(
            img = "https://www.topgear.com/sites/default/files/cars-car/image/2025/09/24C0275_028.jpg",
            name = "Mercedez Benz AMG GT", price = "42000$",
            releaseDate = "2025"),
        )
        listCar.add(CarModel(
            img = "https://hips.hearstapps.com/hmg-prod/images/img-1484-jpg-649644d3c1386.jpg?crop=0.571xw:0.762xh;0.240xw,0.195xh&resize=1200:*",
            name = "Audi RS7", price = "28000$",
            releaseDate = "2024"),
        )
        listCar.add(CarModel(
            img = "https://kolesa-uploads.ru/-/ea955cbb-1469-4149-8aff-14fa1e45ed52/opel-corsa-blue-1280-copy.jpg",
            name = "Opel Corsa", price = "14000$",
            releaseDate = "2022"),
        )
        listCar.add(CarModel(
            img = "https://avatars.mds.yandex.net/get-verba/1604130/2a000001905e982a312012ba884d50e30576/cattouchretcr",
            name = "Volkswagen Jetta", price = "22000$",
            releaseDate = "2023"),
        )
    }

    companion object {
    }
}