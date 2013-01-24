package com.example;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;

//public class MainActivity extends SherlockActivity {
//    /**
//     * Called when the activity is first created.
//     */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        MyIcsSpinner spinner = (MyIcsSpinner) findViewById(R.id.spinner);
//
//        List<String> items = new ArrayList<String>();
//        items.add("item1");
//        items.add("item2");
//        items.add("item3");
//        items.add("item4");
//
//        MyIcsSpinnerAdapter adapter = new MyIcsSpinnerAdapter(this, R.layout.my_ics_spinner, items);
//        spinner.setAdapter(adapter);
//    }
//}
import android.view.View;
import android.widget.Toast;

import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.actionbarsherlock.internal.widget.IcsAdapterView.OnItemSelectedListener;

public class MainActivity extends SherlockActivity {

    private DropDownSpinner spinner;
    private DropDownSpinnerAdapter adapter;
    private String[] items = { "Item1", "Item2", "Item3", "Item4", "Item5", "Item6" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        spinner = (DropDownSpinner) findViewById(R.id.spinner);
        adapter = new DropDownSpinnerAdapter(MainActivity.this, R.layout.drop_down_spinner, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(IcsAdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(IcsAdapterView<?> parent) {
            }
        });
    }
}
