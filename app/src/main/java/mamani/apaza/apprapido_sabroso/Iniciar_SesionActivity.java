package mamani.apaza.apprapido_sabroso;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

        import androidx.activity.EdgeToEdge;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.graphics.Insets;
        import androidx.core.view.ViewCompat;
        import androidx.core.view.WindowInsetsCompat;

public class Iniciar_SesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iniciar_sesion);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void registrar(View view) {
        startActivity(new Intent(Iniciar_SesionActivity.this, RegistrarActivity.class));
    }

    public void manuActivity(View view) {
        startActivity(new Intent(Iniciar_SesionActivity.this, MenuActivity.class));
    }
}



