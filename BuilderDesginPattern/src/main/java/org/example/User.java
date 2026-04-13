package org.example;

public class User {

    private int id ;
    private String name;

    private User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private int id ;
        private String name ;

        public Builder setId (int id){
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public User build(){
            return new User(this.id, this.name);
        }

    }
    public static Builder builder(){ // lombok
        return new Builder();
    }

}
