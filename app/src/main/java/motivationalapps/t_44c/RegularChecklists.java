package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import motivationalapps.t_44c.Checklists.AfterLanding;
import motivationalapps.t_44c.Checklists.AfterStart;
import motivationalapps.t_44c.Checklists.Approach;
import motivationalapps.t_44c.Checklists.BeforeStart;
import motivationalapps.t_44c.Checklists.BeforeTakeoff;
import motivationalapps.t_44c.Checklists.Climb;
import motivationalapps.t_44c.Checklists.Cruise;
import motivationalapps.t_44c.Checklists.Descent;
import motivationalapps.t_44c.Checklists.EngineRunup;
import motivationalapps.t_44c.Checklists.Landing;
import motivationalapps.t_44c.Checklists.Preflight;
import motivationalapps.t_44c.Checklists.Secure;

public class RegularChecklists extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regular_checklists);
        items = (ListView) findViewById(R.id.checkList);
        ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.checklists, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        items.setAdapter(itemAdapter);
        items.setOnItemClickListener(this); //activates a listener to activate the method below
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;

        if (l == 0) {
            intent = new Intent(getBaseContext(), Preflight.class);
            startActivity(intent);
        }
        else if (l == 1) {
            intent = new Intent(getBaseContext(), BeforeStart.class);
            startActivity(intent);
        }

        else if (l == 2) {
            intent = new Intent(getBaseContext(), AfterStart.class);
            startActivity(intent);
        }

        else if (l == 3) {
            intent = new Intent(getBaseContext(), EngineRunup.class);
            startActivity(intent);
        }

        else if (l == 4) {
            intent = new Intent(getBaseContext(), BeforeTakeoff.class);
            startActivity(intent);
        }

        else if (l == 5) {
            intent = new Intent(getBaseContext(), Climb.class);
            startActivity(intent);
        }

        else if (l == 6) {
            intent = new Intent(getBaseContext(), Cruise.class);
            startActivity(intent);
        }

        else if (l == 7) {
            intent = new Intent(getBaseContext(), Descent.class);
            startActivity(intent);
        }

        else if (l == 8) {
            intent = new Intent(getBaseContext(), Approach.class);
            startActivity(intent);
        }

        else if (l == 9) {
            intent = new Intent(getBaseContext(), Landing.class);
            startActivity(intent);
        }

        else if (l == 10) {
            intent = new Intent(getBaseContext(), AfterLanding.class);
            startActivity(intent);
        }

        else if (l == 11) {
            intent = new Intent(getBaseContext(), Secure.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
        }
    }
}
