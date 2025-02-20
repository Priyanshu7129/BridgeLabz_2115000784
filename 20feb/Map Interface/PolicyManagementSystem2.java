import java.time.LocalDate;
import java.util.*;

class Policy2 {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    public Policy2(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Policy2{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolder='" + policyHolder + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}

class InsurancePolicyManager {
    private Map<String, Policy2> policyMap = new HashMap<>();
    private Map<String, Policy2> orderedPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy2>> policiesByExpiry = new TreeMap<>();

    public void addPolicy(Policy2 policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicies.put(policy.policyNumber, policy);
        policiesByExpiry.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    
    public Policy2 getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy2> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        List<Policy2> expiringPolicies = new ArrayList<>();

        for (Map.Entry<LocalDate, List<Policy2>> entry : policiesByExpiry.entrySet()) {
            if (entry.getKey().isAfter(threshold)) break;
            if (!entry.getKey().isBefore(today)) {
                expiringPolicies.addAll(entry.getValue());
            }
        }
        return expiringPolicies;
    }


    public List<Policy2> getPoliciesByHolder(String holderName) {
        List<Policy2> policies = new ArrayList<>();
        for (Policy2 policy : orderedPolicies.values()) {
            if (policy.policyHolder.equalsIgnoreCase(holderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }


    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<Policy2>>> iterator = policiesByExpiry.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<Policy2>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (Policy2 policy : entry.getValue()) {
                    policyMap.remove(policy.policyNumber);
                    orderedPolicies.remove(policy.policyNumber);
                }
                iterator.remove();
            } else {
                break;
            }
        }
    }
}

public class PolicyManagementSystem2 {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new Policy2("P1001", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy2("P1002", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy2("P1003", "Alice", LocalDate.now().plusDays(25)));

        System.out.println("Policy2 P1001: " + manager.getPolicy("P1001"));
        System.out.println("Expiring Policies: " + manager.getExpiringPolicies());
        System.out.println("Alice's Policies: " + manager.getPoliciesByHolder("Alice"));
        
        manager.removeExpiredPolicies();
        System.out.println("After removing expired policies: " + manager.getExpiringPolicies());
    }
}
