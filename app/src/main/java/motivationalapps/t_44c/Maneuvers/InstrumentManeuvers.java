package motivationalapps.t_44c.Maneuvers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import motivationalapps.t_44c.R;

public class InstrumentManeuvers extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    private ListView items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bi_instrument_maneuvers);
        items = (ListView) findViewById(R.id.instrumentList);
        ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.biManeuvers, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        items.setAdapter(itemAdapter);
        items.setOnItemClickListener(this); //activates a listener to activate the method below
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;

        if (l == 0) {
            intent = new Intent(getBaseContext(), BiUnusualAttitude.class);
            startActivity(intent);
        }

        else if (l == 1) {
            intent = new Intent(getBaseContext(), BiOscarPattern.class);
            startActivity(intent);
        }

        else if (l == 2) {
            intent = new Intent(getBaseContext(), BiBravoPattern.class);
            startActivity(intent);
        }

        else if (l == 3) {
            intent = new Intent(getBaseContext(), BiCharliePattern.class);
            startActivity(intent);
        }

        else if (l == 4) {
            intent = new Intent(getBaseContext(), BiYankeePattern.class);
            startActivity(intent);
        }

        else{
            Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
        }
    }
}
