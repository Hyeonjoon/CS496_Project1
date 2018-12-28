package com.example.user.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAddressAdapter extends BaseAdapter {

    ArrayList<ContactAddress> datas;
    LayoutInflater inflater;

    public ContactAddressAdapter(LayoutInflater inflater, ArrayList<ContactAddress> datas) {
        this.datas = datas;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generate method stub
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-genearted mehotd stub
        return position;
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_contact_address, null);
        }
        TextView text_name = (TextView) convertView.findViewById(R.id.text_name);
        TextView text_number = (TextView) convertView.findViewById(R.id.text_number);
        ImageView img_flag = (ImageView) convertView.findViewById(R.id.img_flag);

        text_name.setText(datas.get(postion).getName());
        text_number.setText(datas.get(postion).getNumber());
        img_flag.setImageResource(datas.get(postion).getImgld());

        return convertView;
    }
}
