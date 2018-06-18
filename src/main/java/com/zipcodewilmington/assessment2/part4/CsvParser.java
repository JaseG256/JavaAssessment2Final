package com.zipcodewilmington.assessment2.part4;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class CsvParser {
    private static final Logger LOGGER = Logger.getLogger(CsvParser.class.getName());

    /**
     * Given a string with fields separated by commas.
     * The fields are id, first name, last name, and email.
     * Parse the string and create a user using those fields.
     *
     * @param row String with fields separated by commas
     * @return User with data from the string
     * @throws BadDataException when the first field is not an integer
     *                          or when there are missing fields
     */
    protected User parseRow(String row) throws BadDataException {
        String[] fields = row.split(",");
        User user = new User();
        if (!fields[0].matches("[^0-9]")) {
            throw new BadDataException("Not a number");
        } else if (fields.length < 4) {
            throw new BadDataException("Missing fields");
        } else if (fields[0] == null) {
            throw new BadDataException("First field missing");
        } else {
            user.setId(Integer.parseInt(fields[0]));
            user.setFirstName(fields[1]);
            user.setLastName(fields[2]);
            user.setEmail(fields[3]);
        }
//        for (int i = 0; i < fields.length; i++) {
//            user.setId();
//        }
        return user;
    }

    /**
     * Given a string representing the content of a CSV file.
     * Each row is separated by "\n".
     * The first row is the header. Ignore this row.
     * Map each row to a user.
     * @param csv String content of the a CSV
     * @return List<User>
     */
    public List<User> parseCsvString(String csv) {
        return null;
    }

    /**
     * Given a file path, read the content of the file, and parse it into a list of User.
     * @param filePath
     * @return List<User>
     * @throws IOException when file is not found or cannot read content
     */
    public List<User> parseFile(String filePath) throws IOException {
        return null;
    }
}
