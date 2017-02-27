package com.example.think.helloworld.contentproviderdemo;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.think.helloworld.R;

public class CPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp);
    }

    public void viewClick(View v) {
        ContentResolver contentResolver = this.getContentResolver();
        String id = null;
        String mimetype = null;
        Cursor cursor = contentResolver.query(android.provider.ContactsContract.Contacts.CONTENT_URI,
                new String[]{ContactsContract.Contacts._ID}, null, null, null);
        while (cursor.moveToNext()) {
            id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            Cursor contactInfoCursor = contentResolver.query(android.provider.ContactsContract.Data.CONTENT_URI,
                    new String[]{ContactsContract.Data.CONTACT_ID,
                            ContactsContract.Data.MIMETYPE,
                            ContactsContract.Data.DATA1,
                            ContactsContract.Data.DATA15},
                   android.provider.ContactsContract.Data.CONTACT_ID + "=" + id, null, null);
            while (contactInfoCursor.moveToNext()) {
                mimetype = contactInfoCursor.getString(contactInfoCursor.getColumnIndex(ContactsContract.Data.MIMETYPE));
                String value = contactInfoCursor.getString(contactInfoCursor.getColumnIndex(ContactsContract.Data.DATA1));
                if (mimetype.contains("/name")) {

                    System.out.println("姓名是" + value);

                } else if (mimetype.contains("/im")) {
                    System.out.println("QQ是" + value);
                } else if (mimetype.contains("/email")) {
                    System.out.println("邮箱是" + value);
                } else if (mimetype.contains("/phone")) {
                    System.out.println("电话是" + value);

                }

            }
            contactInfoCursor.close();
        }
        cursor.close();
    }
}

