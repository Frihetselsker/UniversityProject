package comparators.universities;

import models.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityStudyProfileComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2){
        if(null == o1.getMainProfile())
            return 1;
        if(null == o2.getMainProfile())
            return -1;
        return StringUtils.compare(o1.getMainProfile().getProfileName(), o2.getMainProfile().getProfileName());
    }
}
