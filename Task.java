public class Task {
    private String titulo;
    private String descripcion;
    private String LocalDate;
    private boolean completado;

    public Task(String titulo, String descripcion, String LocalDate) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.LocalDate = LocalDate;
        this.completado = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getLocalDate() {
        return LocalDate;
    }
    public void setLocalDate(String LocalDate) {
        this.LocalDate = LocalDate;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean compleatado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nDescripcion: " + descripcion +
                "\nFecha limite: " + LocalDate +
                "\nEstado: " + (completado ? "Realizada" : "Pendiente");

    }
}
