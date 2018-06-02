package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import motivationalapps.t_44c.Maneuvers.ContactManeuvers;
import motivationalapps.t_44c.Maneuvers.InstrumentManeuvers;

public class ManeuversMenu extends AppCompatActivity implements AdapterView.OnClickListener{

    //private ListView items;
    private Button contactButton;
    private Button biButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maneuvers);
        //items = (ListView) findViewById(R.id.maneuverList);
        //ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.ManeuversMain, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        //items.setAdapter(itemAdapter);
        //items.setOnItemClickListener(this); //activates a listener to activate the method below

        contactButton = findViewById(R.id.ContactButton);
        biButton = findViewById(R.id.BIButton);

        contactButton.setOnClickListener(this);
        biButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.ContactButton:
                intent = new Intent(getBaseContext(), ContactManeuvers.class);
                startActivity(intent);
                break;

            case R.id.BIButton:
                intent = new Intent(getBaseContext(), InstrumentManeuvers.class);
                startActivity(intent);
                break;
        }
    }
}
