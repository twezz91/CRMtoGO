package de.crmtogo.deku.crmtogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.firebase.firestore.FirebaseFirestore;

public class SearchCustomer extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    FirebaseFirestore customerSearch = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_customer);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.suchListe, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        String was = parent.getSelectedItem().toString();
        System.out.println(was);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
