package com.sumzed.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.sumzed.loginscreen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding;

        //bind the view
       binding =  ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String username = binding.editTextUsername.getText().toString();
        String password = binding.editTextPassword.getText().toString();

        //execute whatever inside {] take view as a parameter
        binding.signUpButton.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),username + " " + password , Toast.LENGTH_SHORT).show();
        });

    }
}