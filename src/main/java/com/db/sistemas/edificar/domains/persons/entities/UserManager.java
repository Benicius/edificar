package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user_manager")
public class UserManager extends Person implements UserDetails, Serializable {

  @Column(nullable = false, unique = true)
  private String username;
  @Column(nullable = false)
  private String password;

  @ManyToMany
  @JoinTable(name = "users_roles",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
  private List<RoleModel> roles;

  public UserManager(
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Address addressId,
      Company companyId,
      String username,
      String password) {
    super(name, cpf, cnpj, birthday, cellphone, addressId, companyId);
    this.username = username;
    this.password = password;
  }
  public UserManager() {
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.roles;
  }

  public String getPassword() {
    return this.password;
  }

  @Override
  public String getUsername() {
    return this.username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }



}
