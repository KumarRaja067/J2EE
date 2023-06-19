package trainer.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer 
{
	@Id
	private int trainerId;
	private String trainerName;
	private int trainerAge;
	private long trainerPhoneno;
	private String trainerAddress;
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public int getTrainerAge() {
		return trainerAge;
	}
	public void setTrainerAge(int trianerAge) {
		this.trainerAge = trianerAge;
	}
	public long getTrainerPhoneno() {
		return trainerPhoneno;
	}
	public void setTrainerPhoneno(long trainerPhoneno) {
		this.trainerPhoneno = trainerPhoneno;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	
	
	

}
