package lauragallace.BEW6D5p.exceptions;

import java.util.UUID;

public class NotFoundException extends BadRequestException {
    public NotFoundException(UUID id) {
        super("Elemento con id " + id + " non trovato!");
    }
}