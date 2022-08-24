package petshop.external;

public class Pet {

    private Long id;
    private String name;
    private int appearance;
    private int energyId;
    private Address address;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppearance() {
        return appearance;
    }
    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }
    public int getEnergyId() {
        return energyId;
    }
    public void setEnergyId(int energyId) {
        this.energyId = energyId;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

}
