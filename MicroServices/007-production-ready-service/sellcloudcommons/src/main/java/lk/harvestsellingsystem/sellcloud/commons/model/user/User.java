package lk.harvestsellingsystem.sellcloud.commons.model.user;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private boolean farmer;
        private boolean isApproved;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isFarmer() {
            return farmer;
        }

        public void setFarmer(boolean farmer) {
            this.farmer = farmer;
        }

        public boolean isApproved() {
            return isApproved;
        }

        public void setApproved(boolean approved) {
            isApproved = approved;
        }
}
