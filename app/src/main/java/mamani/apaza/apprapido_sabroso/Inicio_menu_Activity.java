
package mamani.apaza.apprapido_sabroso;

        import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;

        import mamani.apaza.apprapido_sabroso.databinding.ActivityInicioMenuBinding;

public class Inicio_menu_Activity extends MenuActivity {

    private ActivityInicioMenuBinding activityInicioMenuBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityInicioMenuBinding = ActivityInicioMenuBinding.inflate(getLayoutInflater());
        setContentView(activityInicioMenuBinding.getRoot());
    }
}
