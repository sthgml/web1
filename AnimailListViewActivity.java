package android.kmu.com.animaillistviewproject_0725;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimailListViewActivity extends Activity {

    TextView title_tv;
    EditText animal_et;
    ListView animal_lv;

    ArrayList<String> animal_list;
    ArrayAdapter<String> animal_adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animail_list_view);

        title_tv = (TextView)findViewById(R.id.title_tv);
        animal_et  = (EditText)findViewById(R.id.animal_et);
        animal_lv= (ListView)findViewById(R.id.animal_lv);

        animal_list = new ArrayList<String>();
        animal_adp = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_single_choice,
                animal_list);
        animal_lv.setAdapter(animal_adp);
    }

    public void click_add(View view) {
        String s = animal_et.getText().toString();
        animal_adp.add(s);
        animal_et.setText("");
    }

    public void click_del(View view) {
        int position = animal_lv.getCheckedItemPosition();
        if(position < 0 )return;
        animal_list.remove(position);
        animal_lv.clearChoices();
        animal_adp.notifyDataSetChanged();
    }

    public void click_re(View view) {
        animal_et.setText("");

    }
}
