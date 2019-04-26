package sic.com.nyumbaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.imgShow)
    ImageView imageView;

    @BindView(R.id.txtName)
    TextView txtName;
    @BindView(R.id.txtcost)
    TextView  txtcost;

    @BindView(R.id.txtlocation)
    TextView txtlocation;

    @BindView(R.id.txtdesc)
    TextView txtdesc;

    @BindView(R.id.txtservices)
    TextView txtservices;

    @BindView(R.id.buttonnext)
    Button buttonnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        ////
        int image=getIntent().getIntExtra("image",0);
        int cost=getIntent().getIntExtra("cost",0);
        String name=getIntent().getStringExtra("name");
        String location=getIntent().getStringExtra("location");
        String description=getIntent().getStringExtra("desc");
        String services=getIntent().getStringExtra("services");
        String button=getIntent().getStringExtra("button");

        imageView.setImageResource(image);

        txtName.setText(name);

        txtcost.setText(Integer.toString(cost));

        txtlocation.setText(location);

        txtdesc.setText(description);

        txtservices.setText(services);

        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent X=new Intent( DetailsActivity.this,MainActivity.class);
                startActivity(X) ;
            }
        });

    }


}
