package com.maestria.autenticacion.repository;

import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.stereotype.Repository;

import com.maestria.autenticacion.dto.request.LoginRequest;
import com.maestria.autenticacion.dto.response.LoginResponse;

@Repository
public class UsuarioRepository {
    
    //@Autowired
    //private LdapTemplate ldapTemplate;

    public LoginResponse authenticate(LoginRequest loginRequest) {
        //EqualsFilter filter = new EqualsFilter("uid", username);
        //return ldapTemplate.authenticate("", filter.encode(), password);
        String user = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        if(user.equals("jtunubala") && 
            password.equals("12345678")){
                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setNombres("Jorge Alfredo");
                loginResponse.setApellidos("Tunubala Ramirez");
                loginResponse.setCorreo("jtunubala@unicauca.edu.co");
                loginResponse.setRol("ESTUDIANTE");
                return loginResponse;
        } else {
            return null;
        }
    }

    /*public List<String> findAllPersonNames() {
        LdapQuery query = LdapQueryBuilder.query()
                .where("objectclass").is("person");

        return ldapTemplate.search(query, new AttributesMapper<String>() {
            @Override
            public String mapFromAttributes(Attributes attributes) throws NamingException {
                return (String) attributes.get("cn").get();
            }
        });
    }*/
}
