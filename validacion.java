    // Valida que el email tenga formato correcto
    private static void validarEmail(String email) throws EmailInvalidoException {
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new EmailInvalidoException("Formato de email inválido. Debe ser: usuario@dominio.com");
        }
    }

    // Valida los requisitos de la contraseña
    private static void validarPassword(String pwd) throws PasswordInvalidaException {
        if (pwd.length() < 8) {
            throw new PasswordInvalidaException("La contraseña debe tener al menos 8 caracteres.");
        }
        
        boolean mayuscula = false, numero = false;
        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) mayuscula = true;
            if (Character.isDigit(c)) numero = true;
        }
        
        if (!mayuscula) {
            throw new PasswordInvalidaException("Debe incluir al menos una letra mayúscula.");
        }
        if (!numero) {
            throw new PasswordInvalidaException("Debe incluir al menos un número.");
        }
    }

    // Valida que la edad esté en el rango permitido
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa.");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años.");
        }
    }
}
