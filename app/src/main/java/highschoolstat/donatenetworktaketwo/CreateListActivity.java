package highschoolstat.donatenetworktaketwo;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by avons on 11/4/2017.
 */

import static highschoolstat.donatenetworktaketwo.R.id.list_items;
import static highschoolstat.donatenetworktaketwo.choosewhattodo.lists;


public class CreateListActivity extends AppCompatActivity {

    private EditText listTitle;
    private EditText listItems;


    public static String materials;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //listTitle = findViewById(R.id.list_title);
        //listItems = findViewById(R.id.list_items);
    }


}
