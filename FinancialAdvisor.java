@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String advisorName;

    @Column
    private String email;

    @Column
    private String phone;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String advisorName, String email,
                            String phone, List<Client> clients) {
        this.advisorName = advisorName;
        this.email = email;
        this.phone = phone;
        this.clients = clients;
    }

    public Long getId() { return id; }
    public String getAdvisorName() { return advisorName; }
    public void setAdvisorName(String advisorName) { this.advisorName = advisorName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
