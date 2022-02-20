package de.hhu.thymeleafsqlseq.services;


import de.hhu.thymeleafsqlseq.domain.User;
import de.hhu.thymeleafsqlseq.dto.UserDto;
import de.hhu.thymeleafsqlseq.repositories.UserRepository;

public class UserService{
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.save(user);
    }
    User findByEmail(String email){
        return repository.findByEmail(email);
    };
}


/*
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email);
        List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
        return buildUserForAuthentication(user, authorities);
    }

    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        for (Role role : userRoles) {
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }

    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(
                user.getEmail()
                , user.getPassword()
                , user.getActive()
                , true
                , true
                , true
                , authorities);
    }
}
*/
