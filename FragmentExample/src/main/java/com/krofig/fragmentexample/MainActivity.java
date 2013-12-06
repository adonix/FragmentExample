package com.krofig.fragmentexample;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> n = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, new String[] { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty" } );
        list.setAdapter(n);
        list.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Fragment f = new MyFragment(i + 1);
        FragmentTransaction t = getFragmentManager().beginTransaction();
        t.replace(R.id.my_fragment, f);
        t.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        t.addToBackStack(null);
        t.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
