package com.example.merchandiseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class add_apparels extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_apparels);
    }

    public void back_to_merchant_page(View view) {
        startActivity(new Intent(add_apparels.this, merchant_landing_page.class));
        finish();
    }
}
