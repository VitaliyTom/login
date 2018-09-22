package user.entity;

import javax.persistence.*;



@Entity
@Table(name = "profile")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  /**/
    @Column(name = "id")
    private Long id;
    @Column(name = "login")
    private String loginName;
    @Column(name = "passwd")
    private String passwdName;




    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPasswdName() {
        return passwdName;
    }

    public void setPasswdName(String passwdName) {
        this.passwdName = passwdName;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", passwdName='" + passwdName + '\'' +
                '}';
    }



   /*
    public String toFileString() {
        return loginName + "_" + passwdName;
    }
    */

/*
    @Entity
    @Table(name = "user")
    public class UserHibCl {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "firstName")
        private String first;

        @Column(name = "lastName")
        private String last;

        public UserHibCl() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        @Override
        public String toString() {
            return "UserHibCl{" +
                    "id=" + id +
                    ", first='" + first + '\'' +
                    ", last='" + last + '\'' +
                    '}';
        }*/


}
