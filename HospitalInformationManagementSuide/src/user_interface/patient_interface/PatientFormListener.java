package user_interface.patient_interface;

import java.util.EventListener;
import Class_Framework.*;

public interface PatientFormListener extends EventListener{
	public void formEventOccurred(PatientFormEvent event);

}
