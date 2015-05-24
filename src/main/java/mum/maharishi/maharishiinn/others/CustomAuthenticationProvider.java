/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.others;

import java.util.ArrayList;
import java.util.List;
import mum.maharishi.maharishiinn.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author binayak
 */
@Component
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private SessionFactory sf;

    public CustomAuthenticationProvider() {
    }

    public CustomAuthenticationProvider(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        String newPassword = null;
        String passAuthority = null;
        
        System.out.println("Reached Here 90909090909");
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
//        no session found for current thread exception
        if (sf != null) {
            System.out.println("user is notNull");
            Session session;
            try {
                session = sf.openSession();
                Transaction tx = session.beginTransaction();
                Query query = session.createQuery("from User where userName = :uname");
                query.setParameter("uname", name);

                User user = (User) query.list().get(0);
                newPassword = user.getPassword();
                passAuthority = user.getAuthorities();
                
                tx.commit();
            } catch (Exception e) {
                System.out.println("Exception occured: " + e.getMessage());
            }

        } else {
            System.out.println("sf is null");
        }

        if (name.equals("admin") && password.equals("admin")) {
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        } else if (name.equals("user") && password.equals("user")) {
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else if (newPassword != null){
            if (newPassword.equals(password)){
                grantedAuths.add(new SimpleGrantedAuthority(passAuthority));
            }
        } else {
            throw new BadCredentialsException("Bad Credentials");
        }

        Authentication auth = new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
        return auth;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
