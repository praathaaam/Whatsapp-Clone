 package com.example.whatsclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.whatsclone.databinding.ActivitySignUpBinding;
import com.google.firebase.auth.FirebaseAuth;

 public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        auth=FirebaseAuth.getInstance();





        getSupportActionBar().hide();
    }
}