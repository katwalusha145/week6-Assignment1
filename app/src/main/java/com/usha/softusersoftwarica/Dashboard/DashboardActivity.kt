package com.usha.softusersoftwarica.Dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.usha.softusersoftwarica.Adapter.ViewPageAdapter
import com.usha.softusersoftwarica.Fragment.AboutFragment
import com.usha.softusersoftwarica.Fragment.HomeFragment
import com.usha.softusersoftwarica.Fragment.StudentFragment
import com.usha.softusersoftwarica.Model.Student
import com.usha.softusersoftwarica.R

class DashboardActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager;
    private lateinit var tabLayout: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        loadViewPagerAdapter();
        loadlist()
    }
    private fun loadViewPagerAdapter() {

        val adapter = ViewPageAdapter(supportFragmentManager);
        adapter.addFragment(HomeFragment(), "Home");
        adapter.addFragment(StudentFragment(), "Add Student");
        adapter.addFragment(AboutFragment(), "About Us");
        viewPager.adapter = adapter;
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.home1);
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_person_add_24);
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_notifications_24);


    }

    private fun loadlist(){
        if (lisfOfStudent.size==0){
            lisfOfStudent.add(Student("Usha Katwal", "20", "ktm", "Female"));

        }
    }
    companion object {
        var lisfOfStudent = arrayListOf<Student>();
    }
}

