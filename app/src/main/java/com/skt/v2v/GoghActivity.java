package com.skt.v2v;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class GoghActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    ImageView user_image2;
    Button goghUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gogh);

        user_image2 = (ImageView) findViewById(R.id.user_image2);
        goghUpload = (Button) findViewById(R.id.goghUpload);

        goghUpload.setOnClickListener(v -> mgetContent.launch("image/*"));

    }

    ActivityResultLauncher<String> mgetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            new ActivityResultCallback<Uri>() {
                @Override
                public void onActivityResult(Uri result) {
                    if (result !=null) {
                        user_image2.setImageURI(result);
                    }
                }
            });
}
