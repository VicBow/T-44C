package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class ChecklistMainMenu extends AppCompatActivity implements AdapterView.OnClickListener{

    //private ListView items;
    private Button ftiButton;
    private Button regularButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist_main_menu);
        //items = (ListView) findViewById(R.id.checkListMenu);
        //ArrayAdapter<CharSequence> itemAdapter = ArrayAdapter.createFromResource(this, R.array.checklistsMenu, android.R.layout.simple_list_item_1); //Gets arrays from Strings.xml to make list
        //items.setAdapter(itemAdapter);
        //items.setOnItemClickListener(this); //activates a listener to activate the method below

        ftiButton = findViewById(R.id.FTIButton);
        regularButton = findViewById(R.id.RegularButton);

        ftiButton.setOnClickListener(this);
        regularButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.FTIButton:
                intent = new Intent(getBaseContext(), FtiChecklists.class);
                startActivity(intent);
                break;

            case R.id.RegularButton:
                intent = new Intent(getBaseContext(), RegularChecklists.class);
                startActivity(intent);
                break;
        }
    }

    /**   @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (l == 0) {
            Intent intent = new Intent(getBaseContext(), FtiChecklists.class);
            startActivity(intent);
        }
        else if (l == 1) {
            Intent intent = new Intent(getBaseContext(), RegularChecklists.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
        }
    }*/
}
