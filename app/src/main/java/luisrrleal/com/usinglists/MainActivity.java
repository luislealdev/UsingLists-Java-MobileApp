package luisrrleal.com.usinglists;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.main_menu);

        toolbar.setOnMenuItemClickListener(listenerMenus);
    }

    Toolbar.OnMenuItemClickListener listenerMenus = (MenuItem item)->{
        String message = "";
        if(item.getItemId()==R.id.action_simple_list){
            message="SIMPLE LIST";
            MarketListFragment fragment = new MarketListFragment();
            loadFragment(fragment);
        }else if(item.getItemId()==R.id.action_custom_list){
            message="CUSTOM LIST";
            loadFragment(new ContactListFragment());
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return true;
    };

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }
}
