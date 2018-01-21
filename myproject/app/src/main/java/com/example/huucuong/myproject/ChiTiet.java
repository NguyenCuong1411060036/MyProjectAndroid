package com.example.huucuong.myproject;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTiet extends AppCompatActivity {
    TextView txtName, txtAuthor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        txtName= (TextView) findViewById(R.id.txtNameManga1);
        txtAuthor=(TextView) findViewById(R.id.txtAuthor1);
        Intent callIntent= getIntent();
        Bundle callBundle = callIntent.getBundleExtra("Dulieu");
        txtName.setText("Tên truyện :"+callBundle.getString("Name"));
        txtAuthor.setText("Tên tác giả :" + callBundle.getString("Author"));
        ImageView imageView= (ImageView) findViewById(R.id.ImageViewdemo);
        imageView.setImageBitmap(BitmapFactory.decodeFile(callBundle.getString("Images")));
    }
    public void back(View view) {
        finish();
    }


}
