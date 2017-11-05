package highschoolstat.donatenetworktaketwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class choosewhattodo extends AppCompatActivity {

    public static Map<String, String> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosewhattodo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lists = new HashMap<String, String>();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void createList(View view)
    {
        Intent next = new Intent(this,CreateListActivity.class);
        startActivity(next);
    }

    public void update(View view)
    {
        Intent updater = new Intent(this,CreateListActivity.class);
        startActivity(updater);
    }

}
