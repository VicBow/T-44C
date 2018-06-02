package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import motivationalapps.t_44c.Fti_Checklists.FtiAfterLanding;
import motivationalapps.t_44c.Fti_Checklists.FtiAfterStart;
import motivationalapps.t_44c.Fti_Checklists.FtiApproach;
import motivationalapps.t_44c.Fti_Checklists.FtiBeforeStart;
import motivationalapps.t_44c.Fti_Checklists.FtiBeforeTakeoff;
import motivationalapps.t_44c.Fti_Checklists.FtiClimb;
import motivationalapps.t_44c.Fti_Checklists.FtiCruise;
import motivationalapps.t_44c.Fti_Checklists.FtiDescent;
import motivationalapps.t_44c.Fti_Checklists.FtiEngineRunup;
import motivationalapps.t_44c.Fti_Checklists.FtiIntro;
import motivationalapps.t_44c.Fti_Checklists.FtiLanding;
import motivationalapps.t_44c.Fti_Checklists.FtiSecure;
import motivationalapps.t_44c.Fti_Checklists.FtiStart;

public class FtiChecklists extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fti_checklists);
        items = (ListView) findViewById(R.id.ftiCheckList);
        ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.ftiChecklists, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        items.setAdapter(itemAdapter);
        items.setOnItemClickListener(this); //activates a listener to activate the method below
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;

        if (l == 0) {
            intent = new Intent(getBaseContext(), FtiIntro.class);
            startActivity(intent);
        }

        else if (l == 1) {
            intent = new Intent(getBaseContext(), FtiBeforeStart.class);
            startActivity(intent);
        }

        else if (l == 2) {
            intent = new Intent(getBaseContext(), FtiStart.class);
            startActivity(intent);
        }

        else if (l == 3) {
            intent = new Intent(getBaseContext(), FtiAfterStart.class);
            startActivity(intent);
        }

        else if (l == 4) {
            intent = new Intent(getBaseContext(), FtiEngineRunup.class);
            startActivity(intent);
        }

        else if (l == 5) {
            intent = new Intent(getBaseContext(), FtiBeforeTakeoff.class);
            startActivity(intent);
        }

        else if (l == 6) {
            intent = new Intent(getBaseContext(), FtiClimb.class);
            startActivity(intent);
        }

        else if (l == 7) {
            intent = new Intent(getBaseContext(), FtiCruise.class);
            startActivity(intent);
        }

        else if (l == 8) {
            intent = new Intent(getBaseContext(), FtiDescent.class);
            startActivity(intent);
        }

        else if (l == 9) {
            intent = new Intent(getBaseContext(), FtiApproach.class);
            startActivity(intent);
        }

        else if (l == 10) {
            intent = new Intent(getBaseContext(), FtiLanding.class);
            startActivity(intent);
        }

        else if (l == 11) {
            intent = new Intent(getBaseContext(), FtiAfterLanding.class);
            startActivity(intent);
        }

        else if (l == 12) {
            intent = new Intent(getBaseContext(), FtiSecure.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
        }
    }
}
