package com.example.eatmore;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.eatmore.databinding.ActivityMenuBinding;
import com.example.eatmore.databinding.LoginActivityBinding;

public class MainActivity extends AppCompatActivity {

    private LoginActivityBinding viewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        viewBinding=LoginActivityBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void onLogInClick(View view) {
        if(viewBinding.etEmailAddress.getText().toString().equals("admin")&viewBinding.etPassword.getText().toString().equals("admin")){
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        }else {
            Toast toast = new Toast(this);
            toast.setText("Вы неправильно ввели эл.почту или пароль!");
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
        }
    }

}