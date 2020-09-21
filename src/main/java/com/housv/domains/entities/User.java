package com.housv.domains.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Fresher-Training
 *
 * @author Namtt
 * @created_at 01/07/2020 - 1:48 PM
 * @created_by Namtt
 * @since 01/07/2020
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class User extends BaseEntity<Long>{

  public User(User user) {
    this.username = user.getUsername();
    this.password = user.getPassword();
    this.email = user.getEmail();
    this.enabled = user.isEnabled();
    this.accountNonExpired = user.isAccountNonExpired();
    this.credentialsNonExpired = user.isCredentialsNonExpired();
    this.accountNonLocked = user.isAccountNonLocked();
    this.roles = user.getRoles();
  }

  @Column(nullable = false)
  private String username;
  @Column(nullable = false)
  private String password;
  @Column(nullable = false)
  private String email;
  @Column(name = "enabled")
  private boolean enabled;
  @Column(name = "accountNonExpired")
  private boolean accountNonExpired;
  @Column(name = "credentialsNonExpired")
  private boolean credentialsNonExpired;
  @Column(name = "accountNonLocked")
  private boolean accountNonLocked;

  @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE,
      CascadeType.REFRESH})
  @JoinTable(name = "role_user", joinColumns = {@JoinColumn(name = "user_id")},
      inverseJoinColumns = {@JoinColumn(name = "role_id")})
  private List<Role> roles;


}
