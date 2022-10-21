package com.example.autocompletesearchviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class HomeActivity extends AppCompatActivity {

    private String[] Areas = new String[]{
        "Abdullahpur", "Adabor", "Banani", "Basila", "Dhanmondi", "Mirpur", "Dhamrai", "Gulshan",
            "Shyamoli", "New Market", "Shahbag", "Tikatuli", "Darussalam", "Science Lab",
            "Bailey Road", "Shantinagar", "Bashabo", "Banasree", "Khilgaon", "Demra", "Kalabagan",
            "Kallyanpur", "Technical", "Mohammadpur", "Asad Gate", "Old Dhaka", "Paltan", "Agargaon",
            "Arambag", "Kamalapur"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AutoCompleteTextView searchAction = findViewById(R.id.searchAction);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_items,R.id.text_view_list_item, Areas);
        searchAction.setAdapter(adapter);
    }
}