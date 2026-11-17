package soa;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/jwt")
public class JwtController {

    @PostMapping("/generate")
    public String generateToken(@RequestBody Map<String, String> user) {

        String username = user.get("username");
        String role = user.get("role");

        return JwtUtil.generateToken(username, role);
    }
}