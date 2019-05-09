package com.example.meditask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class DrawerActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout
    private lateinit var actionBarDrawer : ActionBarDrawerToggle
    private lateinit var navigationView : NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer)

        drawerLayout = findViewById(R.id.empty_activity)
        actionBarDrawer = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)

        drawerLayout.addDrawerListener(actionBarDrawer)
        actionBarDrawer.syncState()

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        navigationView = findViewById(R.id.nv)
        navigationView.setNavigationItemSelectedListener (object : NavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(p0: MenuItem): Boolean {
                return true
            }
        }
        )

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if( actionBarDrawer.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
