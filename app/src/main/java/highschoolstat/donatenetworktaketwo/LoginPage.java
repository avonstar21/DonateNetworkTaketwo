package highschoolstat.donatenetworktaketwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import
public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void goTo(View view)
    {
        Intent intent = new Intent(this,choosewhattodo.class);
        startActivity(intent);
    }
}
