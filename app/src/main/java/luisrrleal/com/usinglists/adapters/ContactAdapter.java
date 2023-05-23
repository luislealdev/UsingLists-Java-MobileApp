package luisrrleal.com.usinglists.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import luisrrleal.com.usinglists.R;
import luisrrleal.com.usinglists.models.Contact;

public class ContactAdapter extends BaseAdapter {

    Context context;
    List<Contact> contacts = new ArrayList<>();

    public ContactAdapter(Context context, List<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Contact getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return contacts.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.contact_item, null);
        }
        Contact c = getItem(position);
        ImageView contactPhoto = convertView.findViewById(R.id.contactPhoto);
        TextView contactFullName = convertView.findViewById(R.id.contactFullName);
        TextView contactPhone = convertView.findViewById(R.id.contactPhone);
        contactPhoto.setImageResource(c.getPhoto());
        contactFullName.setText(c.getFirstName() +" "+ c.getLastName());
        contactPhone.setText(c.getPhone());

        return convertView;
    }
}
