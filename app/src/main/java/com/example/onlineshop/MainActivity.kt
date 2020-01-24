package com.example.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.adapter.CountryAdapter
import com.example.onlineshop.adapter.LatestBrandAdapter
import com.example.onlineshop.adapter.PopularProductsAdapter
import com.example.onlineshop.model.Country
import com.example.onlineshop.model.LatestBrand
import com.example.onlineshop.model.PopularProduct
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lastestBrandArrivals()

        chooseCountry()

        popularProducts()
    }
      fun lastestBrandArrivals(){

          var latestRecyclerView : RecyclerView = findViewById(R.id.recycler_lastest_arrivals)
          var latestBrandList = ArrayList<LatestBrand>()
          latestBrandList.add(LatestBrand("Hyde Park N41015","LOUIS VUITION",52555,62555, R.drawable.bag ))
          latestBrandList.add(LatestBrand("HORNS WHITE LONG SLEEVE T SHIRT","Lady Gaga",1500,0, R.drawable.shirt ))
          latestBrandList.add(LatestBrand("I Phone 8 Plus","Apple",1200,1800, R.drawable.iphone ))
          latestBrandList.add(LatestBrand("Cream Fur Jacket","Uniqlo",4505,0, R.drawable.jacket))

          var latestBrandAdapter = LatestBrandAdapter(latestBrandList)
          latestRecyclerView.layoutManager=LinearLayoutManager(this,
              LinearLayoutManager.HORIZONTAL, false)
          latestRecyclerView.adapter = latestBrandAdapter
      }

    fun chooseCountry(){

        var countryRecyclerView : RecyclerView = findViewById(R.id.recycler_search_country)

        var countryList = ArrayList<Country>()

        countryList.add(Country("JAPAN",R.drawable.japan))
        countryList.add(Country("CHINA",R.drawable.china ))
        countryList.add(Country("KOREA",R.drawable.korea ))
        countryList.add(Country("MYANMAR",R.drawable.myanmar ))


        var chooseCountryAdapter = CountryAdapter(countryList)
        countryRecyclerView.layoutManager = GridLayoutManager(this,2)

        countryRecyclerView.adapter = chooseCountryAdapter

    }

    fun popularProducts(){
        var popularProductRecyclerView : RecyclerView = findViewById(R.id.recycler_popular_products)

        var popularProductList = ArrayList<PopularProduct>()

        popularProductList.add(PopularProduct("I Phone 8 Plus","Apple",1500,2000,R.drawable.iphone))
        popularProductList.add(PopularProduct("GhostBed 11 Inch Cooling Gel Memory Foam",
            "GhostBed",12000,18000,R.drawable.bed))
        popularProductList.add(PopularProduct("Nintendo Switch - Neon Blue and Red Joy-Con",
            "Nintendo",3500,2200,R.drawable.switchone))
        popularProductList.add(PopularProduct("BELARD| Womens Comfy Swing Tunic Short ...",
            "Belaroi",18990,0,R.drawable.shirtwhite))

        var popularAdapter = PopularProductsAdapter(popularProductList)
        popularProductRecyclerView.layoutManager = LinearLayoutManager(this)
        popularProductRecyclerView.adapter = popularAdapter
    }
}

