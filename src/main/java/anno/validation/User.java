package anno.validation;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class User {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    //@NotBlank(message = "Email is required")
    @NotNull(message = "Email is required_ 1")
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Min(value = 0,message = "Age must be positive")
    private int minAge;

    @Max(value = 100,message = "Not Grater than 100")
    private int maxAge;

    @Pattern(regexp = "^[a-zA-Z0-9]{6,20}$",message = "Email must be valid")
    private String gemail;

}
