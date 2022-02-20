package de.hhu.thymeleafsqlseq.domain;


public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean active;
    private Role role;

    public User(String firstName, String lastName, String email, String password, Role role) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.active=true;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }


    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String username){
        this.email=username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public boolean getActive(){
        return this.active;
    }

    public void setActive(boolean active){
        this.active=active;
    }

    public void setRoles(Role role){
        this.role = role;
    }
    public Role getRoles(){
        return this.role;
    }

}