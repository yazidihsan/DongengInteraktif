package net.galihpratama.dongenginteraktif.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.galihpratama.dongenginteraktif.R;

public class MainActivity extends AppCompatActivity {

    private EditText mNamaField;
    private Button mMulaiButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNamaField = (EditText)findViewById(R.id.nameText);
        mMulaiButton = (Button)findViewById(R.id.confirmButton);

        mMulaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = mNamaField.getText().toString();
                mulaiCerita(nama);
            }
        });
    }

    private void mulaiCerita(String nama) {
        Intent intent = new Intent(this, CeritaActivity.class);
        intent.putExtra(getString(R.string.key_nama), nama);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNamaField.setText("");
    }
}
