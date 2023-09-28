package poo.hospital;

public class Hospital {

    private int codHospital;
    private String nameHospital;
    private String address;
    private String phone;
    private int totalRooms;
    private int fullRooms;

    public Hospital(int codHospital, String nameHospital, String address, String phone, int totalRooms, int fullRooms) {
        this.codHospital = codHospital;
        this.nameHospital = nameHospital;
        this.address = address;
        this.phone = phone;
        this.totalRooms = totalRooms;
        this.fullRooms = fullRooms;
    }

    public int getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }

    public String getNameHospital() {
        return nameHospital;
    }

    public void setNameHospital(String nameHospital) {
        this.nameHospital = nameHospital;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getFullRooms() {
        return fullRooms;
    }

    public void setFullRooms(int fullRooms) {
        this.fullRooms = fullRooms;
    }

    public boolean join() {
        if (this.fullRooms < this.totalRooms) {
            this.fullRooms++;
            return true;
        }
        //else
        return false;
    }
    
public boolean out() {
        if (this.fullRooms != 0) {
            this.fullRooms--;
            return true;
        }
        //else
        return false;
    }

    @Override
    public String toString() {
        return "Hospital{" + "codHospital=" + codHospital + ", nameHospital=" + nameHospital + ", address=" + address + ", phone=" + phone + ", totalRooms=" + totalRooms + ", fullRooms=" + fullRooms + '}';
    }

}
