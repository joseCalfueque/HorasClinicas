public class Main {

    public static void main(String[] args) {
        CentroClinico centro = new CentroClinico("Clínica Central", "Av. Salud 123");

        Medico medico1 = new Medico("Dr. Pérez", "Cardiología", 10);
        Paciente paciente1 = new Paciente("Juan Gómez", 45, "juan@gmail.com");

        centro.agregarMedico(medico1);
        centro.agregarPaciente(paciente1);

        CitaMedica cita1 = new CitaMedica(medico1, paciente1, "2025-04-01", "10:00 AM", "Chequeo de rutina");
        centro.agendarCita(cita1);

        System.out.println("Cita agendada exitosamente.");
    }
}
