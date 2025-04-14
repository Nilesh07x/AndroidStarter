package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ContactModel model =new ContactModel(R.drawable.baseline_person_24,"A","9098749290");

        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"A","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"b","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"c","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"d","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"e","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"f","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"g","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"h","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"i","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"j","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"k","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"l","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"m","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"n","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"o","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"p","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"q","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"r","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"s","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"t","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"u","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.baseline_person_24,"v","9098749290"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"w","9098749290"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }

}
