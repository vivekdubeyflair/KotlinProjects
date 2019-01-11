package com.flair.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.flair.R
import com.flair.adapter.CustomListAdapter
import com.flair.adapter.VerticalListAdapter
import com.flair.base.RVItemClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var stringNameList: MutableList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpCheckBoxListener()

        prepareVerticaLDataList()
        setUpCustomListData()
        cbCustomViewList.isChecked = true


    }

    private fun setUpCheckBoxListener() {

        //cbCustomViewList   cbGridViewList  cbHorizontalList  cbVerticalList

        cbCustomViewList.setOnClickListener(View.OnClickListener {
            cbGridViewList.isChecked = false
            cbHorizontalList.isChecked = false
            cbVerticalList.isChecked = false

            prepareVerticaLDataList()
            setUpCustomListData()
        })


        cbGridViewList.setOnClickListener(View.OnClickListener {
            cbCustomViewList.isChecked = false
            cbHorizontalList.isChecked = false
            cbVerticalList.isChecked = false

            prepareVerticaLDataList()
            setUpGridListData()
        })


        cbHorizontalList.setOnClickListener(View.OnClickListener {
            cbGridViewList.isChecked = false
            cbCustomViewList.isChecked = false
            cbVerticalList.isChecked = false

            prepareVerticaLDataList()
            setUpHorizontalListData()

        })

        cbVerticalList.setOnClickListener(View.OnClickListener {
            cbGridViewList.isChecked = false
            cbHorizontalList.isChecked = false
            cbCustomViewList.isChecked = false

            prepareVerticaLDataList()
            setUpVerticalListData()
        })


    }

    private fun prepareVerticaLDataList() {

        stringNameList.clear()

        var i: Int = 0
        while (i <= 100) {
            stringNameList.add(" Vijesh " + i)
            i++
        }


    }

    private fun setUpVerticalListData() {

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VerticalListAdapter(stringNameList, this, object : RVItemClickListener {
            override fun onItemClick(position: Int, view: View) {
                Toast.makeText(applicationContext, "Item Click on " + position + " , item is " + stringNameList.get(position), Toast.LENGTH_SHORT).show()
            }

        })

    }

    private fun setUpCustomListData() {

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomListAdapter(stringNameList, this, object : RVItemClickListener {
            override fun onItemClick(position: Int, view: View) {
                Toast.makeText(applicationContext, "Item Click on " + position + " , item is " + stringNameList.get(position), Toast.LENGTH_SHORT).show()
            }

        })

    }

    private fun setUpHorizontalListData() {

        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true))
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = CustomListAdapter(stringNameList, this, object : RVItemClickListener {
            override fun onItemClick(position: Int, view: View) {
                Toast.makeText(applicationContext, "Item Click on " + position + " , item is " + stringNameList.get(position), Toast.LENGTH_SHORT).show()
            }

        })

    }

    private fun setUpGridListData() {

        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true))
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = CustomListAdapter(stringNameList, this, object : RVItemClickListener {
            override fun onItemClick(position: Int, view: View) {
                Toast.makeText(applicationContext, "Item Click on " + position + " , item is " + stringNameList.get(position), Toast.LENGTH_SHORT).show()
            }

        })

    }
}
