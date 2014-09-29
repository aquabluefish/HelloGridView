package hm.orz.bluefish.hellogridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class HelloGridView extends Activity {
    private GridView list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String[] ldata = {"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH","III","JJJ","KKK","LLL","MMM","NNN",
        					"OOO","PPP","QQQ","RRR","SSS","TTT","UUU","VVV","WWW","XXX","YYY","ZZZ"};

        list = (GridView)this.findViewById(R.id.gridView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list, R.id.list_textView1, ldata);
        list.setAdapter(adapter);
        list.setSelection(1);

        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapter, View view, int pos, long id) {
                Toast.makeText(HelloGridView.this, list.getAdapter().getItem(pos) +" が選択されました", Toast.LENGTH_LONG).show();
            }
        });
    }


}
