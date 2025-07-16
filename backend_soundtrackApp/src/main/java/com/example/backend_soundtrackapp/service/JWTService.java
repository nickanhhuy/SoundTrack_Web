package com.example.backend_soundtrackapp.service;

// JWT ( JSON Web Token) - How it works?
// User gives login info to the server then server creates JWT contains that info and the secret key
// Token sent to client then client send it back to the server to verify and response.
// Include 3 parts ( Header | Payload | Signature )

import org.springframework.stereotype.Service;

@Service
public class JWTService {
    public String generateToken(String email) {

    }
}
