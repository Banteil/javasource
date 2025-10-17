package util;

public class Member {
    private String id, password, name;

    public Member() {
    }

    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member [id=" + this.id + ", password=" + this.password + ", name=" + this.name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member other = (Member) obj;
            return id.equals(other.id);
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
