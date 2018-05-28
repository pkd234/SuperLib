package com.example.superlibrary;

import android.content.Context;
import android.widget.Toast;

public class Quick {
    public static void ToastQuick(Context context, String dd){
        Toast.makeText(context, dd, Toast.LENGTH_SHORT).show();
    }
}
