package com.example.testfragment.presenter

import com.example.testfragment.mobile_interface.MobilePresenterInterface
import com.example.testfragment.service.ApiService

class MobilePresenter (val view: MobilePresenterInterface, private val service: ApiService){

    fun getMobileApi(){
        service.getMobileList()
    }

}

//class BeerListPresenter(val view: BeerApiPresenterInterface, private val service: BeerApiService) {
//
//    companion object {
//        const val PAGE: Int = 1
//        const val PER_PAGE: Int = 25
//    }
//
//    fun getBeerApi() {
//        service.getBeerList(PAGE, PER_PAGE).enqueue(object : Callback<List<BeerModel>> {
//            override fun onFailure(call: Call<List<BeerModel>>, t: Throwable) { }
//
//            override fun onResponse(call: Call<List<BeerModel>>, response: Response<List<BeerModel>>) {
//                response.body()?.apply {
//                    if (this.isNotEmpty()) {
//                        view.setBeer(this)
//                    }
//                }
//            }
//
//        })
//    }
//