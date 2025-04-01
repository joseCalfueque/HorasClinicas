import java.util.ArrayList;
import java.util.List;
public class CentroClinico {
    private String nombre;
    private String direccion;
    private List<Medico> medicos;
    private List<Paciente> pacientes;
    private List<CitaMedica> citas;

    public CentroClinico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agendarCita(CitaMedica cita) {
        citas.add(cita);
    }

    public void eliminarCita(CitaMedica cita) {
        citas.remove(cita);
    }
}
