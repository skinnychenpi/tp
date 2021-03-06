package seedu.address.model.connection;

import java.util.Set;
import java.util.function.Predicate;

import seedu.address.model.meeting.Meeting;
import seedu.address.model.person.Person;

public class PersonInMeetingPredicate implements Predicate<Person> {
    private final Meeting meeting;

    public PersonInMeetingPredicate(Meeting meeting) {
        this.meeting = meeting;
    }

    @Override
    public boolean test(Person person) {
        Set<Person> personsInMeeting = this.meeting.getConnectionToPerson();
        return personsInMeeting.stream()
                .anyMatch(p -> p.equals(person));

    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof seedu.address.model.connection.PersonInMeetingPredicate // instanceof handles null
                && meeting.equals(((seedu.address.model.connection.PersonInMeetingPredicate) other).meeting));
        // state check
    }
}
