package lauragallace.BEW6D5p.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record UserPostDTO(
        @NotEmpty(message = "Username cannot be empty")
        @Size(min = 3,max = 30, message = "Username must be between 3 e 30 chars")
        String username,
        @NotEmpty(message = "Name cannot be empty")
        @Size(min = 3, max = 30, message = "Name must be between 3 e 30 chars")
        String name,
        @NotEmpty(message = "Surname cannot be empty")
        @Size(min = 3, max = 30, message = "Surname must be between 3 e 30 chars")
        String surname,
        @NotEmpty(message = "Email cannot be empty")
        @Email(message = "insert a valid email")
        String email) {
}