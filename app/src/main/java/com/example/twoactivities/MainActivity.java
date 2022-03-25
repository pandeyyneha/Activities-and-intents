package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final String LOG_TAG= MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE
            = "com.example.android.twoactivities.extra.MESSAGE";

    public static final int TEXT_REQUEST = 1;
    private EditText MessageEditText;
    private TextView ReplyHeadTextView;
    private TextView ReplyTextView;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    MessageEditText = findViewById(R.id.editText_main);
    ReplyHeadTextView = findViewById(R.id.text_header_reply);
    ReplyTextView = findViewById(R.id.text_message_reply);
    }

    public void launchSecondActivity(View view){
        Log.d(LOG_TAG,"Button clicked!!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = MessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {

            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                ReplyHeadTextView.setVisibility(View.VISIBLE);
                ReplyTextView.setText(reply);
                ReplyTextView.setVisibility(View.VISIBLE);
            }
        }
    }
}