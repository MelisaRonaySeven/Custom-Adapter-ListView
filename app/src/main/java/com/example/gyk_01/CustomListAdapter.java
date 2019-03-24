package com.example.gyk_01;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<UserModel> {
    Context context;
    ArrayList<UserModel> userModels;


    public CustomListAdapter(Context context, ArrayList<UserModel> userModels) {
        super(context, 0, userModels);
        this.context = context;
        this.userModels = userModels;
    }

    @Override
    public int getCount() {
        return userModels.size();
    }

    @Override
    public UserModel getItem(int position) {
        return userModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(context, R.layout.line_layout, null);

        ImageView image = view.findViewById(R.id.listImg);
        image.setImageResource((userModels.get(position).getImgId()));

        TextView name = view.findViewById(R.id.nameSurname);
        name.setText(userModels.get(position).getName());

        TextView friendsTime = view.findViewById(R.id.numberOfDays);
        friendsTime.setText(userModels.get(position).getFriendshipTime());

        return view;
    }
}
