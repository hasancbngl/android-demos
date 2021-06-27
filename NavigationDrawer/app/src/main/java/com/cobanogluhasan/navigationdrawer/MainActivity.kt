package com.cobanogluhasan.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    //lateinit means it will be initialized later
    lateinit var toggleButton: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        val drawer = findViewById<DrawerLayout>(R.id.drawer)
        toggleButton = ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close)
        //add the toggle button to drawerLayout
        drawer.addDrawerListener(toggleButton)
        //it's ready to used
        toggleButton.syncState()

        //enable the toggle button on the UI it's false by default
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.option1 -> toast("option 1")
                R.id.option2 -> toast("option 2")
                R.id.option3 -> toast("option 3")
                R.id.option4 -> toast("option 4")
                R.id.option5 -> toast("option 5")
            }
            true
        }
    }

    fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    //in order to make our toggle and menu items work we need to override  onOptionsItemSelected

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggleButton.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}