package tote.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import tote.entity.Role;
import tote.service.UserService;

public class UserDetailServiceImpl implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService usrSrv;

    public void setUsrSrv(UserService usrSrv) {
        this.usrSrv = usrSrv;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        tote.entity.User user = usrSrv.getUser(username);
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        authorities.add(new SimpleGrantedAuthority(user.getName()));
        for (GrantedAuthority a : authorities) {
            log.debug("user: {} role: {}", user.getName(), a.getAuthority());
        }
        return new User(user.getName(), user.getPass(), authorities);
    }
}
