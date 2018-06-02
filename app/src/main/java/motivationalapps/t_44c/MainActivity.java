package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements AdapterView.OnClickListener {

    //private ListView items;
    private Button epButton;
    private Button opButton;
    private Button checklistButton;
    private Button maneuverButton;
    private Button feedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //items = (ListView) findViewById(R.id.main_menu);
        //ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.mainMenu, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        //items.setAdapter(itemAdapter);
        //items.setOnItemClickListener(this); //activates a listener to activate the method below

        epButton = findViewById(R.id.EPButton);
        opButton = findViewById(R.id.OPButton);
        checklistButton = findViewById(R.id.ChecklistButton);
        maneuverButton = findViewById(R.id.ManeuverButton);
        feedbackButton = findViewById(R.id.FeedbackButton);

        epButton.setOnClickListener(this);
        opButton.setOnClickListener(this);
        checklistButton.setOnClickListener(this);
        maneuverButton.setOnClickListener(this);
        feedbackButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.EPButton:
                intent = new Intent(getBaseContext(), EmergencyProcedures.class);
                startActivity(intent);
                break;

            case R.id.OPButton:
                intent = new Intent(getBaseContext(), Limits.class);
                startActivity(intent);
                break;

            case R.id.ChecklistButton:
                intent = new Intent(getBaseContext(), ChecklistMainMenu.class);
                startActivity(intent);
                break;

            case R.id.ManeuverButton:
                intent = new Intent(getBaseContext(), ManeuversMenu.class);
                startActivity(intent);
                break;

            case R.id.FeedbackButton:
                intent = new Intent(getBaseContext(), Feedback.class);
                startActivity(intent);
                break;
        }
    }

    /**
     Listens for the main menu items to be clicked to redirect user to the needed menu for desired menu item.
     */
    /** @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    Intent intent;
    if (l == 0) {
    intent = new Intent(getBaseContext(), EmergencyProcedures.class);
    startActivity(intent);
    }

    else if (l == 1) {
    intent = new Intent(getBaseContext(), Limits.class);
    startActivity(intent);
    }

    else if (l == 2) {
    intent = new Intent(getBaseContext(),ChecklistMainMenu.class);
    startActivity(intent);
    }

    else if (l == 3) {
    intent = new Intent(getBaseContext(), ManeuversMenu.class);
    startActivity(intent);
    }

    else if (l == 4) {
    intent = new Intent(getBaseContext(), Feedback.class);
    startActivity(intent);
    }

    else {
    //String itemClicked = ((TextView)view).getText().toString();
    Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
    }
    } */
}
