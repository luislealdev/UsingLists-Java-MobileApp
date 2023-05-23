package luisrrleal.com.usinglists;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MarketListFragment extends Fragment {

    private ListView marketList;
    private String[] products = {"Smart TV", "Cellular", "Stereo", "Bicicle", "Iphone 15", "Perapod", "Pony Station", "Macbook Pro", "Mike Jordan", "Adides"};

    public MarketListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_market_list, container, false);
        marketList = view.findViewById(R.id.marketList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_checked, products);
        marketList.setChoiceMode(1);
        marketList.setAdapter(adapter);
        return view;
    }
}