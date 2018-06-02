package motivationalapps.t_44c;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Limits extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limits);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        //Adding Header Data
        listDataHeader.add("Airspeeds");
        listDataHeader.add("Electrical");
        listDataHeader.add("Interstage Turbine Temperature (ITT)");
        listDataHeader.add("Torque");
        listDataHeader.add("Turbine Tachometer (N1)");
        listDataHeader.add("Propeller Tachometer (N2)");
        listDataHeader.add("Oil Temperature");
        listDataHeader.add("Oil Pressure");
        listDataHeader.add("Weights");
        listDataHeader.add("General");

        //Adding Child Data
        List<String> airspeeds = Arrays.asList(getResources().getStringArray(R.array.airspeedLimits));
        List<String> electrical = Arrays.asList(getResources().getStringArray(R.array.electricalLimits));
        List<String> itt = Arrays.asList(getResources().getStringArray(R.array.ittLimits));
        List<String> torque = Arrays.asList(getResources().getStringArray(R.array.torqueLimits));
        List<String> n1 = Arrays.asList(getResources().getStringArray(R.array.turbineLimits));
        List<String> n2 = Arrays.asList(getResources().getStringArray(R.array.propLimits));
        List<String> oilT = Arrays.asList(getResources().getStringArray(R.array.oilTempLimits));
        List<String> oilP = Arrays.asList(getResources().getStringArray(R.array.oilPxLimits));
        List<String> weights = Arrays.asList(getResources().getStringArray(R.array.weightLimits));
        List<String> general = Arrays.asList(getResources().getStringArray(R.array.generalLimits));

        listDataChild.put(listDataHeader.get(0), airspeeds);
        listDataChild.put(listDataHeader.get(1), electrical);
        listDataChild.put(listDataHeader.get(2), itt);
        listDataChild.put(listDataHeader.get(3), torque);
        listDataChild.put(listDataHeader.get(4), n1);
        listDataChild.put(listDataHeader.get(5), n2);
        listDataChild.put(listDataHeader.get(6), oilT);
        listDataChild.put(listDataHeader.get(7), oilP);
        listDataChild.put(listDataHeader.get(8), weights);
        listDataChild.put(listDataHeader.get(9), general);
    }

}
