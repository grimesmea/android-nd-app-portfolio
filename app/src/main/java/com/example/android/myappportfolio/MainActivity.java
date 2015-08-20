package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment implements View.OnClickListener {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            Button button_app1 = (Button) rootView.findViewById(R.id.button_app1);
            button_app1.setOnClickListener(this);
            Button button_app2 = (Button) rootView.findViewById(R.id.button_app2);
            button_app2.setOnClickListener(this);
            Button button_app3 = (Button) rootView.findViewById(R.id.button_app3);
            button_app3.setOnClickListener(this);
            Button button_app4 = (Button) rootView.findViewById(R.id.button_app4);
            button_app4.setOnClickListener(this);
            Button button_app5 = (Button) rootView.findViewById(R.id.button_app5);
            button_app5.setOnClickListener(this);
            Button button_app6 = (Button) rootView.findViewById(R.id.button_app6);
            button_app6.setOnClickListener(this);

            return rootView;
        }

        @Override
        public void onClick(View v) {
            Button b = (Button) v;
            String buttonText = b.getText().toString();
            Context context = getActivity();
            CharSequence toastText = "This button will launch my " + buttonText + " app!";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, toastText, duration);
            toast.show();
        }
    }
}
