// Excepción para emails con formato inválido
class EmailInvalidoException extends IllegalArgumentException {
    public EmailInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción para contraseñas que no cumplen los requisitos
class PasswordInvalidaException extends IllegalArgumentException {
    public PasswordInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Excepción para edades fuera del rango permitido
class EdadInvalidaException extends IllegalArgumentException {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Excepción para cuando la edad no es un número válido
class FormatoEdadInvalidoException extends NumberFormatException {
    public FormatoEdadInvalidoException(String mensaje) {
        super(mensaje);
    }
}
