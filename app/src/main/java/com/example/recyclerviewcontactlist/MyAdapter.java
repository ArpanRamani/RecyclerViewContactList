package com.example.recyclerviewcontactlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<String> contactName;
    ArrayList<String> contactNumber;
    ArrayList<Integer> userImg;

    public MyAdapter(ArrayList<String> contactName, ArrayList<String> contactNumber, ArrayList<Integer> userImg) {

        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.userImg = userImg;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contactlist, parent, false);
        ViewHolder m = new ViewHolder(view);

        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtName.setText(contactName.get(position));
        holder.txtContact.setText(contactNumber.get(position));
        holder.imgUser.setImageResource(userImg.get(position));

    }

    @Override
    public int getItemCount() {
        return contactName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtContact;
        CircleImageView imgUser;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtContact = itemView.findViewById(R.id.txtContact);
            imgUser = itemView.findViewById(R.id.imgUser);

        }
    }
}
