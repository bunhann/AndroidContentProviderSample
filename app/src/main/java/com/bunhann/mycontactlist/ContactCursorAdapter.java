package com.bunhann.mycontactlist;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContactCursorAdapter extends CursorAdapter {

    public ContactCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {

        View convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, viewGroup, false);

        return convertView;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView tvName = (TextView) view.findViewById(android.R.id.text1);
        TextView tvPhone = (TextView) view.findViewById(android.R.id.text2);
        String name  = cursor.getString(cursor.getColumnIndex(DBOpenHelper.CONTACT_NAME));
        String phone = cursor.getString(cursor.getColumnIndex(DBOpenHelper.CONTACT_PHONE));

        tvName.setText(name);
        tvPhone.setText(phone);

    }
}
