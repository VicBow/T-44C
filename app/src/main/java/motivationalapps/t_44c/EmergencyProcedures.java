package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import motivationalapps.t_44c.emergency_procedures.AbnormalStart;
import motivationalapps.t_44c.emergency_procedures.AbortingTakeoff;
import motivationalapps.t_44c.emergency_procedures.EGPWSImc;
import motivationalapps.t_44c.emergency_procedures.EmergencyDescent;
import motivationalapps.t_44c.emergency_procedures.EmergencyShutdownChecklist;
import motivationalapps.t_44c.emergency_procedures.EmergencyShutdownOnDeck;
import motivationalapps.t_44c.emergency_procedures.EngineFailureAfterTakeoff;
import motivationalapps.t_44c.emergency_procedures.ExplosiveDecompression;
import motivationalapps.t_44c.emergency_procedures.FuelLeak;
import motivationalapps.t_44c.emergency_procedures.GeneratorFailure;
import motivationalapps.t_44c.emergency_procedures.JammedPowerLever;
import motivationalapps.t_44c.emergency_procedures.LowAltWindshear;
import motivationalapps.t_44c.emergency_procedures.PrimaryGovernorFailure;
import motivationalapps.t_44c.emergency_procedures.SingleEngineWaveoff;
import motivationalapps.t_44c.emergency_procedures.SmokeFireUnknown;
import motivationalapps.t_44c.emergency_procedures.SmokeFumeElimination;
import motivationalapps.t_44c.emergency_procedures.SpinOutofControlFlight;
import motivationalapps.t_44c.emergency_procedures.WindmillingAirstart;

public class EmergencyProcedures extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_procedures);
        items = (ListView) findViewById(R.id.epList);
        ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.emergencyProcedures, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        items.setAdapter(itemAdapter);
        items.setOnItemClickListener(this); //activates a listener to activate the method below
    }

    /**
     Listens for the main menu items to be clicked to redirect user to the needed menu for desired menu item.
     */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;

        if (l == 0) {
            intent = new Intent(getBaseContext(), AbnormalStart.class);
            startActivity(intent);
        }

        else if (l == 1) {
            intent = new Intent(getBaseContext(), EmergencyShutdownOnDeck.class);
            startActivity(intent);
        }

        else if (l == 2) {
            intent = new Intent(getBaseContext(), AbortingTakeoff.class);
            startActivity(intent);
        }

        else if (l == 3) {
            intent = new Intent(getBaseContext(), EngineFailureAfterTakeoff.class);
            startActivity(intent);
        }

        else if (l == 4) {
            intent = new Intent(getBaseContext(), EmergencyShutdownChecklist.class);
            startActivity(intent);
        }

        else if (l == 5) {
            intent = new Intent(getBaseContext(), JammedPowerLever.class);
            startActivity(intent);
        }

        else if (l == 6) {
            intent = new Intent(getBaseContext(), WindmillingAirstart.class);
            startActivity(intent);
        }

        else if (l == 7) {
            intent = new Intent(getBaseContext(), SmokeFireUnknown.class);
            startActivity(intent);
        }

        else if (l == 8) {
            intent = new Intent(getBaseContext(), SmokeFumeElimination.class);
            startActivity(intent);
        }

        else if (l == 9) {
            intent = new Intent(getBaseContext(), FuelLeak.class);
            startActivity(intent);
        }

        else if (l == 10) {
            intent = new Intent(getBaseContext(), GeneratorFailure.class);
            startActivity(intent);
        }

        else if (l == 11) {
            intent = new Intent(getBaseContext(), PrimaryGovernorFailure.class);
            startActivity(intent);
        }

        else if (l == 12) {
            intent = new Intent(getBaseContext(), ExplosiveDecompression.class);
            startActivity(intent);
        }

        else if (l == 13) {
            intent = new Intent(getBaseContext(), EmergencyDescent.class);
            startActivity(intent);
        }

        else if (l == 14) {
            intent = new Intent(getBaseContext(), SpinOutofControlFlight.class);
            startActivity(intent);
        }

        else if (l == 15) {
            intent = new Intent(getBaseContext(), EGPWSImc.class);
            startActivity(intent);
        }

        else if (l == 16) {
            intent = new Intent(getBaseContext(), SingleEngineWaveoff.class);
            startActivity(intent);
        }

        else if (l == 17) {
            intent = new Intent(getBaseContext(), LowAltWindshear.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
        }
    }
}
