package com.waewaee.buildconfig.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.buildconfig.R
import com.waewaee.buildconfig.adapters.RestaurantListAdapter
import com.waewaee.shared.data.vos.RestaurantVO
import com.waewaee.shared.mvp.presenters.MainPresenter
import com.waewaee.shared.mvp.presenters.MainPresenterImpl
import com.waewaee.shared.mvp.views.MainView
import com.waewaee.shared.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private val mAdapter: RestaurantListAdapter = RestaurantListAdapter()

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpPresenter()
        setUpToolbar()
        setUpRecyclerView()

        mPresenter.onUiReady()
    }

    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Welcome to ${getString(R.string.app_name)}"
    }

    private fun setUpRecyclerView() {
        with(rvRestaurants) {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this).get(MainPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    override fun showRestaurants(restaurants: List<RestaurantVO>) {
        mAdapter.setNewData(restaurants)
    }

    override fun showError(errorMessage: String) {
        showSnackBar(errorMessage)
    }
}