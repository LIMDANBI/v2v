package com.skt.v2v;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class EgonActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    ImageView user_image1;
    Button egonUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egon);


        user_image1 = (ImageView) findViewById(R.id.user_image1);
        egonUpload = (Button) findViewById(R.id.egonUpload);


        egonUpload.setOnClickListener(v -> mgetContent.launch("image/*"));
    }

    ActivityResultLauncher<String> mgetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            new ActivityResultCallback<Uri>() {
                @Override
                public void onActivityResult(Uri result) {
                    if (result !=null) {
                        user_image1.setImageURI(result);
                    }
                }
            });

}
