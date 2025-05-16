public class FormularioRegistro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        try {
            // Solicitar y validar email
            System.out.print("Ingrese email: ");
            String email = entrada.nextLine();
            validarEmail(email);

            // Solicitar y validar contraseña
            System.out.print("Ingrese contraseña: ");
            String contraseña = entrada.nextLine();
            validarPassword(contraseña);

            // Solicitar y validar edad
            System.out.print("Ingrese edad: ");
            int edad;
            try {
                edad = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                throw new FormatoEdadInvalidoException("La edad debe ser un número entero válido.");
            }
            validarEdad(edad);

            // Mensaje de éxito si todo es válido
            System.out.println("\nRegistro exitoso:");
            System.out.println("Email = " + email);
            System.out.println("Contraseña válida");
            System.out.println("Edad = " + edad + " años.");
            
        } catch (FormatoEdadInvalidoException e) {
            System.out.println("Error de formato: " + e.getMessage());
        } catch (EmailInvalidoException e) {
            System.out.println("Error en email: " + e.getMessage());
        } catch (PasswordInvalidaException e) {
            System.out.println("Error en contraseña: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("Error en edad: " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("\nProceso de registro finalizado.");
        }
    }
