package project.DevTools.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTechResponses {
	private int id;
	private String name;
	private int language_id;
	private String languageName;
}
