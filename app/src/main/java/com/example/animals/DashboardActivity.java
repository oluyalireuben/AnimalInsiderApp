package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
TextView cow, dog, cat, sheep, goat, carmel, donkey, horse, rabbit, pigs, chicken, ducks, bees;
Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cow = findViewById(R.id.cow);
        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        sheep = findViewById(R.id.sheep);
        goat = findViewById(R.id.goat);
        carmel = findViewById(R.id.carmel);
        donkey = findViewById(R.id.donkey);
        horse = findViewById(R.id.horse);
        rabbit = findViewById(R.id.rabbit);
        pigs = findViewById(R.id.pig);
        chicken = findViewById(R.id.chicken);
        ducks = findViewById(R.id.DuckGheese);
        bees = findViewById(R.id.Bees);
        cat = findViewById(R.id.cat);

        exit = findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });

        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, cowActivity.class));
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, dogActivity.class));
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, catActivity.class));
            }
        });

        sheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, sheepActivity.class));
            }
        });

        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, goatActivity.class));
            }
        });

        carmel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, CarmelActivity.class));
            }
        });

        donkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, donkeyActivity.class));
            }
        });

        horse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, horseActivity.class));
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, rabbitActivity.class));
            }
        });

        pigs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, pigsActivity.class));
            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, chickenActivity.class));
            }
        });

        ducks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, duckActivity.class));
            }
        });

        bees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, beesActivity.class));
            }
        });




    }
}