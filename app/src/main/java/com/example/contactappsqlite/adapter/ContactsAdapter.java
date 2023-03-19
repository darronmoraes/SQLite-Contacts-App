package com.example.contactappsqlite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactappsqlite.MainActivity;
import com.example.contactappsqlite.R;
import com.example.contactappsqlite.db.entity.Contact;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> {

    // 1-Variables
    private Context context;
    private ArrayList<Contact> contactsList;
    private MainActivity mainActivity;

    // 2-ViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView email;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.tv_name);
            this.email = itemView.findViewById(R.id.tv_email);
        }
    }

    public ContactsAdapter(Context context, ArrayList<Contact> contactsList, MainActivity mainActivity) {
        this.context = context;
        this.contactsList = contactsList;
        this.mainActivity = mainActivity;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Contact contact = contactsList.get(position);

        holder.name.setText(contact.getName());
        holder.email.setText(contact.getEmail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.addAndEditContacts(true, contact, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }
}
