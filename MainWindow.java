import java.util.Scanner;

public class MainWindow {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Ver tareas");
            System.out.println("2. Añadir tareas");
            System.out.println("3. Marcar tarea como realizada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            int opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nTareas");
                    int i = 0;
                    for (Task t : manager.getTasks()) {
                        System.out.println("[" + i + "] " + t);
                        System.out.println("---");
                        i++;
                    }
                    break;
                    case 2:
                        System.out.println("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.println("Descripcion: ");
                        String desc = sc.nextLine();
                        System.out.println("Fecha limite (YYYY-MM-DD): ");
                        String fecha = sc.nextLine();
                        manager.addTask(new Task(titulo, desc, fecha));
                        System.out.println("Tarea añadida.");
                        break;
                        case 3:
                            System.out.println("Indice de la tarea realizada: ");
                            int idx = sc.nextInt(); sc.nextLine();
                            manager.completeTask(idx);
                            System.out.println("Tarea completada.");
                            break;
                        case 4:
                            System.out.println("Indice de la tarea a eliminar: ");
                            int idxR = sc.nextInt(); sc.nextLine();
                            manager.removeTask(idxR);
                            System.out.println("Tarea eliminada.");
                            break;
                        case 5:
                            salir = true;
                            break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        sc.close();
        System.out.println("Saliendo......");
    }
}
