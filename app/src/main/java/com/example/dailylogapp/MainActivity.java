package com.example.dailylogapp;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;





public class MainActivity extends AppCompatActivity {

    //These variables are for input fields and the submit button
    EditText fuelCostEditText;
    EditText startTimeEditText;
    EditText arrivalTimeEditText;
    EditText endTimeEditText;
    EditText cullsEditTime;
    EditText vaccinatedEditTime;
    EditText movedEditText;
    EditText notesEditText;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Calls  the parent class method to set up the activity
        setContentView(R.layout.activity_main); //This connects this java class with my activity_main.xml layout file

        // This links each EditText and Button to the matching ID from the activity_main file
        fuelCostEditText = findViewById(R.id.fuelCostEditText);
        startTimeEditText = findViewById(R.id.startTimeEditText);
        arrivalTimeEditText = findViewById(R.id.arrivalTimeEditText);
        endTimeEditText = findViewById(R.id.endTimeEditText);
        cullsEditTime = findViewById(R.id.cullsEditText);
        vaccinatedEditTime = findViewById(R.id.vaccinatedEditText);
        movedEditText = findViewById(R.id.movedEditText);
        notesEditText = findViewById(R.id.notesEditText);
        submitButton = findViewById(R.id.submitButton);


        //This sets a listener for when the submit button is clicked
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Gets the text entered ny the user from each input field
                String fuel = fuelCostEditText.getText().toString();
                String start = startTimeEditText.getText().toString();
                String arrival = arrivalTimeEditText.getText().toString();
                String end = endTimeEditText.getText().toString();
                String culls = cullsEditTime.getText().toString();
                String vaccinate = vaccinatedEditTime.getText().toString();
                String moved = movedEditText.getText().toString();
                String notes = notesEditText.getText().toString();

                //Pop-up message with a summary for testing purposes
                Toast.makeText(MainActivity.this,
                        "Daily Log Submitted!\nFuel: $" + fuel + "\nCulls: " + culls, Toast.LENGTH_LONG).show();
            }
        });

    }
}
