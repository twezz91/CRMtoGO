package de.crmtogo.deku.crmtogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;
import android.view.View.OnClickListener;
import android.content.Intent;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button searchCuBtn;
    private Button createCuBtn;
    private Button consultantEvBtn;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchCuBtn = (Button) findViewById(R.id.searchCustomerButton);
        searchCuBtn.setOnClickListener(this);
        createCuBtn = (Button) findViewById(R.id.createCustomerButton);
        createCuBtn.setOnClickListener(this);
        consultantEvBtn = (Button) findViewById(R.id.consultantEventsButton);
        consultantEvBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.searchCustomerButton:
                Intent intent1 = new Intent (this, SearchCustomer.class);
                startActivity(intent1);
                write ();
                break;

            case R.id.createCustomerButton:
                Intent intent2 = new Intent (this, createCustomer.class);
                startActivity(intent2);
                break;

            case R.id.consultantEventsButton:
                Intent intent3 = new Intent (this, showCustomer.class);
                startActivity(intent3);
                break;

            default:
                break;
        }

    }

    public void write (){


    }

}