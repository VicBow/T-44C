package motivationalapps.t_44c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    private Intent emailIntent;
    private String feedback;
    private EditText feedbackBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        feedbackBox = findViewById(R.id.feedback);
        findViewById(R.id.feedbackButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendFeedback();
            }
        });



    }

    private void sendFeedback() {
        emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/html");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {getResources().getString(R.string.mail_feedback_email)});
        feedback = feedbackBox.getText().toString();
        emailIntent.putExtra(Intent.EXTRA_TEXT, feedback);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from the T44 App");

        startActivity(Intent.createChooser(emailIntent, "Send email using..."));
    }
}
