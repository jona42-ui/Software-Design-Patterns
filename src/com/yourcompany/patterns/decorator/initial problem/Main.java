class Consultation {
    private int duration; // in hours

    public Consultation(int duration) {
        this.duration = duration;
    }

    // Method to calculate cost for consultation
    public double calculateConsultationCost() {
        return duration * 100; // $100 per hour for consultation
    }
}

// Main class directly instantiates billable items and adds features
public class Main {
    public static void main(String[] args) {
        // Direct instantiation of Consultation
        Consultation consultation = new Consultation(2);
        
        // Adding urgency feature directly
        double costWithUrgency = consultation.calculateConsultationCost() * 1.2; // Increase cost by 20% for urgency
        System.out.println("Cost of consultation with urgency: $" + costWithUrgency);

        // Similar direct instantiation and feature addition for LabTest and PharmacyItem
    }
}
