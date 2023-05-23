package luisrrleal.com.usinglists;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import luisrrleal.com.usinglists.adapters.ContactAdapter;
import luisrrleal.com.usinglists.models.Contact;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactListFragment extends Fragment {
    ListView contactList;
    private String[] contacts = {};

    public ContactListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_list, container, false);

        contactList = view.findViewById(R.id.contactList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_checked, contacts);
        contactList.setChoiceMode(1);
        contactList.setAdapter(new ContactAdapter(getActivity().getApplicationContext(), Contact.getContacts()));

        contactList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact c = Contact.getContacts().get(position);
                Toast.makeText(getActivity(), "You selected: " + c.getFirstName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}